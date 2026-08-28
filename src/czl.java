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

public class czl {
   public static int a(jj<czj> $$0, cua $$1) {
      czp $$2 = $$1.a(kn.k, czp.a);
      return $$2.a($$0);
   }

   public static czp a(cua $$0, Consumer<czp.a> $$1) {
      km<czp> $$2 = d($$0);
      czp $$3 = $$0.a($$2);
      if ($$3 == null) {
         return czp.a;
      } else {
         czp.a $$4 = new czp.a($$3);
         $$1.accept($$4);
         czp $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cua $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cua $$0, czp $$1) {
      $$0.b(d($$0), $$1);
   }

   public static czp b(cua $$0) {
      return $$0.a(d($$0), czp.a);
   }

   private static km<czp> d(cua $$0) {
      return $$0.a(cud.uw) ? kn.y : kn.k;
   }

   public static boolean c(cua $$0) {
      return !$$0.a(kn.k, czp.a).d() || !$$0.a(kn.y, czp.a).d();
   }

   public static int a(aqk $$0, cua $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((czj)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aqk $$0, cua $$1, cua $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((czj)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(aqk $$0, cua $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((czj)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aqk $$0, @Nullable bsd $$1, bsd $$2, int $$3) {
      if ($$1 instanceof bsy $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((czj)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   private static void a(cua $$0, czl.b $$1) {
      czp $$2 = $$0.a(kn.k, czp.a);

      for (Entry<jj<czj>> $$3 : $$2.b()) {
         $$1.accept((jj<czj>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cua $$0, bsk $$1, bsy $$2, czl.a $$3) {
      if (!$$0.e()) {
         czp $$4 = $$0.a(kn.k);
         if ($$4 != null && !$$4.d()) {
            czi $$5 = new czi($$0, $$1, $$2);

            for (Entry<jj<czj>> $$6 : $$4.b()) {
               jj<czj> $$7 = (jj<czj>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bsy $$0, czl.a $$1) {
      for (bsk $$2 : bsk.values()) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(aqk $$0, bsy $$1, bqw $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(aqk $$0, bsy $$1, bqw $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(aqk $$0, cua $$1, bsd $$2, bqw $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czj)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(aqk $$0, cua $$1, bsd $$2, bqw $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czj)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(aqk $$0, cua $$1, bsd $$2, bqw $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czj)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(aqk $$0, cua $$1, bsd $$2, bqw $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czj)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(aqk $$0, bsd $$1, bqw $$2) {
      if ($$1 instanceof bsy $$3) {
         a($$3, ($$3x, $$4x, $$5) -> $$3x.a().a($$0, $$4x, $$5, czn.c, $$1, $$2));
      }

      if ($$2.d() instanceof bsy $$4) {
         a($$4.eT(), bsk.a, $$4, ($$3, $$4x, $$5) -> $$3.a().a($$0, $$4x, $$5, czn.a, $$1, $$2));
      }
   }

   public static void a(aqk $$0, bsy $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(aqk $$0, cua $$1, bsy $$2, bsk $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((czj)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bsy $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cua $$0, bsy $$1, bsk $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((czj)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(aqk $$0, bsy $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bsd)$$1));
   }

   public static int a(jj<czj> $$0, bsy $$1) {
      Iterable<cua> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cua $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(aqk $$0, cua $$1, bsd $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((czj)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(aqk $$0, cua $$1, bsd $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((czj)$$4x.a()).g($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(aqk $$0, cua $$1, cua $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((czj)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(aqk $$0, cua $$1, cmn $$2, Runnable $$3) {
      bsy $$5 = $$2.s() instanceof bsy $$4 ? $$4 : null;
      czi $$6 = new czi($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((czj)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(aqk $$0, cua $$1, @Nullable bsy $$2, bsd $$3, @Nullable bsk $$4, evz $$5, Runnable $$6) {
      czi $$7 = new czi($$1, $$4, $$2, $$6);
      a($$1, ($$4x, $$5x) -> ((czj)$$4x.a()).a($$0, $$5x, $$7, $$3, $$5));
   }

   public static int c(aqk $$0, cua $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((czj)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(aqk $$0, bsy $$1, bqw $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      aym $$5 = $$1.dS();
      a($$1, ($$5x, $$6, $$7x) -> {
         eqo $$8 = czj.b($$0, $$6, $$1, $$2);
         ((czj)$$5x.a()).a(czk.m).forEach($$5xx -> {
            if ($$5xx.a() == czn.c && $$5xx.b() == czn.c && $$5xx.a($$8)) {
               $$4.setValue(((dab)$$5xx.c()).a($$7x.a(), $$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bsy $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            eqo $$8 = czj.b($$0, $$6, $$1, $$2);
            ((czj)$$5x.a()).a(czk.m).forEach($$5xx -> {
               if ($$5xx.a() == czn.a && $$5xx.b() == czn.c && $$5xx.a($$8)) {
                  $$4.setValue(((dab)$$5xx.c()).a($$7x.a(), $$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cua $$0, bsk $$1, BiConsumer<jj<bub>, bue> $$2) {
      a($$0, ($$2x, $$3) -> ((czj)$$2x.a()).a(czk.l).forEach($$4 -> {
            if (((czj)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3));
            }
         }));
   }

   public static int a(aqk $$0, cua $$1, bsd $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().e($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(aqk $$0, cua $$1, bsd $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(aqk $$0, cua $$1, bsd $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(aqk $$0, cua $$1, bsd $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$3x, $$4x) -> ((czj)$$3x.a()).f($$0, $$4x, $$1, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static float a(aqk $$0, cua $$1, bsy $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$2, ($$4, $$5, $$6) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static boolean a(cua $$0, awk<czj> $$1) {
      czp $$2 = $$0.a(kn.k, czp.a);

      for (Entry<jj<czj>> $$3 : $$2.b()) {
         jj<czj> $$4 = (jj<czj>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cua $$0, km<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((czj)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cua $$0, km<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cua $$0, km<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((czj)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<czi> a(km<?> $$0, bsy $$1, Predicate<cua> $$2) {
      List<czi> $$3 = new ArrayList<>();

      for (bsk $$4 : bsk.values()) {
         cua $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            czp $$6 = $$5.a(kn.k, czp.a);

            for (Entry<jj<czj>> $$7 : $$6.b()) {
               jj<czj> $$8 = (jj<czj>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new czi($$5, $$4, $$1));
               }
            }
         }
      }

      return ac.b($$3, $$1.dS());
   }

   public static int a(aym $$0, int $$1, int $$2, cua $$3) {
      ctv $$4 = $$3.g();
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

   public static cua a(aym $$0, cua $$1, int $$2, jx $$3, Optional<? extends jn<czj>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jj<czj>>>map(jn::a).orElseGet(() -> $$3.d(lr.aK).i().map($$0xx -> $$0xx)));
   }

   public static cua a(aym $$0, cua $$1, int $$2, Stream<jj<czj>> $$3) {
      List<czm> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cud.qP)) {
         $$1 = new cua(cud.uw);
      }

      for (czm $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<czm> b(aym $$0, cua $$1, int $$2, Stream<jj<czj>> $$3) {
      List<czm> $$4 = Lists.newArrayList();
      ctv $$5 = $$1.g();
      int $$6 = $$5.g();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = aye.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<czm> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            boq.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               boq.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<czm> $$0, czm $$1) {
      $$0.removeIf($$1x -> !czj.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jj<czj>> $$0, jj<czj> $$1) {
      for (jj<czj> $$2 : $$0) {
         if (!czj.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<czm> a(int $$0, cua $$1, Stream<jj<czj>> $$2) {
      List<czm> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cud.qP);
      $$2.filter($$2x -> ((czj)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         czj $$3x = (czj)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new czm($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cua $$0, akj<daq> $$1, dcd $$2, ja $$3, aym $$4) {
      daq $$5 = $$2.H_().d(lr.aL).a($$1);
      if ($$5 != null) {
         a($$0, $$5x -> $$5.a($$0, $$5x, $$4, $$2, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jj<czj> var1, int var2, czi var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jj<czj> var1, int var2);
   }
}
