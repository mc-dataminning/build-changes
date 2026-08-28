import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableObject;

public class dfh {
   public static int a(je<dff> $$0, cys $$1) {
      dfl $$2 = $$1.a(kj.l, dfl.a);
      return $$2.a($$0);
   }

   public static dfl a(cys $$0, Consumer<dfl.a> $$1) {
      ki<dfl> $$2 = d($$0);
      dfl $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dfl.a;
      } else {
         dfl.a $$4 = new dfl.a($$3);
         $$1.accept($$4);
         dfl $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cys $$0) {
      return $$0.c(d($$0));
   }

   public static void a(cys $$0, dfl $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dfl b(cys $$0) {
      return $$0.a(d($$0), dfl.a);
   }

   private static ki<dfl> d(cys $$0) {
      return $$0.a(cyw.vz) ? kj.J : kj.l;
   }

   public static boolean c(cys $$0) {
      return !$$0.a(kj.l, dfl.a).d() || !$$0.a(kj.J, dfl.a).d();
   }

   public static int a(aro $$0, cys $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dff)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aro $$0, cys $$1, cys $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dff)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(aro $$0, cys $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dff)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aro $$0, @Nullable bwa $$1, bwa $$2, int $$3) {
      if ($$1 instanceof bwz $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dff)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cys a(dfi $$0) {
      cys $$1 = new cys(cyw.vz);
      $$1.a($$0.b(), $$0.c());
      return $$1;
   }

   private static void a(cys $$0, dfh.b $$1) {
      dfl $$2 = $$0.a(kj.l, dfl.a);

      for (Entry<je<dff>> $$3 : $$2.b()) {
         $$1.accept((je<dff>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cys $$0, bwk $$1, bwz $$2, dfh.a $$3) {
      if (!$$0.f()) {
         dfl $$4 = $$0.a(kj.l);
         if ($$4 != null && !$$4.d()) {
            dfe $$5 = new dfe($$0, $$1, $$2);

            for (Entry<je<dff>> $$6 : $$4.b()) {
               je<dff> $$7 = (je<dff>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bwz $$0, dfh.a $$1) {
      for (bwk $$2 : bwk.j) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(aro $$0, bwz $$1, bup $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(aro $$0, bwz $$1, bup $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(aro $$0, cys $$1, bwa $$2, bup $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dff)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(aro $$0, cys $$1, bwa $$2, bup $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dff)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(aro $$0, cys $$1, bwa $$2, bup $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dff)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(aro $$0, cys $$1, bwa $$2, bup $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dff)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(aro $$0, bwa $$1, bup $$2) {
      if ($$2.d() instanceof bwz $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(aro $$0, bwa $$1, bup $$2, @Nullable cys $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(aro $$0, bwa $$1, bup $$2, @Nullable cys $$3, @Nullable Consumer<cyo> $$4) {
      if ($$1 instanceof bwz $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dff)$$3x.a()).a($$0, $$4x, $$5x, dfj.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bwz $$6) {
            a($$3, bwk.a, $$6, ($$3x, $$4x, $$5) -> ((dff)$$3x.a()).a($$0, $$4x, $$5, dfj.a, $$1, $$2));
         } else if ($$4 != null) {
            dfe $$7 = new dfe($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dff)$$4x.a()).a($$0, $$5, $$7, dfj.a, $$1, $$2));
         }
      }
   }

   public static void a(aro $$0, bwz $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(aro $$0, cys $$1, bwz $$2, bwk $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dff)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bwz $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cys $$0, bwz $$1, bwk $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dff)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(aro $$0, bwz $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bwa)$$1));
   }

   public static int a(je<dff> $$0, bwz $$1) {
      Iterable<cys> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cys $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(aro $$0, cys $$1, bwa $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dff)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(aro $$0, cys $$1, bwa $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dff)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(aro $$0, cys $$1, cys $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dff)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(aro $$0, cys $$1, crm $$2, Consumer<cyo> $$3) {
      bwz $$5 = $$2.q() instanceof bwz $$4 ? $$4 : null;
      dfe $$6 = new dfe($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dff)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(aro $$0, cys $$1, @Nullable bwz $$2, bwa $$3, @Nullable bwk $$4, fdw $$5, dzo $$6, Consumer<cyo> $$7) {
      dfe $$8 = new dfe($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dff)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(aro $$0, cys $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dff)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(aro $$0, bwz $$1, bup $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azt $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         eyn $$8 = dff.b($$0, $$6, $$1, $$2);
         ((dff)$$5x.a()).a(dfg.m).forEach($$4xx -> {
            if ($$4xx.a() == dfj.c && $$4xx.b() == dfj.c && $$4xx.a($$8)) {
               $$4.setValue(((dfy)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bwz $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            eyn $$8 = dff.b($$0, $$6, $$1, $$2);
            ((dff)$$5x.a()).a(dfg.m).forEach($$4xx -> {
               if ($$4xx.a() == dfj.a && $$4xx.b() == dfj.c && $$4xx.a($$8)) {
                  $$4.setValue(((dfy)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cys $$0, bwl $$1, BiConsumer<je<bya>, byd> $$2) {
      a($$0, ($$2x, $$3) -> ((dff)$$2x.a()).a(dfg.l).forEach($$4 -> {
            if (((dff)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cys $$0, bwk $$1, BiConsumer<je<bya>, byd> $$2) {
      a($$0, ($$2x, $$3) -> ((dff)$$2x.a()).a(dfg.l).forEach($$4 -> {
            if (((dff)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(aro $$0, cys $$1, bwa $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(aro $$0, cys $$1, bwa $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(aro $$0, cys $$1, bwa $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cys $$0, bwz $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dff)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cys $$0, bwz $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dff)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cys $$0, axp<dff> $$1) {
      dfl $$2 = $$0.a(kj.l, dfl.a);

      for (Entry<je<dff>> $$3 : $$2.b()) {
         je<dff> $$4 = (je<dff>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cys $$0, ki<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dff)$$2x.a()).i().c($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cys $$0, ki<List<T>> $$1) {
      Pair<List<T>, Integer> $$2 = c($$0, $$1);
      if ($$2 != null) {
         List<T> $$3 = (List<T>)$$2.getFirst();
         int $$4 = (Integer)$$2.getSecond();
         return Optional.of($$3.get(Math.min($$4, $$3.size()) - 1));
      } else {
         return Optional.empty();
      }
   }

   @Nullable
   public static <T> Pair<T, Integer> c(cys $$0, ki<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dff)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dfe> a(ki<?> $$0, bwz $$1, Predicate<cys> $$2) {
      List<dfe> $$3 = new ArrayList<>();

      for (bwk $$4 : bwk.j) {
         cys $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dfl $$6 = $$5.a(kj.l, dfl.a);

            for (Entry<je<dff>> $$7 : $$6.b()) {
               je<dff> $$8 = (je<dff>)$$7.getKey();
               if ($$8.a().i().c($$0) && $$8.a().a($$4)) {
                  $$3.add(new dfe($$5, $$4, $$1));
               }
            }
         }
      }

      return af.b($$3, $$1.dY());
   }

   public static int a(azt $$0, int $$1, int $$2, cys $$3) {
      dfd $$4 = $$3.a(kj.C);
      if ($$4 == null) {
         return 0;
      } else {
         if ($$2 > 15) {
            $$2 = 15;
         }

         int $$5 = $$0.a(8) + 1 + ($$2 >> 1) + $$0.a($$2 + 1);
         if ($$1 == 0) {
            return Math.max($$5 / 3, 1);
         } else {
            return $$1 == 1 ? $$5 * 2 / 3 + 1 : Math.max($$5, $$2 * 2);
         }
      }
   }

   public static cys a(azt $$0, cys $$1, int $$2, js $$3, Optional<? extends ji<dff>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<je<dff>>>map(ji::a).orElseGet(() -> $$3.f(mg.aP).c().map($$0xx -> $$0xx)));
   }

   public static cys a(azt $$0, cys $$1, int $$2, Stream<je<dff>> $$3) {
      List<dfi> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cyw.rA)) {
         $$1 = new cys(cyw.vz);
      }

      for (dfi $$5 : $$4) {
         $$1.a($$5.b(), $$5.c());
      }

      return $$1;
   }

   public static List<dfi> b(azt $$0, cys $$1, int $$2, Stream<je<dff>> $$3) {
      List<dfi> $$4 = Lists.newArrayList();
      dfd $$5 = $$1.a(kj.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azk.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dfi> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bsk.a($$0, $$7, dfi::a).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, af.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bsk.a($$0, $$7, dfi::a).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dfi> $$0, dfi $$1) {
      $$0.removeIf($$1x -> !dff.a($$1.b(), $$1x.b()));
   }

   public static boolean a(Collection<je<dff>> $$0, je<dff> $$1) {
      for (je<dff> $$2 : $$0) {
         if (!dff.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dfi> a(int $$0, cys $$1, Stream<je<dff>> $$2) {
      List<dfi> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cyw.rA);
      $$2.filter($$2x -> ((dff)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dff $$3x = (dff)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dfi($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cys $$0, js $$1, ald<dgn> $$2, btw $$3, azt $$4) {
      dgn $$5 = $$1.f(mg.aO).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(je<dff> var1, int var2, dfe var3);
   }

   @FunctionalInterface
   interface b {
      void accept(je<dff> var1, int var2);
   }
}
