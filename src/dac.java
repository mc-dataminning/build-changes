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

public class dac {
   private static final float a = 0.15F;

   public static int a(dab $$0, cuq $$1) {
      dag $$2 = $$1.a(km.k, dag.a);
      return $$2.a($$0);
   }

   public static dag a(cuq $$0, Consumer<dag.a> $$1) {
      kl<dag> $$2 = l($$0);
      dag $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dag.a;
      } else {
         dag.a $$4 = new dag.a($$3);
         $$1.accept($$4);
         dag $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cuq $$0) {
      return $$0.b(l($$0));
   }

   public static void a(cuq $$0, dag $$1) {
      $$0.b(l($$0), $$1);
   }

   public static dag b(cuq $$0) {
      return $$0.a(l($$0), dag.a);
   }

   private static kl<dag> l(cuq $$0) {
      return $$0.a(cut.uw) ? km.y : km.k;
   }

   public static boolean c(cuq $$0) {
      return !$$0.a(km.k, dag.a).d() || !$$0.a(km.y, dag.a).d();
   }

   public static float a(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }

   private static void a(dac.a $$0, cuq $$1) {
      dag $$2 = $$1.a(km.k, dag.a);

      for (Entry<ji<dab>> $$3 : $$2.b()) {
         $$0.accept((dab)((ji)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(dac.a $$0, Iterable<cuq> $$1) {
      for (cuq $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cuq> $$0, bro $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cuq $$0, @Nullable btb<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(btq $$0) {
      int $$1 = a(dae.t, $$0);
      return $$1 > 0 ? a($$1) : 0.0F;
   }

   public static float a(@Nullable bsv $$0, float $$1) {
      if ($$0 instanceof btq $$2) {
         int $$3 = a(dae.M, $$2);
         if ($$3 > 0) {
            return czx.a((float)$$3, $$1);
         }
      }

      return $$1;
   }

   public static void a(btq $$0, bsv $$1) {
      dac.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$1 instanceof cmy) {
         a($$2, $$0.eX());
      }
   }

   public static void b(btq $$0, bsv $$1) {
      dac.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$0 instanceof cmy) {
         a($$2, $$0.eX());
      }
   }

   public static void a(btq $$0, bsv $$1, dag $$2) {
      for (Entry<ji<dab>> $$3 : $$2.b()) {
         ((dab)((ji)$$3.getKey()).a()).c($$0, $$1, $$3.getIntValue());
      }
   }

   public static int a(dab $$0, btq $$1) {
      Iterable<cuq> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cuq $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(btq $$0) {
      return (float)a(dae.m, $$0) * 0.15F;
   }

   public static int c(btq $$0) {
      return a(dae.q, $$0);
   }

   public static int d(btq $$0) {
      return a(dae.r, $$0);
   }

   public static int e(btq $$0) {
      return a(dae.f, $$0);
   }

   public static int f(btq $$0) {
      return a(dae.i, $$0);
   }

   public static int g(btq $$0) {
      return a(dae.u, $$0);
   }

   public static int d(cuq $$0) {
      return a(dae.C, $$0);
   }

   public static int e(cuq $$0) {
      return a(dae.D, $$0);
   }

   public static int h(btq $$0) {
      return a(dae.s, $$0);
   }

   public static boolean i(btq $$0) {
      return a(dae.g, $$0) > 0;
   }

   public static boolean j(btq $$0) {
      return a(dae.j, $$0) > 0;
   }

   public static boolean k(btq $$0) {
      return a(dae.l, $$0) > 0;
   }

   public static boolean f(cuq $$0) {
      return a(dae.k, $$0) > 0;
   }

   public static boolean g(cuq $$0) {
      return a(dae.P, $$0) > 0;
   }

   public static boolean h(cuq $$0) {
      return a(dae.v, $$0) > 0;
   }

   public static int i(cuq $$0) {
      return a(dae.E, $$0);
   }

   public static int j(cuq $$0) {
      return a(dae.G, $$0);
   }

   public static boolean k(cuq $$0) {
      return a(dae.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<btc, cuq> b(dab $$0, btq $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<btc, cuq> a(dab $$0, btq $$1, Predicate<cuq> $$2) {
      Map<btc, cuq> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<btc, cuq>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<btc, cuq> $$5 : $$3.entrySet()) {
            cuq $$6 = $$5.getValue();
            if (!$$6.e() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.el().a($$4.size()));
      }
   }

   public static int a(azh $$0, int $$1, int $$2, cuq $$3) {
      cul $$4 = $$3.g();
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

   public static cuq a(cpm $$0, azh $$1, cuq $$2, int $$3, boolean $$4) {
      List<dad> $$5 = b($$0, $$1, $$2, $$3, $$4);
      if ($$2.a(cut.qP)) {
         $$2 = new cuq(cut.uw);
      }

      for (dad $$6 : $$5) {
         $$2.a($$6.a, $$6.b);
      }

      return $$2;
   }

   public static List<dad> b(cpm $$0, azh $$1, cuq $$2, int $$3, boolean $$4) {
      List<dad> $$5 = Lists.newArrayList();
      cul $$6 = $$2.g();
      int $$7 = $$6.g();
      if ($$7 <= 0) {
         return $$5;
      } else {
         $$3 += 1 + $$1.a($$7 / 4 + 1) + $$1.a($$7 / 4 + 1);
         float $$8 = ($$1.i() + $$1.i() - 1.0F) * 0.15F;
         $$3 = ayz.a(Math.round((float)$$3 + (float)$$3 * $$8), 1, Integer.MAX_VALUE);
         List<dad> $$9 = a($$0, $$3, $$2, $$4);
         if (!$$9.isEmpty()) {
            bpi.a($$1, $$9).ifPresent($$5::add);

            while ($$1.a(50) <= $$3) {
               if (!$$5.isEmpty()) {
                  a($$9, ac.c($$5));
               }

               if ($$9.isEmpty()) {
                  break;
               }

               bpi.a($$1, $$9).ifPresent($$5::add);
               $$3 /= 2;
            }
         }

         return $$5;
      }
   }

   public static void a(List<dad> $$0, dad $$1) {
      Iterator<dad> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ji<dab>> $$0, dab $$1) {
      for (ji<dab> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dad> a(cpm $$0, int $$1, cuq $$2, boolean $$3) {
      List<dad> $$4 = Lists.newArrayList();
      boolean $$5 = $$2.a(cut.qP);

      for (dab $$6 : lp.f) {
         if ($$6.a($$0) && (!$$6.a() || $$3) && $$6.l() && ($$5 || $$6.b($$2) && $$6.a($$2))) {
            for (int $$7 = $$6.g(); $$7 > $$6.f() - 1; $$7--) {
               if ($$1 >= $$6.c($$7) && $$1 <= $$6.d($$7)) {
                  $$4.add(new dad($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$4;
   }

   @FunctionalInterface
   interface a {
      void accept(dab var1, int var2);
   }
}
