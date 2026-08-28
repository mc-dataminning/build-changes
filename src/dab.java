import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class dab {
   private static final float a = 0.15F;

   public static int a(daa $$0, cup $$1) {
      daf $$2 = $$1.a(km.k, daf.a);
      return $$2.a($$0);
   }

   public static daf a(cup $$0, Consumer<daf.a> $$1) {
      kl<daf> $$2 = l($$0);
      daf $$3 = $$0.a($$2);
      if ($$3 == null) {
         return daf.a;
      } else {
         daf.a $$4 = new daf.a($$3);
         $$1.accept($$4);
         daf $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cup $$0) {
      return $$0.b(l($$0));
   }

   public static void a(cup $$0, daf $$1) {
      $$0.b(l($$0), $$1);
   }

   public static daf b(cup $$0) {
      return $$0.a(l($$0), daf.a);
   }

   private static kl<daf> l(cup $$0) {
      return $$0.a(cus.uw) ? km.y : km.k;
   }

   public static boolean c(cup $$0) {
      return !$$0.a(km.k, daf.a).d() || !$$0.a(km.y, daf.a).d();
   }

   public static float a(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }

   private static void a(dab.a $$0, cup $$1) {
      daf $$2 = $$1.a(km.k, daf.a);

      for (Entry<ji<daa>> $$3 : $$2.b()) {
         $$0.accept((daa)((ji)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(dab.a $$0, Iterable<cup> $$1) {
      for (cup $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cup> $$0, brn $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cup $$0, @Nullable bta<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(btp $$0) {
      int $$1 = a(dad.t, $$0);
      return $$1 > 0 ? a($$1) : 0.0F;
   }

   public static float a(@Nullable bsu $$0, float $$1) {
      if ($$0 instanceof btp $$2) {
         int $$3 = a(dad.M, $$2);
         if ($$3 > 0) {
            return czw.a((float)$$3, $$1);
         }
      }

      return $$1;
   }

   public static void a(btp $$0, bsu $$1) {
      dab.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$1 instanceof cmx) {
         a($$2, $$0.eX());
      }
   }

   public static void b(btp $$0, bsu $$1) {
      dab.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$0 instanceof cmx) {
         a($$2, $$0.eX());
      }
   }

   public static void a(btp $$0, bsu $$1, daf $$2) {
      for (Entry<ji<daa>> $$3 : $$2.b()) {
         ((daa)((ji)$$3.getKey()).a()).c($$0, $$1, $$3.getIntValue());
      }
   }

   public static int a(daa $$0, btp $$1) {
      Iterable<cup> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cup $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(btp $$0) {
      return (float)a(dad.m, $$0) * 0.15F;
   }

   public static int c(btp $$0) {
      return a(dad.q, $$0);
   }

   public static int d(btp $$0) {
      return a(dad.r, $$0);
   }

   public static int e(btp $$0) {
      return a(dad.f, $$0);
   }

   public static int f(btp $$0) {
      return a(dad.i, $$0);
   }

   public static int g(btp $$0) {
      return a(dad.u, $$0);
   }

   public static int d(cup $$0) {
      return a(dad.C, $$0);
   }

   public static int e(cup $$0) {
      return a(dad.D, $$0);
   }

   public static int h(btp $$0) {
      return a(dad.s, $$0);
   }

   public static boolean i(btp $$0) {
      return a(dad.g, $$0) > 0;
   }

   public static boolean j(btp $$0) {
      return a(dad.j, $$0) > 0;
   }

   public static boolean k(btp $$0) {
      return a(dad.l, $$0) > 0;
   }

   public static boolean f(cup $$0) {
      return a(dad.k, $$0) > 0;
   }

   public static boolean g(cup $$0) {
      return a(dad.P, $$0) > 0;
   }

   public static boolean h(cup $$0) {
      return a(dad.v, $$0) > 0;
   }

   public static int i(cup $$0) {
      return a(dad.E, $$0);
   }

   public static int j(cup $$0) {
      return a(dad.G, $$0);
   }

   public static boolean k(cup $$0) {
      return a(dad.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<btb, cup> b(daa $$0, btp $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<btb, cup> a(daa $$0, btp $$1, Predicate<cup> $$2) {
      Map<btb, cup> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<btb, cup>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<btb, cup> $$5 : $$3.entrySet()) {
            cup $$6 = $$5.getValue();
            if (!$$6.e() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.el().a($$4.size()));
      }
   }

   public static int a(azh $$0, int $$1, int $$2, cup $$3) {
      cuk $$4 = $$3.g();
      int $$5 = $$4.g();
      if ($$5 <= 0) {
         return 0;
      } else {
         if ($$2 > 15) {
            $$2 = 15;
         }

         int $$6 = $$0.a(8) + 1 + ($$2 >> 1) + $$0.a($$2 + 1);
         if ($$1 == 0) {
            return Math.max($$6 / 3, 1);
         } else {
            return $$1 == 1 ? $$6 * 2 / 3 + 1 : Math.max($$6, $$2 * 2);
         }
      }
   }

   public static cup a(cpl $$0, azh $$1, cup $$2, int $$3, boolean $$4) {
      List<dac> $$5 = b($$0, $$1, $$2, $$3, $$4);
      if ($$2.a(cus.qP)) {
         $$2 = new cup(cus.uw);
      }

      for (dac $$6 : $$5) {
         $$2.a($$6.a, $$6.b);
      }

      return $$2;
   }

   public static List<dac> b(cpl $$0, azh $$1, cup $$2, int $$3, boolean $$4) {
      List<dac> $$5 = Lists.newArrayList();
      cuk $$6 = $$2.g();
      int $$7 = $$6.g();
      if ($$7 <= 0) {
         return $$5;
      } else {
         $$3 += 1 + $$1.a($$7 / 4 + 1) + $$1.a($$7 / 4 + 1);
         float $$8 = ($$1.i() + $$1.i() - 1.0F) * 0.15F;
         $$3 = ayz.a(Math.round((float)$$3 + (float)$$3 * $$8), 1, Integer.MAX_VALUE);
         List<dac> $$9 = a($$0, $$3, $$2, $$4);
         if (!$$9.isEmpty()) {
            bph.a($$1, $$9).ifPresent($$5::add);

            while ($$1.a(50) <= $$3) {
               if (!$$5.isEmpty()) {
                  a($$9, ac.c($$5));
               }

               if ($$9.isEmpty()) {
                  break;
               }

               bph.a($$1, $$9).ifPresent($$5::add);
               $$3 /= 2;
            }
         }

         return $$5;
      }
   }

   public static void a(List<dac> $$0, dac $$1) {
      Iterator<dac> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ji<daa>> $$0, daa $$1) {
      for (ji<daa> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dac> a(cpl $$0, int $$1, cup $$2, boolean $$3) {
      List<dac> $$4 = Lists.newArrayList();
      boolean $$5 = $$2.a(cus.qP);

      for (daa $$6 : lp.f) {
         if ($$6.a($$0) && (!$$6.a() || $$3) && $$6.l() && ($$5 || $$6.b($$2) && $$6.a($$2))) {
            for (int $$7 = $$6.g(); $$7 > $$6.f() - 1; $$7--) {
               if ($$1 >= $$6.c($$7) && $$1 <= $$6.d($$7)) {
                  $$4.add(new dac($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$4;
   }

   @FunctionalInterface
   interface a {
      void accept(daa var1, int var2);
   }
}
