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

public class cux {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static ta a(@Nullable ajh $$0, int $$1) {
      ta $$2 = new ta();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(ta $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(ta $$0) {
      return aww.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static ajh b(ta $$0) {
      return ajh.a($$0.l("id"));
   }

   @Nullable
   public static ajh a(cuw $$0) {
      return ki.f.b($$0);
   }

   public static int a(cuw $$0, cqm $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         ajh $$2 = a($$0);
         tg $$3 = $$1.y();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            ta $$5 = $$3.a($$4);
            ajh $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cuw, Integer> a(cqm $$0) {
      tg $$1 = $$0.a(cqp.uu) ? cpj.d($$0) : $$0.y();
      return a($$1);
   }

   public static Map<cuw, Integer> a(tg $$0) {
      Map<cuw, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ta $$3 = $$0.a($$2);
         ki.f.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cuw, Integer> $$0, cqm $$1) {
      tg $$2 = new tg();

      for (Entry<cuw, Integer> $$3 : $$0.entrySet()) {
         cuw $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cqp.uu)) {
               cpj.a($$1, new cuy($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.d("Enchantments");
      } else if (!$$1.a(cqp.uu)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cux.a $$0, cqm $$1) {
      if (!$$1.b()) {
         tg $$2 = $$1.y();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            ta $$4 = $$2.a($$3);
            ki.f.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cux.a $$0, Iterable<cqm> $$1) {
      for (cqm $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cqm> $$0, bnw $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cqm $$0, @Nullable bpd<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bpp $$0) {
      int $$1 = a(cuz.t, $$0);
      return $$1 > 0 ? cvl.e($$1) : 0.0F;
   }

   public static void a(bpp $$0, box $$1) {
      cux.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.eZ());
      }

      if ($$1 instanceof ciu) {
         a($$2, $$0.eU());
      }
   }

   public static void b(bpp $$0, box $$1) {
      cux.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.eZ());
      }

      if ($$0 instanceof ciu) {
         a($$2, $$0.eU());
      }
   }

   public static int a(cuw $$0, bpp $$1) {
      Iterable<cqm> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cqm $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bpp $$0) {
      return (float)a(cuz.m, $$0) * 0.15F;
   }

   public static int c(bpp $$0) {
      return a(cuz.q, $$0);
   }

   public static int d(bpp $$0) {
      return a(cuz.r, $$0);
   }

   public static int e(bpp $$0) {
      return a(cuz.f, $$0);
   }

   public static int f(bpp $$0) {
      return a(cuz.i, $$0);
   }

   public static int g(bpp $$0) {
      return a(cuz.u, $$0);
   }

   public static int b(cqm $$0) {
      return a(cuz.C, $$0);
   }

   public static int c(cqm $$0) {
      return a(cuz.D, $$0);
   }

   public static int h(bpp $$0) {
      return a(cuz.s, $$0);
   }

   public static boolean i(bpp $$0) {
      return a(cuz.g, $$0) > 0;
   }

   public static boolean j(bpp $$0) {
      return a(cuz.j, $$0) > 0;
   }

   public static boolean k(bpp $$0) {
      return a(cuz.l, $$0) > 0;
   }

   public static boolean d(cqm $$0) {
      return a(cuz.k, $$0) > 0;
   }

   public static boolean e(cqm $$0) {
      return a(cuz.M, $$0) > 0;
   }

   public static boolean f(cqm $$0) {
      return a(cuz.v, $$0) > 0;
   }

   public static int g(cqm $$0) {
      return a(cuz.E, $$0);
   }

   public static int h(cqm $$0) {
      return a(cuz.G, $$0);
   }

   public static boolean i(cqm $$0) {
      return a(cuz.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bpe, cqm> b(cuw $$0, bpp $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bpe, cqm> a(cuw $$0, bpp $$1, Predicate<cqm> $$2) {
      Map<bpe, cqm> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bpe, cqm>> $$4 = Lists.newArrayList();

         for (Entry<bpe, cqm> $$5 : $$3.entrySet()) {
            cqm $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ei().a($$4.size()));
      }
   }

   public static int a(axd $$0, int $$1, int $$2, cqm $$3) {
      cqh $$4 = $$3.d();
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

   public static cqm a(axd $$0, cqm $$1, int $$2, boolean $$3) {
      List<cuy> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cqp.qO);
      if ($$5) {
         $$1 = new cqm(cqp.uu);
      }

      for (cuy $$6 : $$4) {
         $$1.a($$6.a, $$6.b);
      }

      return $$1;
   }

   public static List<cuy> b(axd $$0, cqm $$1, int $$2, boolean $$3) {
      List<cuy> $$4 = Lists.newArrayList();
      cqh $$5 = $$1.d();
      int $$6 = $$5.e();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = aww.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cuy> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            blq.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               blq.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cuy> $$0, cuy $$1) {
      Iterator<cuy> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cuw> $$0, cuw $$1) {
      for (cuw $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cuy> a(int $$0, cqm $$1, boolean $$2) {
      List<cuy> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cqp.qO);

      for (cuw $$5 : ki.f) {
         if ((!$$5.b() || $$2) && $$5.j() && ($$5.a($$1) || $$4)) {
            for (int $$6 = $$5.a(); $$6 > $$5.f() - 1; $$6--) {
               if ($$0 >= $$5.a($$6) && $$0 <= $$5.b($$6)) {
                  $$3.add(new cuy($$5, $$6));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cuw var1, int var2);
   }
}
