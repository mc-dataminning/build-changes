import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class dyu implements dzu<bui> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Entities";
   private static final String c = "Position";
   private final arq d;
   private final dzf e;
   private final LongSet f = new LongOpenHashSet();
   private final bqx g;

   public dyu(dzf $$0, arq $$1, Executor $$2) {
      this.e = $$0;
      this.d = $$1;
      this.g = new bqx($$2, "entity-deserializer");
   }

   @Override
   public CompletableFuture<dzp<bui>> a(del $$0) {
      if (this.f.contains($$0.a())) {
         return CompletableFuture.completedFuture(b($$0));
      } else {
         CompletableFuture<Optional<un>> $$1 = this.e.a($$0);
         this.b($$1, $$0);
         return $$1.thenApplyAsync($$1x -> {
            if ($$1x.isEmpty()) {
               this.f.add($$0.a());
               return b($$0);
            } else {
               try {
                  del $$2 = a((un)$$1x.get());
                  if (!Objects.equals($$0, $$2)) {
                     a.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
                     this.d.o().a($$2, $$0, this.e.a());
                  }
               } catch (Exception var6) {
                  a.warn("Failed to parse chunk {} position info", $$0, var6);
                  this.d.o().a(var6, this.e.a(), $$0);
               }

               un $$4 = this.e.a((un)$$1x.get(), -1);
               ut $$5 = $$4.c("Entities", 10);
               List<bui> $$6 = bup.a($$5, this.d, buo.r).collect(ImmutableList.toImmutableList());
               return new dzp<>($$0, $$6);
            }
         }, this.g::a_);
      }
   }

   private static del a(un $$0) {
      int[] $$1 = $$0.n("Position");
      return new del($$1[0], $$1[1]);
   }

   private static void a(un $$0, del $$1) {
      $$0.a("Position", new ur(new int[]{$$1.g, $$1.h}));
   }

   private static dzp<bui> b(del $$0) {
      return new dzp<>($$0, ImmutableList.of());
   }

   @Override
   public void a(dzp<bui> $$0) {
      del $$1 = $$0.a();
      if ($$0.c()) {
         if (this.f.add($$1.a())) {
            this.a(this.e.a($$1, null), $$1);
         }
      } else {
         ut $$2 = new ut();
         $$0.b().forEach($$1x -> {
            un $$2x = new un();
            if ($$1x.e($$2x)) {
               $$2.add($$2x);
            }
         });
         un $$3 = vc.e(new un());
         $$3.a("Entities", $$2);
         a($$3, $$1);
         this.a(this.e.a($$1, $$3), $$1);
         this.f.remove($$1.a());
      }
   }

   private void a(CompletableFuture<?> $$0, del $$1) {
      $$0.exceptionally($$1x -> {
         a.error("Failed to store entity chunk {}", $$1, $$1x);
         this.d.o().b($$1x, this.e.a(), $$1);
         return null;
      });
   }

   private void b(CompletableFuture<?> $$0, del $$1) {
      $$0.exceptionally($$1x -> {
         a.error("Failed to load entity chunk {}", $$1, $$1x);
         this.d.o().a($$1x, this.e.a(), $$1);
         return null;
      });
   }

   @Override
   public void a(boolean $$0) {
      this.e.a($$0).join();
      this.g.a();
   }

   @Override
   public void close() throws IOException {
      this.e.close();
   }
}
