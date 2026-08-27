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

public class ctn {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static sw a(@Nullable aiy $$0, int $$1) {
      sw $$2 = new sw();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(sw $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(sw $$0) {
      return awi.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static aiy b(sw $$0) {
      return aiy.a($$0.l("id"));
   }

   @Nullable
   public static aiy a(ctm $$0) {
      return kf.f.b($$0);
   }

   public static int a(ctm $$0, cpd $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         aiy $$2 = a($$0);
         tc $$3 = $$1.y();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            sw $$5 = $$3.a($$4);
            aiy $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<ctm, Integer> a(cpd $$0) {
      tc $$1 = $$0.a(cpg.us) ? cnz.d($$0) : $$0.y();
      return a($$1);
   }

   public static Map<ctm, Integer> a(tc $$0) {
      Map<ctm, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sw $$3 = $$0.a($$2);
         kf.f.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<ctm, Integer> $$0, cpd $$1) {
      tc $$2 = new tc();

      for (Entry<ctm, Integer> $$3 : $$0.entrySet()) {
         ctm $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cpg.us)) {
               cnz.a($$1, new cto($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cpg.us)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(ctn.a $$0, cpd $$1) {
      if (!$$1.b()) {
         tc $$2 = $$1.y();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sw $$4 = $$2.a($$3);
            kf.f.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(ctn.a $$0, Iterable<cpd> $$1) {
      for (cpd $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cpd> $$0, bmp $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cpd $$0, @Nullable bnw<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(boi $$0) {
      int $$1 = a(ctp.t, $$0);
      return $$1 > 0 ? cub.e($$1) : 0.0F;
   }

   public static void a(boi $$0, bnq $$1) {
      ctn.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$1 instanceof chl) {
         a($$2, $$0.eT());
      }
   }

   public static void b(boi $$0, bnq $$1) {
      ctn.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$0 instanceof chl) {
         a($$2, $$0.eT());
      }
   }

   public static int a(ctm $$0, boi $$1) {
      Iterable<cpd> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cpd $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(boi $$0) {
      return (float)a(ctp.m, $$0) * 0.15F;
   }

   public static int c(boi $$0) {
      return a(ctp.q, $$0);
   }

   public static int d(boi $$0) {
      return a(ctp.r, $$0);
   }

   public static int e(boi $$0) {
      return a(ctp.f, $$0);
   }

   public static int f(boi $$0) {
      return a(ctp.i, $$0);
   }

   public static int g(boi $$0) {
      return a(ctp.u, $$0);
   }

   public static int b(cpd $$0) {
      return a(ctp.C, $$0);
   }

   public static int c(cpd $$0) {
      return a(ctp.D, $$0);
   }

   public static int h(boi $$0) {
      return a(ctp.s, $$0);
   }

   public static boolean i(boi $$0) {
      return a(ctp.g, $$0) > 0;
   }

   public static boolean j(boi $$0) {
      return a(ctp.j, $$0) > 0;
   }

   public static boolean k(boi $$0) {
      return a(ctp.l, $$0) > 0;
   }

   public static boolean d(cpd $$0) {
      return a(ctp.k, $$0) > 0;
   }

   public static boolean e(cpd $$0) {
      return a(ctp.M, $$0) > 0;
   }

   public static boolean f(cpd $$0) {
      return a(ctp.v, $$0) > 0;
   }

   public static int g(cpd $$0) {
      return a(ctp.E, $$0);
   }

   public static int h(cpd $$0) {
      return a(ctp.G, $$0);
   }

   public static boolean i(cpd $$0) {
      return a(ctp.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bnx, cpd> b(ctm $$0, boi $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bnx, cpd> a(ctm $$0, boi $$1, Predicate<cpd> $$2) {
      Map<bnx, cpd> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bnx, cpd>> $$4 = Lists.newArrayList();

         for (Entry<bnx, cpd> $$5 : $$3.entrySet()) {
            cpd $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.eh().a($$4.size()));
      }
   }

   public static int a(awp $$0, int $$1, int $$2, cpd $$3) {
      coy $$4 = $$3.d();
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

   public static cpd a(awp $$0, cpd $$1, int $$2, boolean $$3) {
      List<cto> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cpg.qO);
      if ($$5) {
         $$1 = new cpd(cpg.us);
      }

      for (cto $$6 : $$4) {
         if ($$5) {
            cnz.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cto> b(awp $$0, cpd $$1, int $$2, boolean $$3) {
      List<cto> $$4 = Lists.newArrayList();
      coy $$5 = $$1.d();
      int $$6 = $$5.an_();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = awi.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cto> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bkj.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bkj.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cto> $$0, cto $$1) {
      Iterator<cto> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ctm> $$0, ctm $$1) {
      for (ctm $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cto> a(int $$0, cpd $$1, boolean $$2) {
      List<cto> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cpg.qO);

      for (ctm $$5 : kf.f) {
         if ((!$$5.b() || $$2) && $$5.j() && ($$5.a($$1) || $$4)) {
            for (int $$6 = $$5.a(); $$6 > $$5.f() - 1; $$6--) {
               if ($$0 >= $$5.a($$6) && $$0 <= $$5.b($$6)) {
                  $$3.add(new cto($$5, $$6));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(ctm var1, int var2);
   }
}
