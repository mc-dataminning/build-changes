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

public class dad {
   private static final float a = 0.15F;

   public static int a(dac $$0, cur $$1) {
      dah $$2 = $$1.a(km.k, dah.a);
      return $$2.a($$0);
   }

   public static dah a(cur $$0, Consumer<dah.a> $$1) {
      kl<dah> $$2 = l($$0);
      dah $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dah.a;
      } else {
         dah.a $$4 = new dah.a($$3);
         $$1.accept($$4);
         dah $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cur $$0) {
      return $$0.b(l($$0));
   }

   public static void a(cur $$0, dah $$1) {
      $$0.b(l($$0), $$1);
   }

   public static dah b(cur $$0) {
      return $$0.a(l($$0), dah.a);
   }

   private static kl<dah> l(cur $$0) {
      return $$0.a(cuu.uw) ? km.y : km.k;
   }

   public static boolean c(cur $$0) {
      return !$$0.a(km.k, dah.a).d() || !$$0.a(km.y, dah.a).d();
   }

   public static float a(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }

   private static void a(dad.a $$0, cur $$1) {
      dah $$2 = $$1.a(km.k, dah.a);

      for (Entry<ji<dac>> $$3 : $$2.b()) {
         $$0.accept((dac)((ji)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(dad.a $$0, Iterable<cur> $$1) {
      for (cur $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cur> $$0, brp $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cur $$0, @Nullable btc<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(btr $$0) {
      int $$1 = a(daf.t, $$0);
      return $$1 > 0 ? a($$1) : 0.0F;
   }

   public static float a(@Nullable bsw $$0, float $$1) {
      if ($$0 instanceof btr $$2) {
         int $$3 = a(daf.M, $$2);
         if ($$3 > 0) {
            return czy.a((float)$$3, $$1);
         }
      }

      return $$1;
   }

   public static void a(btr $$0, bsw $$1) {
      dad.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$1 instanceof cmz) {
         a($$2, $$0.eX());
      }
   }

   public static void b(btr $$0, bsw $$1) {
      dad.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$0 instanceof cmz) {
         a($$2, $$0.eX());
      }
   }

   public static void a(btr $$0, bsw $$1, dah $$2) {
      for (Entry<ji<dac>> $$3 : $$2.b()) {
         ((dac)((ji)$$3.getKey()).a()).c($$0, $$1, $$3.getIntValue());
      }
   }

   public static int a(dac $$0, btr $$1) {
      Iterable<cur> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cur $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(btr $$0) {
      return (float)a(daf.m, $$0) * 0.15F;
   }

   public static int c(btr $$0) {
      return a(daf.q, $$0);
   }

   public static int d(btr $$0) {
      return a(daf.r, $$0);
   }

   public static int e(btr $$0) {
      return a(daf.f, $$0);
   }

   public static int f(btr $$0) {
      return a(daf.i, $$0);
   }

   public static int g(btr $$0) {
      return a(daf.u, $$0);
   }

   public static int d(cur $$0) {
      return a(daf.C, $$0);
   }

   public static int e(cur $$0) {
      return a(daf.D, $$0);
   }

   public static int h(btr $$0) {
      return a(daf.s, $$0);
   }

   public static boolean i(btr $$0) {
      return a(daf.g, $$0) > 0;
   }

   public static boolean j(btr $$0) {
      return a(daf.j, $$0) > 0;
   }

   public static boolean k(btr $$0) {
      return a(daf.l, $$0) > 0;
   }

   public static boolean f(cur $$0) {
      return a(daf.k, $$0) > 0;
   }

   public static boolean g(cur $$0) {
      return a(daf.P, $$0) > 0;
   }

   public static boolean h(cur $$0) {
      return a(daf.v, $$0) > 0;
   }

   public static int i(cur $$0) {
      return a(daf.E, $$0);
   }

   public static int j(cur $$0) {
      return a(daf.G, $$0);
   }

   public static boolean k(cur $$0) {
      return a(daf.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<btd, cur> b(dac $$0, btr $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<btd, cur> a(dac $$0, btr $$1, Predicate<cur> $$2) {
      Map<btd, cur> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<btd, cur>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<btd, cur> $$5 : $$3.entrySet()) {
            cur $$6 = $$5.getValue();
            if (!$$6.e() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.el().a($$4.size()));
      }
   }

   public static int a(azh $$0, int $$1, int $$2, cur $$3) {
      cum $$4 = $$3.g();
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

   public static cur a(cpn $$0, azh $$1, cur $$2, int $$3, boolean $$4) {
      List<dae> $$5 = b($$0, $$1, $$2, $$3, $$4);
      if ($$2.a(cuu.qP)) {
         $$2 = new cur(cuu.uw);
      }

      for (dae $$6 : $$5) {
         $$2.a($$6.a, $$6.b);
      }

      return $$2;
   }

   public static List<dae> b(cpn $$0, azh $$1, cur $$2, int $$3, boolean $$4) {
      List<dae> $$5 = Lists.newArrayList();
      cum $$6 = $$2.g();
      int $$7 = $$6.g();
      if ($$7 <= 0) {
         return $$5;
      } else {
         $$3 += 1 + $$1.a($$7 / 4 + 1) + $$1.a($$7 / 4 + 1);
         float $$8 = ($$1.i() + $$1.i() - 1.0F) * 0.15F;
         $$3 = ayz.a(Math.round((float)$$3 + (float)$$3 * $$8), 1, Integer.MAX_VALUE);
         List<dae> $$9 = a($$0, $$3, $$2, $$4);
         if (!$$9.isEmpty()) {
            bpj.a($$1, $$9).ifPresent($$5::add);

            while ($$1.a(50) <= $$3) {
               if (!$$5.isEmpty()) {
                  a($$9, ac.c($$5));
               }

               if ($$9.isEmpty()) {
                  break;
               }

               bpj.a($$1, $$9).ifPresent($$5::add);
               $$3 /= 2;
            }
         }

         return $$5;
      }
   }

   public static void a(List<dae> $$0, dae $$1) {
      Iterator<dae> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ji<dac>> $$0, dac $$1) {
      for (ji<dac> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dae> a(cpn $$0, int $$1, cur $$2, boolean $$3) {
      List<dae> $$4 = Lists.newArrayList();
      boolean $$5 = $$2.a(cuu.qP);

      for (dac $$6 : lp.f) {
         if ($$6.a($$0) && (!$$6.a() || $$3) && $$6.l() && ($$5 || $$6.b($$2) && $$6.a($$2))) {
            for (int $$7 = $$6.g(); $$7 > $$6.f() - 1; $$7--) {
               if ($$1 >= $$6.c($$7) && $$1 <= $$6.d($$7)) {
                  $$4.add(new dae($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$4;
   }

   @FunctionalInterface
   interface a {
      void accept(dac var1, int var2);
   }
}
