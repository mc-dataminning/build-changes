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

public class dlo implements dmj<blf> {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "Entities";
   private static final String d = "Position";
   private final amp e;
   private final dlp f;
   private final LongSet g = new LongOpenHashSet();
   private final bie<Runnable> h;
   protected final DataFixer a;

   public dlo(amp $$0, Path $$1, DataFixer $$2, boolean $$3, Executor $$4) {
      this.e = $$0;
      this.a = $$2;
      this.h = bie.a($$4, "entity-deserializer");
      this.f = new dlp($$1, $$3, "entities");
   }

   @Override
   public CompletableFuture<dme<blf>> a(csf $$0) {
      return this.g.contains($$0.a()) ? CompletableFuture.completedFuture(b($$0)) : this.f.a($$0).thenApplyAsync($$1 -> {
         if ($$1.isEmpty()) {
            this.g.add($$0.a());
            return b($$0);
         } else {
            try {
               csf $$2 = a($$1.get());
               if (!Objects.equals($$0, $$2)) {
                  b.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
               }
            } catch (Exception var6) {
               b.warn("Failed to parse chunk {} position info", $$0, var6);
            }

            sj $$4 = this.b($$1.get());
            sp $$5 = $$4.c("Entities", 10);
            List<blf> $$6 = blj.a($$5, this.e).collect(ImmutableList.toImmutableList());
            return new dme<>($$0, $$6);
         }
      }, this.h::a);
   }

   private static csf a(sj $$0) {
      int[] $$1 = $$0.n("Position");
      return new csf($$1[0], $$1[1]);
   }

   private static void a(sj $$0, csf $$1) {
      $$0.a("Position", new sn(new int[]{$$1.e, $$1.f}));
   }

   private static dme<blf> b(csf $$0) {
      return new dme<>($$0, ImmutableList.of());
   }

   @Override
   public void a(dme<blf> $$0) {
      csf $$1 = $$0.a();
      if ($$0.c()) {
         if (this.g.add($$1.a())) {
            this.f.a($$1, null);
         }
      } else {
         sp $$2 = new sp();
         $$0.b().forEach($$1x -> {
            sj $$2x = new sj();
            if ($$1x.e($$2x)) {
               $$2.add($$2x);
            }
         });
         sj $$3 = sy.g(new sj());
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

   private sj b(sj $$0) {
      int $$1 = sy.b($$0, -1);
      return avg.s.a(this.a, $$0, $$1);
   }

   @Override
   public void close() throws IOException {
      this.f.close();
   }
}
