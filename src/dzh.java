import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableObject;

public class dzh {
   private static final dzh a = new dzh(new Long2ObjectOpenHashMap(), new Long2ObjectOpenHashMap()) {
      @Override
      public dzh.a a(int $$0, int $$1) {
         return new dzh.a(1.0, 0.0);
      }

      @Override
      public double a(dxy.b $$0, double $$1) {
         return $$1;
      }

      @Override
      public ddi a(ddi $$0) {
         return $$0;
      }
   };
   private static final enk b = enk.b(new dzg(42L), qq.a);
   private static final int c = ju.d(7) - 1;
   private static final int d = ju.e(c + 3);
   private static final int e = 2;
   private static final int f = ju.e(5);
   private static final double g = 8.0;
   private final Long2ObjectOpenHashMap<dzi> h;
   private final Long2ObjectOpenHashMap<dzi> i;

   public static dzh a() {
      return a;
   }

   public static dzh a(@Nullable aqt $$0) {
      if ($$0 == null) {
         return a;
      } else {
         dbm $$1 = $$0.a();
         if (!$$0.a($$1, d)) {
            return a;
         } else {
            Long2ObjectOpenHashMap<dzi> $$2 = new Long2ObjectOpenHashMap();
            Long2ObjectOpenHashMap<dzi> $$3 = new Long2ObjectOpenHashMap();
            int $$4 = ayg.h(d + 1);

            for (int $$5 = -d; $$5 <= d; $$5++) {
               for (int $$6 = -d; $$6 <= d; $$6++) {
                  if ($$5 * $$5 + $$6 * $$6 <= $$4) {
                     int $$7 = $$1.e + $$5;
                     int $$8 = $$1.f + $$6;
                     dzi $$9 = dzi.a($$0, $$7, $$8);
                     if ($$9 != null) {
                        $$2.put(dbm.c($$7, $$8), $$9);
                        if ($$5 >= -f && $$5 <= f && $$6 >= -f && $$6 <= f) {
                           $$3.put(dbm.c($$7, $$8), $$9);
                        }
                     }
                  }
               }
            }

            return $$2.isEmpty() && $$3.isEmpty() ? a : new dzh($$2, $$3);
         }
      }
   }

