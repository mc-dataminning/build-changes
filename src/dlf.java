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

public class dlf {
   private static final Logger a = LogUtils.getLogger();
   private final dpe b;
   private final cus c;
   private final long d;
   private final long e;
   private final Map<dzg, List<ead>> f = new Object2ObjectOpenHashMap();
   private final Map<eaa, CompletableFuture<List<csw>>> g = new Object2ObjectArrayMap();
   private boolean h;
   private final List<ih<dzm>> i;

   public static dlf a(dpe $$0, long $$1, cus $$2, Stream<ih<dzm>> $$3) {
      List<ih<dzm>> $$4 = $$3.filter($$1x -> a((dzm)$$1x.a(), $$2)).toList();
      return new dlf($$0, $$2, $$1, 0L, $$4);
   }

   public static dlf a(dpe $$0, long $$1, cus $$2, ij<dzm> $$3) {
      List<ih<dzm>> $$4 = $$3.b().filter($$1x -> a((dzm)$$1x.a(), $$2)).collect(Collectors.toUnmodifiableList());
      return new dlf($$0, $$2, $$1, $$1, $$4);
   }

   private static boolean a(dzm $$0, cus $$1) {
      Stream<ih<cuo>> $$2 = $$0.a().stream().flatMap($$0x -> {
         dzg $$1x = $$0x.a().a();
         return $$1x.a().a();
      });
      return $$2.anyMatch($$1.c()::contains);
   }

   private dlf(dpe $$0, cus $$1, long $$2, long $$3, List<ih<dzm>> $$4) {
      this.b = $$0;
      this.d = $$2;
      this.c = $$1;
      this.e = $$3;
      this.i = $$4;
   }

   public List<ih<dzm>> a() {
      return this.i;
   }

   private void e() {
      Set<ih<cuo>> $$0 = this.c.c();
      this.a().forEach($$1 -> {
         dzm $$2 = $$1.a();
         boolean $$3 = false;

         for (dzm.a $$4 : $$2.a()) {
            dzg $$5 = $$4.a().a();
            if ($$5.a().a().anyMatch($$0::contains)) {
               this.f.computeIfAbsent($$5, $$0xx -> new ArrayList<>()).add($$2.b());
               $$3 = true;
            }
         }

         if ($$3 && $$2.b() instanceof eaa $$7) {
            this.g.put($$7, this.a((ih<dzm>)$$1, $$7));
         }
      });
   }

   private CompletableFuture<List<csw>> a(ih<dzm> $$0, eaa $$1) {
      if ($$1.c() == 0) {
         return CompletableFuture.completedFuture(List.of());
      } else {
         Stopwatch $$2 = Stopwatch.createStarted(ac.c);
         int $$3 = $$1.a();
         int $$4 = $$1.c();
         List<CompletableFuture<csw>> $$5 = new ArrayList<>($$4);
         int $$6 = $$1.b();
         il<cuo> $$7 = $$1.d();
         auv $$8 = auv.a();
         $$8.b(this.e);
         double $$9 = $$8.j() * Math.PI * 2.0;
         int $$10 = 0;
         int $$11 = 0;

         for (int $$12 = 0; $$12 < $$4; $$12++) {
            double $$13 = (double)(4 * $$3 + $$3 * $$11 * 6) + ($$8.j() - 0.5) * (double)$$3 * 2.5;
            int $$14 = (int)Math.round(Math.cos($$9) * $$13);
            int $$15 = (int)Math.round(Math.sin($$9) * $$13);
            auv $$16 = $$8.d();
            $$5.add(CompletableFuture.supplyAsync(() -> {
               Pair<hx, ih<cuo>> $$4x = this.c.a(iz.a($$14, 8), 0, iz.a($$15, 8), 112, $$7::a, $$16, this.b.b());
               if ($$4x != null) {
                  hx $$5x = (hx)$$4x.getFirst();
                  return new csw(iz.a($$5x.u()), iz.a($$5x.w()));
               } else {
                  return new csw($$14, $$15);
               }
            }, ac.f()));
            $$9 += (Math.PI * 2) / (double)$$6;
            if (++$$10 == $$6) {
               $$11++;
               $$10 = 0;
               $$6 += 2 * $$6 / ($$11 + 1);
               $$6 = Math.min($$6, $$4 - $$12);
               $$9 += $$8.j() * Math.PI * 2.0;
            }
         }

         return ac.b($$5).thenApply($$2x -> {
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
   public List<csw> a(eaa $$0) {
      this.b();
      CompletableFuture<List<csw>> $$1 = this.g.get($$0);
      return $$1 != null ? $$1.join() : null;
   }

   public List<ead> a(ih<dzg> $$0) {
      this.b();
      return this.f.getOrDefault($$0.a(), List.of());
   }

   public dpe c() {
      return this.b;
   }

   public boolean a(ih<dzm> $$0, int $$1, int $$2, int $$3) {
      ead $$4 = $$0.a().b();

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
