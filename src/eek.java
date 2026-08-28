import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableObject;

public class eek {
   private static final eek a = new eek(new Long2ObjectOpenHashMap(), new Long2ObjectOpenHashMap()) {
      @Override
      public eek.a a(int $$0, int $$1) {
         return new eek.a(1.0, 0.0);
      }

      @Override
      public double a(edb.b $$0, double $$1) {
         return $$1;
      }

      @Override
      public dif a(dif $$0) {
         return $$0;
      }
   };
   private static final ess b = ess.b(new eej(42L), ro.a);
   private static final int c = kb.d(7) - 1;
   private static final int d = kb.e(c + 3);
   private static final int e = 2;
   private static final int f = kb.e(5);
   private static final double g = 8.0;
   private final Long2ObjectOpenHashMap<eel> h;
   private final Long2ObjectOpenHashMap<eel> i;

   public static eek a() {
      return a;
   }

   public static eek a(@Nullable asp $$0) {
      if ($$0 == null) {
         return a;
      } else {
         dgg $$1 = $$0.b();
         if (!$$0.a($$1, d)) {
            return a;
         } else {
            Long2ObjectOpenHashMap<eel> $$2 = new Long2ObjectOpenHashMap();
            Long2ObjectOpenHashMap<eel> $$3 = new Long2ObjectOpenHashMap();
            int $$4 = bae.h(d + 1);

            for (int $$5 = -d; $$5 <= d; $$5++) {
               for (int $$6 = -d; $$6 <= d; $$6++) {
                  if ($$5 * $$5 + $$6 * $$6 <= $$4) {
                     int $$7 = $$1.g + $$5;
                     int $$8 = $$1.h + $$6;
                     eel $$9 = eel.a($$0, $$7, $$8);
                     if ($$9 != null) {
                        $$2.put(dgg.c($$7, $$8), $$9);
                        if ($$5 >= -f && $$5 <= f && $$6 >= -f && $$6 <= f) {
                           $$3.put(dgg.c($$7, $$8), $$9);
                        }
                     }
                  }
               }
            }

            return $$2.isEmpty() && $$3.isEmpty() ? a : new eek($$2, $$3);
         }
      }
   }

