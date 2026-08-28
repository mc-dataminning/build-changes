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

public class ddc {
   public static int a(jr<dda> $$0, cwq $$1) {
      ddg $$2 = $$1.a(kv.l, ddg.a);
      return $$2.a($$0);
   }

   public static ddg a(cwq $$0, Consumer<ddg.a> $$1) {
      ku<ddg> $$2 = d($$0);
      ddg $$3 = $$0.a($$2);
      if ($$3 == null) {
         return ddg.a;
      } else {
         ddg.a $$4 = new ddg.a($$3);
         $$1.accept($$4);
         ddg $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cwq $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cwq $$0, ddg $$1) {
      $$0.b(d($$0), $$1);
   }

   public static ddg b(cwq $$0) {
      return $$0.a(d($$0), ddg.a);
   }

   private static ku<ddg> d(cwq $$0) {
      return $$0.a(cwu.vv) ? kv.I : kv.l;
   }

   public static boolean c(cwq $$0) {
      return !$$0.a(kv.l, ddg.a).d() || !$$0.a(kv.I, ddg.a).d();
   }

   public static int a(ard $$0, cwq $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dda)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(ard $$0, cwq $$1, cwq $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dda)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(ard $$0, cwq $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dda)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(ard $$0, @Nullable bum $$1, bum $$2, int $$3) {
      if ($$1 instanceof bvi $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dda)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cwq a(ddd $$0) {
      cwq $$1 = new cwq(cwu.vv);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cwq $$0, ddc.b $$1) {
      ddg $$2 = $$0.a(kv.l, ddg.a);

      for (Entry<jr<dda>> $$3 : $$2.b()) {
         $$1.accept((jr<dda>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cwq $$0, buu $$1, bvi $$2, ddc.a $$3) {
      if (!$$0.f()) {
         ddg $$4 = $$0.a(kv.l);
         if ($$4 != null && !$$4.d()) {
            dcz $$5 = new dcz($$0, $$1, $$2);

            for (Entry<jr<dda>> $$6 : $$4.b()) {
               jr<dda> $$7 = (jr<dda>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bvi $$0, ddc.a $$1) {
      for (buu $$2 : buu.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(ard $$0, bvi $$1, btc $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(ard $$0, bvi $$1, btc $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(ard $$0, cwq $$1, bum $$2, btc $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dda)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(ard $$0, cwq $$1, bum $$2, btc $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dda)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(ard $$0, cwq $$1, bum $$2, btc $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dda)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(ard $$0, cwq $$1, bum $$2, btc $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dda)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(ard $$0, bum $$1, btc $$2) {
      if ($$2.d() instanceof bvi $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(ard $$0, bum $$1, btc $$2, @Nullable cwq $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(ard $$0, bum $$1, btc $$2, @Nullable cwq $$3, @Nullable Consumer<cwm> $$4) {
      if ($$1 instanceof bvi $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dda)$$3x.a()).a($$0, $$4x, $$5x, dde.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bvi $$6) {
            a($$3, buu.a, $$6, ($$3x, $$4x, $$5) -> ((dda)$$3x.a()).a($$0, $$4x, $$5, dde.a, $$1, $$2));
         } else if ($$4 != null) {
            dcz $$7 = new dcz($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dda)$$4x.a()).a($$0, $$5, $$7, dde.a, $$1, $$2));
         }
      }
   }

   public static void a(ard $$0, bvi $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(ard $$0, cwq $$1, bvi $$2, buu $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dda)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bvi $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cwq $$0, bvi $$1, buu $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dda)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(ard $$0, bvi $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bum)$$1));
   }

   public static int a(jr<dda> $$0, bvi $$1) {
      Iterable<cwq> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cwq $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(ard $$0, cwq $$1, bum $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dda)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(ard $$0, cwq $$1, bum $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dda)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(ard $$0, cwq $$1, cwq $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dda)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(ard $$0, cwq $$1, cpr $$2, Consumer<cwm> $$3) {
      bvi $$5 = $$2.p() instanceof bvi $$4 ? $$4 : null;
      dcz $$6 = new dcz($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dda)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(ard $$0, cwq $$1, @Nullable bvi $$2, bum $$3, @Nullable buu $$4, fbb $$5, dwy $$6, Consumer<cwm> $$7) {
      dcz $$8 = new dcz($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dda)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(ard $$0, cwq $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dda)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(ard $$0, bvi $$1, btc $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azh $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         evs $$8 = dda.b($$0, $$6, $$1, $$2);
         ((dda)$$5x.a()).a(ddb.m).forEach($$4xx -> {
            if ($$4xx.a() == dde.c && $$4xx.b() == dde.c && $$4xx.a($$8)) {
               $$4.setValue(((ddt)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bvi $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            evs $$8 = dda.b($$0, $$6, $$1, $$2);
            ((dda)$$5x.a()).a(ddb.m).forEach($$4xx -> {
               if ($$4xx.a() == dde.a && $$4xx.b() == dde.c && $$4xx.a($$8)) {
                  $$4.setValue(((ddt)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cwq $$0, buv $$1, BiConsumer<jr<bwl>, bwo> $$2) {
      a($$0, ($$2x, $$3) -> ((dda)$$2x.a()).a(ddb.l).forEach($$4 -> {
            if (((dda)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cwq $$0, buu $$1, BiConsumer<jr<bwl>, bwo> $$2) {
      a($$0, ($$2x, $$3) -> ((dda)$$2x.a()).a(ddb.l).forEach($$4 -> {
            if (((dda)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(ard $$0, cwq $$1, bum $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(ard $$0, cwq $$1, bum $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(ard $$0, cwq $$1, bum $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cwq $$0, bvi $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dda)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cwq $$0, bvi $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dda)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cwq $$0, axf<dda> $$1) {
      ddg $$2 = $$0.a(kv.l, ddg.a);

      for (Entry<jr<dda>> $$3 : $$2.b()) {
         jr<dda> $$4 = (jr<dda>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cwq $$0, ku<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dda)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cwq $$0, ku<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cwq $$0, ku<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dda)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dcz> a(ku<?> $$0, bvi $$1, Predicate<cwq> $$2) {
      List<dcz> $$3 = new ArrayList<>();

      for (buu $$4 : buu.i) {
         cwq $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            ddg $$6 = $$5.a(kv.l, ddg.a);

            for (Entry<jr<dda>> $$7 : $$6.b()) {
               jr<dda> $$8 = (jr<dda>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dcz($$5, $$4, $$1));
               }
            }
         }
      }

      return af.b($$3, $$1.dY());
   }

   public static int a(azh $$0, int $$1, int $$2, cwq $$3) {
      dcy $$4 = $$3.a(kv.C);
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

   public static cwq a(azh $$0, cwq $$1, int $$2, kf $$3, Optional<? extends jv<dda>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jr<dda>>>map(jv::a).orElseGet(() -> $$3.e(mc.aO).c().map($$0xx -> $$0xx)));
   }

   public static cwq a(azh $$0, cwq $$1, int $$2, Stream<jr<dda>> $$3) {
      List<ddd> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cwu.rw)) {
         $$1 = new cwq(cwu.vv);
      }

      for (ddd $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<ddd> b(azh $$0, cwq $$1, int $$2, Stream<jr<dda>> $$3) {
      List<ddd> $$4 = Lists.newArrayList();
      dcy $$5 = $$1.a(kv.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ayz.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<ddd> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bqw.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, af.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bqw.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<ddd> $$0, ddd $$1) {
      $$0.removeIf($$1x -> !dda.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jr<dda>> $$0, jr<dda> $$1) {
      for (jr<dda> $$2 : $$0) {
         if (!dda.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<ddd> a(int $$0, cwq $$1, Stream<jr<dda>> $$2) {
      List<ddd> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cwu.rw);
      $$2.filter($$2x -> ((dda)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dda $$3x = (dda)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new ddd($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cwq $$0, kf $$1, aku<dei> $$2, bsj $$3, azh $$4) {
      dei $$5 = $$1.e(mc.aP).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jr<dda> var1, int var2, dcz var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jr<dda> var1, int var2);
   }
}
