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

public class cza {
   private static final float a = 0.15F;

   public static int a(cyz $$0, cto $$1) {
      cze $$2 = $$1.a(kb.j, cze.a);
      return $$2.a($$0);
   }

   public static cze a(cto $$0, Consumer<cze.a> $$1) {
      ka<cze> $$2 = l($$0);
      cze $$3 = $$0.a($$2);
      if ($$3 == null) {
         return cze.a;
      } else {
         cze.a $$4 = new cze.a($$3);
         $$1.accept($$4);
         cze $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cto $$0) {
      return $$0.b(l($$0));
   }

   public static void a(cto $$0, cze $$1) {
      $$0.b(l($$0), $$1);
   }

   public static cze b(cto $$0) {
      return $$0.a(l($$0), cze.a);
   }

   private static ka<cze> l(cto $$0) {
      return $$0.a(ctr.uw) ? kb.x : kb.j;
   }

   public static boolean c(cto $$0) {
      return !$$0.a(kb.j, cze.a).d() || !$$0.a(kb.x, cze.a).d();
   }

   public static float a(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }

   private static void a(cza.a $$0, cto $$1) {
      cze $$2 = $$1.a(kb.j, cze.a);

      for (Entry<ix<cyz>> $$3 : $$2.b()) {
         $$0.accept((cyz)((ix)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(cza.a $$0, Iterable<cto> $$1) {
      for (cto $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cto> $$0, bqn $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cto $$0, @Nullable bsa<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bso $$0) {
      int $$1 = a(czc.t, $$0);
      return $$1 > 0 ? a($$1) : 0.0F;
   }

   public static float a(@Nullable bru $$0, float $$1) {
      if ($$0 instanceof bso $$2) {
         int $$3 = a(czc.M, $$2);
         if ($$3 > 0) {
            return cyv.a((float)$$3, $$1);
         }
      }

      return $$1;
   }

   public static void a(bso $$0, bru $$1) {
      cza.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$1 instanceof clw) {
         a($$2, $$0.eX());
      }
   }

   public static void b(bso $$0, bru $$1) {
      cza.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$0 instanceof clw) {
         a($$2, $$0.eX());
      }
   }

   public static void a(bso $$0, bru $$1, cze $$2) {
      for (Entry<ix<cyz>> $$3 : $$2.b()) {
         ((cyz)((ix)$$3.getKey()).a()).c($$0, $$1, $$3.getIntValue());
      }
   }

   public static int a(cyz $$0, bso $$1) {
      Iterable<cto> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cto $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bso $$0) {
      return (float)a(czc.m, $$0) * 0.15F;
   }

   public static int c(bso $$0) {
      return a(czc.q, $$0);
   }

   public static int d(bso $$0) {
      return a(czc.r, $$0);
   }

   public static int e(bso $$0) {
      return a(czc.f, $$0);
   }

   public static int f(bso $$0) {
      return a(czc.i, $$0);
   }

   public static int g(bso $$0) {
      return a(czc.u, $$0);
   }

   public static int d(cto $$0) {
      return a(czc.C, $$0);
   }

   public static int e(cto $$0) {
      return a(czc.D, $$0);
   }

   public static int h(bso $$0) {
      return a(czc.s, $$0);
   }

   public static boolean i(bso $$0) {
      return a(czc.g, $$0) > 0;
   }

   public static boolean j(bso $$0) {
      return a(czc.j, $$0) > 0;
   }

   public static boolean k(bso $$0) {
      return a(czc.l, $$0) > 0;
   }

   public static boolean f(cto $$0) {
      return a(czc.k, $$0) > 0;
   }

   public static boolean g(cto $$0) {
      return a(czc.P, $$0) > 0;
   }

   public static boolean h(cto $$0) {
      return a(czc.v, $$0) > 0;
   }

   public static int i(cto $$0) {
      return a(czc.E, $$0);
   }

   public static int j(cto $$0) {
      return a(czc.G, $$0);
   }

   public static boolean k(cto $$0) {
      return a(czc.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<bsb, cto> b(cyz $$0, bso $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<bsb, cto> a(cyz $$0, bso $$1, Predicate<cto> $$2) {
      Map<bsb, cto> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<bsb, cto>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<bsb, cto> $$5 : $$3.entrySet()) {
            cto $$6 = $$5.getValue();
            if (!$$6.e() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.el().a($$4.size()));
      }
   }

   public static int a(ayk $$0, int $$1, int $$2, cto $$3) {
      ctj $$4 = $$3.g();
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

   public static cto a(coj $$0, ayk $$1, cto $$2, int $$3, boolean $$4) {
      List<czb> $$5 = b($$0, $$1, $$2, $$3, $$4);
      if ($$2.a(ctr.qP)) {
         $$2 = new cto(ctr.uw);
      }

      for (czb $$6 : $$5) {
         $$2.a($$6.a, $$6.b);
      }

      return $$2;
   }

   public static List<czb> b(coj $$0, ayk $$1, cto $$2, int $$3, boolean $$4) {
      List<czb> $$5 = Lists.newArrayList();
      ctj $$6 = $$2.g();
      int $$7 = $$6.g();
      if ($$7 <= 0) {
         return $$5;
      } else {
         $$3 += 1 + $$1.a($$7 / 4 + 1) + $$1.a($$7 / 4 + 1);
         float $$8 = ($$1.i() + $$1.i() - 1.0F) * 0.15F;
         $$3 = ayd.a(Math.round((float)$$3 + (float)$$3 * $$8), 1, Integer.MAX_VALUE);
         List<czb> $$9 = a($$0, $$3, $$2, $$4);
         if (!$$9.isEmpty()) {
            boh.a($$1, $$9).ifPresent($$5::add);

            while ($$1.a(50) <= $$3) {
               if (!$$5.isEmpty()) {
                  a($$9, ac.c($$5));
               }

               if ($$9.isEmpty()) {
                  break;
               }

               boh.a($$1, $$9).ifPresent($$5::add);
               $$3 /= 2;
            }
         }

         return $$5;
      }
   }

   public static void a(List<czb> $$0, czb $$1) {
      Iterator<czb> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ix<cyz>> $$0, cyz $$1) {
      for (ix<cyz> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<czb> a(coj $$0, int $$1, cto $$2, boolean $$3) {
      List<czb> $$4 = Lists.newArrayList();
      boolean $$5 = $$2.a(ctr.qP);

      for (cyz $$6 : le.f) {
         if ($$6.a($$0) && (!$$6.a() || $$3) && $$6.l() && ($$5 || $$6.b($$2) && $$6.a($$2))) {
            for (int $$7 = $$6.g(); $$7 > $$6.f() - 1; $$7--) {
               if ($$1 >= $$6.c($$7) && $$1 <= $$6.d($$7)) {
                  $$4.add(new czb($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$4;
   }

   @FunctionalInterface
   interface a {
      void accept(cyz var1, int var2);
   }
}
