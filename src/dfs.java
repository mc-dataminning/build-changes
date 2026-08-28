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

public class dfs {
   public static int a(je<dfq> $$0, czd $$1) {
      dfw $$2 = $$1.a(kj.l, dfw.a);
      return $$2.a($$0);
   }

   public static dfw a(czd $$0, Consumer<dfw.a> $$1) {
      ki<dfw> $$2 = d($$0);
      dfw $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dfw.a;
      } else {
         dfw.a $$4 = new dfw.a($$3);
         $$1.accept($$4);
         dfw $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(czd $$0) {
      return $$0.c(d($$0));
   }

   public static void a(czd $$0, dfw $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dfw b(czd $$0) {
      return $$0.a(d($$0), dfw.a);
   }

   private static ki<dfw> d(czd $$0) {
      return $$0.a(czh.vG) ? kj.J : kj.l;
   }

   public static boolean c(czd $$0) {
      return !$$0.a(kj.l, dfw.a).d() || !$$0.a(kj.J, dfw.a).d();
   }

   public static int a(arq $$0, czd $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dfq)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arq $$0, czd $$1, czd $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dfq)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arq $$0, czd $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dfq)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arq $$0, @Nullable bwf $$1, bwf $$2, int $$3) {
      if ($$1 instanceof bxe $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dfq)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static czd a(dft $$0) {
      czd $$1 = new czd(czh.vG);
      $$1.a($$0.b(), $$0.c());
      return $$1;
   }

   private static void a(czd $$0, dfs.b $$1) {
      dfw $$2 = $$0.a(kj.l, dfw.a);

      for (Entry<je<dfq>> $$3 : $$2.b()) {
         $$1.accept((je<dfq>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(czd $$0, bwp $$1, bxe $$2, dfs.a $$3) {
      if (!$$0.f()) {
         dfw $$4 = $$0.a(kj.l);
         if ($$4 != null && !$$4.d()) {
            dfp $$5 = new dfp($$0, $$1, $$2);

            for (Entry<je<dfq>> $$6 : $$4.b()) {
               je<dfq> $$7 = (je<dfq>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bxe $$0, dfs.a $$1) {
      for (bwp $$2 : bwp.j) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arq $$0, bxe $$1, buu $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arq $$0, bxe $$1, buu $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arq $$0, czd $$1, bwf $$2, buu $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfq)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arq $$0, czd $$1, bwf $$2, buu $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfq)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arq $$0, czd $$1, bwf $$2, buu $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfq)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arq $$0, czd $$1, bwf $$2, buu $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfq)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arq $$0, bwf $$1, buu $$2) {
      if ($$2.d() instanceof bxe $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arq $$0, bwf $$1, buu $$2, @Nullable czd $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arq $$0, bwf $$1, buu $$2, @Nullable czd $$3, @Nullable Consumer<cyz> $$4) {
      if ($$1 instanceof bxe $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dfq)$$3x.a()).a($$0, $$4x, $$5x, dfu.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bxe $$6) {
            a($$3, bwp.a, $$6, ($$3x, $$4x, $$5) -> ((dfq)$$3x.a()).a($$0, $$4x, $$5, dfu.a, $$1, $$2));
         } else if ($$4 != null) {
            dfp $$7 = new dfp($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dfq)$$4x.a()).a($$0, $$5, $$7, dfu.a, $$1, $$2));
         }
      }
   }

   public static void a(arq $$0, bxe $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arq $$0, czd $$1, bxe $$2, bwp $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dfq)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bxe $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(czd $$0, bxe $$1, bwp $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dfq)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arq $$0, bxe $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bwf)$$1));
   }

   public static int a(je<dfq> $$0, bxe $$1) {
      Iterable<czd> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (czd $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arq $$0, czd $$1, bwf $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dfq)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arq $$0, czd $$1, bwf $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dfq)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arq $$0, czd $$1, czd $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dfq)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arq $$0, czd $$1, crx $$2, Consumer<cyz> $$3) {
      bxe $$5 = $$2.q() instanceof bxe $$4 ? $$4 : null;
      dfp $$6 = new dfp($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dfq)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arq $$0, czd $$1, @Nullable bxe $$2, bwf $$3, @Nullable bwp $$4, feq $$5, eah $$6, Consumer<cyz> $$7) {
      dfp $$8 = new dfp($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dfq)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arq $$0, czd $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dfq)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arq $$0, bxe $$1, buu $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azv $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         ezh $$8 = dfq.b($$0, $$6, $$1, $$2);
         ((dfq)$$5x.a()).a(dfr.m).forEach($$4xx -> {
            if ($$4xx.a() == dfu.c && $$4xx.b() == dfu.c && $$4xx.a($$8)) {
               $$4.setValue(((dgj)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bxe $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            ezh $$8 = dfq.b($$0, $$6, $$1, $$2);
            ((dfq)$$5x.a()).a(dfr.m).forEach($$4xx -> {
               if ($$4xx.a() == dfu.a && $$4xx.b() == dfu.c && $$4xx.a($$8)) {
                  $$4.setValue(((dgj)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(czd $$0, bwq $$1, BiConsumer<je<byf>, byi> $$2) {
      a($$0, ($$2x, $$3) -> ((dfq)$$2x.a()).a(dfr.l).forEach($$4 -> {
            if (((dfq)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(czd $$0, bwp $$1, BiConsumer<je<byf>, byi> $$2) {
      a($$0, ($$2x, $$3) -> ((dfq)$$2x.a()).a(dfr.l).forEach($$4 -> {
            if (((dfq)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arq $$0, czd $$1, bwf $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arq $$0, czd $$1, bwf $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arq $$0, czd $$1, bwf $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(czd $$0, bxe $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dfq)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(czd $$0, bxe $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dfq)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(czd $$0, axr<dfq> $$1) {
      dfw $$2 = $$0.a(kj.l, dfw.a);

      for (Entry<je<dfq>> $$3 : $$2.b()) {
         je<dfq> $$4 = (je<dfq>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(czd $$0, ki<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dfq)$$2x.a()).i().c($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(czd $$0, ki<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(czd $$0, ki<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dfq)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dfp> a(ki<?> $$0, bxe $$1, Predicate<czd> $$2) {
      List<dfp> $$3 = new ArrayList<>();

      for (bwp $$4 : bwp.j) {
         czd $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dfw $$6 = $$5.a(kj.l, dfw.a);

            for (Entry<je<dfq>> $$7 : $$6.b()) {
               je<dfq> $$8 = (je<dfq>)$$7.getKey();
               if ($$8.a().i().c($$0) && $$8.a().a($$4)) {
                  $$3.add(new dfp($$5, $$4, $$1));
               }
            }
         }
      }

      return af.b($$3, $$1.dY());
   }

   public static int a(azv $$0, int $$1, int $$2, czd $$3) {
      dfo $$4 = $$3.a(kj.C);
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

   public static czd a(azv $$0, czd $$1, int $$2, js $$3, Optional<? extends ji<dfq>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<je<dfq>>>map(ji::a).orElseGet(() -> $$3.f(mg.aR).c().map($$0xx -> $$0xx)));
   }

   public static czd a(azv $$0, czd $$1, int $$2, Stream<je<dfq>> $$3) {
      List<dft> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(czh.rF)) {
         $$1 = new czd(czh.vG);
      }

      for (dft $$5 : $$4) {
         $$1.a($$5.b(), $$5.c());
      }

      return $$1;
   }

   public static List<dft> b(azv $$0, czd $$1, int $$2, Stream<je<dfq>> $$3) {
      List<dft> $$4 = Lists.newArrayList();
      dfo $$5 = $$1.a(kj.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azm.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dft> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bsp.a($$0, $$7, dft::a).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, af.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bsp.a($$0, $$7, dft::a).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dft> $$0, dft $$1) {
      $$0.removeIf($$1x -> !dfq.a($$1.b(), $$1x.b()));
   }

   public static boolean a(Collection<je<dfq>> $$0, je<dfq> $$1) {
      for (je<dfq> $$2 : $$0) {
         if (!dfq.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dft> a(int $$0, czd $$1, Stream<je<dfq>> $$2) {
      List<dft> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(czh.rF);
      $$2.filter($$2x -> ((dfq)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dfq $$3x = (dfq)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dft($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(czd $$0, js $$1, alf<dgy> $$2, bub $$3, azv $$4) {
      dgy $$5 = $$1.f(mg.aQ).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(je<dfq> var1, int var2, dfp var3);
   }

   @FunctionalInterface
   interface b {
      void accept(je<dfq> var1, int var2);
   }
}
