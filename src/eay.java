import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableObject;

public class eay {
   private static final eay a = new eay(new Long2ObjectOpenHashMap(), new Long2ObjectOpenHashMap()) {
      @Override
      public eay.a a(int $$0, int $$1) {
         return new eay.a(1.0, 0.0);
      }

      @Override
      public double a(dzp.b $$0, double $$1) {
         return $$1;
      }

      @Override
      public dew a(dew $$0) {
         return $$0;
      }
   };
   private static final epe b = epe.b(new eax(42L), qx.a);
   private static final int c = jy.d(7) - 1;
   private static final int d = jy.e(c + 3);
   private static final int e = 2;
   private static final int f = jy.e(5);
   private static final double g = 8.0;
   private final Long2ObjectOpenHashMap<eaz> h;
   private final Long2ObjectOpenHashMap<eaz> i;

   public static eay a() {
      return a;
   }

   public static eay a(@Nullable arn $$0) {
      if ($$0 == null) {
         return a;
      } else {
         dcy $$1 = $$0.a();
         if (!$$0.a($$1, d)) {
            return a;
         } else {
            Long2ObjectOpenHashMap<eaz> $$2 = new Long2ObjectOpenHashMap();
            Long2ObjectOpenHashMap<eaz> $$3 = new Long2ObjectOpenHashMap();
            int $$4 = azc.h(d + 1);

            for (int $$5 = -d; $$5 <= d; $$5++) {
               for (int $$6 = -d; $$6 <= d; $$6++) {
                  if ($$5 * $$5 + $$6 * $$6 <= $$4) {
                     int $$7 = $$1.e + $$5;
                     int $$8 = $$1.f + $$6;
                     eaz $$9 = eaz.a($$0, $$7, $$8);
                     if ($$9 != null) {
                        $$2.put(dcy.c($$7, $$8), $$9);
                        if ($$5 >= -f && $$5 <= f && $$6 >= -f && $$6 <= f) {
                           $$3.put(dcy.c($$7, $$8), $$9);
                        }
                     }
                  }
               }
            }

            return $$2.isEmpty() && $$3.isEmpty() ? a : new eay($$2, $$3);
         }
      }
   }

