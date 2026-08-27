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

public class cua {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static sy a(@Nullable ajc $$0, int $$1) {
      sy $$2 = new sy();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(sy $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(sy $$0) {
      return awm.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static ajc b(sy $$0) {
      return ajc.a($$0.l("id"));
   }

   @Nullable
   public static ajc a(ctz $$0) {
      return kh.f.b($$0);
   }

   public static int a(ctz $$0, cpq $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         ajc $$2 = a($$0);
         te $$3 = $$1.y();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            sy $$5 = $$3.a($$4);
            ajc $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<ctz, Integer> a(cpq $$0) {
      te $$1 = $$0.a(cpt.us) ? com.d($$0) : $$0.y();
      return a($$1);
   }

   public static Map<ctz, Integer> a(te $$0) {
      Map<ctz, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sy $$3 = $$0.a($$2);
         kh.f.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<ctz, Integer> $$0, cpq $$1) {
      te $$2 = new te();

      for (Entry<ctz, Integer> $$3 : $$0.entrySet()) {
         ctz $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cpt.us)) {
               com.a($$1, new cub($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.d("Enchantments");
      } else if (!$$1.a(cpt.us)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cua.a $$0, cpq $$1) {
      if (!$$1.b()) {
         te $$2 = $$1.y();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sy $$4 = $$2.a($$3);
            kh.f.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cua.a $$0, Iterable<cpq> $$1) {
      for (cpq $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cpq> $$0, bne $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cpq $$0, @Nullable bol<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(box $$0) {
      int $$1 = a(cuc.t, $$0);
      return $$1 > 0 ? cuo.e($$1) : 0.0F;
   }

   public static void a(box $$0, bof $$1) {
      cua.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.eW());
      }

      if ($$1 instanceof cia) {
         a($$2, $$0.eR());
      }
   }

   public static void b(box $$0, bof $$1) {
      cua.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.eW());
      }

      if ($$0 instanceof cia) {
         a($$2, $$0.eR());
      }
   }

   public static int a(ctz $$0, box $$1) {
      Iterable<cpq> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cpq $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(box $$0) {
      return (float)a(cuc.m, $$0) * 0.15F;
   }

   public static int c(box $$0) {
      return a(cuc.q, $$0);
   }

   public static int d(box $$0) {
      return a(cuc.r, $$0);
   }

   public static int e(box $$0) {
      return a(cuc.f, $$0);
   }

   public static int f(box $$0) {
      return a(cuc.i, $$0);
   }

   public static int g(box $$0) {
      return a(cuc.u, $$0);
   }

   public static int b(cpq $$0) {
      return a(cuc.C, $$0);
   }

   public static int c(cpq $$0) {
      return a(cuc.D, $$0);
   }

   public static int h(box $$0) {
      return a(cuc.s, $$0);
   }

   public static boolean i(box $$0) {
      return a(cuc.g, $$0) > 0;
   }

   public static boolean j(box $$0) {
      return a(cuc.j, $$0) > 0;
   }

   public static boolean k(box $$0) {
      return a(cuc.l, $$0) > 0;
   }

   public static boolean d(cpq $$0) {
      return a(cuc.k, $$0) > 0;
   }

   public static boolean e(cpq $$0) {
      return a(cuc.M, $$0) > 0;
   }

   public static boolean f(cpq $$0) {
      return a(cuc.v, $$0) > 0;
   }

   public static int g(cpq $$0) {
      return a(cuc.E, $$0);
   }

   public static int h(cpq $$0) {
      return a(cuc.G, $$0);
   }

   public static boolean i(cpq $$0) {
      return a(cuc.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bom, cpq> b(ctz $$0, box $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bom, cpq> a(ctz $$0, box $$1, Predicate<cpq> $$2) {
      Map<bom, cpq> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bom, cpq>> $$4 = Lists.newArrayList();

         for (Entry<bom, cpq> $$5 : $$3.entrySet()) {
            cpq $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ef().a($$4.size()));
      }
   }

   public static int a(awt $$0, int $$1, int $$2, cpq $$3) {
      cpl $$4 = $$3.d();
      int $$5 = $$4.e();
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

   public static cpq a(awt $$0, cpq $$1, int $$2, boolean $$3) {
      List<cub> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cpt.qO);
      if ($$5) {
         $$1 = new cpq(cpt.us);
      }

      for (cub $$6 : $$4) {
         $$1.a($$6.a, $$6.b);
      }

      return $$1;
   }

   public static List<cub> b(awt $$0, cpq $$1, int $$2, boolean $$3) {
      List<cub> $$4 = Lists.newArrayList();
      cpl $$5 = $$1.d();
      int $$6 = $$5.e();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = awm.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cub> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bky.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bky.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cub> $$0, cub $$1) {
      Iterator<cub> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ctz> $$0, ctz $$1) {
      for (ctz $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cub> a(int $$0, cpq $$1, boolean $$2) {
      List<cub> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cpt.qO);

      for (ctz $$5 : kh.f) {
         if ((!$$5.b() || $$2) && $$5.j() && ($$5.a($$1) || $$4)) {
            for (int $$6 = $$5.a(); $$6 > $$5.f() - 1; $$6--) {
               if ($$0 >= $$5.a($$6) && $$0 <= $$5.b($$6)) {
                  $$3.add(new cub($$5, $$6));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(ctz var1, int var2);
   }
}