   eek(Long2ObjectOpenHashMap<eel> $$0, Long2ObjectOpenHashMap<eel> $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public eek.a a(int $$0, int $$1) {
      int $$2 = kb.a($$0);
      int $$3 = kb.a($$1);
      double $$4 = this.a($$2, 0, $$3, eel::a);
      if ($$4 != Double.MAX_VALUE) {
         return new eek.a(0.0, a($$4));
      } else {
         MutableDouble $$5 = new MutableDouble(0.0);
         MutableDouble $$6 = new MutableDouble(0.0);
         MutableDouble $$7 = new MutableDouble(Double.POSITIVE_INFINITY);
         this.h.forEach(($$5x, $$6x) -> $$6x.a(kb.d(dgg.a($$5x)), kb.d(dgg.b($$5x)), ($$5xx, $$6xx, $$7x) -> {
               double $$8x = (double)bae.f((float)($$2 - $$5xx), (float)($$3 - $$6xx));
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
            return new eek.a(1.0, 0.0);
         } else {
            double $$8 = $$6.doubleValue() / $$5.doubleValue();
            double $$9 = bae.a($$7.doubleValue() / (double)(c + 1), 0.0, 1.0);
            $$9 = 3.0 * $$9 * $$9 - 2.0 * $$9 * $$9 * $$9;
            return new eek.a($$9, a($$8));
         }
      }
   }

   private static double a(double $$0) {
      double $$1 = 1.0;
      double $$2 = $$0 + 0.5;
      double $$3 = bae.c($$2, 8.0);
      return 1.0 * (32.0 * ($$2 - 128.0) - 3.0 * ($$2 - 120.0) * $$3 + 3.0 * $$3 * $$3) / (128.0 * (32.0 - 3.0 * $$3));
   }

   public double a(edb.b $$0, double $$1) {
      int $$2 = kb.a($$0.a());
      int $$3 = $$0.b() / 8;
      int $$4 = kb.a($$0.c());
      double $$5 = this.a($$2, $$3, $$4, eel::b);
      if ($$5 != Double.MAX_VALUE) {
         return $$5;
      } else {
         MutableDouble $$6 = new MutableDouble(0.0);
         MutableDouble $$7 = new MutableDouble(0.0);
         MutableDouble $$8 = new MutableDouble(Double.POSITIVE_INFINITY);
         this.i.forEach(($$6x, $$7x) -> $$7x.a(kb.d(dgg.a($$6x)), kb.d(dgg.b($$6x)), $$3 - 1, $$3 + 1, ($$6xx, $$7xx, $$8x, $$9x) -> {
               double $$10x = bae.g((double)($$2 - $$6xx), (double)(($$3 - $$7xx) * 2), (double)($$4 - $$8x));
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
            double $$10 = bae.a($$8.doubleValue() / 3.0, 0.0, 1.0);
            return bae.d($$10, $$9, $$1);
         }
      }
   }

   private double a(int $$0, int $$1, int $$2, eek.b $$3) {
      int $$4 = kb.e($$0);
      int $$5 = kb.e($$2);
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

   private double a(eek.b $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      eel $$6 = (eel)this.h.get(dgg.c($$1, $$2));
      return $$6 != null ? $$0.get($$6, $$3 - kb.d($$1), $$4, $$5 - kb.d($$2)) : Double.MAX_VALUE;
   }

   public dif a(dif $$0) {
      return ($$1, $$2, $$3, $$4) -> {
         jq<dic> $$5 = this.a($$1, $$2, $$3);
         return $$5 == null ? $$0.getNoiseBiome($$1, $$2, $$3, $$4) : $$5;
      };
   }

   @Nullable
   private jq<dic> a(int $$0, int $$1, int $$2) {
      MutableDouble $$3 = new MutableDouble(Double.POSITIVE_INFINITY);
      MutableObject<jq<dic>> $$4 = new MutableObject();
      this.h.forEach(($$5x, $$6x) -> $$6x.a(kb.d(dgg.a($$5x)), $$1, kb.d(dgg.b($$5x)), ($$4xx, $$5xx, $$6xx) -> {
            double $$7 = (double)bae.f((float)($$0 - $$4xx), (float)($$2 - $$5xx));
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
         double $$6 = bae.a(($$3.doubleValue() + $$5) / (double)(c + 1), 0.0, 1.0);
         return $$6 > 0.5 ? null : (jq)$$4.getValue();
      }
   }

   public static void a(asp $$0, dzi $$1) {
      dgg $$2 = $$1.f();
      boolean $$3 = $$1.r();
      jh.a $$4 = new jh.a();
      jh $$5 = new jh($$2.d(), 0, $$2.e());
      eel $$6 = $$1.s();
      if ($$6 != null) {
         int $$7 = $$6.b().L_();
         int $$8 = $$6.b().am();
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

         for (jm $$11 : jm.c.a) {
            if ($$0.a($$2.g + $$11.j(), $$2.h + $$11.l()).r() != $$3) {
               int $$12 = $$11 == jm.f ? 15 : 0;
               int $$13 = $$11 == jm.e ? 0 : 15;
               int $$14 = $$11 == jm.d ? 15 : 0;
               int $$15 = $$11 == jm.c ? 0 : 15;

               for (int $$16 = $$12; $$16 <= $$13; $$16++) {
                  for (int $$17 = $$14; $$17 <= $$15; $$17++) {
                     int $$18 = Math.min($$8, $$1.a(edi.a.e, $$16, $$17)) + 1;

                     for (int $$19 = $$7; $$19 < $$18; $$19++) {
                        a($$1, $$4.a($$5, $$16, $$19, $$17));
                     }
                  }
               }
            }
         }
      }
   }

   private static void a(dzi $$0, jh $$1) {
      dxn $$2 = $$0.a_($$1);
      if ($$2.a(axu.Q)) {
         $$0.e($$1);
      }

      etp $$3 = $$0.b_($$1);
      if (!$$3.c()) {
         $$0.e($$1);
      }
   }

   public static void a(dhy $$0, eac $$1) {
      dgg $$2 = $$1.f();
      Builder<jn, eel> $$3 = ImmutableMap.builder();

      for (jn $$4 : jn.values()) {
         int $$5 = $$2.g + $$4.b();
         int $$6 = $$2.h + $$4.c();
         eel $$7 = $$0.a($$5, $$6).s();
         if ($$7 != null) {
            $$3.put($$4, $$7);
         }
      }

      ImmutableMap<jn, eel> $$8 = $$3.build();
      if ($$1.r() || !$$8.isEmpty()) {
         eek.c $$9 = a($$1.s(), $$8);
         dzh.a $$10 = ($$1x, $$2x, $$3x) -> {
            double $$4x = (double)$$1x + 0.5 + b.a((double)$$1x, (double)$$2x, (double)$$3x) * 4.0;
            double $$5x = (double)$$2x + 0.5 + b.a((double)$$2x, (double)$$3x, (double)$$1x) * 4.0;
            double $$6x = (double)$$3x + 0.5 + b.a((double)$$3x, (double)$$1x, (double)$$2x) * 4.0;
            return $$9.getDistance($$4x, $$5x, $$6x) < 4.0;
         };
         $$1.C().a($$10);
      }
   }

   public static eek.c a(@Nullable eel $$0, Map<jn, eel> $$1) {
      List<eek.c> $$2 = Lists.newArrayList();
      if ($$0 != null) {
         $$2.add(a(null, $$0));
      }

      $$1.forEach(($$1x, $$2x) -> $$2.add(a($$1x, $$2x)));
      return ($$1x, $$2x, $$3) -> {
         double $$4 = Double.POSITIVE_INFINITY;

         for (eek.c $$5 : $$2) {
            double $$6 = $$5.getDistance($$1x, $$2x, $$3);
            if ($$6 < $$4) {
               $$4 = $$6;
            }
         }

         return $$4;
      };
   }

   private static eek.c a(@Nullable jn $$0, eel $$1) {
      double $$2 = 0.0;
      double $$3 = 0.0;
      if ($$0 != null) {
         for (jm $$4 : $$0.a()) {
            $$2 += (double)($$4.j() * 16);
            $$3 += (double)($$4.l() * 16);
         }
      }

      double $$5 = $$2;
      double $$6 = $$3;
      double $$7 = (double)$$1.b().M_() / 2.0;
      double $$8 = (double)$$1.b().L_() + $$7;
      return ($$4x, $$5x, $$6x) -> a($$4x - 8.0 - $$5, $$5x - $$8, $$6x - 8.0 - $$6, 8.0, $$7, 8.0);
   }

   private static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = Math.abs($$0) - $$3;
      double $$7 = Math.abs($$1) - $$4;
      double $$8 = Math.abs($$2) - $$5;
      return bae.g(Math.max(0.0, $$6), Math.max(0.0, $$7), Math.max(0.0, $$8));
   }

   public static record a(double a, double b) {
   }

   interface b {
      double get(eel var1, int var2, int var3, int var4);
   }

   public interface c {
      double getDistance(double var1, double var3, double var5);
   }
}
