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

public class czc {
   private static final float a = 0.15F;

   public static int a(czb $$0, ctq $$1) {
      czg $$2 = $$1.a(kb.j, czg.a);
      return $$2.a($$0);
   }

   public static czg a(ctq $$0, Consumer<czg.a> $$1) {
      ka<czg> $$2 = l($$0);
      czg $$3 = $$0.a($$2);
      if ($$3 == null) {
         return czg.a;
      } else {
         czg.a $$4 = new czg.a($$3);
         $$1.accept($$4);
         czg $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(ctq $$0) {
      return $$0.b(l($$0));
   }

   public static void a(ctq $$0, czg $$1) {
      $$0.b(l($$0), $$1);
   }

   public static czg b(ctq $$0) {
      return $$0.a(l($$0), czg.a);
   }

   private static ka<czg> l(ctq $$0) {
      return $$0.a(ctt.uw) ? kb.x : kb.j;
   }

   public static boolean c(ctq $$0) {
      return !$$0.a(kb.j, czg.a).d() || !$$0.a(kb.x, czg.a).d();
   }

   public static float a(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }

   private static void a(czc.a $$0, ctq $$1) {
      czg $$2 = $$1.a(kb.j, czg.a);

      for (Entry<ix<czb>> $$3 : $$2.b()) {
         $$0.accept((czb)((ix)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(czc.a $$0, Iterable<ctq> $$1) {
      for (ctq $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<ctq> $$0, bqp $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(ctq $$0, @Nullable bsc<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bsq $$0) {
      int $$1 = a(cze.t, $$0);
      return $$1 > 0 ? a($$1) : 0.0F;
   }

   public static float a(@Nullable brw $$0, float $$1) {
      if ($$0 instanceof bsq $$2) {
         int $$3 = a(cze.M, $$2);
         if ($$3 > 0) {
            return cyx.a((float)$$3, $$1);
         }
      }

      return $$1;
   }

   public static void a(bsq $$0, brw $$1) {
      czc.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$1 instanceof cly) {
         a($$2, $$0.eX());
      }
   }

   public static void b(bsq $$0, brw $$1) {
      czc.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$0 instanceof cly) {
         a($$2, $$0.eX());
      }
   }

   public static void a(bsq $$0, brw $$1, czg $$2) {
      for (Entry<ix<czb>> $$3 : $$2.b()) {
         ((czb)((ix)$$3.getKey()).a()).c($$0, $$1, $$3.getIntValue());
      }
   }

   public static int a(czb $$0, bsq $$1) {
      Iterable<ctq> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (ctq $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bsq $$0) {
      return (float)a(cze.m, $$0) * 0.15F;
   }

   public static int c(bsq $$0) {
      return a(cze.q, $$0);
   }

   public static int d(bsq $$0) {
      return a(cze.r, $$0);
   }

   public static int e(bsq $$0) {
      return a(cze.f, $$0);
   }

   public static int f(bsq $$0) {
      return a(cze.i, $$0);
   }

   public static int g(bsq $$0) {
      return a(cze.u, $$0);
   }

   public static int d(ctq $$0) {
      return a(cze.C, $$0);
   }

   public static int e(ctq $$0) {
      return a(cze.D, $$0);
   }

   public static int h(bsq $$0) {
      return a(cze.s, $$0);
   }

   public static boolean i(bsq $$0) {
      return a(cze.g, $$0) > 0;
   }

   public static boolean j(bsq $$0) {
      return a(cze.j, $$0) > 0;
   }

   public static boolean k(bsq $$0) {
      return a(cze.l, $$0) > 0;
   }

   public static boolean f(ctq $$0) {
      return a(cze.k, $$0) > 0;
   }

   public static boolean g(ctq $$0) {
      return a(cze.P, $$0) > 0;
   }

   public static boolean h(ctq $$0) {
      return a(cze.v, $$0) > 0;
   }

   public static int i(ctq $$0) {
      return a(cze.E, $$0);
   }

   public static int j(ctq $$0) {
      return a(cze.G, $$0);
   }

   public static boolean k(ctq $$0) {
      return a(cze.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<bsd, ctq> b(czb $$0, bsq $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<bsd, ctq> a(czb $$0, bsq $$1, Predicate<ctq> $$2) {
      Map<bsd, ctq> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<bsd, ctq>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<bsd, ctq> $$5 : $$3.entrySet()) {
            ctq $$6 = $$5.getValue();
            if (!$$6.e() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.el().a($$4.size()));
      }
   }

   public static int a(aym $$0, int $$1, int $$2, ctq $$3) {
      ctl $$4 = $$3.g();
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

   public static ctq a(col $$0, aym $$1, ctq $$2, int $$3, boolean $$4) {
      List<czd> $$5 = b($$0, $$1, $$2, $$3, $$4);
      if ($$2.a(ctt.qP)) {
         $$2 = new ctq(ctt.uw);
      }

      for (czd $$6 : $$5) {
         $$2.a($$6.a, $$6.b);
      }

      return $$2;
   }

   public static List<czd> b(col $$0, aym $$1, ctq $$2, int $$3, boolean $$4) {
      List<czd> $$5 = Lists.newArrayList();
      ctl $$6 = $$2.g();
      int $$7 = $$6.g();
      if ($$7 <= 0) {
         return $$5;
      } else {
         $$3 += 1 + $$1.a($$7 / 4 + 1) + $$1.a($$7 / 4 + 1);
         float $$8 = ($$1.i() + $$1.i() - 1.0F) * 0.15F;
         $$3 = ayf.a(Math.round((float)$$3 + (float)$$3 * $$8), 1, Integer.MAX_VALUE);
         List<czd> $$9 = a($$0, $$3, $$2, $$4);
         if (!$$9.isEmpty()) {
            boj.a($$1, $$9).ifPresent($$5::add);

            while ($$1.a(50) <= $$3) {
               if (!$$5.isEmpty()) {
                  a($$9, ac.c($$5));
               }

               if ($$9.isEmpty()) {
                  break;
               }

               boj.a($$1, $$9).ifPresent($$5::add);
               $$3 /= 2;
            }
         }

         return $$5;
      }
   }

   public static void a(List<czd> $$0, czd $$1) {
      Iterator<czd> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ix<czb>> $$0, czb $$1) {
      for (ix<czb> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<czd> a(col $$0, int $$1, ctq $$2, boolean $$3) {
      List<czd> $$4 = Lists.newArrayList();
      boolean $$5 = $$2.a(ctt.qP);

      for (czb $$6 : le.f) {
         if ($$6.a($$0) && (!$$6.a() || $$3) && $$6.l() && ($$5 || $$6.b($$2) && $$6.a($$2))) {
            for (int $$7 = $$6.g(); $$7 > $$6.f() - 1; $$7--) {
               if ($$1 >= $$6.c($$7) && $$1 <= $$6.d($$7)) {
                  $$4.add(new czd($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$4;
   }

   @FunctionalInterface
   interface a {
      void accept(czb var1, int var2);
   }
}
