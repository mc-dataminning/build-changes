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

public class dae {
   private static final float a = 0.15F;

   public static int a(dad $$0, cuh $$1) {
      dai $$2 = $$1.a(ke.i, dai.a);
      return $$2.a($$0);
   }

   public static dai a(cuh $$0, Consumer<dai.a> $$1) {
      kd<dai> $$2 = l($$0);
      dai $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dai.a;
      } else {
         dai.a $$4 = new dai.a($$3);
         $$1.accept($$4);
         dai $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cuh $$0) {
      return $$0.b(l($$0));
   }

   public static void a(cuh $$0, dai $$1) {
      $$0.b(l($$0), $$1);
   }

   public static dai b(cuh $$0) {
      return $$0.a(l($$0), dai.a);
   }

   private static kd<dai> l(cuh $$0) {
      return $$0.a(cuk.wh) ? ke.w : ke.i;
   }

   public static boolean c(cuh $$0) {
      return !$$0.a(ke.i, dai.a).d() || !$$0.a(ke.w, dai.a).d();
   }

   public static float a(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }

   private static void a(dae.a $$0, cuh $$1) {
      dai $$2 = $$1.a(ke.i, dai.a);

      for (Entry<ja<dad>> $$3 : $$2.b()) {
         $$0.accept((dad)((ja)$$3.getKey()).a(), $$3.getIntValue());
      }
   }

   private static void a(dae.a $$0, Iterable<cuh> $$1) {
      for (cuh $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cuh> $$0, bqt $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cuh $$0, @Nullable bsb<?> $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bso $$0) {
      int $$1 = a(dag.t, $$0);
      return $$1 > 0 ? a($$1) : 0.0F;
   }

   public static void a(bso $$0, brv $$1) {
      dae.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fl());
      }

      if ($$1 instanceof cly) {
         a($$2, $$0.fg());
      }
   }

   public static void b(bso $$0, brv $$1) {
      dae.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.fl());
      }

      if ($$0 instanceof cly) {
         a($$2, $$0.fg());
      }
   }

   public static int a(dad $$0, bso $$1) {
      Iterable<cuh> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cuh $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bso $$0) {
      return (float)a(dag.m, $$0) * 0.15F;
   }

   public static int c(bso $$0) {
      return a(dag.q, $$0);
   }

   public static int d(bso $$0) {
      return a(dag.r, $$0);
   }

   public static int e(bso $$0) {
      return a(dag.f, $$0);
   }

   public static int f(bso $$0) {
      return a(dag.i, $$0);
   }

   public static int g(bso $$0) {
      return a(dag.u, $$0);
   }

   public static int d(cuh $$0) {
      return a(dag.D, $$0);
   }

   public static int e(cuh $$0) {
      return a(dag.E, $$0);
   }

   public static int h(bso $$0) {
      return a(dag.s, $$0);
   }

   public static boolean i(bso $$0) {
      return a(dag.g, $$0) > 0;
   }

   public static boolean j(bso $$0) {
      return a(dag.j, $$0) > 0;
   }

   public static boolean k(bso $$0) {
      return a(dag.l, $$0) > 0;
   }

   public static boolean f(cuh $$0) {
      return a(dag.k, $$0) > 0;
   }

   public static boolean g(cuh $$0) {
      return a(dag.N, $$0) > 0;
   }

   public static boolean h(cuh $$0) {
      return a(dag.v, $$0) > 0;
   }

   public static int i(cuh $$0) {
      return a(dag.F, $$0);
   }

   public static int j(cuh $$0) {
      return a(dag.H, $$0);
   }

   public static boolean k(cuh $$0) {
      return a(dag.I, $$0) > 0;
   }

   @Nullable
   public static java.util.Map.Entry<bsc, cuh> b(dad $$0, bso $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static java.util.Map.Entry<bsc, cuh> a(dad $$0, bso $$1, Predicate<cuh> $$2) {
      Map<bsc, cuh> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<java.util.Map.Entry<bsc, cuh>> $$4 = Lists.newArrayList();

         for (java.util.Map.Entry<bsc, cuh> $$5 : $$3.entrySet()) {
            cuh $$6 = $$5.getValue();
            if (!$$6.d() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.et().a($$4.size()));
      }
   }

   public static int a(ayt $$0, int $$1, int $$2, cuh $$3) {
      cuc $$4 = $$3.f();
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

   public static cuh a(ayt $$0, cuh $$1, int $$2, boolean $$3) {
      List<daf> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cuk.sm)) {
         $$1 = new cuh(cuk.wh);
      }

      for (daf $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<daf> b(ayt $$0, cuh $$1, int $$2, boolean $$3) {
      List<daf> $$4 = Lists.newArrayList();
      cuc $$5 = $$1.f();
      int $$6 = $$5.g();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = aym.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<daf> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bon.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ad.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bon.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<daf> $$0, daf $$1) {
      Iterator<daf> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<ja<dad>> $$0, dad $$1) {
      for (ja<dad> $$2 : $$0) {
         if (!$$2.a().b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<daf> a(int $$0, cuh $$1, boolean $$2) {
      List<daf> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cuk.sm);

      for (dad $$5 : lh.f) {
         if ((!$$5.a() || $$2) && $$5.k() && ($$4 || $$5.b($$1) && $$5.a($$1))) {
            for (int $$6 = $$5.g(); $$6 > $$5.f() - 1; $$6--) {
               if ($$0 >= $$5.c($$6) && $$0 <= $$5.d($$6)) {
                  $$3.add(new daf($$5, $$6));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(dad var1, int var2);
   }
}
