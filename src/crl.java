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

public class crl {
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
      return auo.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static ahg b(sn $$0) {
      return ahg.a($$0.l("id"));
   }

   @Nullable
   public static ahg a(crj $$0) {
      return kd.f.b($$0);
   }

   public static int a(crj $$0, cmy $$1) {
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

   public static Map<crj, Integer> a(cmy $$0) {
      st $$1 = $$0.a(cnb.up) ? clu.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<crj, Integer> a(st $$0) {
      Map<crj, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sn $$3 = $$0.a($$2);
         kd.f.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<crj, Integer> $$0, cmy $$1) {
      st $$2 = new st();

      for (Entry<crj, Integer> $$3 : $$0.entrySet()) {
         crj $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cnb.up)) {
               clu.a($$1, new crm($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cnb.up)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(crl.a $$0, cmy $$1) {
      if (!$$1.b()) {
         st $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sn $$4 = $$2.a($$3);
            kd.f.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(crl.a $$0, Iterable<cmy> $$1) {
      for (cmy $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cmy> $$0, bkt $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cmy $$0, bmq $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bml $$0) {
      int $$1 = a(crn.t, $$0);
      return $$1 > 0 ? crz.e($$1) : 0.0F;
   }

   public static void a(bml $$0, blv $$1) {
      crl.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$1 instanceof cfi) {
         a($$2, $$0.eT());
      }
   }

   public static void b(bml $$0, blv $$1) {
      crl.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$0 instanceof cfi) {
         a($$2, $$0.eT());
      }
   }

   public static int a(crj $$0, bml $$1) {
      Iterable<cmy> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cmy $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bml $$0) {
      return (float)a(crn.m, $$0) * 0.15F;
   }

   public static int c(bml $$0) {
      return a(crn.q, $$0);
   }

   public static int d(bml $$0) {
      return a(crn.r, $$0);
   }

   public static int e(bml $$0) {
      return a(crn.f, $$0);
   }

   public static int f(bml $$0) {
      return a(crn.i, $$0);
   }

   public static int g(bml $$0) {
      return a(crn.u, $$0);
   }

   public static int b(cmy $$0) {
      return a(crn.C, $$0);
   }

   public static int c(cmy $$0) {
      return a(crn.D, $$0);
   }

   public static int h(bml $$0) {
      return a(crn.s, $$0);
   }

   public static boolean i(bml $$0) {
      return a(crn.g, $$0) > 0;
   }

   public static boolean j(bml $$0) {
      return a(crn.j, $$0) > 0;
   }

   public static boolean k(bml $$0) {
      return a(crn.l, $$0) > 0;
   }

   public static boolean d(cmy $$0) {
      return a(crn.k, $$0) > 0;
   }

   public static boolean e(cmy $$0) {
      return a(crn.M, $$0) > 0;
   }

   public static boolean f(cmy $$0) {
      return a(crn.v, $$0) > 0;
   }

   public static int g(cmy $$0) {
      return a(crn.E, $$0);
   }

   public static int h(cmy $$0) {
      return a(crn.G, $$0);
   }

   public static boolean i(cmy $$0) {
      return a(crn.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bma, cmy> b(crj $$0, bml $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bma, cmy> a(crj $$0, bml $$1, Predicate<cmy> $$2) {
      Map<bma, cmy> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bma, cmy>> $$4 = Lists.newArrayList();

         for (Entry<bma, cmy> $$5 : $$3.entrySet()) {
            cmy $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.eg().a($$4.size()));
      }
   }

   public static int a(auv $$0, int $$1, int $$2, cmy $$3) {
      cmt $$4 = $$3.d();
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

   public static cmy a(auv $$0, cmy $$1, int $$2, boolean $$3) {
      List<crm> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cnb.qM);
      if ($$5) {
         $$1 = new cmy(cnb.up);
      }

      for (crm $$6 : $$4) {
         if ($$5) {
            clu.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<crm> b(auv $$0, cmy $$1, int $$2, boolean $$3) {
      List<crm> $$4 = Lists.newArrayList();
      cmt $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = auo.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<crm> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bio.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bio.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<crm> $$0, crm $$1) {
      Iterator<crm> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<crj> $$0, crj $$1) {
      for (crj $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<crm> a(int $$0, cmy $$1, boolean $$2) {
      List<crm> $$3 = Lists.newArrayList();
      cmt $$4 = $$1.d();
      boolean $$5 = $$1.a(cnb.qM);

      for (crj $$6 : kd.f) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new crm($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(crj var1, int var2);
   }
}