   eay(Long2ObjectOpenHashMap<eaz> $$0, Long2ObjectOpenHashMap<eaz> $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public eay.a a(int $$0, int $$1) {
      int $$2 = jy.a($$0);
      int $$3 = jy.a($$1);
      double $$4 = this.a($$2, 0, $$3, eaz::a);
      if ($$4 != Double.MAX_VALUE) {
         return new eay.a(0.0, a($$4));
      } else {
         MutableDouble $$5 = new MutableDouble(0.0);
         MutableDouble $$6 = new MutableDouble(0.0);
         MutableDouble $$7 = new MutableDouble(Double.POSITIVE_INFINITY);
         this.h.forEach(($$5x, $$6x) -> $$6x.a(jy.d(dcy.a($$5x)), jy.d(dcy.b($$5x)), ($$5xx, $$6xx, $$7x) -> {
               double $$8x = (double)azc.f((float)($$2 - $$5xx), (float)($$3 - $$6xx));
               if (!($$8x > (double)c)) {
                  if ($$8x < $$7.doubleValue()) {
                     $$7.setValue($$8x);
                  }

                  double $$9x = 1.0 / ($$8x * $$8x * $$8x * $$8x);
                  $$6.add($$7x * $$9x);
                  $$5.add($$9x);
               }
            }));
         if ($$7.doubleValue() == Double.POSITIVE_INFINITY) {
            return new eay.a(1.0, 0.0);
         } else {
            double $$8 = $$6.doubleValue() / $$5.doubleValue();
            double $$9 = azc.a($$7.doubleValue() / (double)(c + 1), 0.0, 1.0);
            $$9 = 3.0 * $$9 * $$9 - 2.0 * $$9 * $$9 * $$9;
            return new eay.a($$9, a($$8));
         }
      }
   }

   private static double a(double $$0) {
      double $$1 = 1.0;
      double $$2 = $$0 + 0.5;
      double $$3 = azc.c($$2, 8.0);
      return 1.0 * (32.0 * ($$2 - 128.0) - 3.0 * ($$2 - 120.0) * $$3 + 3.0 * $$3 * $$3) / (128.0 * (32.0 - 3.0 * $$3));
   }

   public double a(dzp.b $$0, double $$1) {
      int $$2 = jy.a($$0.a());
      int $$3 = $$0.b() / 8;
      int $$4 = jy.a($$0.c());
      double $$5 = this.a($$2, $$3, $$4, eaz::b);
      if ($$5 != Double.MAX_VALUE) {
         return $$5;
      } else {
         MutableDouble $$6 = new MutableDouble(0.0);
         MutableDouble $$7 = new MutableDouble(0.0);
         MutableDouble $$8 = new MutableDouble(Double.POSITIVE_INFINITY);
         this.i.forEach(($$6x, $$7x) -> $$7x.a(jy.d(dcy.a($$6x)), jy.d(dcy.b($$6x)), $$3 - 1, $$3 + 1, ($$6xx, $$7xx, $$8x, $$9x) -> {
               double $$10x = azc.g((double)($$2 - $$6xx), (double)(($$3 - $$7xx) * 2), (double)($$4 - $$8x));
               if (!($$10x > 2.0)) {
                  if ($$10x < $$8.doubleValue()) {
                     $$8.setValue($$10x);
                  }

                  double $$11 = 1.0 / ($$10x * $$10x * $$10x * $$10x);
                  $$7.add($$9x * $$11);
                  $$6.add($$11);
               }
            }));
         if ($$8.doubleValue() == Double.POSITIVE_INFINITY) {
            return $$1;
         } else {
            double $$9 = $$7.doubleValue() / $$6.doubleValue();
            double $$10 = azc.a($$8.doubleValue() / 3.0, 0.0, 1.0);
            return azc.d($$10, $$9, $$1);
         }
      }
   }

   private double a(int $$0, int $$1, int $$2, eay.b $$3) {
      int $$4 = jy.e($$0);
      int $$5 = jy.e($$2);
      boolean $$6 = ($$0 & 3) == 0;
      boolean $$7 = ($$2 & 3) == 0;
      double $$8 = this.a($$3, $$4, $$5, $$0, $$1, $$2);
      if ($$8 == Double.MAX_VALUE) {
         if ($$6 && $$7) {
            $$8 = this.a($$3, $$4 - 1, $$5 - 1, $$0, $$1, $$2);
         }

         if ($$8 == Double.MAX_VALUE) {
            if ($$6) {
               $$8 = this.a($$3, $$4 - 1, $$5, $$0, $$1, $$2);
            }

            if ($$8 == Double.MAX_VALUE && $$7) {
               $$8 = this.a($$3, $$4, $$5 - 1, $$0, $$1, $$2);
            }
         }
      }

      return $$8;
   }

   private double a(eay.b $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      eaz $$6 = (eaz)this.h.get(dcy.c($$1, $$2));
      return $$6 != null ? $$0.get($$6, $$3 - jy.d($$1), $$4, $$5 - jy.d($$2)) : Double.MAX_VALUE;
   }

   public dew a(dew $$0) {
      return ($$1, $$2, $$3, $$4) -> {
         jn<det> $$5 = this.a($$1, $$2, $$3);
         return $$5 == null ? $$0.getNoiseBiome($$1, $$2, $$3, $$4) : $$5;
      };
   }

   @Nullable
   private jn<det> a(int $$0, int $$1, int $$2) {
      MutableDouble $$3 = new MutableDouble(Double.POSITIVE_INFINITY);
      MutableObject<jn<det>> $$4 = new MutableObject();
      this.h.forEach(($$5x, $$6x) -> $$6x.a(jy.d(dcy.a($$5x)), $$1, jy.d(dcy.b($$5x)), ($$4xx, $$5xx, $$6xx) -> {
            double $$7 = (double)azc.f((float)($$0 - $$4xx), (float)($$2 - $$5xx));
            if (!($$7 > (double)c)) {
               if ($$7 < $$3.doubleValue()) {
                  $$4.setValue($$6xx);
                  $$3.setValue($$7);
               }
            }
         }));
      if ($$3.doubleValue() == Double.POSITIVE_INFINITY) {
         return null;
      } else {
         double $$5 = b.a((double)$$0, 0.0, (double)$$2) * 12.0;
         double $$6 = azc.a(($$3.doubleValue() + $$5) / (double)(c + 1), 0.0, 1.0);
         return $$6 > 0.5 ? null : (jn)$$4.getValue();
      }
   }

   public static void a(arn $$0, dvw $$1) {
      dcy $$2 = $$1.f();
      boolean $$3 = $$1.r();
      je.a $$4 = new je.a();
      je $$5 = new je($$2.d(), 0, $$2.e());
      eaz $$6 = $$1.s();
      if ($$6 != null) {
         int $$7 = $$6.b().G_();
         int $$8 = $$6.b().an() - 1;
         if ($$3) {
            for (int $$9 = 0; $$9 < 16; $$9++) {
               for (int $$10 = 0; $$10 < 16; $$10++) {
                  a($$1, $$4.a($$5, $$9, $$7 - 1, $$10));
                  a($$1, $$4.a($$5, $$9, $$7, $$10));
                  a($$1, $$4.a($$5, $$9, $$8, $$10));
                  a($$1, $$4.a($$5, $$9, $$8 + 1, $$10));
               }
            }
         }

         for (jj $$11 : jj.c.a) {
            if ($$0.a($$2.e + $$11.j(), $$2.f + $$11.l()).r() != $$3) {
               int $$12 = $$11 == jj.f ? 15 : 0;
               int $$13 = $$11 == jj.e ? 0 : 15;
               int $$14 = $$11 == jj.d ? 15 : 0;
               int $$15 = $$11 == jj.c ? 0 : 15;

               for (int $$16 = $$12; $$16 <= $$13; $$16++) {
                  for (int $$17 = $$14; $$17 <= $$15; $$17++) {
                     int $$18 = Math.min($$8, $$1.a(dzw.a.e, $$16, $$17)) + 1;

                     for (int $$19 = $$7; $$19 < $$18; $$19++) {
                        a($$1, $$4.a($$5, $$16, $$19, $$17));
                     }
                  }
               }
            }
         }
      }
   }

   private static void a(dvw $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      if ($$2.a(aws.P)) {
         $$0.e($$1);
      }

      eqb $$3 = $$0.b_($$1);
      if (!$$3.c()) {
         $$0.e($$1);
      }
   }

   public static void a(dep $$0, dwq $$1) {
      dcy $$2 = $$1.f();
      Builder<jk, eaz> $$3 = ImmutableMap.builder();

      for (jk $$4 : jk.values()) {
         int $$5 = $$2.e + $$4.b();
         int $$6 = $$2.f + $$4.c();
         eaz $$7 = $$0.a($$5, $$6).s();
         if ($$7 != null) {
            $$3.put($$4, $$7);
         }
      }

      ImmutableMap<jk, eaz> $$8 = $$3.build();
      if ($$1.r() || !$$8.isEmpty()) {
         eay.c $$9 = a($$1.s(), $$8);
         dvv.a $$10 = ($$1x, $$2x, $$3x) -> {
            double $$4x = (double)$$1x + 0.5 + b.a((double)$$1x, (double)$$2x, (double)$$3x) * 4.0;
            double $$5x = (double)$$2x + 0.5 + b.a((double)$$2x, (double)$$3x, (double)$$1x) * 4.0;
            double $$6x = (double)$$3x + 0.5 + b.a((double)$$3x, (double)$$1x, (double)$$2x) * 4.0;
            return $$9.getDistance($$4x, $$5x, $$6x) < 4.0;
         };
         $$1.C().a($$10);
      }
   }

   public static eay.c a(@Nullable eaz $$0, Map<jk, eaz> $$1) {
      List<eay.c> $$2 = Lists.newArrayList();
      if ($$0 != null) {
         $$2.add(a(null, $$0));
      }

      $$1.forEach(($$1x, $$2x) -> $$2.add(a($$1x, $$2x)));
      return ($$1x, $$2x, $$3) -> {
         double $$4 = Double.POSITIVE_INFINITY;

         for (eay.c $$5 : $$2) {
            double $$6 = $$5.getDistance($$1x, $$2x, $$3);
            if ($$6 < $$4) {
               $$4 = $$6;
            }
         }

         return $$4;
      };
   }

   private static eay.c a(@Nullable jk $$0, eaz $$1) {
      double $$2 = 0.0;
      double $$3 = 0.0;
      if ($$0 != null) {
         for (jj $$4 : $$0.a()) {
            $$2 += (double)($$4.j() * 16);
            $$3 += (double)($$4.l() * 16);
         }
      }

      double $$5 = $$2;
      double $$6 = $$3;
      double $$7 = (double)$$1.b().H_() / 2.0;
      double $$8 = (double)$$1.b().G_() + $$7;
      return ($$4x, $$5x, $$6x) -> a($$4x - 8.0 - $$5, $$5x - $$8, $$6x - 8.0 - $$6, 8.0, $$7, 8.0);
   }

   private static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = Math.abs($$0) - $$3;
      double $$7 = Math.abs($$1) - $$4;
      double $$8 = Math.abs($$2) - $$5;
      return azc.g(Math.max(0.0, $$6), Math.max(0.0, $$7), Math.max(0.0, $$8));
   }

   public static record a(double a, double b) {
   }

   interface b {
      double get(eaz var1, int var2, int var3, int var4);
   }

   public interface c {
      double getDistance(double var1, double var3, double var5);
   }
}
