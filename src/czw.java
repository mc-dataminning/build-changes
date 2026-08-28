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

public class czw {
   private static final float a = 0.15F;

   public static int a(czv $$0, cuk $$1) {
      daa $$2 = $$1.a(km.j, daa.a);
      return $$2.a($$0);
   }

   public static daa a(cuk $$0, Consumer<daa.a> $$1) {
      kl<daa> $$2 = l($$0);
      daa $$3 = $$0.a($$2);
      if ($$3 == null) {
         return daa.a;
      } else {
         daa.a $$4 = new daa.a($$3);
         $$1.accept($$4);
         daa $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cuk $$0) {
      return $$0.b(l($$0));
   }

   public static void a(cuk $$0, daa $$1) {
      $$0.b(l($$0), $$1);
   }

   public static daa b(cuk $$0) {
      return $$0.a(l($$0), daa.a);
   }

   private static kl<daa> l(cuk $$0) {
      return $$0.a(cun.uw) ? km.x : km.j;
   }

   public static boolean c(cuk $$0) {
      return !$$0.a(km.j, daa.a).d() || !$$0.a(km.x, daa.a).d();
   }

   public static float a(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }

   private static void a(czw.a $$0, cuk $$1) {
      daa $$2 = $$1.a(km.j, daa.a);

      for (Entry<ji<czv>> $$3 : $$2.b()) {
         $$0.accept((czv)((ji)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(czw.a $$0, Iterable<cuk> $$1) {
      for (cuk $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cuk> $$0, bri $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cuk $$0, @Nullable bsv<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(btk $$0) {
      int $$1 = a(czy.t, $$0);
      return $$1 > 0 ? a($$1) : 0.0F;
   }

   public static float a(@Nullable bsp $$0, float $$1) {
      if ($$0 instanceof btk $$2) {
         int $$3 = a(czy.M, $$2);
         if ($$3 > 0) {
            return czr.a((float)$$3, $$1);
         }
      }

      return $$1;
   }

   public static void a(btk $$0, bsp $$1) {
      czw.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$1 instanceof cms) {
         a($$2, $$0.eX());
      }
   }

   public static void b(btk $$0, bsp $$1) {
      czw.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$0 instanceof cms) {
         a($$2, $$0.eX());
      }
   }

   public static void a(btk $$0, bsp $$1, daa $$2) {
      for (Entry<ji<czv>> $$3 : $$2.b()) {
         ((czv)((ji)$$3.getKey()).a()).c($$0, $$1, $$3.getIntValue());
      }
   }

   public static int a(czv $$0, btk $$1) {
      Iterable<cuk> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cuk $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(btk $$0) {
      return (float)a(czy.m, $$0) * 0.15F;
   }

   public static int c(btk $$0) {
      return a(czy.q, $$0);
   }

   public static int d(btk $$0) {
      return a(czy.r, $$0);
   }

   public static int e(btk $$0) {
      return a(czy.f, $$0);
   }

   public static int f(btk $$0) {
      return a(czy.i, $$0);
   }

   public static int g(btk $$0) {
      return a(czy.u, $$0);
   }

   public static int d(cuk $$0) {
      return a(czy.C, $$0);
   }

   public static int e(cuk $$0) {
      return a(czy.D, $$0);
   }

   public static int h(btk $$0) {
      return a(czy.s, $$0);
   }

   public static boolean i(btk $$0) {
      return a(czy.g, $$0) > 0;
   }

   public static boolean j(btk $$0) {
      return a(czy.j, $$0) > 0;
   }

   public static boolean k(btk $$0) {
      return a(czy.l, $$0) > 0;
   }

   public static boolean f(cuk $$0) {
      return a(czy.k, $$0) > 0;
   }

   public static boolean g(cuk $$0) {
      return a(czy.P, $$0) > 0;
   }

   public static boolean h(cuk $$0) {
      return a(czy.v, $$0) > 0;
   }

   public static int i(cuk $$0) {
      return a(czy.E, $$0);
   }

   public static int j(cuk $$0) {
      return a(czy.G, $$0);
   }

   public static boolean k(cuk $$0) {
      return a(czy.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<bsw, cuk> b(czv $$0, btk $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<bsw, cuk> a(czv $$0, btk $$1, Predicate<cuk> $$2) {
      Map<bsw, cuk> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<bsw, cuk>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<bsw, cuk> $$5 : $$3.entrySet()) {
            cuk $$6 = $$5.getValue();
            if (!$$6.e() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.el().a($$4.size()));
      }
   }

   public static int a(azc $$0, int $$1, int $$2, cuk $$3) {
      cuf $$4 = $$3.g();
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

   public static cuk a(cpg $$0, azc $$1, cuk $$2, int $$3, boolean $$4) {
      List<czx> $$5 = b($$0, $$1, $$2, $$3, $$4);
      if ($$2.a(cun.qP)) {
         $$2 = new cuk(cun.uw);
      }

      for (czx $$6 : $$5) {
         $$2.a($$6.a, $$6.b);
      }

      return $$2;
   }

   public static List<czx> b(cpg $$0, azc $$1, cuk $$2, int $$3, boolean $$4) {
      List<czx> $$5 = Lists.newArrayList();
      cuf $$6 = $$2.g();
      int $$7 = $$6.g();
      if ($$7 <= 0) {
         return $$5;
      } else {
         $$3 += 1 + $$1.a($$7 / 4 + 1) + $$1.a($$7 / 4 + 1);
         float $$8 = ($$1.i() + $$1.i() - 1.0F) * 0.15F;
         $$3 = ayu.a(Math.round((float)$$3 + (float)$$3 * $$8), 1, Integer.MAX_VALUE);
         List<czx> $$9 = a($$0, $$3, $$2, $$4);
         if (!$$9.isEmpty()) {
            bpc.a($$1, $$9).ifPresent($$5::add);

            while ($$1.a(50) <= $$3) {
               if (!$$5.isEmpty()) {
                  a($$9, ac.c($$5));
               }

               if ($$9.isEmpty()) {
                  break;
               }

               bpc.a($$1, $$9).ifPresent($$5::add);
               $$3 /= 2;
            }
         }

         return $$5;
      }
   }

   public static void a(List<czx> $$0, czx $$1) {
      Iterator<czx> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ji<czv>> $$0, czv $$1) {
      for (ji<czv> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<czx> a(cpg $$0, int $$1, cuk $$2, boolean $$3) {
      List<czx> $$4 = Lists.newArrayList();
      boolean $$5 = $$2.a(cun.qP);

      for (czv $$6 : lp.f) {
         if ($$6.a($$0) && (!$$6.a() || $$3) && $$6.l() && ($$5 || $$6.b($$2) && $$6.a($$2))) {
            for (int $$7 = $$6.g(); $$7 > $$6.f() - 1; $$7--) {
               if ($$1 >= $$6.c($$7) && $$1 <= $$6.d($$7)) {
                  $$4.add(new czx($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$4;
   }

   @FunctionalInterface
   interface a {
      void accept(czv var1, int var2);
   }
}
