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

public class czo {
   public static int a(jj<czm> $$0, cud $$1) {
      czs $$2 = $$1.a(kn.k, czs.a);
      return $$2.a($$0);
   }

   public static czs a(cud $$0, Consumer<czs.a> $$1) {
      km<czs> $$2 = d($$0);
      czs $$3 = $$0.a($$2);
      if ($$3 == null) {
         return czs.a;
      } else {
         czs.a $$4 = new czs.a($$3);
         $$1.accept($$4);
         czs $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cud $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cud $$0, czs $$1) {
      $$0.b(d($$0), $$1);
   }

   public static czs b(cud $$0) {
      return $$0.a(d($$0), czs.a);
   }

   private static km<czs> d(cud $$0) {
      return $$0.a(cug.uw) ? kn.y : kn.k;
   }

   public static boolean c(cud $$0) {
      return !$$0.a(kn.k, czs.a).d() || !$$0.a(kn.y, czs.a).d();
   }

   public static int a(aqm $$0, cud $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((czm)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aqm $$0, cud $$1, cud $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((czm)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(aqm $$0, cud $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((czm)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aqm $$0, @Nullable bsh $$1, bsh $$2, int $$3) {
      if ($$1 instanceof btc $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((czm)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   private static void a(cud $$0, czo.b $$1) {
      czs $$2 = $$0.a(kn.k, czs.a);

      for (Entry<jj<czm>> $$3 : $$2.b()) {
         $$1.accept((jj<czm>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cud $$0, bso $$1, btc $$2, czo.a $$3) {
      if (!$$0.e()) {
         czs $$4 = $$0.a(kn.k);
         if ($$4 != null && !$$4.d()) {
            czl $$5 = new czl($$0, $$1, $$2);

            for (Entry<jj<czm>> $$6 : $$4.b()) {
               jj<czm> $$7 = (jj<czm>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(btc $$0, czo.a $$1) {
      for (bso $$2 : bso.values()) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(aqm $$0, btc $$1, bra $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(aqm $$0, btc $$1, bra $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(aqm $$0, cud $$1, bsh $$2, bra $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czm)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(aqm $$0, cud $$1, bsh $$2, bra $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czm)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(aqm $$0, cud $$1, bsh $$2, bra $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czm)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(aqm $$0, cud $$1, bsh $$2, bra $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czm)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(aqm $$0, bsh $$1, bra $$2) {
      if ($$2.d() instanceof btc $$3) {
         a($$0, $$1, $$2, $$3.eV());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(aqm $$0, bsh $$1, bra $$2, @Nullable cud $$3) {
      if ($$1 instanceof btc $$4) {
         a($$4, ($$3x, $$4x, $$5x) -> ((czm)$$3x.a()).a($$0, $$4x, $$5x, czq.c, $$1, $$2));
      }

      if ($$3 != null && $$2.d() instanceof btc $$5) {
         a($$3, bso.a, $$5, ($$3x, $$4, $$5x) -> ((czm)$$3x.a()).a($$0, $$4, $$5x, czq.a, $$1, $$2));
      }
   }

   public static void a(aqm $$0, btc $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(aqm $$0, cud $$1, btc $$2, bso $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((czm)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(btc $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cud $$0, btc $$1, bso $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((czm)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(aqm $$0, btc $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bsh)$$1));
   }

   public static int a(jj<czm> $$0, btc $$1) {
      Iterable<cud> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cud $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(aqm $$0, cud $$1, bsh $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((czm)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(aqm $$0, cud $$1, bsh $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((czm)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(aqm $$0, cud $$1, cud $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((czm)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(aqm $$0, cud $$1, cmr $$2, Consumer<cty> $$3) {
      btc $$5 = $$2.s() instanceof btc $$4 ? $$4 : null;
      czl $$6 = new czl($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((czm)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(aqm $$0, cud $$1, @Nullable btc $$2, bsh $$3, @Nullable bso $$4, ewh $$5, Consumer<cty> $$6) {
      czl $$7 = new czl($$1, $$4, $$2, $$6);
      a($$1, ($$4x, $$5x) -> ((czm)$$4x.a()).a($$0, $$5x, $$7, $$3, $$5));
   }

   public static int c(aqm $$0, cud $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((czm)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(aqm $$0, btc $$1, bra $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      ayo $$5 = $$1.dU();
      a($$1, ($$5x, $$6, $$7x) -> {
         eqw $$8 = czm.b($$0, $$6, $$1, $$2);
         ((czm)$$5x.a()).a(czn.m).forEach($$4xx -> {
            if ($$4xx.a() == czq.c && $$4xx.b() == czq.c && $$4xx.a($$8)) {
               $$4.setValue(((dae)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof btc $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            eqw $$8 = czm.b($$0, $$6, $$1, $$2);
            ((czm)$$5x.a()).a(czn.m).forEach($$4xx -> {
               if ($$4xx.a() == czq.a && $$4xx.b() == czq.c && $$4xx.a($$8)) {
                  $$4.setValue(((dae)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cud $$0, bsp $$1, BiConsumer<jj<buf>, bui> $$2) {
      a($$0, ($$2x, $$3) -> ((czm)$$2x.a()).a(czn.l).forEach($$4 -> {
            if (((czm)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3));
            }
         }));
   }

   public static void a(cud $$0, bso $$1, BiConsumer<jj<buf>, bui> $$2) {
      a($$0, ($$2x, $$3) -> ((czm)$$2x.a()).a(czn.l).forEach($$4 -> {
            if (((czm)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3));
            }
         }));
   }

   public static int a(aqm $$0, cud $$1, bsh $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(aqm $$0, cud $$1, bsh $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(aqm $$0, cud $$1, bsh $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(btc $$0, float $$1) {
      MutableFloat $$2 = new MutableFloat($$1);
      a($$0, ($$2x, $$3, $$4) -> ((czm)$$2x.a()).b($$0.dU(), $$3, $$2));
      return Math.max(0.0F, $$2.floatValue());
   }

   public static float b(btc $$0) {
      MutableFloat $$1 = new MutableFloat(0.0F);
      a($$0, ($$2, $$3, $$4) -> $$2.a().a($$0.dU(), $$3, $$1));
      return $$1.floatValue();
   }

   public static boolean a(cud $$0, awm<czm> $$1) {
      czs $$2 = $$0.a(kn.k, czs.a);

      for (Entry<jj<czm>> $$3 : $$2.b()) {
         jj<czm> $$4 = (jj<czm>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cud $$0, km<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((czm)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cud $$0, km<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cud $$0, km<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((czm)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<czl> a(km<?> $$0, btc $$1, Predicate<cud> $$2) {
      List<czl> $$3 = new ArrayList<>();

      for (bso $$4 : bso.values()) {
         cud $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            czs $$6 = $$5.a(kn.k, czs.a);

            for (Entry<jj<czm>> $$7 : $$6.b()) {
               jj<czm> $$8 = (jj<czm>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new czl($$5, $$4, $$1));
               }
            }
         }
      }

      return ac.b($$3, $$1.dU());
   }

   public static int a(ayo $$0, int $$1, int $$2, cud $$3) {
      cty $$4 = $$3.g();
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

   public static cud a(ayo $$0, cud $$1, int $$2, jx $$3, Optional<? extends jn<czm>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jj<czm>>>map(jn::a).orElseGet(() -> $$3.d(lr.aK).i().map($$0xx -> $$0xx)));
   }

   public static cud a(ayo $$0, cud $$1, int $$2, Stream<jj<czm>> $$3) {
      List<czp> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cug.qP)) {
         $$1 = new cud(cug.uw);
      }

      for (czp $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<czp> b(ayo $$0, cud $$1, int $$2, Stream<jj<czm>> $$3) {
      List<czp> $$4 = Lists.newArrayList();
      cty $$5 = $$1.g();
      int $$6 = $$5.g();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ayg.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<czp> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bou.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bou.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<czp> $$0, czp $$1) {
      $$0.removeIf($$1x -> !czm.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jj<czm>> $$0, jj<czm> $$1) {
      for (jj<czm> $$2 : $$0) {
         if (!czm.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<czp> a(int $$0, cud $$1, Stream<jj<czm>> $$2) {
      List<czp> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cug.qP);
      $$2.filter($$2x -> ((czm)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         czm $$3x = (czm)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new czp($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cud $$0, jx $$1, akj<dat> $$2, bqf $$3, ayo $$4) {
      dat $$5 = $$1.d(lr.aL).a($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jj<czm> var1, int var2, czl var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jj<czm> var1, int var2);
   }
}
