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

public class cyh {
   private static final float a = 0.15F;

   public static int a(cyg $$0, csz $$1) {
      cyl $$2 = $$1.a(ka.i, cyl.a);
      return $$2.a($$0);
   }

   public static cyl a(csz $$0, Consumer<cyl.a> $$1) {
      jz<cyl> $$2 = l($$0);
      cyl $$3 = $$0.a($$2);
      if ($$3 == null) {
         return cyl.a;
      } else {
         cyl.a $$4 = new cyl.a($$3);
         $$1.accept($$4);
         cyl $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(csz $$0) {
      return $$0.b(l($$0));
   }

   public static void a(csz $$0, cyl $$1) {
      $$0.b(l($$0), $$1);
   }

   public static cyl b(csz $$0) {
      return $$0.a(l($$0), cyl.a);
   }

   private static jz<cyl> l(csz $$0) {
      return $$0.a(ctc.uw) ? ka.w : ka.i;
   }

   public static boolean c(csz $$0) {
      return !$$0.a(ka.i, cyl.a).d() || !$$0.a(ka.w, cyl.a).d();
   }

   public static float a(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }

   private static void a(cyh.a $$0, csz $$1) {
      cyl $$2 = $$1.a(ka.i, cyl.a);

      for (Entry<iw<cyg>> $$3 : $$2.b()) {
         $$0.accept((cyg)((iw)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(cyh.a $$0, Iterable<csz> $$1) {
      for (csz $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<csz> $$0, bqf $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(csz $$0, @Nullable brn<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bsa $$0) {
      int $$1 = a(cyj.t, $$0);
      return $$1 > 0 ? a($$1) : 0.0F;
   }

   public static void a(bsa $$0, brh $$1) {
      cyh.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fa());
      }

      if ($$1 instanceof clh) {
         a($$2, $$0.eV());
      }
   }

   public static void b(bsa $$0, brh $$1) {
      cyh.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fa());
      }

      if ($$0 instanceof clh) {
         a($$2, $$0.eV());
      }
   }

   public static int a(cyg $$0, bsa $$1) {
      Iterable<csz> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (csz $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bsa $$0) {
      return (float)a(cyj.m, $$0) * 0.15F;
   }

   public static int c(bsa $$0) {
      return a(cyj.q, $$0);
   }

   public static int d(bsa $$0) {
      return a(cyj.r, $$0);
   }

   public static int e(bsa $$0) {
      return a(cyj.f, $$0);
   }

   public static int f(bsa $$0) {
      return a(cyj.i, $$0);
   }

   public static int g(bsa $$0) {
      return a(cyj.u, $$0);
   }

   public static int d(csz $$0) {
      return a(cyj.C, $$0);
   }

   public static int e(csz $$0) {
      return a(cyj.D, $$0);
   }

   public static int h(bsa $$0) {
      return a(cyj.s, $$0);
   }

   public static boolean i(bsa $$0) {
      return a(cyj.g, $$0) > 0;
   }

   public static boolean j(bsa $$0) {
      return a(cyj.j, $$0) > 0;
   }

   public static boolean k(bsa $$0) {
      return a(cyj.l, $$0) > 0;
   }

   public static boolean f(csz $$0) {
      return a(cyj.k, $$0) > 0;
   }

   public static boolean g(csz $$0) {
      return a(cyj.M, $$0) > 0;
   }

   public static boolean h(csz $$0) {
      return a(cyj.v, $$0) > 0;
   }

   public static int i(csz $$0) {
      return a(cyj.E, $$0);
   }

   public static int j(csz $$0) {
      return a(cyj.G, $$0);
   }

   public static boolean k(csz $$0) {
      return a(cyj.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<bro, csz> b(cyg $$0, bsa $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<bro, csz> a(cyg $$0, bsa $$1, Predicate<csz> $$2) {
      Map<bro, csz> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<bro, csz>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<bro, csz> $$5 : $$3.entrySet()) {
            csz $$6 = $$5.getValue();
            if (!$$6.d() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ej().a($$4.size()));
      }
   }

   public static int a(ayg $$0, int $$1, int $$2, csz $$3) {
      csu $$4 = $$3.f();
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

   public static csz a(ayg $$0, csz $$1, int $$2, boolean $$3) {
      List<cyi> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(ctc.qP)) {
         $$1 = new csz(ctc.uw);
      }

      for (cyi $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<cyi> b(ayg $$0, csz $$1, int $$2, boolean $$3) {
      List<cyi> $$4 = Lists.newArrayList();
      csu $$5 = $$1.f();
      int $$6 = $$5.g();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = axz.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cyi> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bnz.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bnz.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cyi> $$0, cyi $$1) {
      Iterator<cyi> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<iw<cyg>> $$0, cyg $$1) {
      for (iw<cyg> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cyi> a(int $$0, csz $$1, boolean $$2) {
      List<cyi> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(ctc.qP);

      for (cyg $$5 : ld.f) {
         if ((!$$5.a() || $$2) && $$5.k() && ($$4 || $$5.b($$1) && $$5.a($$1))) {
            for (int $$6 = $$5.g(); $$6 > $$5.f() - 1; $$6--) {
               if ($$0 >= $$5.c($$6) && $$0 <= $$5.d($$6)) {
                  $$3.add(new cyi($$5, $$6));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cyg var1, int var2);
   }
}
