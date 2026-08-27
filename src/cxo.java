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

public class cxo {
   private static final float a = 0.15F;

   public static int a(cxn $$0, csd $$1) {
      cxu $$2 = $$1.a(jz.f, cxu.a);
      return $$2.a($$0);
   }

   public static cxu a(csd $$0, Consumer<cxu.a> $$1) {
      jy<cxu> $$2 = l($$0);
      cxu $$3 = $$0.a($$2);
      if ($$3 == null) {
         return cxu.a;
      } else {
         cxu.a $$4 = new cxu.a($$3);
         $$1.accept($$4);
         cxu $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(csd $$0) {
      return $$0.b(l($$0));
   }

   public static void a(csd $$0, cxu $$1) {
      $$0.b(l($$0), $$1);
   }

   public static cxu b(csd $$0) {
      return $$0.a(l($$0), cxu.a);
   }

   private static jy<cxu> l(csd $$0) {
      return $$0.a(csg.uw) ? jz.p : jz.f;
   }

   public static boolean c(csd $$0) {
      return !$$0.a(jz.f, cxu.a).d() || !$$0.a(jz.p, cxu.a).d();
   }

   private static void a(cxo.a $$0, csd $$1) {
      cxu $$2 = $$1.a(jz.f, cxu.a);

      for (Entry<iv<cxn>> $$3 : $$2.b()) {
         $$0.accept((cxn)((iv)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(cxo.a $$0, Iterable<csd> $$1) {
      for (csd $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<csd> $$0, bpj $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(csd $$0, @Nullable bqr<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bre $$0) {
      int $$1 = a(cxq.t, $$0);
      return $$1 > 0 ? cyd.e($$1) : 0.0F;
   }

   public static void a(bre $$0, bql $$1) {
      cxo.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fa());
      }

      if ($$1 instanceof ckl) {
         a($$2, $$0.eV());
      }
   }

   public static void b(bre $$0, bql $$1) {
      cxo.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fa());
      }

      if ($$0 instanceof ckl) {
         a($$2, $$0.eV());
      }
   }

   public static int a(cxn $$0, bre $$1) {
      Iterable<csd> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (csd $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bre $$0) {
      return (float)a(cxq.m, $$0) * 0.15F;
   }

   public static int c(bre $$0) {
      return a(cxq.q, $$0);
   }

   public static int d(bre $$0) {
      return a(cxq.r, $$0);
   }

   public static int e(bre $$0) {
      return a(cxq.f, $$0);
   }

   public static int f(bre $$0) {
      return a(cxq.i, $$0);
   }

   public static int g(bre $$0) {
      return a(cxq.u, $$0);
   }

   public static int d(csd $$0) {
      return a(cxq.C, $$0);
   }

   public static int e(csd $$0) {
      return a(cxq.D, $$0);
   }

   public static int h(bre $$0) {
      return a(cxq.s, $$0);
   }

   public static boolean i(bre $$0) {
      return a(cxq.g, $$0) > 0;
   }

   public static boolean j(bre $$0) {
      return a(cxq.j, $$0) > 0;
   }

   public static boolean k(bre $$0) {
      return a(cxq.l, $$0) > 0;
   }

   public static boolean f(csd $$0) {
      return a(cxq.k, $$0) > 0;
   }

   public static boolean g(csd $$0) {
      return a(cxq.M, $$0) > 0;
   }

   public static boolean h(csd $$0) {
      return a(cxq.v, $$0) > 0;
   }

   public static int i(csd $$0) {
      return a(cxq.E, $$0);
   }

   public static int j(csd $$0) {
      return a(cxq.G, $$0);
   }

   public static boolean k(csd $$0) {
      return a(cxq.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<bqs, csd> b(cxn $$0, bre $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<bqs, csd> a(cxn $$0, bre $$1, Predicate<csd> $$2) {
      Map<bqs, csd> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<bqs, csd>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<bqs, csd> $$5 : $$3.entrySet()) {
            csd $$6 = $$5.getValue();
            if (!$$6.d() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ej().a($$4.size()));
      }
   }

   public static int a(ayd $$0, int $$1, int $$2, csd $$3) {
      cry $$4 = $$3.f();
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

   public static csd a(ayd $$0, csd $$1, int $$2, boolean $$3) {
      List<cxp> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(csg.qP)) {
         $$1 = new csd(csg.uw);
      }

      for (cxp $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<cxp> b(ayd $$0, csd $$1, int $$2, boolean $$3) {
      List<cxp> $$4 = Lists.newArrayList();
      cry $$5 = $$1.f();
      int $$6 = $$5.g();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = axw.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cxp> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bnd.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bnd.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cxp> $$0, cxp $$1) {
      Iterator<cxp> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<iv<cxn>> $$0, cxn $$1) {
      for (iv<cxn> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cxp> a(int $$0, csd $$1, boolean $$2) {
      List<cxp> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(csg.qP);

      for (cxn $$5 : lc.f) {
         if ((!$$5.b() || $$2) && $$5.j() && ($$5.a($$1) || $$4)) {
            for (int $$6 = $$5.a(); $$6 > $$5.f() - 1; $$6--) {
               if ($$0 >= $$5.a($$6) && $$0 <= $$5.b($$6)) {
                  $$3.add(new cxp($$5, $$6));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cxn var1, int var2);
   }
}
