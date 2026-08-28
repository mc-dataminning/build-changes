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

public class dda {
   public static int a(jr<dcy> $$0, cwo $$1) {
      dde $$2 = $$1.a(kv.l, dde.a);
      return $$2.a($$0);
   }

   public static dde a(cwo $$0, Consumer<dde.a> $$1) {
      ku<dde> $$2 = d($$0);
      dde $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dde.a;
      } else {
         dde.a $$4 = new dde.a($$3);
         $$1.accept($$4);
         dde $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cwo $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cwo $$0, dde $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dde b(cwo $$0) {
      return $$0.a(d($$0), dde.a);
   }

   private static ku<dde> d(cwo $$0) {
      return $$0.a(cws.vv) ? kv.I : kv.l;
   }

   public static boolean c(cwo $$0) {
      return !$$0.a(kv.l, dde.a).d() || !$$0.a(kv.I, dde.a).d();
   }

   public static int a(ard $$0, cwo $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcy)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(ard $$0, cwo $$1, cwo $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dcy)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(ard $$0, cwo $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcy)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(ard $$0, @Nullable buk $$1, buk $$2, int $$3) {
      if ($$1 instanceof bvg $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dcy)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cwo a(ddb $$0) {
      cwo $$1 = new cwo(cws.vv);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cwo $$0, dda.b $$1) {
      dde $$2 = $$0.a(kv.l, dde.a);

      for (Entry<jr<dcy>> $$3 : $$2.b()) {
         $$1.accept((jr<dcy>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cwo $$0, bus $$1, bvg $$2, dda.a $$3) {
      if (!$$0.f()) {
         dde $$4 = $$0.a(kv.l);
         if ($$4 != null && !$$4.d()) {
            dcx $$5 = new dcx($$0, $$1, $$2);

            for (Entry<jr<dcy>> $$6 : $$4.b()) {
               jr<dcy> $$7 = (jr<dcy>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bvg $$0, dda.a $$1) {
      for (bus $$2 : bus.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(ard $$0, bvg $$1, bta $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(ard $$0, bvg $$1, bta $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(ard $$0, cwo $$1, buk $$2, bta $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcy)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(ard $$0, cwo $$1, buk $$2, bta $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcy)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(ard $$0, cwo $$1, buk $$2, bta $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcy)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(ard $$0, cwo $$1, buk $$2, bta $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcy)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(ard $$0, buk $$1, bta $$2) {
      if ($$2.d() instanceof bvg $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(ard $$0, buk $$1, bta $$2, @Nullable cwo $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(ard $$0, buk $$1, bta $$2, @Nullable cwo $$3, @Nullable Consumer<cwk> $$4) {
      if ($$1 instanceof bvg $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dcy)$$3x.a()).a($$0, $$4x, $$5x, ddc.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bvg $$6) {
            a($$3, bus.a, $$6, ($$3x, $$4x, $$5) -> ((dcy)$$3x.a()).a($$0, $$4x, $$5, ddc.a, $$1, $$2));
         } else if ($$4 != null) {
            dcx $$7 = new dcx($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dcy)$$4x.a()).a($$0, $$5, $$7, ddc.a, $$1, $$2));
         }
      }
   }

   public static void a(ard $$0, bvg $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(ard $$0, cwo $$1, bvg $$2, bus $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dcy)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bvg $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cwo $$0, bvg $$1, bus $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dcy)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(ard $$0, bvg $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (buk)$$1));
   }

   public static int a(jr<dcy> $$0, bvg $$1) {
      Iterable<cwo> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cwo $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(ard $$0, cwo $$1, buk $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dcy)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(ard $$0, cwo $$1, buk $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dcy)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(ard $$0, cwo $$1, cwo $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dcy)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(ard $$0, cwo $$1, cpp $$2, Consumer<cwk> $$3) {
      bvg $$5 = $$2.p() instanceof bvg $$4 ? $$4 : null;
      dcx $$6 = new dcx($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dcy)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(ard $$0, cwo $$1, @Nullable bvg $$2, buk $$3, @Nullable bus $$4, faz $$5, dww $$6, Consumer<cwk> $$7) {
      dcx $$8 = new dcx($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dcy)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(ard $$0, cwo $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcy)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(ard $$0, bvg $$1, bta $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azh $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         evq $$8 = dcy.b($$0, $$6, $$1, $$2);
         ((dcy)$$5x.a()).a(dcz.m).forEach($$4xx -> {
            if ($$4xx.a() == ddc.c && $$4xx.b() == ddc.c && $$4xx.a($$8)) {
               $$4.setValue(((ddr)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bvg $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            evq $$8 = dcy.b($$0, $$6, $$1, $$2);
            ((dcy)$$5x.a()).a(dcz.m).forEach($$4xx -> {
               if ($$4xx.a() == ddc.a && $$4xx.b() == ddc.c && $$4xx.a($$8)) {
                  $$4.setValue(((ddr)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cwo $$0, but $$1, BiConsumer<jr<bwj>, bwm> $$2) {
      a($$0, ($$2x, $$3) -> ((dcy)$$2x.a()).a(dcz.l).forEach($$4 -> {
            if (((dcy)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cwo $$0, bus $$1, BiConsumer<jr<bwj>, bwm> $$2) {
      a($$0, ($$2x, $$3) -> ((dcy)$$2x.a()).a(dcz.l).forEach($$4 -> {
            if (((dcy)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(ard $$0, cwo $$1, buk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(ard $$0, cwo $$1, buk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(ard $$0, cwo $$1, buk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cwo $$0, bvg $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dcy)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cwo $$0, bvg $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dcy)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cwo $$0, axf<dcy> $$1) {
      dde $$2 = $$0.a(kv.l, dde.a);

      for (Entry<jr<dcy>> $$3 : $$2.b()) {
         jr<dcy> $$4 = (jr<dcy>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cwo $$0, ku<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dcy)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cwo $$0, ku<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cwo $$0, ku<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dcy)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dcx> a(ku<?> $$0, bvg $$1, Predicate<cwo> $$2) {
      List<dcx> $$3 = new ArrayList<>();

      for (bus $$4 : bus.i) {
         cwo $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dde $$6 = $$5.a(kv.l, dde.a);

            for (Entry<jr<dcy>> $$7 : $$6.b()) {
               jr<dcy> $$8 = (jr<dcy>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dcx($$5, $$4, $$1));
               }
            }
         }
      }

      return af.b($$3, $$1.dY());
   }

   public static int a(azh $$0, int $$1, int $$2, cwo $$3) {
      dcw $$4 = $$3.a(kv.C);
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

   public static cwo a(azh $$0, cwo $$1, int $$2, kf $$3, Optional<? extends jv<dcy>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jr<dcy>>>map(jv::a).orElseGet(() -> $$3.e(mc.aO).c().map($$0xx -> $$0xx)));
   }

   public static cwo a(azh $$0, cwo $$1, int $$2, Stream<jr<dcy>> $$3) {
      List<ddb> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cws.rw)) {
         $$1 = new cwo(cws.vv);
      }

      for (ddb $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<ddb> b(azh $$0, cwo $$1, int $$2, Stream<jr<dcy>> $$3) {
      List<ddb> $$4 = Lists.newArrayList();
      dcw $$5 = $$1.a(kv.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ayz.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<ddb> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bqu.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, af.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bqu.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<ddb> $$0, ddb $$1) {
      $$0.removeIf($$1x -> !dcy.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jr<dcy>> $$0, jr<dcy> $$1) {
      for (jr<dcy> $$2 : $$0) {
         if (!dcy.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<ddb> a(int $$0, cwo $$1, Stream<jr<dcy>> $$2) {
      List<ddb> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cws.rw);
      $$2.filter($$2x -> ((dcy)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dcy $$3x = (dcy)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new ddb($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cwo $$0, kf $$1, aku<deg> $$2, bsh $$3, azh $$4) {
      deg $$5 = $$1.e(mc.aP).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jr<dcy> var1, int var2, dcx var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jr<dcy> var1, int var2);
   }
}
