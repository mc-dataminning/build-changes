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

public class cnl {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static qu a(@Nullable aeu $$0, int $$1) {
      qu $$2 = new qu();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(qu $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(qu $$0) {
      return ars.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static aeu b(qu $$0) {
      return aeu.a($$0.l("id"));
   }

   @Nullable
   public static aeu a(cnj $$0) {
      return jd.g.b($$0);
   }

   public static int a(cnj $$0, cja $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         aeu $$2 = a($$0);
         ra $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            qu $$5 = $$3.a($$4);
            aeu $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cnj, Integer> a(cja $$0) {
      ra $$1 = $$0.a(cjd.tC) ? chw.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cnj, Integer> a(ra $$0) {
      Map<cnj, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qu $$3 = $$0.a($$2);
         jd.g.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cnj, Integer> $$0, cja $$1) {
      ra $$2 = new ra();

      for (Entry<cnj, Integer> $$3 : $$0.entrySet()) {
         cnj $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cjd.tC)) {
               chw.a($$1, new cnm($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cjd.tC)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cnl.a $$0, cja $$1) {
      if (!$$1.b()) {
         ra $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qu $$4 = $$2.a($$3);
            jd.g.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cnl.a $$0, Iterable<cja> $$1) {
      for (cja $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cja> $$0, bhj $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cja $$0, bjg $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bjb $$0) {
      int $$1 = a(cnn.t, $$0);
      return $$1 > 0 ? cnz.e($$1) : 0.0F;
   }

   public static void a(bjb $$0, bil $$1) {
      cnl.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$1 instanceof cbp) {
         a($$2, $$0.eR());
      }
   }

   public static void b(bjb $$0, bil $$1) {
      cnl.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$0 instanceof cbp) {
         a($$2, $$0.eR());
      }
   }

   public static int a(cnj $$0, bjb $$1) {
      Iterable<cja> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cja $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bjb $$0) {
      return (float)a(cnn.m, $$0) * 0.15F;
   }

   public static int c(bjb $$0) {
      return a(cnn.q, $$0);
   }

   public static int d(bjb $$0) {
      return a(cnn.r, $$0);
   }

   public static int e(bjb $$0) {
      return a(cnn.f, $$0);
   }

   public static int f(bjb $$0) {
      return a(cnn.i, $$0);
   }

   public static int g(bjb $$0) {
      return a(cnn.u, $$0);
   }

   public static int b(cja $$0) {
      return a(cnn.C, $$0);
   }

   public static int c(cja $$0) {
      return a(cnn.D, $$0);
   }

   public static int h(bjb $$0) {
      return a(cnn.s, $$0);
   }

   public static boolean i(bjb $$0) {
      return a(cnn.g, $$0) > 0;
   }

   public static boolean j(bjb $$0) {
      return a(cnn.j, $$0) > 0;
   }

   public static boolean k(bjb $$0) {
      return a(cnn.l, $$0) > 0;
   }

   public static boolean d(cja $$0) {
      return a(cnn.k, $$0) > 0;
   }

   public static boolean e(cja $$0) {
      return a(cnn.M, $$0) > 0;
   }

   public static boolean f(cja $$0) {
      return a(cnn.v, $$0) > 0;
   }

   public static int g(cja $$0) {
      return a(cnn.E, $$0);
   }

   public static int h(cja $$0) {
      return a(cnn.G, $$0);
   }

   public static boolean i(cja $$0) {
      return a(cnn.H, $$0) > 0;
   }

   @Nullable
   public static Entry<biq, cja> b(cnj $$0, bjb $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<biq, cja> a(cnj $$0, bjb $$1, Predicate<cja> $$2) {
      Map<biq, cja> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<biq, cja>> $$4 = Lists.newArrayList();

         for (Entry<biq, cja> $$5 : $$3.entrySet()) {
            cja $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ee().a($$4.size()));
      }
   }

   public static int a(arx $$0, int $$1, int $$2, cja $$3) {
      civ $$4 = $$3.d();
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

   public static cja a(arx $$0, cja $$1, int $$2, boolean $$3) {
      List<cnm> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cjd.qb);
      if ($$5) {
         $$1 = new cja(cjd.tC);
      }

      for (cnm $$6 : $$4) {
         if ($$5) {
            chw.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cnm> b(arx $$0, cja $$1, int $$2, boolean $$3) {
      List<cnm> $$4 = Lists.newArrayList();
      civ $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ars.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cnm> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bfg.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bfg.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cnm> $$0, cnm $$1) {
      Iterator<cnm> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cnj> $$0, cnj $$1) {
      for (cnj $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cnm> a(int $$0, cja $$1, boolean $$2) {
      List<cnm> $$3 = Lists.newArrayList();
      civ $$4 = $$1.d();
      boolean $$5 = $$1.a(cjd.qb);

      for (cnj $$6 : jd.g) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cnm($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cnj var1, int var2);
   }
}
