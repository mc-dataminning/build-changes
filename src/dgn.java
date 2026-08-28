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

public class dgn {
   public static int a(jf<dgl> $$0, czy $$1) {
      dgr $$2 = $$1.a(kk.l, dgr.a);
      return $$2.a($$0);
   }

   public static dgr a(czy $$0, Consumer<dgr.a> $$1) {
      kj<dgr> $$2 = d($$0);
      dgr $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dgr.a;
      } else {
         dgr.a $$4 = new dgr.a($$3);
         $$1.accept($$4);
         dgr $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(czy $$0) {
      return $$0.c(d($$0));
   }

   public static void a(czy $$0, dgr $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dgr b(czy $$0) {
      return $$0.a(d($$0), dgr.a);
   }

   private static kj<dgr> d(czy $$0) {
      return $$0.a(dac.vG) ? kk.J : kk.l;
   }

   public static boolean c(czy $$0) {
      return !$$0.a(kk.l, dgr.a).d() || !$$0.a(kk.J, dgr.a).d();
   }

   public static int a(ars $$0, czy $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dgl)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(ars $$0, czy $$1, czy $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dgl)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(ars $$0, czy $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dgl)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(ars $$0, @Nullable bwt $$1, bwt $$2, int $$3) {
      if ($$1 instanceof bxu $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dgl)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static czy a(dgo $$0) {
      czy $$1 = new czy(dac.vG);
      $$1.a($$0.b(), $$0.c());
      return $$1;
   }

   private static void a(czy $$0, dgn.b $$1) {
      dgr $$2 = $$0.a(kk.l, dgr.a);

      for (Entry<jf<dgl>> $$3 : $$2.b()) {
         $$1.accept((jf<dgl>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(czy $$0, bxd $$1, bxu $$2, dgn.a $$3) {
      if (!$$0.f()) {
         dgr $$4 = $$0.a(kk.l);
         if ($$4 != null && !$$4.d()) {
            dgk $$5 = new dgk($$0, $$1, $$2);

            for (Entry<jf<dgl>> $$6 : $$4.b()) {
               jf<dgl> $$7 = (jf<dgl>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bxu $$0, dgn.a $$1) {
      for (bxd $$2 : bxd.j) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(ars $$0, bxu $$1, bvi $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(ars $$0, bxu $$1, bvi $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(ars $$0, czy $$1, bwt $$2, bvi $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgl)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(ars $$0, czy $$1, bwt $$2, bvi $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgl)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(ars $$0, czy $$1, bwt $$2, bvi $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgl)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(ars $$0, czy $$1, bwt $$2, bvi $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgl)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(ars $$0, bwt $$1, bvi $$2) {
      if ($$2.d() instanceof bxu $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(ars $$0, bwt $$1, bvi $$2, @Nullable czy $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(ars $$0, bwt $$1, bvi $$2, @Nullable czy $$3, @Nullable Consumer<czu> $$4) {
      if ($$1 instanceof bxu $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dgl)$$3x.a()).a($$0, $$4x, $$5x, dgp.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bxu $$6) {
            a($$3, bxd.a, $$6, ($$3x, $$4x, $$5) -> ((dgl)$$3x.a()).a($$0, $$4x, $$5, dgp.a, $$1, $$2));
         } else if ($$4 != null) {
            dgk $$7 = new dgk($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dgl)$$4x.a()).a($$0, $$5, $$7, dgp.a, $$1, $$2));
         }
      }
   }

   public static void a(ars $$0, bxu $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(ars $$0, czy $$1, bxu $$2, bxd $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dgl)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bxu $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(czy $$0, bxu $$1, bxd $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dgl)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(ars $$0, bxu $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bwt)$$1));
   }

   public static int a(jf<dgl> $$0, bxu $$1) {
      Iterable<czy> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (czy $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(ars $$0, czy $$1, bwt $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dgl)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(ars $$0, czy $$1, bwt $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dgl)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(ars $$0, czy $$1, czy $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dgl)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(ars $$0, czy $$1, css $$2, Consumer<czu> $$3) {
      bxu $$5 = $$2.q() instanceof bxu $$4 ? $$4 : null;
      dgk $$6 = new dgk($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dgl)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(ars $$0, czy $$1, @Nullable bxu $$2, bwt $$3, @Nullable bxd $$4, ffq $$5, ebe $$6, Consumer<czu> $$7) {
      dgk $$8 = new dgk($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dgl)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(ars $$0, czy $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dgl)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(ars $$0, bxu $$1, bvi $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azx $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         fah $$8 = dgl.b($$0, $$6, $$1, $$2);
         ((dgl)$$5x.a()).a(dgm.m).forEach($$4xx -> {
            if ($$4xx.a() == dgp.c && $$4xx.b() == dgp.c && $$4xx.a($$8)) {
               $$4.setValue(((dhe)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bxu $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            fah $$8 = dgl.b($$0, $$6, $$1, $$2);
            ((dgl)$$5x.a()).a(dgm.m).forEach($$4xx -> {
               if ($$4xx.a() == dgp.a && $$4xx.b() == dgp.c && $$4xx.a($$8)) {
                  $$4.setValue(((dhe)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(czy $$0, bxe $$1, BiConsumer<jf<byv>, byy> $$2) {
      a($$0, ($$2x, $$3) -> ((dgl)$$2x.a()).a(dgm.l).forEach($$4 -> {
            if (((dgl)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(czy $$0, bxd $$1, BiConsumer<jf<byv>, byy> $$2) {
      a($$0, ($$2x, $$3) -> ((dgl)$$2x.a()).a(dgm.l).forEach($$4 -> {
            if (((dgl)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(ars $$0, czy $$1, bwt $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(ars $$0, czy $$1, bwt $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(ars $$0, czy $$1, bwt $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(czy $$0, bxu $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dgl)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(czy $$0, bxu $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dgl)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(czy $$0, axt<dgl> $$1) {
      dgr $$2 = $$0.a(kk.l, dgr.a);

      for (Entry<jf<dgl>> $$3 : $$2.b()) {
         jf<dgl> $$4 = (jf<dgl>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(czy $$0, kj<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dgl)$$2x.a()).i().c($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(czy $$0, kj<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(czy $$0, kj<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dgl)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dgk> a(kj<?> $$0, bxu $$1, Predicate<czy> $$2) {
      List<dgk> $$3 = new ArrayList<>();

      for (bxd $$4 : bxd.j) {
         czy $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dgr $$6 = $$5.a(kk.l, dgr.a);

            for (Entry<jf<dgl>> $$7 : $$6.b()) {
               jf<dgl> $$8 = (jf<dgl>)$$7.getKey();
               if ($$8.a().i().c($$0) && $$8.a().a($$4)) {
                  $$3.add(new dgk($$5, $$4, $$1));
               }
            }
         }
      }

      return ag.b($$3, $$1.dY());
   }

   public static int a(azx $$0, int $$1, int $$2, czy $$3) {
      dgj $$4 = $$3.a(kk.C);
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

   public static czy a(azx $$0, czy $$1, int $$2, jt $$3, Optional<? extends jj<dgl>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jf<dgl>>>map(jj::a).orElseGet(() -> $$3.f(mh.aR).c().map($$0xx -> $$0xx)));
   }

   public static czy a(azx $$0, czy $$1, int $$2, Stream<jf<dgl>> $$3) {
      List<dgo> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(dac.rF)) {
         $$1 = new czy(dac.vG);
      }

      for (dgo $$5 : $$4) {
         $$1.a($$5.b(), $$5.c());
      }

      return $$1;
   }

   public static List<dgo> b(azx $$0, czy $$1, int $$2, Stream<jf<dgl>> $$3) {
      List<dgo> $$4 = Lists.newArrayList();
      dgj $$5 = $$1.a(kk.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azo.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dgo> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            btc.a($$0, $$7, dgo::a).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ag.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               btc.a($$0, $$7, dgo::a).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dgo> $$0, dgo $$1) {
      $$0.removeIf($$1x -> !dgl.a($$1.b(), $$1x.b()));
   }

   public static boolean a(Collection<jf<dgl>> $$0, jf<dgl> $$1) {
      for (jf<dgl> $$2 : $$0) {
         if (!dgl.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dgo> a(int $$0, czy $$1, Stream<jf<dgl>> $$2) {
      List<dgo> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(dac.rF);
      $$2.filter($$2x -> ((dgl)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dgl $$3x = (dgl)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dgo($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(czy $$0, jt $$1, alh<dht> $$2, bup $$3, azx $$4) {
      dht $$5 = $$1.f(mh.aQ).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jf<dgl> var1, int var2, dgk var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jf<dgl> var1, int var2);
   }
}
