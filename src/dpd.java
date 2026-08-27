import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class dpd implements dqb<bof> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Entities";
   private static final String c = "Position";
   private final apa d;
   private final dpm e;
   private final LongSet f = new LongOpenHashSet();
   private final ble<Runnable> g;

   public dpd(dpm $$0, apa $$1, Executor $$2) {
      this.e = $$0;
      this.d = $$1;
      this.g = ble.a($$2, "entity-deserializer");
   }

   @Override
   public CompletableFuture<dpw<bof>> a(cvl $$0) {
      return this.f.contains($$0.a()) ? CompletableFuture.completedFuture(b($$0)) : this.e.a($$0).thenApplyAsync($$1 -> {
         if ($$1.isEmpty()) {
            this.f.add($$0.a());
            return b($$0);
         } else {
            try {
               cvl $$2 = a($$1.get());
               if (!Objects.equals($$0, $$2)) {
                  a.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
               }
            } catch (Exception var6) {
               a.warn("Failed to parse chunk {} position info", $$0, var6);
            }

            sy $$4 = this.e.a($$1.get(), -1);
            te $$5 = $$4.c("Entities", 10);
            List<bof> $$6 = bol.a($$5, this.d).collect(ImmutableList.toImmutableList());
            return new dpw<>($$0, $$6);
         }
      }, this.g::a);
   }

   private static cvl a(sy $$0) {
      int[] $$1 = $$0.n("Position");
      return new cvl($$1[0], $$1[1]);
   }

   private static void a(sy $$0, cvl $$1) {
      $$0.a("Position", new tc(new int[]{$$1.e, $$1.f}));
   }

   private static dpw<bof> b(cvl $$0) {
      return new dpw<>($$0, ImmutableList.of());
   }

   @Override
   public void a(dpw<bof> $$0) {
      cvl $$1 = $$0.a();
      if ($$0.c()) {
         if (this.f.add($$1.a())) {
            this.e.a($$1, null);
         }
      } else {
         te $$2 = new te();
         $$0.b().forEach($$1x -> {
            sy $$2x = new sy();
            if ($$1x.e($$2x)) {
               $$2.add($$2x);
            }
         });
         sy $$3 = tn.g(new sy());
         $$3.a("Entities", $$2);
         a($$3, $$1);
         this.e.a($$1, $$3).exceptionally($$1x -> {
            a.error("Failed to store chunk {}", $$1, $$1x);
            return null;
         });
         this.f.remove($$1.a());
      }
   }

   @Override
   public void a(boolean $$0) {
      this.e.a($$0).join();
      this.g.a();
   }
}
