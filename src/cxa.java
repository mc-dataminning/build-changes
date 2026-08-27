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

public class cxa {
   private static final float a = 0.15F;

   public static int a(cwz $$0, crs $$1) {
      cxg $$2 = $$1.a(jr.f, cxg.a);
      return $$2.a($$0);
   }

   public static cxg a(crs $$0, Consumer<cxg.a> $$1) {
      jq<cxg> $$2 = l($$0);
      cxg $$3 = $$0.a($$2);
      if ($$3 == null) {
         return cxg.a;
      } else {
         cxg.a $$4 = new cxg.a($$3);
         $$1.accept($$4);
         cxg $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(crs $$0) {
      return $$0.b(l($$0));
   }

   public static void a(crs $$0, cxg $$1) {
      $$0.b(l($$0), $$1);
   }

   public static cxg b(crs $$0) {
      return $$0.a(l($$0), cxg.a);
   }

   private static jq<cxg> l(crs $$0) {
      return $$0.a(crv.uu) ? jr.p : jr.f;
   }

   public static boolean c(crs $$0) {
      return !$$0.a(jr.f, cxg.a).d() || !$$0.a(jr.p, cxg.a).d();
   }

   private static void a(cxa.a $$0, crs $$1) {
      cxg $$2 = $$1.a(jr.f, cxg.a);

      for (Entry<in<cwz>> $$3 : $$2.b()) {
         $$0.accept((cwz)((in)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(cxa.a $$0, Iterable<crs> $$1) {
      for (crs $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<crs> $$0, boy $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(crs $$0, @Nullable bqg<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bqt $$0) {
      int $$1 = a(cxc.t, $$0);
      return $$1 > 0 ? cxp.e($$1) : 0.0F;
   }

   public static void a(bqt $$0, bqa $$1) {
      cxa.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.eZ());
      }

      if ($$1 instanceof cka) {
         a($$2, $$0.eU());
      }
   }

   public static void b(bqt $$0, bqa $$1) {
      cxa.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.eZ());
      }

      if ($$0 instanceof cka) {
         a($$2, $$0.eU());
      }
   }

   public static int a(cwz $$0, bqt $$1) {
      Iterable<crs> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (crs $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bqt $$0) {
      return (float)a(cxc.m, $$0) * 0.15F;
   }

   public static int c(bqt $$0) {
      return a(cxc.q, $$0);
   }

   public static int d(bqt $$0) {
      return a(cxc.r, $$0);
   }

   public static int e(bqt $$0) {
      return a(cxc.f, $$0);
   }

   public static int f(bqt $$0) {
      return a(cxc.i, $$0);
   }

   public static int g(bqt $$0) {
      return a(cxc.u, $$0);
   }

   public static int d(crs $$0) {
      return a(cxc.C, $$0);
   }

   public static int e(crs $$0) {
      return a(cxc.D, $$0);
   }

   public static int h(bqt $$0) {
      return a(cxc.s, $$0);
   }

   public static boolean i(bqt $$0) {
      return a(cxc.g, $$0) > 0;
   }

   public static boolean j(bqt $$0) {
      return a(cxc.j, $$0) > 0;
   }

   public static boolean k(bqt $$0) {
      return a(cxc.l, $$0) > 0;
   }

   public static boolean f(crs $$0) {
      return a(cxc.k, $$0) > 0;
   }

   public static boolean g(crs $$0) {
      return a(cxc.M, $$0) > 0;
   }

   public static boolean h(crs $$0) {
      return a(cxc.v, $$0) > 0;
   }

   public static int i(crs $$0) {
      return a(cxc.E, $$0);
   }

   public static int j(crs $$0) {
      return a(cxc.G, $$0);
   }

   public static boolean k(crs $$0) {
      return a(cxc.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<bqh, crs> b(cwz $$0, bqt $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<bqh, crs> a(cwz $$0, bqt $$1, Predicate<crs> $$2) {
      Map<bqh, crs> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<bqh, crs>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<bqh, crs> $$5 : $$3.entrySet()) {
            crs $$6 = $$5.getValue();
            if (!$$6.d() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ei().a($$4.size()));
      }
   }

   public static int a(axt $$0, int $$1, int $$2, crs $$3) {
      crn $$4 = $$3.f();
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

   public static crs a(axt $$0, crs $$1, int $$2, boolean $$3) {
      List<cxb> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(crv.qO)) {
         $$1 = new crs(crv.uu);
      }

      for (cxb $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<cxb> b(axt $$0, crs $$1, int $$2, boolean $$3) {
      List<cxb> $$4 = Lists.newArrayList();
      crn $$5 = $$1.f();
      int $$6 = $$5.g();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = axm.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cxb> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bms.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bms.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cxb> $$0, cxb $$1) {
      Iterator<cxb> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<in<cwz>> $$0, cwz $$1) {
      for (in<cwz> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cxb> a(int $$0, crs $$1, boolean $$2) {
      List<cxb> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(crv.qO);

      for (cwz $$5 : kt.f) {
         if ((!$$5.b() || $$2) && $$5.j() && ($$5.a($$1) || $$4)) {
            for (int $$6 = $$5.a(); $$6 > $$5.f() - 1; $$6--) {
               if ($$0 >= $$5.a($$6) && $$0 <= $$5.b($$6)) {
                  $$3.add(new cxb($$5, $$6));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cwz var1, int var2);
   }
}
