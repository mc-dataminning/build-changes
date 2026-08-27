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

public class cqu {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static sj a(@Nullable agt $$0, int $$1) {
      sj $$2 = new sj();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(sj $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(sj $$0) {
      return aty.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static agt b(sj $$0) {
      return agt.a($$0.l("id"));
   }

   @Nullable
   public static agt a(cqs $$0) {
      return kb.f.b($$0);
   }

   public static int a(cqs $$0, cmh $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         agt $$2 = a($$0);
         sp $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            sj $$5 = $$3.a($$4);
            agt $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cqs, Integer> a(cmh $$0) {
      sp $$1 = $$0.a(cmk.up) ? cld.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cqs, Integer> a(sp $$0) {
      Map<cqs, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sj $$3 = $$0.a($$2);
         kb.f.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cqs, Integer> $$0, cmh $$1) {
      sp $$2 = new sp();

      for (Entry<cqs, Integer> $$3 : $$0.entrySet()) {
         cqs $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cmk.up)) {
               cld.a($$1, new cqv($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cmk.up)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cqu.a $$0, cmh $$1) {
      if (!$$1.b()) {
         sp $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sj $$4 = $$2.a($$3);
            kb.f.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cqu.a $$0, Iterable<cmh> $$1) {
      for (cmh $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cmh> $$0, bkd $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cmh $$0, bma $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(blv $$0) {
      int $$1 = a(cqw.t, $$0);
      return $$1 > 0 ? cri.e($$1) : 0.0F;
   }

   public static void a(blv $$0, blf $$1) {
      cqu.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$1 instanceof cer) {
         a($$2, $$0.eT());
      }
   }

   public static void b(blv $$0, blf $$1) {
      cqu.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$0 instanceof cer) {
         a($$2, $$0.eT());
      }
   }

   public static int a(cqs $$0, blv $$1) {
      Iterable<cmh> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cmh $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(blv $$0) {
      return (float)a(cqw.m, $$0) * 0.15F;
   }

   public static int c(blv $$0) {
      return a(cqw.q, $$0);
   }

   public static int d(blv $$0) {
      return a(cqw.r, $$0);
   }

   public static int e(blv $$0) {
      return a(cqw.f, $$0);
   }

   public static int f(blv $$0) {
      return a(cqw.i, $$0);
   }

   public static int g(blv $$0) {
      return a(cqw.u, $$0);
   }

   public static int b(cmh $$0) {
      return a(cqw.C, $$0);
   }

   public static int c(cmh $$0) {
      return a(cqw.D, $$0);
   }

   public static int h(blv $$0) {
      return a(cqw.s, $$0);
   }

   public static boolean i(blv $$0) {
      return a(cqw.g, $$0) > 0;
   }

   public static boolean j(blv $$0) {
      return a(cqw.j, $$0) > 0;
   }

   public static boolean k(blv $$0) {
      return a(cqw.l, $$0) > 0;
   }

   public static boolean d(cmh $$0) {
      return a(cqw.k, $$0) > 0;
   }

   public static boolean e(cmh $$0) {
      return a(cqw.M, $$0) > 0;
   }

   public static boolean f(cmh $$0) {
      return a(cqw.v, $$0) > 0;
   }

   public static int g(cmh $$0) {
      return a(cqw.E, $$0);
   }

   public static int h(cmh $$0) {
      return a(cqw.G, $$0);
   }

   public static boolean i(cmh $$0) {
      return a(cqw.H, $$0) > 0;
   }

   @Nullable
   public static Entry<blk, cmh> b(cqs $$0, blv $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<blk, cmh> a(cqs $$0, blv $$1, Predicate<cmh> $$2) {
      Map<blk, cmh> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<blk, cmh>> $$4 = Lists.newArrayList();

         for (Entry<blk, cmh> $$5 : $$3.entrySet()) {
            cmh $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.eg().a($$4.size()));
      }
   }

   public static int a(auf $$0, int $$1, int $$2, cmh $$3) {
      cmc $$4 = $$3.d();
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

   public static cmh a(auf $$0, cmh $$1, int $$2, boolean $$3) {
      List<cqv> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cmk.qM);
      if ($$5) {
         $$1 = new cmh(cmk.up);
      }

      for (cqv $$6 : $$4) {
         if ($$5) {
            cld.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cqv> b(auf $$0, cmh $$1, int $$2, boolean $$3) {
      List<cqv> $$4 = Lists.newArrayList();
      cmc $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = aty.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cqv> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bhy.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bhy.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cqv> $$0, cqv $$1) {
      Iterator<cqv> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cqs> $$0, cqs $$1) {
      for (cqs $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cqv> a(int $$0, cmh $$1, boolean $$2) {
      List<cqv> $$3 = Lists.newArrayList();
      cmc $$4 = $$1.d();
      boolean $$5 = $$1.a(cmk.qM);

      for (cqs $$6 : kb.f) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cqv($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cqs var1, int var2);
   }
}
