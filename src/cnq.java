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

public class cnq {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static qx a(@Nullable aex $$0, int $$1) {
      qx $$2 = new qx();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(qx $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(qx $$0) {
      return arx.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static aex b(qx $$0) {
      return aex.a($$0.l("id"));
   }

   @Nullable
   public static aex a(cno $$0) {
      return jd.g.b($$0);
   }

   public static int a(cno $$0, cjf $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         aex $$2 = a($$0);
         rd $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            qx $$5 = $$3.a($$4);
            aex $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cno, Integer> a(cjf $$0) {
      rd $$1 = $$0.a(cji.tC) ? cib.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cno, Integer> a(rd $$0) {
      Map<cno, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qx $$3 = $$0.a($$2);
         jd.g.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cno, Integer> $$0, cjf $$1) {
      rd $$2 = new rd();

      for (Entry<cno, Integer> $$3 : $$0.entrySet()) {
         cno $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cji.tC)) {
               cib.a($$1, new cnr($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cji.tC)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cnq.a $$0, cjf $$1) {
      if (!$$1.b()) {
         rd $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qx $$4 = $$2.a($$3);
            jd.g.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cnq.a $$0, Iterable<cjf> $$1) {
      for (cjf $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cjf> $$0, bho $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cjf $$0, bjl $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bjg $$0) {
      int $$1 = a(cns.t, $$0);
      return $$1 > 0 ? coe.e($$1) : 0.0F;
   }

   public static void a(bjg $$0, biq $$1) {
      cnq.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$1 instanceof cbu) {
         a($$2, $$0.eS());
      }
   }

   public static void b(bjg $$0, biq $$1) {
      cnq.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$0 instanceof cbu) {
         a($$2, $$0.eS());
      }
   }

   public static int a(cno $$0, bjg $$1) {
      Iterable<cjf> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cjf $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bjg $$0) {
      return (float)a(cns.m, $$0) * 0.15F;
   }

   public static int c(bjg $$0) {
      return a(cns.q, $$0);
   }

   public static int d(bjg $$0) {
      return a(cns.r, $$0);
   }

   public static int e(bjg $$0) {
      return a(cns.f, $$0);
   }

   public static int f(bjg $$0) {
      return a(cns.i, $$0);
   }

   public static int g(bjg $$0) {
      return a(cns.u, $$0);
   }

   public static int b(cjf $$0) {
      return a(cns.C, $$0);
   }

   public static int c(cjf $$0) {
      return a(cns.D, $$0);
   }

   public static int h(bjg $$0) {
      return a(cns.s, $$0);
   }

   public static boolean i(bjg $$0) {
      return a(cns.g, $$0) > 0;
   }

   public static boolean j(bjg $$0) {
      return a(cns.j, $$0) > 0;
   }

   public static boolean k(bjg $$0) {
      return a(cns.l, $$0) > 0;
   }

   public static boolean d(cjf $$0) {
      return a(cns.k, $$0) > 0;
   }

   public static boolean e(cjf $$0) {
      return a(cns.M, $$0) > 0;
   }

   public static boolean f(cjf $$0) {
      return a(cns.v, $$0) > 0;
   }

   public static int g(cjf $$0) {
      return a(cns.E, $$0);
   }

   public static int h(cjf $$0) {
      return a(cns.G, $$0);
   }

   public static boolean i(cjf $$0) {
      return a(cns.H, $$0) > 0;
   }

   @Nullable
   public static Entry<biv, cjf> b(cno $$0, bjg $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<biv, cjf> a(cno $$0, bjg $$1, Predicate<cjf> $$2) {
      Map<biv, cjf> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<biv, cjf>> $$4 = Lists.newArrayList();

         for (Entry<biv, cjf> $$5 : $$3.entrySet()) {
            cjf $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ef().a($$4.size()));
      }
   }

   public static int a(asc $$0, int $$1, int $$2, cjf $$3) {
      cja $$4 = $$3.d();
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

   public static cjf a(asc $$0, cjf $$1, int $$2, boolean $$3) {
      List<cnr> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cji.qb);
      if ($$5) {
         $$1 = new cjf(cji.tC);
      }

      for (cnr $$6 : $$4) {
         if ($$5) {
            cib.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cnr> b(asc $$0, cjf $$1, int $$2, boolean $$3) {
      List<cnr> $$4 = Lists.newArrayList();
      cja $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = arx.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cnr> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bfl.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bfl.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cnr> $$0, cnr $$1) {
      Iterator<cnr> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cno> $$0, cno $$1) {
      for (cno $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cnr> a(int $$0, cjf $$1, boolean $$2) {
      List<cnr> $$3 = Lists.newArrayList();
      cja $$4 = $$1.d();
      boolean $$5 = $$1.a(cji.qb);

      for (cno $$6 : jd.g) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cnr($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cno var1, int var2);
   }
}
