import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class doe implements doz<bno> {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "Entities";
   private static final String d = "Position";
   private final aov e;
   private final dof f;
   private final LongSet g = new LongOpenHashSet();
   private final bkn<Runnable> h;
   protected final DataFixer a;

   public doe(aov $$0, Path $$1, DataFixer $$2, boolean $$3, Executor $$4) {
      this.e = $$0;
      this.a = $$2;
      this.h = bkn.a($$4, "entity-deserializer");
      this.f = new dof($$1, $$3, "entities");
   }

   @Override
   public CompletableFuture<dou<bno>> a(cuu $$0) {
      return this.g.contains($$0.a()) ? CompletableFuture.completedFuture(b($$0)) : this.f.a($$0).thenApplyAsync($$1 -> {
         if ($$1.isEmpty()) {
            this.g.add($$0.a());
            return b($$0);
         } else {
            try {
               cuu $$2 = a($$1.get());
               if (!Objects.equals($$0, $$2)) {
                  b.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
               }
            } catch (Exception var6) {
               b.warn("Failed to parse chunk {} position info", $$0, var6);
            }

            sw $$4 = this.b($$1.get());
            tc $$5 = $$4.c("Entities", 10);
            List<bno> $$6 = bnu.a($$5, this.e).collect(ImmutableList.toImmutableList());
            return new dou<>($$0, $$6);
         }
      }, this.h::a);
   }

   private static cuu a(sw $$0) {
      int[] $$1 = $$0.n("Position");
      return new cuu($$1[0], $$1[1]);
   }

   private static void a(sw $$0, cuu $$1) {
      $$0.a("Position", new ta(new int[]{$$1.e, $$1.f}));
   }

   private static dou<bno> b(cuu $$0) {
      return new dou<>($$0, ImmutableList.of());
   }

   @Override
   public void a(dou<bno> $$0) {
      cuu $$1 = $$0.a();
      if ($$0.c()) {
         if (this.g.add($$1.a())) {
            this.f.a($$1, null);
         }
      } else {
         tc $$2 = new tc();
         $$0.b().forEach($$1x -> {
            sw $$2x = new sw();
            if ($$1x.e($$2x)) {
               $$2.add($$2x);
            }
         });
         sw $$3 = tl.g(new sw());
         $$3.a("Entities", $$2);
         a($$3, $$1);
         this.f.a($$1, $$3).exceptionally($$1x -> {
            b.error("Failed to store chunk {}", $$1, $$1x);
            return null;
         });
         this.g.remove($$1.a());
      }
   }

   @Override
   public void a(boolean $$0) {
      this.f.a($$0).join();
      this.h.a();
   }

   private sw b(sw $$0) {
      int $$1 = tl.b($$0, -1);
      return axo.s.a(this.a, $$0, $$1);
   }

   @Override
   public void close() throws IOException {
      this.f.close();
   }
}
