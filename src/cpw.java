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

public class cpw {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static rz a(@Nullable agi $$0, int $$1) {
      rz $$2 = new rz();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(rz $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(rz $$0) {
      return atm.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static agi b(rz $$0) {
      return agi.a($$0.l("id"));
   }

   @Nullable
   public static agi a(cpu $$0) {
      return jy.g.b($$0);
   }

   public static int a(cpu $$0, clj $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         agi $$2 = a($$0);
         sf $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            rz $$5 = $$3.a($$4);
            agi $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cpu, Integer> a(clj $$0) {
      sf $$1 = $$0.a(clm.uo) ? ckf.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cpu, Integer> a(sf $$0) {
      Map<cpu, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         rz $$3 = $$0.a($$2);
         jy.g.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cpu, Integer> $$0, clj $$1) {
      sf $$2 = new sf();

      for (Entry<cpu, Integer> $$3 : $$0.entrySet()) {
         cpu $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(clm.uo)) {
               ckf.a($$1, new cpx($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(clm.uo)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cpw.a $$0, clj $$1) {
      if (!$$1.b()) {
         sf $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            rz $$4 = $$2.a($$3);
            jy.g.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cpw.a $$0, Iterable<clj> $$1) {
      for (clj $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<clj> $$0, bjo $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(clj $$0, bll $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(blg $$0) {
      int $$1 = a(cpy.t, $$0);
      return $$1 > 0 ? cqk.e($$1) : 0.0F;
   }

   public static void a(blg $$0, bkq $$1) {
      cpw.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$1 instanceof cdu) {
         a($$2, $$0.eU());
      }
   }

   public static void b(blg $$0, bkq $$1) {
      cpw.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$0 instanceof cdu) {
         a($$2, $$0.eU());
      }
   }

   public static int a(cpu $$0, blg $$1) {
      Iterable<clj> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (clj $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(blg $$0) {
      return (float)a(cpy.m, $$0) * 0.15F;
   }

   public static int c(blg $$0) {
      return a(cpy.q, $$0);
   }

   public static int d(blg $$0) {
      return a(cpy.r, $$0);
   }

   public static int e(blg $$0) {
      return a(cpy.f, $$0);
   }

   public static int f(blg $$0) {
      return a(cpy.i, $$0);
   }

   public static int g(blg $$0) {
      return a(cpy.u, $$0);
   }

   public static int b(clj $$0) {
      return a(cpy.C, $$0);
   }

   public static int c(clj $$0) {
      return a(cpy.D, $$0);
   }

   public static int h(blg $$0) {
      return a(cpy.s, $$0);
   }

   public static boolean i(blg $$0) {
      return a(cpy.g, $$0) > 0;
   }

   public static boolean j(blg $$0) {
      return a(cpy.j, $$0) > 0;
   }

   public static boolean k(blg $$0) {
      return a(cpy.l, $$0) > 0;
   }

   public static boolean d(clj $$0) {
      return a(cpy.k, $$0) > 0;
   }

   public static boolean e(clj $$0) {
      return a(cpy.M, $$0) > 0;
   }

   public static boolean f(clj $$0) {
      return a(cpy.v, $$0) > 0;
   }

   public static int g(clj $$0) {
      return a(cpy.E, $$0);
   }

   public static int h(clj $$0) {
      return a(cpy.G, $$0);
   }

   public static boolean i(clj $$0) {
      return a(cpy.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bkv, clj> b(cpu $$0, blg $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bkv, clj> a(cpu $$0, blg $$1, Predicate<clj> $$2) {
      Map<bkv, clj> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bkv, clj>> $$4 = Lists.newArrayList();

         for (Entry<bkv, clj> $$5 : $$3.entrySet()) {
            clj $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.eh().a($$4.size()));
      }
   }

   public static int a(ats $$0, int $$1, int $$2, clj $$3) {
      cle $$4 = $$3.d();
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

   public static clj a(ats $$0, clj $$1, int $$2, boolean $$3) {
      List<cpx> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(clm.qM);
      if ($$5) {
         $$1 = new clj(clm.uo);
      }

      for (cpx $$6 : $$4) {
         if ($$5) {
            ckf.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cpx> b(ats $$0, clj $$1, int $$2, boolean $$3) {
      List<cpx> $$4 = Lists.newArrayList();
      cle $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = atm.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cpx> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bhk.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bhk.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cpx> $$0, cpx $$1) {
      Iterator<cpx> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cpu> $$0, cpu $$1) {
      for (cpu $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cpx> a(int $$0, clj $$1, boolean $$2) {
      List<cpx> $$3 = Lists.newArrayList();
      cle $$4 = $$1.d();
      boolean $$5 = $$1.a(clm.qM);

      for (cpu $$6 : jy.g) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cpx($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cpu var1, int var2);
   }
}
