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

public class czz {
   private static final float a = 0.15F;

   public static int a(czy $$0, cun $$1) {
      dad $$2 = $$1.a(km.j, dad.a);
      return $$2.a($$0);
   }

   public static dad a(cun $$0, Consumer<dad.a> $$1) {
      kl<dad> $$2 = l($$0);
      dad $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dad.a;
      } else {
         dad.a $$4 = new dad.a($$3);
         $$1.accept($$4);
         dad $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cun $$0) {
      return $$0.b(l($$0));
   }

   public static void a(cun $$0, dad $$1) {
      $$0.b(l($$0), $$1);
   }

   public static dad b(cun $$0) {
      return $$0.a(l($$0), dad.a);
   }

   private static kl<dad> l(cun $$0) {
      return $$0.a(cuq.uw) ? km.x : km.j;
   }

   public static boolean c(cun $$0) {
      return !$$0.a(km.j, dad.a).d() || !$$0.a(km.x, dad.a).d();
   }

   public static float a(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }

   private static void a(czz.a $$0, cun $$1) {
      dad $$2 = $$1.a(km.j, dad.a);

      for (Entry<ji<czy>> $$3 : $$2.b()) {
         $$0.accept((czy)((ji)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(czz.a $$0, Iterable<cun> $$1) {
      for (cun $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cun> $$0, brl $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cun $$0, @Nullable bsy<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(btn $$0) {
      int $$1 = a(dab.t, $$0);
      return $$1 > 0 ? a($$1) : 0.0F;
   }

   public static float a(@Nullable bss $$0, float $$1) {
      if ($$0 instanceof btn $$2) {
         int $$3 = a(dab.M, $$2);
         if ($$3 > 0) {
            return czu.a((float)$$3, $$1);
         }
      }

      return $$1;
   }

   public static void a(btn $$0, bss $$1) {
      czz.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$1 instanceof cmv) {
         a($$2, $$0.eX());
      }
   }

   public static void b(btn $$0, bss $$1) {
      czz.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fc());
      }

      if ($$0 instanceof cmv) {
         a($$2, $$0.eX());
      }
   }

   public static void a(btn $$0, bss $$1, dad $$2) {
      for (Entry<ji<czy>> $$3 : $$2.b()) {
         ((czy)((ji)$$3.getKey()).a()).c($$0, $$1, $$3.getIntValue());
      }
   }

   public static int a(czy $$0, btn $$1) {
      Iterable<cun> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cun $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(btn $$0) {
      return (float)a(dab.m, $$0) * 0.15F;
   }

   public static int c(btn $$0) {
      return a(dab.q, $$0);
   }

   public static int d(btn $$0) {
      return a(dab.r, $$0);
   }

   public static int e(btn $$0) {
      return a(dab.f, $$0);
   }

   public static int f(btn $$0) {
      return a(dab.i, $$0);
   }

   public static int g(btn $$0) {
      return a(dab.u, $$0);
   }

   public static int d(cun $$0) {
      return a(dab.C, $$0);
   }

   public static int e(cun $$0) {
      return a(dab.D, $$0);
   }

   public static int h(btn $$0) {
      return a(dab.s, $$0);
   }

   public static boolean i(btn $$0) {
      return a(dab.g, $$0) > 0;
   }

   public static boolean j(btn $$0) {
      return a(dab.j, $$0) > 0;
   }

   public static boolean k(btn $$0) {
      return a(dab.l, $$0) > 0;
   }

   public static boolean f(cun $$0) {
      return a(dab.k, $$0) > 0;
   }

   public static boolean g(cun $$0) {
      return a(dab.P, $$0) > 0;
   }

   public static boolean h(cun $$0) {
      return a(dab.v, $$0) > 0;
   }

   public static int i(cun $$0) {
      return a(dab.E, $$0);
   }

   public static int j(cun $$0) {
      return a(dab.G, $$0);
   }

   public static boolean k(cun $$0) {
      return a(dab.H, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<bsz, cun> b(czy $$0, btn $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<bsz, cun> a(czy $$0, btn $$1, Predicate<cun> $$2) {
      Map<bsz, cun> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<bsz, cun>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<bsz, cun> $$5 : $$3.entrySet()) {
            cun $$6 = $$5.getValue();
            if (!$$6.e() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.el().a($$4.size()));
      }
   }

   public static int a(azf $$0, int $$1, int $$2, cun $$3) {
      cui $$4 = $$3.g();
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

   public static cun a(cpj $$0, azf $$1, cun $$2, int $$3, boolean $$4) {
      List<daa> $$5 = b($$0, $$1, $$2, $$3, $$4);
      if ($$2.a(cuq.qP)) {
         $$2 = new cun(cuq.uw);
      }

      for (daa $$6 : $$5) {
         $$2.a($$6.a, $$6.b);
      }

      return $$2;
   }

   public static List<daa> b(cpj $$0, azf $$1, cun $$2, int $$3, boolean $$4) {
      List<daa> $$5 = Lists.newArrayList();
      cui $$6 = $$2.g();
      int $$7 = $$6.g();
      if ($$7 <= 0) {
         return $$5;
      } else {
         $$3 += 1 + $$1.a($$7 / 4 + 1) + $$1.a($$7 / 4 + 1);
         float $$8 = ($$1.i() + $$1.i() - 1.0F) * 0.15F;
         $$3 = ayx.a(Math.round((float)$$3 + (float)$$3 * $$8), 1, Integer.MAX_VALUE);
         List<daa> $$9 = a($$0, $$3, $$2, $$4);
         if (!$$9.isEmpty()) {
            bpf.a($$1, $$9).ifPresent($$5::add);

            while ($$1.a(50) <= $$3) {
               if (!$$5.isEmpty()) {
                  a($$9, ac.c($$5));
               }

               if ($$9.isEmpty()) {
                  break;
               }

               bpf.a($$1, $$9).ifPresent($$5::add);
               $$3 /= 2;
            }
         }

         return $$5;
      }
   }

   public static void a(List<daa> $$0, daa $$1) {
      Iterator<daa> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ji<czy>> $$0, czy $$1) {
      for (ji<czy> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<daa> a(cpj $$0, int $$1, cun $$2, boolean $$3) {
      List<daa> $$4 = Lists.newArrayList();
      boolean $$5 = $$2.a(cuq.qP);

      for (czy $$6 : lp.f) {
         if ($$6.a($$0) && (!$$6.a() || $$3) && $$6.l() && ($$5 || $$6.b($$2) && $$6.a($$2))) {
            for (int $$7 = $$6.g(); $$7 > $$6.f() - 1; $$7--) {
               if ($$1 >= $$6.c($$7) && $$1 <= $$6.d($$7)) {
                  $$4.add(new daa($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$4;
   }

   @FunctionalInterface
   interface a {
      void accept(czy var1, int var2);
   }
}
