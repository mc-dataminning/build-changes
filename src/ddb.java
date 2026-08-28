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

public class ddb {
   public static int a(jr<dcz> $$0, cwp $$1) {
      ddf $$2 = $$1.a(kv.l, ddf.a);
      return $$2.a($$0);
   }

   public static ddf a(cwp $$0, Consumer<ddf.a> $$1) {
      ku<ddf> $$2 = d($$0);
      ddf $$3 = $$0.a($$2);
      if ($$3 == null) {
         return ddf.a;
      } else {
         ddf.a $$4 = new ddf.a($$3);
         $$1.accept($$4);
         ddf $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cwp $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cwp $$0, ddf $$1) {
      $$0.b(d($$0), $$1);
   }

   public static ddf b(cwp $$0) {
      return $$0.a(d($$0), ddf.a);
   }

   private static ku<ddf> d(cwp $$0) {
      return $$0.a(cwt.vv) ? kv.I : kv.l;
   }

   public static boolean c(cwp $$0) {
      return !$$0.a(kv.l, ddf.a).d() || !$$0.a(kv.I, ddf.a).d();
   }

   public static int a(arc $$0, cwp $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcz)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arc $$0, cwp $$1, cwp $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dcz)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arc $$0, cwp $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcz)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arc $$0, @Nullable buk $$1, buk $$2, int $$3) {
      if ($$1 instanceof bvg $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dcz)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cwp a(ddc $$0) {
      cwp $$1 = new cwp(cwt.vv);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cwp $$0, ddb.b $$1) {
      ddf $$2 = $$0.a(kv.l, ddf.a);

      for (Entry<jr<dcz>> $$3 : $$2.b()) {
         $$1.accept((jr<dcz>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cwp $$0, bus $$1, bvg $$2, ddb.a $$3) {
      if (!$$0.f()) {
         ddf $$4 = $$0.a(kv.l);
         if ($$4 != null && !$$4.d()) {
            dcy $$5 = new dcy($$0, $$1, $$2);

            for (Entry<jr<dcz>> $$6 : $$4.b()) {
               jr<dcz> $$7 = (jr<dcz>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bvg $$0, ddb.a $$1) {
      for (bus $$2 : bus.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arc $$0, bvg $$1, bta $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arc $$0, bvg $$1, bta $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arc $$0, cwp $$1, buk $$2, bta $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcz)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arc $$0, cwp $$1, buk $$2, bta $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcz)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arc $$0, cwp $$1, buk $$2, bta $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcz)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arc $$0, cwp $$1, buk $$2, bta $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcz)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arc $$0, buk $$1, bta $$2) {
      if ($$2.d() instanceof bvg $$3) {
         a($$0, $$1, $$2, $$3.ea());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arc $$0, buk $$1, bta $$2, @Nullable cwp $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arc $$0, buk $$1, bta $$2, @Nullable cwp $$3, @Nullable Consumer<cwl> $$4) {
      if ($$1 instanceof bvg $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dcz)$$3x.a()).a($$0, $$4x, $$5x, ddd.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bvg $$6) {
            a($$3, bus.a, $$6, ($$3x, $$4x, $$5) -> ((dcz)$$3x.a()).a($$0, $$4x, $$5, ddd.a, $$1, $$2));
         } else if ($$4 != null) {
            dcy $$7 = new dcy($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dcz)$$4x.a()).a($$0, $$5, $$7, ddd.a, $$1, $$2));
         }
      }
   }

   public static void a(arc $$0, bvg $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arc $$0, cwp $$1, bvg $$2, bus $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dcz)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bvg $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cwp $$0, bvg $$1, bus $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dcz)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arc $$0, bvg $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (buk)$$1));
   }

   public static int a(jr<dcz> $$0, bvg $$1) {
      Iterable<cwp> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cwp $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arc $$0, cwp $$1, buk $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dcz)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arc $$0, cwp $$1, buk $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dcz)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arc $$0, cwp $$1, cwp $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dcz)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arc $$0, cwp $$1, cpq $$2, Consumer<cwl> $$3) {
      bvg $$5 = $$2.p() instanceof bvg $$4 ? $$4 : null;
      dcy $$6 = new dcy($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dcz)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arc $$0, cwp $$1, @Nullable bvg $$2, buk $$3, @Nullable bus $$4, fba $$5, dwx $$6, Consumer<cwl> $$7) {
      dcy $$8 = new dcy($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dcz)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arc $$0, cwp $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcz)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arc $$0, bvg $$1, bta $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azh $$5 = $$1.dZ();
      a($$1, ($$5x, $$6, $$7x) -> {
         evr $$8 = dcz.b($$0, $$6, $$1, $$2);
         ((dcz)$$5x.a()).a(dda.m).forEach($$4xx -> {
            if ($$4xx.a() == ddd.c && $$4xx.b() == ddd.c && $$4xx.a($$8)) {
               $$4.setValue(((dds)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bvg $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            evr $$8 = dcz.b($$0, $$6, $$1, $$2);
            ((dcz)$$5x.a()).a(dda.m).forEach($$4xx -> {
               if ($$4xx.a() == ddd.a && $$4xx.b() == ddd.c && $$4xx.a($$8)) {
                  $$4.setValue(((dds)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cwp $$0, but $$1, BiConsumer<jr<bwj>, bwm> $$2) {
      a($$0, ($$2x, $$3) -> ((dcz)$$2x.a()).a(dda.l).forEach($$4 -> {
            if (((dcz)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cwp $$0, bus $$1, BiConsumer<jr<bwj>, bwm> $$2) {
      a($$0, ($$2x, $$3) -> ((dcz)$$2x.a()).a(dda.l).forEach($$4 -> {
            if (((dcz)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arc $$0, cwp $$1, buk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arc $$0, cwp $$1, buk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arc $$0, cwp $$1, buk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cwp $$0, bvg $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dcz)$$2x.a()).b($$1.dZ(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cwp $$0, bvg $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dcz)$$2x.a()).a($$1.dZ(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cwp $$0, axf<dcz> $$1) {
      ddf $$2 = $$0.a(kv.l, ddf.a);

      for (Entry<jr<dcz>> $$3 : $$2.b()) {
         jr<dcz> $$4 = (jr<dcz>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cwp $$0, ku<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dcz)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cwp $$0, ku<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cwp $$0, ku<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dcz)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dcy> a(ku<?> $$0, bvg $$1, Predicate<cwp> $$2) {
      List<dcy> $$3 = new ArrayList<>();

      for (bus $$4 : bus.i) {
         cwp $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            ddf $$6 = $$5.a(kv.l, ddf.a);

            for (Entry<jr<dcz>> $$7 : $$6.b()) {
               jr<dcz> $$8 = (jr<dcz>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dcy($$5, $$4, $$1));
               }
            }
         }
      }

      return af.b($$3, $$1.dZ());
   }

   public static int a(azh $$0, int $$1, int $$2, cwp $$3) {
      dcx $$4 = $$3.a(kv.C);
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

   public static cwp a(azh $$0, cwp $$1, int $$2, kf $$3, Optional<? extends jv<dcz>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jr<dcz>>>map(jv::a).orElseGet(() -> $$3.e(mc.aO).c().map($$0xx -> $$0xx)));
   }

   public static cwp a(azh $$0, cwp $$1, int $$2, Stream<jr<dcz>> $$3) {
      List<ddc> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cwt.rw)) {
         $$1 = new cwp(cwt.vv);
      }

      for (ddc $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<ddc> b(azh $$0, cwp $$1, int $$2, Stream<jr<dcz>> $$3) {
      List<ddc> $$4 = Lists.newArrayList();
      dcx $$5 = $$1.a(kv.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ayz.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<ddc> $$7 = a($$2, $$1, $$3);
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

   public static void a(List<ddc> $$0, ddc $$1) {
      $$0.removeIf($$1x -> !dcz.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jr<dcz>> $$0, jr<dcz> $$1) {
      for (jr<dcz> $$2 : $$0) {
         if (!dcz.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<ddc> a(int $$0, cwp $$1, Stream<jr<dcz>> $$2) {
      List<ddc> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cwt.rw);
      $$2.filter($$2x -> ((dcz)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dcz $$3x = (dcz)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new ddc($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cwp $$0, kf $$1, akt<deh> $$2, bsh $$3, azh $$4) {
      deh $$5 = $$1.e(mc.aP).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jr<dcz> var1, int var2, dcy var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jr<dcz> var1, int var2);
   }
}
