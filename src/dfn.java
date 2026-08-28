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

public class dfn {
   public static int a(je<dfl> $$0, cyy $$1) {
      dfr $$2 = $$1.a(kj.l, dfr.a);
      return $$2.a($$0);
   }

   public static dfr a(cyy $$0, Consumer<dfr.a> $$1) {
      ki<dfr> $$2 = d($$0);
      dfr $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dfr.a;
      } else {
         dfr.a $$4 = new dfr.a($$3);
         $$1.accept($$4);
         dfr $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cyy $$0) {
      return $$0.c(d($$0));
   }

   public static void a(cyy $$0, dfr $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dfr b(cyy $$0) {
      return $$0.a(d($$0), dfr.a);
   }

   private static ki<dfr> d(cyy $$0) {
      return $$0.a(czc.vB) ? kj.J : kj.l;
   }

   public static boolean c(cyy $$0) {
      return !$$0.a(kj.l, dfr.a).d() || !$$0.a(kj.J, dfr.a).d();
   }

   public static int a(arq $$0, cyy $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dfl)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arq $$0, cyy $$1, cyy $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dfl)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arq $$0, cyy $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dfl)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arq $$0, @Nullable bwd $$1, bwd $$2, int $$3) {
      if ($$1 instanceof bxc $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dfl)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cyy a(dfo $$0) {
      cyy $$1 = new cyy(czc.vB);
      $$1.a($$0.b(), $$0.c());
      return $$1;
   }

   private static void a(cyy $$0, dfn.b $$1) {
      dfr $$2 = $$0.a(kj.l, dfr.a);

      for (Entry<je<dfl>> $$3 : $$2.b()) {
         $$1.accept((je<dfl>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cyy $$0, bwn $$1, bxc $$2, dfn.a $$3) {
      if (!$$0.f()) {
         dfr $$4 = $$0.a(kj.l);
         if ($$4 != null && !$$4.d()) {
            dfk $$5 = new dfk($$0, $$1, $$2);

            for (Entry<je<dfl>> $$6 : $$4.b()) {
               je<dfl> $$7 = (je<dfl>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bxc $$0, dfn.a $$1) {
      for (bwn $$2 : bwn.j) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arq $$0, bxc $$1, bus $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arq $$0, bxc $$1, bus $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arq $$0, cyy $$1, bwd $$2, bus $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfl)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arq $$0, cyy $$1, bwd $$2, bus $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfl)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arq $$0, cyy $$1, bwd $$2, bus $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfl)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arq $$0, cyy $$1, bwd $$2, bus $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfl)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arq $$0, bwd $$1, bus $$2) {
      if ($$2.d() instanceof bxc $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arq $$0, bwd $$1, bus $$2, @Nullable cyy $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arq $$0, bwd $$1, bus $$2, @Nullable cyy $$3, @Nullable Consumer<cyu> $$4) {
      if ($$1 instanceof bxc $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dfl)$$3x.a()).a($$0, $$4x, $$5x, dfp.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bxc $$6) {
            a($$3, bwn.a, $$6, ($$3x, $$4x, $$5) -> ((dfl)$$3x.a()).a($$0, $$4x, $$5, dfp.a, $$1, $$2));
         } else if ($$4 != null) {
            dfk $$7 = new dfk($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dfl)$$4x.a()).a($$0, $$5, $$7, dfp.a, $$1, $$2));
         }
      }
   }

   public static void a(arq $$0, bxc $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arq $$0, cyy $$1, bxc $$2, bwn $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dfl)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bxc $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cyy $$0, bxc $$1, bwn $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dfl)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arq $$0, bxc $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bwd)$$1));
   }

   public static int a(je<dfl> $$0, bxc $$1) {
      Iterable<cyy> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cyy $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arq $$0, cyy $$1, bwd $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dfl)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arq $$0, cyy $$1, bwd $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dfl)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arq $$0, cyy $$1, cyy $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dfl)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arq $$0, cyy $$1, crs $$2, Consumer<cyu> $$3) {
      bxc $$5 = $$2.q() instanceof bxc $$4 ? $$4 : null;
      dfk $$6 = new dfk($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dfl)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arq $$0, cyy $$1, @Nullable bxc $$2, bwd $$3, @Nullable bwn $$4, fei $$5, dzz $$6, Consumer<cyu> $$7) {
      dfk $$8 = new dfk($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dfl)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arq $$0, cyy $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dfl)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arq $$0, bxc $$1, bus $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azv $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         eyz $$8 = dfl.b($$0, $$6, $$1, $$2);
         ((dfl)$$5x.a()).a(dfm.m).forEach($$4xx -> {
            if ($$4xx.a() == dfp.c && $$4xx.b() == dfp.c && $$4xx.a($$8)) {
               $$4.setValue(((dge)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bxc $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            eyz $$8 = dfl.b($$0, $$6, $$1, $$2);
            ((dfl)$$5x.a()).a(dfm.m).forEach($$4xx -> {
               if ($$4xx.a() == dfp.a && $$4xx.b() == dfp.c && $$4xx.a($$8)) {
                  $$4.setValue(((dge)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cyy $$0, bwo $$1, BiConsumer<je<byd>, byg> $$2) {
      a($$0, ($$2x, $$3) -> ((dfl)$$2x.a()).a(dfm.l).forEach($$4 -> {
            if (((dfl)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cyy $$0, bwn $$1, BiConsumer<je<byd>, byg> $$2) {
      a($$0, ($$2x, $$3) -> ((dfl)$$2x.a()).a(dfm.l).forEach($$4 -> {
            if (((dfl)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arq $$0, cyy $$1, bwd $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arq $$0, cyy $$1, bwd $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arq $$0, cyy $$1, bwd $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cyy $$0, bxc $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dfl)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cyy $$0, bxc $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dfl)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cyy $$0, axr<dfl> $$1) {
      dfr $$2 = $$0.a(kj.l, dfr.a);

      for (Entry<je<dfl>> $$3 : $$2.b()) {
         je<dfl> $$4 = (je<dfl>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cyy $$0, ki<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dfl)$$2x.a()).i().c($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cyy $$0, ki<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cyy $$0, ki<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dfl)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dfk> a(ki<?> $$0, bxc $$1, Predicate<cyy> $$2) {
      List<dfk> $$3 = new ArrayList<>();

      for (bwn $$4 : bwn.j) {
         cyy $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dfr $$6 = $$5.a(kj.l, dfr.a);

            for (Entry<je<dfl>> $$7 : $$6.b()) {
               je<dfl> $$8 = (je<dfl>)$$7.getKey();
               if ($$8.a().i().c($$0) && $$8.a().a($$4)) {
                  $$3.add(new dfk($$5, $$4, $$1));
               }
            }
         }
      }

      return af.b($$3, $$1.dY());
   }

   public static int a(azv $$0, int $$1, int $$2, cyy $$3) {
      dfj $$4 = $$3.a(kj.C);
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

   public static cyy a(azv $$0, cyy $$1, int $$2, js $$3, Optional<? extends ji<dfl>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<je<dfl>>>map(ji::a).orElseGet(() -> $$3.f(mg.aQ).c().map($$0xx -> $$0xx)));
   }

   public static cyy a(azv $$0, cyy $$1, int $$2, Stream<je<dfl>> $$3) {
      List<dfo> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(czc.rC)) {
         $$1 = new cyy(czc.vB);
      }

      for (dfo $$5 : $$4) {
         $$1.a($$5.b(), $$5.c());
      }

      return $$1;
   }

   public static List<dfo> b(azv $$0, cyy $$1, int $$2, Stream<je<dfl>> $$3) {
      List<dfo> $$4 = Lists.newArrayList();
      dfj $$5 = $$1.a(kj.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azm.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dfo> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bsn.a($$0, $$7, dfo::a).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, af.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bsn.a($$0, $$7, dfo::a).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dfo> $$0, dfo $$1) {
      $$0.removeIf($$1x -> !dfl.a($$1.b(), $$1x.b()));
   }

   public static boolean a(Collection<je<dfl>> $$0, je<dfl> $$1) {
      for (je<dfl> $$2 : $$0) {
         if (!dfl.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dfo> a(int $$0, cyy $$1, Stream<je<dfl>> $$2) {
      List<dfo> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(czc.rC);
      $$2.filter($$2x -> ((dfl)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dfl $$3x = (dfl)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dfo($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cyy $$0, js $$1, alf<dgt> $$2, btz $$3, azv $$4) {
      dgt $$5 = $$1.f(mg.aP).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(je<dfl> var1, int var2, dfk var3);
   }

   @FunctionalInterface
   interface b {
      void accept(je<dfl> var1, int var2);
   }
}
