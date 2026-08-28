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

public class eba implements eca<bvj> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Entities";
   private static final String c = "Position";
   private final ash d;
   private final ebl e;
   private final LongSet f = new LongOpenHashSet();
   private final bry g;

   public eba(ebl $$0, ash $$1, Executor $$2) {
      this.e = $$0;
      this.d = $$1;
      this.g = new bry($$2, "entity-deserializer");
   }

   @Override
   public CompletableFuture<ebv<bvj>> a(dgn $$0) {
      if (this.f.contains($$0.a())) {
         return CompletableFuture.completedFuture(b($$0));
      } else {
         CompletableFuture<Optional<ux>> $$1 = this.e.a($$0);
         this.b($$1, $$0);
         return $$1.thenApplyAsync($$1x -> {
            if ($$1x.isEmpty()) {
               this.f.add($$0.a());
               return b($$0);
            } else {
               try {
                  dgn $$2 = a((ux)$$1x.get());
                  if (!Objects.equals($$0, $$2)) {
                     a.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
                     this.d.p().a($$2, $$0, this.e.a());
                  }
               } catch (Exception var6) {
                  a.warn("Failed to parse chunk {} position info", $$0, var6);
                  this.d.p().a(var6, this.e.a(), $$0);
               }

               ux $$4 = this.e.a((ux)$$1x.get(), -1);
               vd $$5 = $$4.c("Entities", 10);
               List<bvj> $$6 = bvq.a($$5, this.d, bvp.r).collect(ImmutableList.toImmutableList());
               return new ebv<>($$0, $$6);
            }
         }, this.g::a_);
      }
   }

   private static dgn a(ux $$0) {
      int[] $$1 = $$0.n("Position");
      return new dgn($$1[0], $$1[1]);
   }

   private static void a(ux $$0, dgn $$1) {
      $$0.a("Position", new vb(new int[]{$$1.h, $$1.i}));
   }

   private static ebv<bvj> b(dgn $$0) {
      return new ebv<>($$0, ImmutableList.of());
   }

   @Override
   public void a(ebv<bvj> $$0) {
      dgn $$1 = $$0.a();
      if ($$0.c()) {
         if (this.f.add($$1.a())) {
            this.a(this.e.a($$1, null), $$1);
         }
      } else {
         vd $$2 = new vd();
         $$0.b().forEach($$1x -> {
            ux $$2x = new ux();
            if ($$1x.e($$2x)) {
               $$2.add($$2x);
            }
         });
         ux $$3 = vm.e(new ux());
         $$3.a("Entities", $$2);
         a($$3, $$1);
         this.a(this.e.a($$1, $$3), $$1);
         this.f.remove($$1.a());
      }
   }

   private void a(CompletableFuture<?> $$0, dgn $$1) {
      $$0.exceptionally($$1x -> {
         a.error("Failed to store entity chunk {}", $$1, $$1x);
         this.d.p().b($$1x, this.e.a(), $$1);
         return null;
      });
   }

   private void b(CompletableFuture<?> $$0, dgn $$1) {
      $$0.exceptionally($$1x -> {
         a.error("Failed to load entity chunk {}", $$1, $$1x);
         this.d.p().a($$1x, this.e.a(), $$1);
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
