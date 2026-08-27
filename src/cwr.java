import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class cwr {
   private static final float a = 0.15F;

   public static int a(cwq $$0, crj $$1) {
      cwx $$2 = $$1.a(jp.f, cwx.a);
      return $$2.a($$0);
   }

   public static cwx a(crj $$0, Consumer<cwx.a> $$1) {
      jo<cwx> $$2 = k($$0);
      cwx $$3 = $$0.a($$2);
      if ($$3 == null) {
         return cwx.a;
      } else {
         cwx.a $$4 = new cwx.a($$3);
         $$1.accept($$4);
         cwx $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(crj $$0) {
      return $$0.b(k($$0));
   }

   public static void a(crj $$0, cwx $$1) {
      $$0.b(k($$0), $$1);
   }

   public static cwx b(crj $$0) {
      return $$0.a(k($$0), cwx.a);
   }

   private static jo<cwx> k(crj $$0) {
      return $$0.a(crm.uu) ? jp.p : jp.f;
   }

   private static void a(cwr.a $$0, crj $$1) {
      cwx $$2 = $$1.a(jp.f, cwx.a);

      for (Entry<il<cwq>> $$3 : $$2.b()) {
         $$0.accept((cwq)((il)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(cwr.a $$0, Iterable<crj> $$1) {
      for (crj $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<crj> $$0, bot $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(crj $$0, @Nullable bqb<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bqo $$0) {
      int $$1 = a(cwt.t, $$0);
      return $$1 > 0 ? cxg.e($$1) : 0.0F;
   }

   public static void a(bqo $$0, bpv $$1) {
      cwr.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.eZ());
      }

      if ($$1 instanceof cjt) {
         a($$2, $$0.eU());
      }
   }

   public static void b(bqo $$0, bpv $$1) {
      cwr.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.eZ());
      }

      if ($$0 instanceof cjt) {
         a($$2, $$0.eU());
      }
   }

   public static int a(cwq $$0, bqo $$1) {
      Iterable<crj> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (crj $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bqo $$0) {
      return (float)a(cwt.m, $$0) * 0.15F;
   }

   public static int c(bqo $$0) {
      return a(cwt.q, $$0);
   }

   public static int d(bqo $$0) {
      return a(cwt.r, $$0);
   }

   public static int e(bqo $$0) {
      return a(cwt.f, $$0);
   }

   public static int f(bqo $$0) {
      return a(cwt.i, $$0);
   }

   public static int g(bqo $$0) {
      return a(cwt.u, $$0);
   }

   public static int c(crj $$0) {
      return a(cwt.C, $$0);
   }

   public static int d(crj $$0) {
      return a(cwt.D, $$0);
   }

   public static int h(bqo $$0) {
      return a(cwt.s, $$0);
   }

   public static boolean i(bqo $$0) {
      return a(cwt.g, $$0) > 0;
   }

   public static boolean j(bqo $$0) {
      return a(cwt.j, $$0) > 0;
   }

   public static boolean k(bqo $$0) {
      return a(cwt.l, $$0) > 0;
   }

   public static boolean e(crj $$0) {
      return a(cwt.k, $$0) > 0;
   }

   public static boolean f(crj $$0) {
      return a(cwt.M, $$0) > 0;
   }

   public static boolean g(crj $$0) {
      return a(cwt.v, $$0) > 0;
   }

   public static int h(crj $$0) {
      return a(cwt.E, $$0);
   }

   public static int i(crj $$0) {
      return a(cwt.G, $$0);
   }

   public static boolean j(crj $$0) {
      return a(cwt.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<bqc, crj> b(cwq $$0, bqo $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<bqc, crj> a(cwq $$0, bqo $$1, Predicate<crj> $$2) {
      Map<bqc, crj> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<bqc, crj>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<bqc, crj> $$5 : $$3.entrySet()) {
            crj $$6 = $$5.getValue();
            if (!$$6.d() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.ei().a($$4.size()));
      }
   }

   public static int a(axr $$0, int $$1, int $$2, crj $$3) {
      cre $$4 = $$3.f();
      int $$5 = $$4.g();
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

   public static crj a(axr $$0, crj $$1, int $$2, boolean $$3) {
      List<cws> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(crm.qO)) {
         $$1 = new crj(crm.uu);
      }

      for (cws $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<cws> b(axr $$0, crj $$1, int $$2, boolean $$3) {
      List<cws> $$4 = Lists.newArrayList();
      cre $$5 = $$1.f();
      int $$6 = $$5.g();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = axk.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<cws> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bmn.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bmn.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<cws> $$0, cws $$1) {
      Iterator<cws> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<il<cwq>> $$0, cwq $$1) {
      for (il<cwq> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<cws> a(int $$0, crj $$1, boolean $$2) {
      List<cws> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(crm.qO);

      for (cwq $$5 : kr.f) {
         if ((!$$5.b() || $$2) && $$5.j() && ($$5.a($$1) || $$4)) {
            for (int $$6 = $$5.a(); $$6 > $$5.f() - 1; $$6--) {
               if ($$0 >= $$5.a($$6) && $$0 <= $$5.b($$6)) {
                  $$3.add(new cws($$5, $$6));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cwq var1, int var2);
   }
}
