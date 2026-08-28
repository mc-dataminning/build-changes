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

public class daa {
   private static final float a = 0.15F;

   public static int a(czz $$0, cuo $$1) {
      dae $$2 = $$1.a(km.k, dae.a);
      return $$2.a($$0);
   }

   public static dae a(cuo $$0, Consumer<dae.a> $$1) {
      kl<dae> $$2 = l($$0);
      dae $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dae.a;
      } else {
         dae.a $$4 = new dae.a($$3);
         $$1.accept($$4);
         dae $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cuo $$0) {
      return $$0.b(l($$0));
   }

   public static void a(cuo $$0, dae $$1) {
      $$0.b(l($$0), $$1);
   }

   public static dae b(cuo $$0) {
      return $$0.a(l($$0), dae.a);
   }

   private static kl<dae> l(cuo $$0) {
      return $$0.a(cur.uw) ? km.y : km.k;
   }

   public static boolean c(cuo $$0) {
      return !$$0.a(km.k, dae.a).d() || !$$0.a(km.y, dae.a).d();
   }

   public static float a(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }

   private static void a(daa.a $$0, cuo $$1) {
      dae $$2 = $$1.a(km.k, dae.a);

      for (Entry<ji<czz>> $$3 : $$2.b()) {
         $$0.accept((czz)((ji)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(daa.a $$0, Iterable<cuo> $$1) {
      for (cuo $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cuo> $$0, brm $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cuo $$0, @Nullable bsz<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bto $$0) {
      int $$1 = a(dac.t, $$0);
      return $$1 > 0 ? a($$1) : 0.0F;
   }

   public static float a(@Nullable bst $$0, float $$1) {
      if ($$0 instanceof bto $$2) {
         int $$3 = a(dac.M, $$2);
         if ($$3 > 0) {
            return czv.a((float)$$3, $$1);
         }
      }

      return $$1;
   }

   public static void a(bto $$0, bst $$1) {
      daa.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$1 instanceof cmw) {
         a($$2, $$0.eX());
      }
   }

   public static void b(bto $$0, bst $$1) {
      daa.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$0 instanceof cmw) {
         a($$2, $$0.eX());
      }
   }

   public static void a(bto $$0, bst $$1, dae $$2) {
      for (Entry<ji<czz>> $$3 : $$2.b()) {
         ((czz)((ji)$$3.getKey()).a()).c($$0, $$1, $$3.getIntValue());
      }
   }

   public static int a(czz $$0, bto $$1) {
      Iterable<cuo> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cuo $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bto $$0) {
      return (float)a(dac.m, $$0) * 0.15F;
   }

   public static int c(bto $$0) {
      return a(dac.q, $$0);
   }

   public static int d(bto $$0) {
      return a(dac.r, $$0);
   }

   public static int e(bto $$0) {
      return a(dac.f, $$0);
   }

   public static int f(bto $$0) {
      return a(dac.i, $$0);
   }

   public static int g(bto $$0) {
      return a(dac.u, $$0);
   }

   public static int d(cuo $$0) {
      return a(dac.C, $$0);
   }

   public static int e(cuo $$0) {
      return a(dac.D, $$0);
   }

   public static int h(bto $$0) {
      return a(dac.s, $$0);
   }

   public static boolean i(bto $$0) {
      return a(dac.g, $$0) > 0;
   }

   public static boolean j(bto $$0) {
      return a(dac.j, $$0) > 0;
   }

   public static boolean k(bto $$0) {
      return a(dac.l, $$0) > 0;
   }

   public static boolean f(cuo $$0) {
      return a(dac.k, $$0) > 0;
   }

   public static boolean g(cuo $$0) {
      return a(dac.P, $$0) > 0;
   }

   public static boolean h(cuo $$0) {
      return a(dac.v, $$0) > 0;
   }

   public static int i(cuo $$0) {
      return a(dac.E, $$0);
   }

   public static int j(cuo $$0) {
      return a(dac.G, $$0);
   }

   public static boolean k(cuo $$0) {
      return a(dac.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<bta, cuo> b(czz $$0, bto $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<bta, cuo> a(czz $$0, bto $$1, Predicate<cuo> $$2) {
      Map<bta, cuo> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<bta, cuo>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<bta, cuo> $$5 : $$3.entrySet()) {
            cuo $$6 = $$5.getValue();
            if (!$$6.e() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.el().a($$4.size()));
      }
   }

   public static int a(azg $$0, int $$1, int $$2, cuo $$3) {
      cuj $$4 = $$3.g();
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

   public static cuo a(cpk $$0, azg $$1, cuo $$2, int $$3, boolean $$4) {
      List<dab> $$5 = b($$0, $$1, $$2, $$3, $$4);
      if ($$2.a(cur.qP)) {
         $$2 = new cuo(cur.uw);
      }

      for (dab $$6 : $$5) {
         $$2.a($$6.a, $$6.b);
      }

      return $$2;
   }

   public static List<dab> b(cpk $$0, azg $$1, cuo $$2, int $$3, boolean $$4) {
      List<dab> $$5 = Lists.newArrayList();
      cuj $$6 = $$2.g();
      int $$7 = $$6.g();
      if ($$7 <= 0) {
         return $$5;
      } else {
         $$3 += 1 + $$1.a($$7 / 4 + 1) + $$1.a($$7 / 4 + 1);
         float $$8 = ($$1.i() + $$1.i() - 1.0F) * 0.15F;
         $$3 = ayy.a(Math.round((float)$$3 + (float)$$3 * $$8), 1, Integer.MAX_VALUE);
         List<dab> $$9 = a($$0, $$3, $$2, $$4);
         if (!$$9.isEmpty()) {
            bpg.a($$1, $$9).ifPresent($$5::add);

            while ($$1.a(50) <= $$3) {
               if (!$$5.isEmpty()) {
                  a($$9, ac.c($$5));
               }

               if ($$9.isEmpty()) {
                  break;
               }

               bpg.a($$1, $$9).ifPresent($$5::add);
               $$3 /= 2;
            }
         }

         return $$5;
      }
   }

   public static void a(List<dab> $$0, dab $$1) {
      Iterator<dab> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ji<czz>> $$0, czz $$1) {
      for (ji<czz> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dab> a(cpk $$0, int $$1, cuo $$2, boolean $$3) {
      List<dab> $$4 = Lists.newArrayList();
      boolean $$5 = $$2.a(cur.qP);

      for (czz $$6 : lp.f) {
         if ($$6.a($$0) && (!$$6.a() || $$3) && $$6.l() && ($$5 || $$6.b($$2) && $$6.a($$2))) {
            for (int $$7 = $$6.g(); $$7 > $$6.f() - 1; $$7--) {
               if ($$1 >= $$6.c($$7) && $$1 <= $$6.d($$7)) {
                  $$4.add(new dab($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$4;
   }

   @FunctionalInterface
   interface a {
      void accept(czz var1, int var2);
   }
}
