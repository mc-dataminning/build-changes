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

public class ctj {
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
      return awh.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static aiy b(sw $$0) {
      return aiy.a($$0.l("id"));
   }

   @Nullable
   public static aiy a(cti $$0) {
      return kf.f.b($$0);
   }

   public static int a(cti $$0, coz $$1) {
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

   public static Map<cti, Integer> a(coz $$0) {
      tc $$1 = $$0.a(cpc.us) ? cnv.d($$0) : $$0.y();
      return a($$1);
   }

   public static Map<cti, Integer> a(tc $$0) {
      Map<cti, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sw $$3 = $$0.a($$2);
         kf.f.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cti, Integer> $$0, coz $$1) {
      tc $$2 = new tc();

      for (Entry<cti, Integer> $$3 : $$0.entrySet()) {
         cti $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cpc.us)) {
               cnv.a($$1, new ctk($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cpc.us)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(ctj.a $$0, coz $$1) {
      if (!$$1.b()) {
         tc $$2 = $$1.y();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sw $$4 = $$2.a($$3);
            kf.f.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(ctj.a $$0, Iterable<coz> $$1) {
      for (coz $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<coz> $$0, bmn $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(coz $$0, @Nullable bnu<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bog $$0) {
      int $$1 = a(ctl.t, $$0);
      return $$1 > 0 ? ctx.e($$1) : 0.0F;
   }

   public static void a(bog $$0, bno $$1) {
      ctj.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$1 instanceof chh) {
         a($$2, $$0.eT());
      }
   }

   public static void b(bog $$0, bno $$1) {
      ctj.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$0 instanceof chh) {
         a($$2, $$0.eT());
      }
   }

   public static int a(cti $$0, bog $$1) {
      Iterable<coz> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (coz $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bog $$0) {
      return (float)a(ctl.m, $$0) * 0.15F;
   }

   public static int c(bog $$0) {
      return a(ctl.q, $$0);
   }

   public static int d(bog $$0) {
      return a(ctl.r, $$0);
   }

   public static int e(bog $$0) {
      return a(ctl.f, $$0);
   }

   public static int f(bog $$0) {
      return a(ctl.i, $$0);
   }

   public static int g(bog $$0) {
      return a(ctl.u, $$0);
   }

   public static int b(coz $$0) {
      return a(ctl.C, $$0);
   }

   public static int c(coz $$0) {
      return a(ctl.D, $$0);
   }

   public static int h(bog $$0) {
      return a(ctl.s, $$0);
   }

   public static boolean i(bog $$0) {
      return a(ctl.g, $$0) > 0;
   }

   public static boolean j(bog $$0) {
      return a(ctl.j, $$0) > 0;
   }

   public static boolean k(bog $$0) {
      return a(ctl.l, $$0) > 0;
   }

   public static boolean d(coz $$0) {
      return a(ctl.k, $$0) > 0;
   }

   public static boolean e(coz $$0) {
      return a(ctl.M, $$0) > 0;
   }

   public static boolean f(coz $$0) {
      return a(ctl.v, $$0) > 0;
   }

   public static int g(coz $$0) {
      return a(ctl.E, $$0);
   }

   public static int h(coz $$0) {
      return a(ctl.G, $$0);
   }

   public static boolean i(coz $$0) {
      return a(ctl.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bnv, coz> b(cti $$0, bog $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bnv, coz> a(cti $$0, bog $$1, Predicate<coz> $$2) {
      Map<bnv, coz> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bnv, coz>> $$4 = Lists.newArrayList();

         for (Entry<bnv, coz> $$5 : $$3.entrySet()) {
            coz $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.eh().a($$4.size()));
      }
   }

   public static int a(awo $$0, int $$1, int $$2, coz $$3) {
      cou $$4 = $$3.d();
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

   public static coz a(awo $$0, coz $$1, int $$2, boolean $$3) {
      List<ctk> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cpc.qO);
      if ($$5) {
         $$1 = new coz(cpc.us);
      }

      for (ctk $$6 : $$4) {
         if ($$5) {
            cnv.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<ctk> b(awo $$0, coz $$1, int $$2, boolean $$3) {
      List<ctk> $$4 = Lists.newArrayList();
      cou $$5 = $$1.d();
      int $$6 = $$5.an_();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = awh.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<ctk> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bkh.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bkh.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<ctk> $$0, ctk $$1) {
      Iterator<ctk> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cti> $$0, cti $$1) {
      for (cti $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<ctk> a(int $$0, coz $$1, boolean $$2) {
      List<ctk> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cpc.qO);

      for (cti $$5 : kf.f) {
         if ((!$$5.b() || $$2) && $$5.j() && ($$5.a($$1) || $$4)) {
            for (int $$6 = $$5.a(); $$6 > $$5.f() - 1; $$6--) {
               if ($$0 >= $$5.a($$6) && $$0 <= $$5.b($$6)) {
                  $$3.add(new ctk($$5, $$6));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cti var1, int var2);
   }
}
