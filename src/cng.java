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

public class cng {
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
   public static aer a(cne $$0) {
      return jb.g.b($$0);
   }

   public static int a(cne $$0, cix $$1) {
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

   public static Map<cne, Integer> a(cix $$0) {
      qx $$1 = $$0.a(cja.tC) ? cht.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cne, Integer> a(qx $$0) {
      Map<cne, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qr $$3 = $$0.a($$2);
         jb.g.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cne, Integer> $$0, cix $$1) {
      qx $$2 = new qx();

      for (Entry<cne, Integer> $$3 : $$0.entrySet()) {
         cne $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cja.tC)) {
               cht.a($$1, new cnh($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cja.tC)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cng.a $$0, cix $$1) {
      if (!$$1.b()) {
         qx $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qr $$4 = $$2.a($$3);
            jb.g.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cng.a $$0, Iterable<cix> $$1) {
      for (cix $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cix> $$0, bhg $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cix $$0, bjd $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(biy $$0) {
      int $$1 = a(cni.t, $$0);
      return $$1 > 0 ? cnu.e($$1) : 0.0F;
   }

   public static void a(biy $$0, bii $$1) {
      cng.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$1 instanceof cbm) {
         a($$2, $$0.eR());
      }
   }

   public static void b(biy $$0, bii $$1) {
      cng.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bL());
      }

      if ($$0 instanceof cbm) {
         a($$2, $$0.eR());
      }
   }

   public static int a(cne $$0, biy $$1) {
      Iterable<cix> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cix $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(biy $$0) {
      return (float)a(cni.m, $$0) * 0.15F;
   }

   public static int c(biy $$0) {
      return a(cni.q, $$0);
   }

   public static int d(biy $$0) {
      return a(cni.r, $$0);
   }

   public static int e(biy $$0) {
      return a(cni.f, $$0);
   }

   public static int f(biy $$0) {
      return a(cni.i, $$0);
   }

   public static int g(biy $$0) {
      return a(cni.u, $$0);
   }

   public static int b(cix $$0) {
      return a(cni.C, $$0);
   }

   public static int c(cix $$0) {
      return a(cni.D, $$0);
   }

   public static int h(biy $$0) {
      return a(cni.s, $$0);
   }

   public static boolean i(biy $$0) {
      return a(cni.g, $$0) > 0;
   }

   public static boolean j(biy $$0) {
      return a(cni.j, $$0) > 0;
   }

   public static boolean k(biy $$0) {
      return a(cni.l, $$0) > 0;
   }

   public static boolean d(cix $$0) {
      return a(cni.k, $$0) > 0;
   }

   public static boolean e(cix $$0) {
      return a(cni.M, $$0) > 0;
   }

   public static boolean f(cix $$0) {
      return a(cni.v, $$0) > 0;
   }

   public static int g(cix $$0) {
      return a(cni.E, $$0);
   }

   public static int h(cix $$0) {
      return a(cni.G, $$0);
   }

   public static boolean i(cix $$0) {
      return a(cni.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bin, cix> b(cne $$0, biy $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bin, cix> a(cne $$0, biy $$1, Predicate<cix> $$2) {
      Map<bin, cix> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bin, cix>> $$4 = Lists.newArrayList();

         for (Entry<bin, cix> $$5 : $$3.entrySet()) {
            cix $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ee().a($$4.size()));
      }
   }

   public static int a(aru $$0, int $$1, int $$2, cix $$3) {
      cis $$4 = $$3.d();
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

   public static cix a(aru $$0, cix $$1, int $$2, boolean $$3) {
      List<cnh> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cja.qb);
      if ($$5) {
         $$1 = new cix(cja.tC);
      }

      for (cnh $$6 : $$4) {
         if ($$5) {
            cht.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cnh> b(aru $$0, cix $$1, int $$2, boolean $$3) {
      List<cnh> $$4 = Lists.newArrayList();
      cis $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = arp.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cnh> $$8 = a($$2, $$1, $$3);
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

   public static void a(List<cnh> $$0, cnh $$1) {
      Iterator<cnh> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cne> $$0, cne $$1) {
      for (cne $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cnh> a(int $$0, cix $$1, boolean $$2) {
      List<cnh> $$3 = Lists.newArrayList();
      cis $$4 = $$1.d();
      boolean $$5 = $$1.a(cja.qb);

      for (cne $$6 : jb.g) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cnh($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cne var1, int var2);
   }
}
