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

public class crk {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static sn a(@Nullable ahg $$0, int $$1) {
      sn $$2 = new sn();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(sn $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(sn $$0) {
      return aun.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static ahg b(sn $$0) {
      return ahg.a($$0.l("id"));
   }

   @Nullable
   public static ahg a(cri $$0) {
      return kd.f.b($$0);
   }

   public static int a(cri $$0, cmx $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         ahg $$2 = a($$0);
         st $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            sn $$5 = $$3.a($$4);
            ahg $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cri, Integer> a(cmx $$0) {
      st $$1 = $$0.a(cna.up) ? clt.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cri, Integer> a(st $$0) {
      Map<cri, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sn $$3 = $$0.a($$2);
         kd.f.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cri, Integer> $$0, cmx $$1) {
      st $$2 = new st();

      for (Entry<cri, Integer> $$3 : $$0.entrySet()) {
         cri $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cna.up)) {
               clt.a($$1, new crl($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cna.up)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(crk.a $$0, cmx $$1) {
      if (!$$1.b()) {
         st $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sn $$4 = $$2.a($$3);
            kd.f.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(crk.a $$0, Iterable<cmx> $$1) {
      for (cmx $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cmx> $$0, bks $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cmx $$0, bmp $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bmk $$0) {
      int $$1 = a(crm.t, $$0);
      return $$1 > 0 ? cry.e($$1) : 0.0F;
   }

   public static void a(bmk $$0, blu $$1) {
      crk.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$1 instanceof cfh) {
         a($$2, $$0.eT());
      }
   }

   public static void b(bmk $$0, blu $$1) {
      crk.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$0 instanceof cfh) {
         a($$2, $$0.eT());
      }
   }

   public static int a(cri $$0, bmk $$1) {
      Iterable<cmx> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cmx $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bmk $$0) {
      return (float)a(crm.m, $$0) * 0.15F;
   }

   public static int c(bmk $$0) {
      return a(crm.q, $$0);
   }

   public static int d(bmk $$0) {
      return a(crm.r, $$0);
   }

   public static int e(bmk $$0) {
      return a(crm.f, $$0);
   }

   public static int f(bmk $$0) {
      return a(crm.i, $$0);
   }

   public static int g(bmk $$0) {
      return a(crm.u, $$0);
   }

   public static int b(cmx $$0) {
      return a(crm.C, $$0);
   }

   public static int c(cmx $$0) {
      return a(crm.D, $$0);
   }

   public static int h(bmk $$0) {
      return a(crm.s, $$0);
   }

   public static boolean i(bmk $$0) {
      return a(crm.g, $$0) > 0;
   }

   public static boolean j(bmk $$0) {
      return a(crm.j, $$0) > 0;
   }

   public static boolean k(bmk $$0) {
      return a(crm.l, $$0) > 0;
   }

   public static boolean d(cmx $$0) {
      return a(crm.k, $$0) > 0;
   }

   public static boolean e(cmx $$0) {
      return a(crm.M, $$0) > 0;
   }

   public static boolean f(cmx $$0) {
      return a(crm.v, $$0) > 0;
   }

   public static int g(cmx $$0) {
      return a(crm.E, $$0);
   }

   public static int h(cmx $$0) {
      return a(crm.G, $$0);
   }

   public static boolean i(cmx $$0) {
      return a(crm.H, $$0) > 0;
   }

   @Nullable
   public static Entry<blz, cmx> b(cri $$0, bmk $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<blz, cmx> a(cri $$0, bmk $$1, Predicate<cmx> $$2) {
      Map<blz, cmx> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<blz, cmx>> $$4 = Lists.newArrayList();

         for (Entry<blz, cmx> $$5 : $$3.entrySet()) {
            cmx $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.eg().a($$4.size()));
      }
   }

   public static int a(auu $$0, int $$1, int $$2, cmx $$3) {
      cms $$4 = $$3.d();
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

   public static cmx a(auu $$0, cmx $$1, int $$2, boolean $$3) {
      List<crl> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cna.qM);
      if ($$5) {
         $$1 = new cmx(cna.up);
      }

      for (crl $$6 : $$4) {
         if ($$5) {
            clt.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<crl> b(auu $$0, cmx $$1, int $$2, boolean $$3) {
      List<crl> $$4 = Lists.newArrayList();
      cms $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = aun.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<crl> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bin.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bin.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<crl> $$0, crl $$1) {
      Iterator<crl> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cri> $$0, cri $$1) {
      for (cri $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<crl> a(int $$0, cmx $$1, boolean $$2) {
      List<crl> $$3 = Lists.newArrayList();
      cms $$4 = $$1.d();
      boolean $$5 = $$1.a(cna.qM);

      for (cri $$6 : kd.f) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new crl($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cri var1, int var2);
   }
}
