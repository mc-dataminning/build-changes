import com.google.common.base.Stopwatch;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ecs {
   private static final Logger a = LogUtils.getLogger();
   private final ehg b;
   private final dkt c;
   private final long d;
   private final long e;
   private final Map<ern, List<esk>> f = new Object2ObjectOpenHashMap();
   private final Map<esh, CompletableFuture<List<dir>>> g = new Object2ObjectArrayMap();
   private boolean h;
   private final List<jf<ert>> i;

   public static ecs a(ehg $$0, long $$1, dkt $$2, Stream<jf<ert>> $$3) {
      List<jf<ert>> $$4 = $$3.filter($$1x -> a((ert)$$1x.a(), $$2)).toList();
      return new ecs($$0, $$2, $$1, 0L, $$4);
   }

   public static ecs a(ehg $$0, long $$1, dkt $$2, jh<ert> $$3) {
      List<jf<ert>> $$4 = $$3.c().filter($$1x -> a((ert)$$1x.a(), $$2)).collect(Collectors.toUnmodifiableList());
      return new ecs($$0, $$2, $$1, $$1, $$4);
   }

   private static boolean a(ert $$0, dkt $$1) {
      Stream<jf<dkp>> $$2 = $$0.a().stream().flatMap($$0x -> {
         ern $$1x = $$0x.a().a();
         return $$1x.a().a();
      });
      return $$2.anyMatch($$1.c()::contains);
   }

   private ecs(ehg $$0, dkt $$1, long $$2, long $$3, List<jf<ert>> $$4) {
      this.b = $$0;
      this.d = $$2;
      this.c = $$1;
      this.e = $$3;
      this.i = $$4;
   }

   public List<jf<ert>> a() {
      return this.i;
   }

   private void e() {
      Set<jf<dkp>> $$0 = this.c.c();
      this.a().forEach($$1 -> {
         ert $$2 = $$1.a();
         boolean $$3 = false;

         for (ert.a $$4 : $$2.a()) {
            ern $$5 = $$4.a().a();
            if ($$5.a().a().anyMatch($$0::contains)) {
               this.f.computeIfAbsent($$5, $$0xx -> new ArrayList<>()).add($$2.b());
               $$3 = true;
            }
         }

         if ($$3 && $$2.b() instanceof esh $$7) {
            this.g.put($$7, this.a((jf<ert>)$$1, $$7));
         }
      });
   }

   private CompletableFuture<List<dir>> a(jf<ert> $$0, esh $$1) {
      if ($$1.c() == 0) {
         return CompletableFuture.completedFuture(List.of());
      } else {
         Stopwatch $$2 = Stopwatch.createStarted(ag.d);
         int $$3 = $$1.a();
         int $$4 = $$1.c();
         List<CompletableFuture<dir>> $$5 = new ArrayList<>($$4);
         int $$6 = $$1.b();
         jj<dkp> $$7 = $$1.d();
         azv $$8 = azv.a();
         $$8.b(this.e);
         double $$9 = $$8.j() * Math.PI * 2.0;
         int $$10 = 0;
         int $$11 = 0;

         for (int $$12 = 0; $$12 < $$4; $$12++) {
            double $$13 = (double)(4 * $$3 + $$3 * $$11 * 6) + ($$8.j() - 0.5) * (double)$$3 * 2.5;
            int $$14 = (int)Math.round(Math.cos($$9) * $$13);
            int $$15 = (int)Math.round(Math.sin($$9) * $$13);
            azv $$16 = $$8.d();
            $$5.add(CompletableFuture.supplyAsync(() -> {
               Pair<iv, jf<dkp>> $$4x = this.c.a(jy.a($$14, 8), 0, jy.a($$15, 8), 112, $$7::a, $$16, this.b.b());
               if ($$4x != null) {
                  iv $$5x = (iv)$$4x.getFirst();
                  return new dir(jy.a($$5x.u()), jy.a($$5x.w()));
               } else {
                  return new dir($$14, $$15);
               }
            }, ag.h().a("structureRings")));
            $$9 += (Math.PI * 2) / (double)$$6;
            if (++$$10 == $$6) {
               $$11++;
               $$10 = 0;
               $$6 += 2 * $$6 / ($$11 + 1);
               $$6 = Math.min($$6, $$4 - $$12);
               $$9 += $$8.j() * Math.PI * 2.0;
            }
         }

         return ag.d($$5).thenApply($$2x -> {
            double $$3x = (double)$$2.stop().elapsed(TimeUnit.MILLISECONDS) / 1000.0;
            a.debug("Calculation for {} took {}s", $$0, $$3x);
            return $$2x;
         });
      }
   }

   public void b() {
      if (!this.h) {
         this.e();
         this.h = true;
      }
   }

   @Nullable
   public List<dir> a(esh $$0) {
      this.b();
      CompletableFuture<List<dir>> $$1 = this.g.get($$0);
      return $$1 != null ? $$1.join() : null;
   }

   public List<esk> a(jf<ern> $$0) {
      this.b();
      return this.f.getOrDefault($$0.a(), List.of());
   }

   public ehg c() {
      return this.b;
   }

   public boolean a(jf<ert> $$0, int $$1, int $$2, int $$3) {
      esk $$4 = $$0.a().b();

      for (int $$5 = $$1 - $$3; $$5 <= $$1 + $$3; $$5++) {
         for (int $$6 = $$2 - $$3; $$6 <= $$2 + $$3; $$6++) {
            if ($$4.b(this, $$5, $$6)) {
               return true;
            }
         }
      }

      return false;
   }

   public long d() {
      return this.d;
   }
}
