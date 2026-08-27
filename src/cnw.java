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

public class cnw {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static qw a(@Nullable aez $$0, int $$1) {
      qw $$2 = new qw();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(qw $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(qw $$0) {
      return asb.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static aez b(qw $$0) {
      return aez.a($$0.l("id"));
   }

   @Nullable
   public static aez a(cnu $$0) {
      return jb.g.b($$0);
   }

   public static int a(cnu $$0, cjl $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         aez $$2 = a($$0);
         rc $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            qw $$5 = $$3.a($$4);
            aez $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cnu, Integer> a(cjl $$0) {
      rc $$1 = $$0.a(cjo.tC) ? cih.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cnu, Integer> a(rc $$0) {
      Map<cnu, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qw $$3 = $$0.a($$2);
         jb.g.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cnu, Integer> $$0, cjl $$1) {
      rc $$2 = new rc();

      for (Entry<cnu, Integer> $$3 : $$0.entrySet()) {
         cnu $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cjo.tC)) {
               cih.a($$1, new cnx($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cjo.tC)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cnw.a $$0, cjl $$1) {
      if (!$$1.b()) {
         rc $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qw $$4 = $$2.a($$3);
            jb.g.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cnw.a $$0, Iterable<cjl> $$1) {
      for (cjl $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cjl> $$0, bhu $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cjl $$0, bjr $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bjm $$0) {
      int $$1 = a(cny.t, $$0);
      return $$1 > 0 ? cok.e($$1) : 0.0F;
   }

   public static void a(bjm $$0, biw $$1) {
      cnw.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$1 instanceof cca) {
         a($$2, $$0.eS());
      }
   }

   public static void b(bjm $$0, biw $$1) {
      cnw.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$0 instanceof cca) {
         a($$2, $$0.eS());
      }
   }

   public static int a(cnu $$0, bjm $$1) {
      Iterable<cjl> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cjl $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bjm $$0) {
      return (float)a(cny.m, $$0) * 0.15F;
   }

   public static int c(bjm $$0) {
      return a(cny.q, $$0);
   }

   public static int d(bjm $$0) {
      return a(cny.r, $$0);
   }

   public static int e(bjm $$0) {
      return a(cny.f, $$0);
   }

   public static int f(bjm $$0) {
      return a(cny.i, $$0);
   }

   public static int g(bjm $$0) {
      return a(cny.u, $$0);
   }

   public static int b(cjl $$0) {
      return a(cny.C, $$0);
   }

   public static int c(cjl $$0) {
      return a(cny.D, $$0);
   }

   public static int h(bjm $$0) {
      return a(cny.s, $$0);
   }

   public static boolean i(bjm $$0) {
      return a(cny.g, $$0) > 0;
   }

   public static boolean j(bjm $$0) {
      return a(cny.j, $$0) > 0;
   }

   public static boolean k(bjm $$0) {
      return a(cny.l, $$0) > 0;
   }

   public static boolean d(cjl $$0) {
      return a(cny.k, $$0) > 0;
   }

   public static boolean e(cjl $$0) {
      return a(cny.M, $$0) > 0;
   }

   public static boolean f(cjl $$0) {
      return a(cny.v, $$0) > 0;
   }

   public static int g(cjl $$0) {
      return a(cny.E, $$0);
   }

   public static int h(cjl $$0) {
      return a(cny.G, $$0);
   }

   public static boolean i(cjl $$0) {
      return a(cny.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bjb, cjl> b(cnu $$0, bjm $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bjb, cjl> a(cnu $$0, bjm $$1, Predicate<cjl> $$2) {
      Map<bjb, cjl> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bjb, cjl>> $$4 = Lists.newArrayList();

         for (Entry<bjb, cjl> $$5 : $$3.entrySet()) {
            cjl $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ef().a($$4.size()));
      }
   }

   public static int a(ash $$0, int $$1, int $$2, cjl $$3) {
      cjg $$4 = $$3.d();
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

   public static cjl a(ash $$0, cjl $$1, int $$2, boolean $$3) {
      List<cnx> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cjo.qb);
      if ($$5) {
         $$1 = new cjl(cjo.tC);
      }

      for (cnx $$6 : $$4) {
         if ($$5) {
            cih.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cnx> b(ash $$0, cjl $$1, int $$2, boolean $$3) {
      List<cnx> $$4 = Lists.newArrayList();
      cjg $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = asb.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cnx> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bfr.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bfr.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cnx> $$0, cnx $$1) {
      Iterator<cnx> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cnu> $$0, cnu $$1) {
      for (cnu $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cnx> a(int $$0, cjl $$1, boolean $$2) {
      List<cnx> $$3 = Lists.newArrayList();
      cjg $$4 = $$1.d();
      boolean $$5 = $$1.a(cjo.qb);

      for (cnu $$6 : jb.g) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cnx($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cnu var1, int var2);
   }
}
