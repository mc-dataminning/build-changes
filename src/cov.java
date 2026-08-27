import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class cov {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static rt a(@Nullable afw $$0, int $$1) {
      rt $$2 = new rt();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(rt $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(rt $$0) {
      return asy.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static afw b(rt $$0) {
      return afw.a($$0.l("id"));
   }

   @Nullable
   public static afw a(cot $$0) {
      return jy.g.b($$0);
   }

   public static int a(cot $$0, ckj $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         afw $$2 = a($$0);
         rz $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            rt $$5 = $$3.a($$4);
            afw $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cot, Integer> a(ckj $$0) {
      rz $$1 = $$0.a(ckm.tC) ? cjf.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cot, Integer> a(rz $$0) {
      Map<cot, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         rt $$3 = $$0.a($$2);
         jy.g.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cot, Integer> $$0, ckj $$1) {
      rz $$2 = new rz();

      for (Entry<cot, Integer> $$3 : $$0.entrySet()) {
         cot $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(ckm.tC)) {
               cjf.a($$1, new cow($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(ckm.tC)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cov.a $$0, ckj $$1) {
      if (!$$1.b()) {
         rz $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            rt $$4 = $$2.a($$3);
            jy.g.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cov.a $$0, Iterable<ckj> $$1) {
      for (ckj $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<ckj> $$0, bir $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(ckj $$0, bko $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bkj $$0) {
      int $$1 = a(cox.t, $$0);
      return $$1 > 0 ? cpj.e($$1) : 0.0F;
   }

   public static void a(bkj $$0, bjt $$1) {
      cov.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$1 instanceof ccx) {
         a($$2, $$0.eS());
      }
   }

   public static void b(bkj $$0, bjt $$1) {
      cov.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$0 instanceof ccx) {
         a($$2, $$0.eS());
      }
   }

   public static int a(cot $$0, bkj $$1) {
      Iterable<ckj> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (ckj $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bkj $$0) {
      return (float)a(cox.m, $$0) * 0.15F;
   }

   public static int c(bkj $$0) {
      return a(cox.q, $$0);
   }

   public static int d(bkj $$0) {
      return a(cox.r, $$0);
   }

   public static int e(bkj $$0) {
      return a(cox.f, $$0);
   }

   public static int f(bkj $$0) {
      return a(cox.i, $$0);
   }

   public static int g(bkj $$0) {
      return a(cox.u, $$0);
   }

   public static int b(ckj $$0) {
      return a(cox.C, $$0);
   }

   public static int c(ckj $$0) {
      return a(cox.D, $$0);
   }

   public static int h(bkj $$0) {
      return a(cox.s, $$0);
   }

   public static boolean i(bkj $$0) {
      return a(cox.g, $$0) > 0;
   }

   public static boolean j(bkj $$0) {
      return a(cox.j, $$0) > 0;
   }

   public static boolean k(bkj $$0) {
      return a(cox.l, $$0) > 0;
   }

   public static boolean d(ckj $$0) {
      return a(cox.k, $$0) > 0;
   }

   public static boolean e(ckj $$0) {
      return a(cox.M, $$0) > 0;
   }

   public static boolean f(ckj $$0) {
      return a(cox.v, $$0) > 0;
   }

   public static int g(ckj $$0) {
      return a(cox.E, $$0);
   }

   public static int h(ckj $$0) {
      return a(cox.G, $$0);
   }

   public static boolean i(ckj $$0) {
      return a(cox.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bjy, ckj> b(cot $$0, bkj $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bjy, ckj> a(cot $$0, bkj $$1, Predicate<ckj> $$2) {
      Map<bjy, ckj> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bjy, ckj>> $$4 = Lists.newArrayList();

         for (Entry<bjy, ckj> $$5 : $$3.entrySet()) {
            ckj $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ef().a($$4.size()));
      }
   }

   public static int a(ate $$0, int $$1, int $$2, ckj $$3) {
      cke $$4 = $$3.d();
      int $$5 = $$4.c();
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

   public static ckj a(ate $$0, ckj $$1, int $$2, boolean $$3) {
      List<cow> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(ckm.qb);
      if ($$5) {
         $$1 = new ckj(ckm.tC);
      }

      for (cow $$6 : $$4) {
         if ($$5) {
            cjf.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cow> b(ate $$0, ckj $$1, int $$2, boolean $$3) {
      List<cow> $$4 = Lists.newArrayList();
      cke $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = asy.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cow> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bgo.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bgo.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cow> $$0, cow $$1) {
      Iterator<cow> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cot> $$0, cot $$1) {
      for (cot $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cow> a(int $$0, ckj $$1, boolean $$2) {
      List<cow> $$3 = Lists.newArrayList();
      cke $$4 = $$1.d();
      boolean $$5 = $$1.a(ckm.qb);

      for (cot $$6 : jy.g) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cow($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cot var1, int var2);
   }
}
