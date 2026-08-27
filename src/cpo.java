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

public class cpo {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static rz a(@Nullable agg $$0, int $$1) {
      rz $$2 = new rz();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(rz $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(rz $$0) {
      return ati.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static agg b(rz $$0) {
      return agg.a($$0.l("id"));
   }

   @Nullable
   public static agg a(cpm $$0) {
      return jy.g.b($$0);
   }

   public static int a(cpm $$0, clb $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         agg $$2 = a($$0);
         sf $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            rz $$5 = $$3.a($$4);
            agg $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cpm, Integer> a(clb $$0) {
      sf $$1 = $$0.a(cle.tD) ? cjx.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cpm, Integer> a(sf $$0) {
      Map<cpm, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         rz $$3 = $$0.a($$2);
         jy.g.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cpm, Integer> $$0, clb $$1) {
      sf $$2 = new sf();

      for (Entry<cpm, Integer> $$3 : $$0.entrySet()) {
         cpm $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cle.tD)) {
               cjx.a($$1, new cpp($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cle.tD)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cpo.a $$0, clb $$1) {
      if (!$$1.b()) {
         sf $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            rz $$4 = $$2.a($$3);
            jy.g.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cpo.a $$0, Iterable<clb> $$1) {
      for (clb $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<clb> $$0, bjg $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(clb $$0, bld $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bky $$0) {
      int $$1 = a(cpq.t, $$0);
      return $$1 > 0 ? cqc.e($$1) : 0.0F;
   }

   public static void a(bky $$0, bki $$1) {
      cpo.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$1 instanceof cdm) {
         a($$2, $$0.eS());
      }
   }

   public static void b(bky $$0, bki $$1) {
      cpo.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$0 instanceof cdm) {
         a($$2, $$0.eS());
      }
   }

   public static int a(cpm $$0, bky $$1) {
      Iterable<clb> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (clb $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bky $$0) {
      return (float)a(cpq.m, $$0) * 0.15F;
   }

   public static int c(bky $$0) {
      return a(cpq.q, $$0);
   }

   public static int d(bky $$0) {
      return a(cpq.r, $$0);
   }

   public static int e(bky $$0) {
      return a(cpq.f, $$0);
   }

   public static int f(bky $$0) {
      return a(cpq.i, $$0);
   }

   public static int g(bky $$0) {
      return a(cpq.u, $$0);
   }

   public static int b(clb $$0) {
      return a(cpq.C, $$0);
   }

   public static int c(clb $$0) {
      return a(cpq.D, $$0);
   }

   public static int h(bky $$0) {
      return a(cpq.s, $$0);
   }

   public static boolean i(bky $$0) {
      return a(cpq.g, $$0) > 0;
   }

   public static boolean j(bky $$0) {
      return a(cpq.j, $$0) > 0;
   }

   public static boolean k(bky $$0) {
      return a(cpq.l, $$0) > 0;
   }

   public static boolean d(clb $$0) {
      return a(cpq.k, $$0) > 0;
   }

   public static boolean e(clb $$0) {
      return a(cpq.M, $$0) > 0;
   }

   public static boolean f(clb $$0) {
      return a(cpq.v, $$0) > 0;
   }

   public static int g(clb $$0) {
      return a(cpq.E, $$0);
   }

   public static int h(clb $$0) {
      return a(cpq.G, $$0);
   }

   public static boolean i(clb $$0) {
      return a(cpq.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bkn, clb> b(cpm $$0, bky $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bkn, clb> a(cpm $$0, bky $$1, Predicate<clb> $$2) {
      Map<bkn, clb> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bkn, clb>> $$4 = Lists.newArrayList();

         for (Entry<bkn, clb> $$5 : $$3.entrySet()) {
            clb $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ef().a($$4.size()));
      }
   }

   public static int a(ato $$0, int $$1, int $$2, clb $$3) {
      ckw $$4 = $$3.d();
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

   public static clb a(ato $$0, clb $$1, int $$2, boolean $$3) {
      List<cpp> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cle.qb);
      if ($$5) {
         $$1 = new clb(cle.tD);
      }

      for (cpp $$6 : $$4) {
         if ($$5) {
            cjx.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cpp> b(ato $$0, clb $$1, int $$2, boolean $$3) {
      List<cpp> $$4 = Lists.newArrayList();
      ckw $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ati.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cpp> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bhd.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bhd.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cpp> $$0, cpp $$1) {
      Iterator<cpp> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cpm> $$0, cpm $$1) {
      for (cpm $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cpp> a(int $$0, clb $$1, boolean $$2) {
      List<cpp> $$3 = Lists.newArrayList();
      ckw $$4 = $$1.d();
      boolean $$5 = $$1.a(cle.qb);

      for (cpm $$6 : jy.g) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cpp($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cpm var1, int var2);
   }
}
