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

public class cqb {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static sd a(@Nullable agm $$0, int $$1) {
      sd $$2 = new sd();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(sd $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(sd $$0) {
      return atq.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static agm b(sd $$0) {
      return agm.a($$0.l("id"));
   }

   @Nullable
   public static agm a(cpz $$0) {
      return kc.g.b($$0);
   }

   public static int a(cpz $$0, clo $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         agm $$2 = a($$0);
         sj $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            sd $$5 = $$3.a($$4);
            agm $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cpz, Integer> a(clo $$0) {
      sj $$1 = $$0.a(clr.uo) ? ckk.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<cpz, Integer> a(sj $$0) {
      Map<cpz, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sd $$3 = $$0.a($$2);
         kc.g.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cpz, Integer> $$0, clo $$1) {
      sj $$2 = new sj();

      for (Entry<cpz, Integer> $$3 : $$0.entrySet()) {
         cpz $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(clr.uo)) {
               ckk.a($$1, new cqc($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(clr.uo)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cqb.a $$0, clo $$1) {
      if (!$$1.b()) {
         sj $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sd $$4 = $$2.a($$3);
            kc.g.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cqb.a $$0, Iterable<clo> $$1) {
      for (clo $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<clo> $$0, bjt $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(clo $$0, blq $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bll $$0) {
      int $$1 = a(cqd.t, $$0);
      return $$1 > 0 ? cqp.e($$1) : 0.0F;
   }

   public static void a(bll $$0, bkv $$1) {
      cqb.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$1 instanceof cdz) {
         a($$2, $$0.eU());
      }
   }

   public static void b(bll $$0, bkv $$1) {
      cqb.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$0 instanceof cdz) {
         a($$2, $$0.eU());
      }
   }

   public static int a(cpz $$0, bll $$1) {
      Iterable<clo> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (clo $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bll $$0) {
      return (float)a(cqd.m, $$0) * 0.15F;
   }

   public static int c(bll $$0) {
      return a(cqd.q, $$0);
   }

   public static int d(bll $$0) {
      return a(cqd.r, $$0);
   }

   public static int e(bll $$0) {
      return a(cqd.f, $$0);
   }

   public static int f(bll $$0) {
      return a(cqd.i, $$0);
   }

   public static int g(bll $$0) {
      return a(cqd.u, $$0);
   }

   public static int b(clo $$0) {
      return a(cqd.C, $$0);
   }

   public static int c(clo $$0) {
      return a(cqd.D, $$0);
   }

   public static int h(bll $$0) {
      return a(cqd.s, $$0);
   }

   public static boolean i(bll $$0) {
      return a(cqd.g, $$0) > 0;
   }

   public static boolean j(bll $$0) {
      return a(cqd.j, $$0) > 0;
   }

   public static boolean k(bll $$0) {
      return a(cqd.l, $$0) > 0;
   }

   public static boolean d(clo $$0) {
      return a(cqd.k, $$0) > 0;
   }

   public static boolean e(clo $$0) {
      return a(cqd.M, $$0) > 0;
   }

   public static boolean f(clo $$0) {
      return a(cqd.v, $$0) > 0;
   }

   public static int g(clo $$0) {
      return a(cqd.E, $$0);
   }

   public static int h(clo $$0) {
      return a(cqd.G, $$0);
   }

   public static boolean i(clo $$0) {
      return a(cqd.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bla, clo> b(cpz $$0, bll $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bla, clo> a(cpz $$0, bll $$1, Predicate<clo> $$2) {
      Map<bla, clo> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bla, clo>> $$4 = Lists.newArrayList();

         for (Entry<bla, clo> $$5 : $$3.entrySet()) {
            clo $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.eh().a($$4.size()));
      }
   }

   public static int a(atw $$0, int $$1, int $$2, clo $$3) {
      clj $$4 = $$3.d();
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

   public static clo a(atw $$0, clo $$1, int $$2, boolean $$3) {
      List<cqc> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(clr.qM);
      if ($$5) {
         $$1 = new clo(clr.uo);
      }

      for (cqc $$6 : $$4) {
         if ($$5) {
            ckk.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<cqc> b(atw $$0, clo $$1, int $$2, boolean $$3) {
      List<cqc> $$4 = Lists.newArrayList();
      clj $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = atq.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cqc> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bho.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bho.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cqc> $$0, cqc $$1) {
      Iterator<cqc> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<cpz> $$0, cpz $$1) {
      for (cpz $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cqc> a(int $$0, clo $$1, boolean $$2) {
      List<cqc> $$3 = Lists.newArrayList();
      clj $$4 = $$1.d();
      boolean $$5 = $$1.a(clr.qM);

      for (cpz $$6 : kc.g) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new cqc($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cpz var1, int var2);
   }
}
