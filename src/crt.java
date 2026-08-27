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

public class crt {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static so a(@Nullable ahh $$0, int $$1) {
      so $$2 = new so();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(so $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(so $$0) {
      return aup.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static ahh b(so $$0) {
      return ahh.a($$0.l("id"));
   }

   @Nullable
   public static ahh a(crr $$0) {
      return kd.f.b($$0);
   }

   public static int a(crr $$0, cng $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         ahh $$2 = a($$0);
         su $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            so $$5 = $$3.a($$4);
            ahh $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<crr, Integer> a(cng $$0) {
      su $$1 = $$0.a(cnj.us) ? cmd.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<crr, Integer> a(su $$0) {
      Map<crr, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         so $$3 = $$0.a($$2);
         kd.f.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<crr, Integer> $$0, cng $$1) {
      su $$2 = new su();

      for (Entry<crr, Integer> $$3 : $$0.entrySet()) {
         crr $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cnj.us)) {
               cmd.a($$1, new cru($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cnj.us)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(crt.a $$0, cng $$1) {
      if (!$$1.b()) {
         su $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            so $$4 = $$2.a($$3);
            kd.f.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(crt.a $$0, Iterable<cng> $$1) {
      for (cng $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cng> $$0, bkv $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cng $$0, bmt $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bmo $$0) {
      int $$1 = a(crv.t, $$0);
      return $$1 > 0 ? csh.e($$1) : 0.0F;
   }

   public static void a(bmo $$0, blw $$1) {
      crt.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$1 instanceof cfq) {
         a($$2, $$0.eT());
      }
   }

   public static void b(bmo $$0, blw $$1) {
      crt.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$0 instanceof cfq) {
         a($$2, $$0.eT());
      }
   }

   public static int a(crr $$0, bmo $$1) {
      Iterable<cng> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cng $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bmo $$0) {
      return (float)a(crv.m, $$0) * 0.15F;
   }

   public static int c(bmo $$0) {
      return a(crv.q, $$0);
   }

   public static int d(bmo $$0) {
      return a(crv.r, $$0);
   }

   public static int e(bmo $$0) {
      return a(crv.f, $$0);
   }

   public static int f(bmo $$0) {
      return a(crv.i, $$0);
   }

   public static int g(bmo $$0) {
      return a(crv.u, $$0);
   }

   public static int b(cng $$0) {
      return a(crv.C, $$0);
   }

   public static int c(cng $$0) {
      return a(crv.D, $$0);
   }

   public static int h(bmo $$0) {
      return a(crv.s, $$0);
   }

   public static boolean i(bmo $$0) {
      return a(crv.g, $$0) > 0;
   }

   public static boolean j(bmo $$0) {
      return a(crv.j, $$0) > 0;
   }

   public static boolean k(bmo $$0) {
      return a(crv.l, $$0) > 0;
   }

   public static boolean d(cng $$0) {
      return a(crv.k, $$0) > 0;
   }

   public static boolean e(cng $$0) {
      return a(crv.M, $$0) > 0;
   }

   public static boolean f(cng $$0) {
      return a(crv.v, $$0) > 0;
   }

   public static int g(cng $$0) {
      return a(crv.E, $$0);
   }

   public static int h(cng $$0) {
      return a(crv.G, $$0);
   }

   public static boolean i(cng $$0) {
      return a(crv.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bmd, cng> b(crr $$0, bmo $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bmd, cng> a(crr $$0, bmo $$1, Predicate<cng> $$2) {
      Map<bmd, cng> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bmd, cng>> $$4 = Lists.newArrayList();

         for (Entry<bmd, cng> $$5 : $$3.entrySet()) {
            cng $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.eg().a($$4.size()));
      }
   }

   public static int a(auw $$0, int $$1, int $$2, cng $$3) {
      cnb $$4 = $$3.d();
      int $$5 = $$4.an_();
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

   public static cng a(auw $$0, cng $$1, int $$2, boolean $$3) {
      List<cru> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cnj.qO);
      if ($$5) {
         $$1 = new cng(cnj.us);
      }

      for (cru $$6 : $$4) {
         if ($$5) {
            cmd.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cru> b(auw $$0, cng $$1, int $$2, boolean $$3) {
      List<cru> $$4 = Lists.newArrayList();
      cnb $$5 = $$1.d();
      int $$6 = $$5.an_();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = aup.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cru> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bip.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bip.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cru> $$0, cru $$1) {
      Iterator<cru> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<crr> $$0, crr $$1) {
      for (crr $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cru> a(int $$0, cng $$1, boolean $$2) {
      List<cru> $$3 = Lists.newArrayList();
      cnb $$4 = $$1.d();
      boolean $$5 = $$1.a(cnj.qO);

      for (crr $$6 : kd.f) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cru($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(crr var1, int var2);
   }
}
