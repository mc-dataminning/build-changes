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

public class cnh {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static qr a(@Nullable aer $$0, int $$1) {
      qr $$2 = new qr();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(qr $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(qr $$0) {
      return arp.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static aer b(qr $$0) {
      return aer.a($$0.l("id"));
   }

   @Nullable
   public static aer a(cnf $$0) {
      return jb.g.b($$0);
   }

   public static int a(cnf $$0, ciy $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         aer $$2 = a($$0);
         qx $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            qr $$5 = $$3.a($$4);
            aer $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cnf, Integer> a(ciy $$0) {
      qx $$1 = $$0.a(cjb.tC) ? chu.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cnf, Integer> a(qx $$0) {
      Map<cnf, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qr $$3 = $$0.a($$2);
         jb.g.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cnf, Integer> $$0, ciy $$1) {
      qx $$2 = new qx();

      for (Entry<cnf, Integer> $$3 : $$0.entrySet()) {
         cnf $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cjb.tC)) {
               chu.a($$1, new cni($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cjb.tC)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cnh.a $$0, ciy $$1) {
      if (!$$1.b()) {
         qx $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qr $$4 = $$2.a($$3);
            jb.g.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cnh.a $$0, Iterable<ciy> $$1) {
      for (ciy $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<ciy> $$0, bhg $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(ciy $$0, bjd $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(biy $$0) {
      int $$1 = a(cnj.t, $$0);
      return $$1 > 0 ? cnv.e($$1) : 0.0F;
   }

   public static void a(biy $$0, bii $$1) {
      cnh.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$1 instanceof cbn) {
         a($$2, $$0.eR());
      }
   }

   public static void b(biy $$0, bii $$1) {
      cnh.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$0 instanceof cbn) {
         a($$2, $$0.eR());
      }
   }

   public static int a(cnf $$0, biy $$1) {
      Iterable<ciy> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (ciy $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(biy $$0) {
      return (float)a(cnj.m, $$0) * 0.15F;
   }

   public static int c(biy $$0) {
      return a(cnj.q, $$0);
   }

   public static int d(biy $$0) {
      return a(cnj.r, $$0);
   }

   public static int e(biy $$0) {
      return a(cnj.f, $$0);
   }

   public static int f(biy $$0) {
      return a(cnj.i, $$0);
   }

   public static int g(biy $$0) {
      return a(cnj.u, $$0);
   }

   public static int b(ciy $$0) {
      return a(cnj.C, $$0);
   }

   public static int c(ciy $$0) {
      return a(cnj.D, $$0);
   }

   public static int h(biy $$0) {
      return a(cnj.s, $$0);
   }

   public static boolean i(biy $$0) {
      return a(cnj.g, $$0) > 0;
   }

   public static boolean j(biy $$0) {
      return a(cnj.j, $$0) > 0;
   }

   public static boolean k(biy $$0) {
      return a(cnj.l, $$0) > 0;
   }

   public static boolean d(ciy $$0) {
      return a(cnj.k, $$0) > 0;
   }

   public static boolean e(ciy $$0) {
      return a(cnj.M, $$0) > 0;
   }

   public static boolean f(ciy $$0) {
      return a(cnj.v, $$0) > 0;
   }

   public static int g(ciy $$0) {
      return a(cnj.E, $$0);
   }

   public static int h(ciy $$0) {
      return a(cnj.G, $$0);
   }

   public static boolean i(ciy $$0) {
      return a(cnj.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bin, ciy> b(cnf $$0, biy $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bin, ciy> a(cnf $$0, biy $$1, Predicate<ciy> $$2) {
      Map<bin, ciy> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bin, ciy>> $$4 = Lists.newArrayList();

         for (Entry<bin, ciy> $$5 : $$3.entrySet()) {
            ciy $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ee().a($$4.size()));
      }
   }

   public static int a(aru $$0, int $$1, int $$2, ciy $$3) {
      cit $$4 = $$3.d();
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

   public static ciy a(aru $$0, ciy $$1, int $$2, boolean $$3) {
      List<cni> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cjb.qb);
      if ($$5) {
         $$1 = new ciy(cjb.tC);
      }

      for (cni $$6 : $$4) {
         if ($$5) {
            chu.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cni> b(aru $$0, ciy $$1, int $$2, boolean $$3) {
      List<cni> $$4 = Lists.newArrayList();
      cit $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = arp.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cni> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bfd.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bfd.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cni> $$0, cni $$1) {
      Iterator<cni> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cnf> $$0, cnf $$1) {
      for (cnf $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cni> a(int $$0, ciy $$1, boolean $$2) {
      List<cni> $$3 = Lists.newArrayList();
      cit $$4 = $$1.d();
      boolean $$5 = $$1.a(cjb.qb);

      for (cnf $$6 : jb.g) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cni($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cnf var1, int var2);
   }
}