   dzh(Long2ObjectOpenHashMap<dzi> $$0, Long2ObjectOpenHashMap<dzi> $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public dzh.a a(int $$0, int $$1) {
      int $$2 = ju.a($$0);
      int $$3 = ju.a($$1);
      double $$4 = this.a($$2, 0, $$3, dzi::a);
      if ($$4 != Double.MAX_VALUE) {
         return new dzh.a(0.0, a($$4));
      } else {
         MutableDouble $$5 = new MutableDouble(0.0);
         MutableDouble $$6 = new MutableDouble(0.0);
         MutableDouble $$7 = new MutableDouble(Double.POSITIVE_INFINITY);
         this.h.forEach(($$5x, $$6x) -> $$6x.a(ju.d(dbm.a($$5x)), ju.d(dbm.b($$5x)), ($$5xx, $$6xx, $$7x) -> {
               double $$8x = ayg.f((double)($$2 - $$5xx), (double)($$3 - $$6xx));
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
            return new dzh.a(1.0, 0.0);
         } else {
            double $$8 = $$6.doubleValue() / $$5.doubleValue();
            double $$9 = ayg.a($$7.doubleValue() / (double)(c + 1), 0.0, 1.0);
            $$9 = 3.0 * $$9 * $$9 - 2.0 * $$9 * $$9 * $$9;
            return new dzh.a($$9, a($$8));
         }
      }
   }

   private static double a(double $$0) {
      double $$1 = 1.0;
      double $$2 = $$0 + 0.5;
      double $$3 = ayg.c($$2, 8.0);
      return 1.0 * (32.0 * ($$2 - 128.0) - 3.0 * ($$2 - 120.0) * $$3 + 3.0 * $$3 * $$3) / (128.0 * (32.0 - 3.0 * $$3));
   }

   public double a(dxy.b $$0, double $$1) {
      int $$2 = ju.a($$0.a());
      int $$3 = $$0.b() / 8;
      int $$4 = ju.a($$0.c());
      double $$5 = this.a($$2, $$3, $$4, dzi::b);
      if ($$5 != Double.MAX_VALUE) {
         return $$5;
      } else {
         MutableDouble $$6 = new MutableDouble(0.0);
         MutableDouble $$7 = new MutableDouble(0.0);
         MutableDouble $$8 = new MutableDouble(Double.POSITIVE_INFINITY);
         this.i.forEach(($$6x, $$7x) -> $$7x.a(ju.d(dbm.a($$6x)), ju.d(dbm.b($$6x)), $$3 - 1, $$3 + 1, ($$6xx, $$7xx, $$8x, $$9x) -> {
               double $$10x = ayg.g((double)($$2 - $$6xx), (double)(($$3 - $$7xx) * 2), (double)($$4 - $$8x));
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
            double $$10 = ayg.a($$8.doubleValue() / 3.0, 0.0, 1.0);
            return ayg.d($$10, $$9, $$1);
         }
      }
   }

   private double a(int $$0, int $$1, int $$2, dzh.b $$3) {
      int $$4 = ju.e($$0);
      int $$5 = ju.e($$2);
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

   private double a(dzh.b $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      dzi $$6 = (dzi)this.h.get(dbm.c($$1, $$2));
      return $$6 != null ? $$0.get($$6, $$3 - ju.d($$1), $$4, $$5 - ju.d($$2)) : Double.MAX_VALUE;
   }

   public ddi a(ddi $$0) {
      return ($$1, $$2, $$3, $$4) -> {
         jj<ddf> $$5 = this.a($$1, $$2, $$3);
         return $$5 == null ? $$0.getNoiseBiome($$1, $$2, $$3, $$4) : $$5;
      };
   }

   @Nullable
   private jj<ddf> a(int $$0, int $$1, int $$2) {
      MutableDouble $$3 = new MutableDouble(Double.POSITIVE_INFINITY);
      MutableObject<jj<ddf>> $$4 = new MutableObject();
      this.h.forEach(($$5x, $$6x) -> $$6x.a(ju.d(dbm.a($$5x)), $$1, ju.d(dbm.b($$5x)), ($$4xx, $$5xx, $$6xx) -> {
            double $$7 = ayg.f((double)($$0 - $$4xx), (double)($$2 - $$5xx));
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
         double $$6 = ayg.a(($$3.doubleValue() + $$5) / (double)(c + 1), 0.0, 1.0);
         return $$6 > 0.5 ? null : (jj)$$4.getValue();
      }
   }

   public static void a(aqt $$0, dug $$1) {
      dbm $$2 = $$1.f();
      boolean $$3 = $$1.s();
      ja.a $$4 = new ja.a();
      ja $$5 = new ja($$2.d(), 0, $$2.e());
      dzi $$6 = $$1.t();
      if ($$6 != null) {
         int $$7 = $$6.a().I_();
         int $$8 = $$6.a().am() - 1;
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

         for (jf $$11 : jf.c.a) {
            if ($$0.a($$2.e + $$11.j(), $$2.f + $$11.l()).s() != $$3) {
               int $$12 = $$11 == jf.f ? 15 : 0;
               int $$13 = $$11 == jf.e ? 0 : 15;
               int $$14 = $$11 == jf.d ? 15 : 0;
               int $$15 = $$11 == jf.c ? 0 : 15;

               for (int $$16 = $$12; $$16 <= $$13; $$16++) {
                  for (int $$17 = $$14; $$17 <= $$15; $$17++) {
                     int $$18 = Math.min($$8, $$1.a(dyf.a.e, $$16, $$17)) + 1;

                     for (int $$19 = $$7; $$19 < $$18; $$19++) {
                        a($$1, $$4.a($$5, $$16, $$19, $$17));
                     }
                  }
               }
            }
         }
      }
   }

   private static void a(dug $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      if ($$2.a(avw.O)) {
         $$0.e($$1);
      }

      eoh $$3 = $$0.b_($$1);
      if (!$$3.c()) {
         $$0.e($$1);
      }
   }

   public static void a(ddb $$0, dva $$1) {
      dbm $$2 = $$1.f();
      Builder<jg, dzi> $$3 = ImmutableMap.builder();

      for (jg $$4 : jg.values()) {
         int $$5 = $$2.e + $$4.b();
         int $$6 = $$2.f + $$4.c();
         dzi $$7 = $$0.a($$5, $$6).t();
         if ($$7 != null) {
            $$3.put($$4, $$7);
         }
      }

      ImmutableMap<jg, dzi> $$8 = $$3.build();
      if ($$1.s() || !$$8.isEmpty()) {
         dzh.c $$9 = a($$1.t(), $$8);
         duf.a $$10 = ($$1x, $$2x, $$3x) -> {
            double $$4x = (double)$$1x + 0.5 + b.a((double)$$1x, (double)$$2x, (double)$$3x) * 4.0;
            double $$5x = (double)$$2x + 0.5 + b.a((double)$$2x, (double)$$3x, (double)$$1x) * 4.0;
            double $$6x = (double)$$3x + 0.5 + b.a((double)$$3x, (double)$$1x, (double)$$2x) * 4.0;
            return $$9.getDistance($$4x, $$5x, $$6x) < 4.0;
         };
         Stream.of(dyb.a.values()).map($$1::b).forEach($$1x -> $$1x.a($$10));
      }
   }

   public static dzh.c a(@Nullable dzi $$0, Map<jg, dzi> $$1) {
      List<dzh.c> $$2 = Lists.newArrayList();
      if ($$0 != null) {
         $$2.add(a(null, $$0));
      }

      $$1.forEach(($$1x, $$2x) -> $$2.add(a($$1x, $$2x)));
      return ($$1x, $$2x, $$3) -> {
         double $$4 = Double.POSITIVE_INFINITY;

         for (dzh.c $$5 : $$2) {
            double $$6 = $$5.getDistance($$1x, $$2x, $$3);
            if ($$6 < $$4) {
               $$4 = $$6;
            }
         }

         return $$4;
      };
   }

   private static dzh.c a(@Nullable jg $$0, dzi $$1) {
      double $$2 = 0.0;
      double $$3 = 0.0;
      if ($$0 != null) {
         for (jf $$4 : $$0.a()) {
            $$2 += (double)($$4.j() * 16);
            $$3 += (double)($$4.l() * 16);
         }
      }

      double $$5 = $$2;
      double $$6 = $$3;
      double $$7 = (double)$$1.a().J_() / 2.0;
      double $$8 = (double)$$1.a().I_() + $$7;
      return ($$4x, $$5x, $$6x) -> a($$4x - 8.0 - $$5, $$5x - $$8, $$6x - 8.0 - $$6, 8.0, $$7, 8.0);
   }

   private static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = Math.abs($$0) - $$3;
      double $$7 = Math.abs($$1) - $$4;
      double $$8 = Math.abs($$2) - $$5;
      return ayg.g(Math.max(0.0, $$6), Math.max(0.0, $$7), Math.max(0.0, $$8));
   }

   public static record a(double a, double b) {
   }

   interface b {
      double get(dzi var1, int var2, int var3, int var4);
   }

   public interface c {
      double getDistance(double var1, double var3, double var5);
   }
}
