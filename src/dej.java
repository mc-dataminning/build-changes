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

public class dej {
   public static int a(js<deh> $$0, cxy $$1) {
      den $$2 = $$1.a(kx.l, den.a);
      return $$2.a($$0);
   }

   public static den a(cxy $$0, Consumer<den.a> $$1) {
      kw<den> $$2 = d($$0);
      den $$3 = $$0.a($$2);
      if ($$3 == null) {
         return den.a;
      } else {
         den.a $$4 = new den.a($$3);
         $$1.accept($$4);
         den $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cxy $$0) {
      return $$0.c(d($$0));
   }

   public static void a(cxy $$0, den $$1) {
      $$0.b(d($$0), $$1);
   }

   public static den b(cxy $$0) {
      return $$0.a(d($$0), den.a);
   }

   private static kw<den> d(cxy $$0) {
      return $$0.a(cyc.vz) ? kx.J : kx.l;
   }

   public static boolean c(cxy $$0) {
      return !$$0.a(kx.l, den.a).d() || !$$0.a(kx.J, den.a).d();
   }

   public static int a(arn $$0, cxy $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((deh)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arn $$0, cxy $$1, cxy $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((deh)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arn $$0, cxy $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((deh)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arn $$0, @Nullable bvs $$1, bvs $$2, int $$3) {
      if ($$1 instanceof bwr $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((deh)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cxy a(dek $$0) {
      cxy $$1 = new cxy(cyc.vz);
      $$1.a($$0.b(), $$0.c());
      return $$1;
   }

   private static void a(cxy $$0, dej.b $$1) {
      den $$2 = $$0.a(kx.l, den.a);

      for (Entry<js<deh>> $$3 : $$2.b()) {
         $$1.accept((js<deh>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cxy $$0, bwc $$1, bwr $$2, dej.a $$3) {
      if (!$$0.f()) {
         den $$4 = $$0.a(kx.l);
         if ($$4 != null && !$$4.d()) {
            deg $$5 = new deg($$0, $$1, $$2);

            for (Entry<js<deh>> $$6 : $$4.b()) {
               js<deh> $$7 = (js<deh>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bwr $$0, dej.a $$1) {
      for (bwc $$2 : bwc.j) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arn $$0, bwr $$1, buh $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arn $$0, bwr $$1, buh $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arn $$0, cxy $$1, bvs $$2, buh $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((deh)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arn $$0, cxy $$1, bvs $$2, buh $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((deh)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arn $$0, cxy $$1, bvs $$2, buh $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((deh)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arn $$0, cxy $$1, bvs $$2, buh $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((deh)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arn $$0, bvs $$1, buh $$2) {
      if ($$2.d() instanceof bwr $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arn $$0, bvs $$1, buh $$2, @Nullable cxy $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arn $$0, bvs $$1, buh $$2, @Nullable cxy $$3, @Nullable Consumer<cxu> $$4) {
      if ($$1 instanceof bwr $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((deh)$$3x.a()).a($$0, $$4x, $$5x, del.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bwr $$6) {
            a($$3, bwc.a, $$6, ($$3x, $$4x, $$5) -> ((deh)$$3x.a()).a($$0, $$4x, $$5, del.a, $$1, $$2));
         } else if ($$4 != null) {
            deg $$7 = new deg($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((deh)$$4x.a()).a($$0, $$5, $$7, del.a, $$1, $$2));
         }
      }
   }

   public static void a(arn $$0, bwr $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arn $$0, cxy $$1, bwr $$2, bwc $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((deh)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bwr $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cxy $$0, bwr $$1, bwc $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((deh)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arn $$0, bwr $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bvs)$$1));
   }

   public static int a(js<deh> $$0, bwr $$1) {
      Iterable<cxy> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cxy $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arn $$0, cxy $$1, bvs $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((deh)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arn $$0, cxy $$1, bvs $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((deh)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arn $$0, cxy $$1, cxy $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((deh)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arn $$0, cxy $$1, crb $$2, Consumer<cxu> $$3) {
      bwr $$5 = $$2.q() instanceof bwr $$4 ? $$4 : null;
      deg $$6 = new deg($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((deh)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arn $$0, cxy $$1, @Nullable bwr $$2, bvs $$3, @Nullable bwc $$4, fcu $$5, dym $$6, Consumer<cxu> $$7) {
      deg $$8 = new deg($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((deh)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arn $$0, cxy $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((deh)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arn $$0, bwr $$1, buh $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azs $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         exl $$8 = deh.b($$0, $$6, $$1, $$2);
         ((deh)$$5x.a()).a(dei.m).forEach($$4xx -> {
            if ($$4xx.a() == del.c && $$4xx.b() == del.c && $$4xx.a($$8)) {
               $$4.setValue(((dfa)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bwr $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            exl $$8 = deh.b($$0, $$6, $$1, $$2);
            ((deh)$$5x.a()).a(dei.m).forEach($$4xx -> {
               if ($$4xx.a() == del.a && $$4xx.b() == del.c && $$4xx.a($$8)) {
                  $$4.setValue(((dfa)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cxy $$0, bwd $$1, BiConsumer<js<bxs>, bxv> $$2) {
      a($$0, ($$2x, $$3) -> ((deh)$$2x.a()).a(dei.l).forEach($$4 -> {
            if (((deh)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cxy $$0, bwc $$1, BiConsumer<js<bxs>, bxv> $$2) {
      a($$0, ($$2x, $$3) -> ((deh)$$2x.a()).a(dei.l).forEach($$4 -> {
            if (((deh)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arn $$0, cxy $$1, bvs $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arn $$0, cxy $$1, bvs $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arn $$0, cxy $$1, bvs $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cxy $$0, bwr $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((deh)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cxy $$0, bwr $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((deh)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cxy $$0, axp<deh> $$1) {
      den $$2 = $$0.a(kx.l, den.a);

      for (Entry<js<deh>> $$3 : $$2.b()) {
         js<deh> $$4 = (js<deh>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cxy $$0, kw<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((deh)$$2x.a()).i().c($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cxy $$0, kw<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cxy $$0, kw<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((deh)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<deg> a(kw<?> $$0, bwr $$1, Predicate<cxy> $$2) {
      List<deg> $$3 = new ArrayList<>();

      for (bwc $$4 : bwc.j) {
         cxy $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            den $$6 = $$5.a(kx.l, den.a);

            for (Entry<js<deh>> $$7 : $$6.b()) {
               js<deh> $$8 = (js<deh>)$$7.getKey();
               if ($$8.a().i().c($$0) && $$8.a().a($$4)) {
                  $$3.add(new deg($$5, $$4, $$1));
               }
            }
         }
      }

      return af.b($$3, $$1.dY());
   }

   public static int a(azs $$0, int $$1, int $$2, cxy $$3) {
      def $$4 = $$3.a(kx.D);
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

   public static cxy a(azs $$0, cxy $$1, int $$2, kg $$3, Optional<? extends jw<deh>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<js<deh>>>map(jw::a).orElseGet(() -> $$3.f(me.aS).c().map($$0xx -> $$0xx)));
   }

   public static cxy a(azs $$0, cxy $$1, int $$2, Stream<js<deh>> $$3) {
      List<dek> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cyc.rA)) {
         $$1 = new cxy(cyc.vz);
      }

      for (dek $$5 : $$4) {
         $$1.a($$5.b(), $$5.c());
      }

      return $$1;
   }

   public static List<dek> b(azs $$0, cxy $$1, int $$2, Stream<js<deh>> $$3) {
      List<dek> $$4 = Lists.newArrayList();
      def $$5 = $$1.a(kx.D);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azk.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dek> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bsc.a($$0, $$7, dek::a).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, af.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bsc.a($$0, $$7, dek::a).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dek> $$0, dek $$1) {
      $$0.removeIf($$1x -> !deh.a($$1.b(), $$1x.b()));
   }

   public static boolean a(Collection<js<deh>> $$0, js<deh> $$1) {
      for (js<deh> $$2 : $$0) {
         if (!deh.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dek> a(int $$0, cxy $$1, Stream<js<deh>> $$2) {
      List<dek> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cyc.rA);
      $$2.filter($$2x -> ((deh)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         deh $$3x = (deh)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dek($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cxy $$0, kg $$1, alc<dfp> $$2, bto $$3, azs $$4) {
      dfp $$5 = $$1.f(me.aT).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(js<deh> var1, int var2, deg var3);
   }

   @FunctionalInterface
   interface b {
      void accept(js<deh> var1, int var2);
   }
}
