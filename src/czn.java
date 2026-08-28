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

public class czn {
   public static int a(jj<czl> $$0, cuc $$1) {
      czr $$2 = $$1.a(kn.k, czr.a);
      return $$2.a($$0);
   }

   public static czr a(cuc $$0, Consumer<czr.a> $$1) {
      km<czr> $$2 = d($$0);
      czr $$3 = $$0.a($$2);
      if ($$3 == null) {
         return czr.a;
      } else {
         czr.a $$4 = new czr.a($$3);
         $$1.accept($$4);
         czr $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cuc $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cuc $$0, czr $$1) {
      $$0.b(d($$0), $$1);
   }

   public static czr b(cuc $$0) {
      return $$0.a(d($$0), czr.a);
   }

   private static km<czr> d(cuc $$0) {
      return $$0.a(cuf.uw) ? kn.y : kn.k;
   }

   public static boolean c(cuc $$0) {
      return !$$0.a(kn.k, czr.a).d() || !$$0.a(kn.y, czr.a).d();
   }

   public static int a(aqm $$0, cuc $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((czl)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aqm $$0, cuc $$1, cuc $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((czl)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(aqm $$0, cuc $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((czl)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aqm $$0, @Nullable bsg $$1, bsg $$2, int $$3) {
      if ($$1 instanceof btb $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((czl)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   private static void a(cuc $$0, czn.b $$1) {
      czr $$2 = $$0.a(kn.k, czr.a);

      for (Entry<jj<czl>> $$3 : $$2.b()) {
         $$1.accept((jj<czl>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cuc $$0, bsn $$1, btb $$2, czn.a $$3) {
      if (!$$0.e()) {
         czr $$4 = $$0.a(kn.k);
         if ($$4 != null && !$$4.d()) {
            czk $$5 = new czk($$0, $$1, $$2);

            for (Entry<jj<czl>> $$6 : $$4.b()) {
               jj<czl> $$7 = (jj<czl>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(btb $$0, czn.a $$1) {
      for (bsn $$2 : bsn.values()) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(aqm $$0, btb $$1, bqz $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(aqm $$0, btb $$1, bqz $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(aqm $$0, cuc $$1, bsg $$2, bqz $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czl)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(aqm $$0, cuc $$1, bsg $$2, bqz $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czl)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(aqm $$0, cuc $$1, bsg $$2, bqz $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czl)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(aqm $$0, cuc $$1, bsg $$2, bqz $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((czl)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(aqm $$0, bsg $$1, bqz $$2) {
      if ($$1 instanceof btb $$3) {
         a($$3, ($$3x, $$4x, $$5) -> $$3x.a().a($$0, $$4x, $$5, czp.c, $$1, $$2));
      }

      if ($$2.d() instanceof btb $$4) {
         a($$4.eU(), bsn.a, $$4, ($$3, $$4x, $$5) -> $$3.a().a($$0, $$4x, $$5, czp.a, $$1, $$2));
      }
   }

   public static void a(aqm $$0, btb $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(aqm $$0, cuc $$1, btb $$2, bsn $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((czl)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(btb $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cuc $$0, btb $$1, bsn $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((czl)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(aqm $$0, btb $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bsg)$$1));
   }

   public static int a(jj<czl> $$0, btb $$1) {
      Iterable<cuc> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cuc $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(aqm $$0, cuc $$1, bsg $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((czl)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(aqm $$0, cuc $$1, bsg $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((czl)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(aqm $$0, cuc $$1, cuc $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((czl)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(aqm $$0, cuc $$1, cmq $$2, Runnable $$3) {
      btb $$5 = $$2.s() instanceof btb $$4 ? $$4 : null;
      czk $$6 = new czk($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((czl)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(aqm $$0, cuc $$1, @Nullable btb $$2, bsg $$3, @Nullable bsn $$4, ewf $$5, Runnable $$6) {
      czk $$7 = new czk($$1, $$4, $$2, $$6);
      a($$1, ($$4x, $$5x) -> ((czl)$$4x.a()).a($$0, $$5x, $$7, $$3, $$5));
   }

   public static int c(aqm $$0, cuc $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((czl)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(aqm $$0, btb $$1, bqz $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      ayo $$5 = $$1.dT();
      a($$1, ($$5x, $$6, $$7x) -> {
         equ $$8 = czl.b($$0, $$6, $$1, $$2);
         ((czl)$$5x.a()).a(czm.m).forEach($$4xx -> {
            if ($$4xx.a() == czp.c && $$4xx.b() == czp.c && $$4xx.a($$8)) {
               $$4.setValue(((dad)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof btb $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            equ $$8 = czl.b($$0, $$6, $$1, $$2);
            ((czl)$$5x.a()).a(czm.m).forEach($$4xx -> {
               if ($$4xx.a() == czp.a && $$4xx.b() == czp.c && $$4xx.a($$8)) {
                  $$4.setValue(((dad)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cuc $$0, bsn $$1, BiConsumer<jj<bue>, buh> $$2) {
      a($$0, ($$2x, $$3) -> ((czl)$$2x.a()).a(czm.l).forEach($$4 -> {
            if (((czl)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3));
            }
         }));
   }

   public static int a(aqm $$0, cuc $$1, bsg $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(aqm $$0, cuc $$1, bsg $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(aqm $$0, cuc $$1, bsg $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(btb $$0, float $$1) {
      MutableFloat $$2 = new MutableFloat($$1);
      a($$0, ($$2x, $$3, $$4) -> ((czl)$$2x.a()).b($$0.dT(), $$3, $$2));
      return Math.max(0.0F, $$2.floatValue());
   }

   public static float b(btb $$0) {
      MutableFloat $$1 = new MutableFloat(0.0F);
      a($$0, ($$2, $$3, $$4) -> $$2.a().a($$0.dT(), $$3, $$1));
      return $$1.floatValue();
   }

   public static boolean a(cuc $$0, awm<czl> $$1) {
      czr $$2 = $$0.a(kn.k, czr.a);

      for (Entry<jj<czl>> $$3 : $$2.b()) {
         jj<czl> $$4 = (jj<czl>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cuc $$0, km<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((czl)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cuc $$0, km<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cuc $$0, km<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((czl)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<czk> a(km<?> $$0, btb $$1, Predicate<cuc> $$2) {
      List<czk> $$3 = new ArrayList<>();

      for (bsn $$4 : bsn.values()) {
         cuc $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            czr $$6 = $$5.a(kn.k, czr.a);

            for (Entry<jj<czl>> $$7 : $$6.b()) {
               jj<czl> $$8 = (jj<czl>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new czk($$5, $$4, $$1));
               }
            }
         }
      }

      return ac.b($$3, $$1.dT());
   }

   public static int a(ayo $$0, int $$1, int $$2, cuc $$3) {
      ctx $$4 = $$3.g();
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

   public static cuc a(ayo $$0, cuc $$1, int $$2, jx $$3, Optional<? extends jn<czl>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jj<czl>>>map(jn::a).orElseGet(() -> $$3.d(lr.aK).i().map($$0xx -> $$0xx)));
   }

   public static cuc a(ayo $$0, cuc $$1, int $$2, Stream<jj<czl>> $$3) {
      List<czo> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cuf.qP)) {
         $$1 = new cuc(cuf.uw);
      }

      for (czo $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<czo> b(ayo $$0, cuc $$1, int $$2, Stream<jj<czl>> $$3) {
      List<czo> $$4 = Lists.newArrayList();
      ctx $$5 = $$1.g();
      int $$6 = $$5.g();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ayg.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<czo> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bot.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bot.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<czo> $$0, czo $$1) {
      $$0.removeIf($$1x -> !czl.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jj<czl>> $$0, jj<czl> $$1) {
      for (jj<czl> $$2 : $$0) {
         if (!czl.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<czo> a(int $$0, cuc $$1, Stream<jj<czl>> $$2) {
      List<czo> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cuf.qP);
      $$2.filter($$2x -> ((czl)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         czl $$3x = (czl)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new czo($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cuc $$0, akj<das> $$1, dcf $$2, ja $$3, ayo $$4) {
      das $$5 = $$2.H_().d(lr.aL).a($$1);
      if ($$5 != null) {
         a($$0, $$5x -> $$5.a($$0, $$5x, $$4, $$2, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jj<czl> var1, int var2, czk var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jj<czl> var1, int var2);
   }
}
