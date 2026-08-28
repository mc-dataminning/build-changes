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

public class dbo {
   public static int a(jp<dbm> $$0, cvx $$1) {
      dbs $$2 = $$1.a(kt.l, dbs.a);
      return $$2.a($$0);
   }

   public static dbs a(cvx $$0, Consumer<dbs.a> $$1) {
      ks<dbs> $$2 = d($$0);
      dbs $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dbs.a;
      } else {
         dbs.a $$4 = new dbs.a($$3);
         $$1.accept($$4);
         dbs $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cvx $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cvx $$0, dbs $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dbs b(cvx $$0) {
      return $$0.a(d($$0), dbs.a);
   }

   private static ks<dbs> d(cvx $$0) {
      return $$0.a(cwb.uy) ? kt.H : kt.l;
   }

   public static boolean c(cvx $$0) {
      return !$$0.a(kt.l, dbs.a).d() || !$$0.a(kt.H, dbs.a).d();
   }

   public static int a(arm $$0, cvx $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbm)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arm $$0, cvx $$1, cvx $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dbm)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arm $$0, cvx $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbm)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arm $$0, @Nullable btz $$1, btz $$2, int $$3) {
      if ($$1 instanceof buv $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dbm)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cvx a(dbp $$0) {
      cvx $$1 = new cvx(cwb.uy);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cvx $$0, dbo.b $$1) {
      dbs $$2 = $$0.a(kt.l, dbs.a);

      for (Entry<jp<dbm>> $$3 : $$2.b()) {
         $$1.accept((jp<dbm>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cvx $$0, buh $$1, buv $$2, dbo.a $$3) {
      if (!$$0.f()) {
         dbs $$4 = $$0.a(kt.l);
         if ($$4 != null && !$$4.d()) {
            dbl $$5 = new dbl($$0, $$1, $$2);

            for (Entry<jp<dbm>> $$6 : $$4.b()) {
               jp<dbm> $$7 = (jp<dbm>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(buv $$0, dbo.a $$1) {
      for (buh $$2 : buh.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arm $$0, buv $$1, bsp $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arm $$0, buv $$1, bsp $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arm $$0, cvx $$1, btz $$2, bsp $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbm)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arm $$0, cvx $$1, btz $$2, bsp $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbm)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arm $$0, cvx $$1, btz $$2, bsp $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbm)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arm $$0, cvx $$1, btz $$2, bsp $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbm)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arm $$0, btz $$1, bsp $$2) {
      if ($$2.d() instanceof buv $$3) {
         a($$0, $$1, $$2, $$3.eb());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arm $$0, btz $$1, bsp $$2, @Nullable cvx $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arm $$0, btz $$1, bsp $$2, @Nullable cvx $$3, @Nullable Consumer<cvt> $$4) {
      if ($$1 instanceof buv $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dbm)$$3x.a()).a($$0, $$4x, $$5x, dbq.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof buv $$6) {
            a($$3, buh.a, $$6, ($$3x, $$4x, $$5) -> ((dbm)$$3x.a()).a($$0, $$4x, $$5, dbq.a, $$1, $$2));
         } else if ($$4 != null) {
            dbl $$7 = new dbl($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dbm)$$4x.a()).a($$0, $$5, $$7, dbq.a, $$1, $$2));
         }
      }
   }

   public static void a(arm $$0, buv $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arm $$0, cvx $$1, buv $$2, buh $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dbm)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(buv $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cvx $$0, buv $$1, buh $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dbm)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arm $$0, buv $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (btz)$$1));
   }

   public static int a(jp<dbm> $$0, buv $$1) {
      Iterable<cvx> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cvx $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arm $$0, cvx $$1, btz $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dbm)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arm $$0, cvx $$1, btz $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dbm)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arm $$0, cvx $$1, cvx $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dbm)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arm $$0, cvx $$1, cpb $$2, Consumer<cvt> $$3) {
      buv $$5 = $$2.s() instanceof buv $$4 ? $$4 : null;
      dbl $$6 = new dbl($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dbm)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arm $$0, cvx $$1, @Nullable buv $$2, btz $$3, @Nullable buh $$4, ezh $$5, dvd $$6, Consumer<cvt> $$7) {
      dbl $$8 = new dbl($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dbm)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arm $$0, cvx $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbm)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arm $$0, buv $$1, bsp $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azr $$5 = $$1.ea();
      a($$1, ($$5x, $$6, $$7x) -> {
         etw $$8 = dbm.b($$0, $$6, $$1, $$2);
         ((dbm)$$5x.a()).a(dbn.m).forEach($$4xx -> {
            if ($$4xx.a() == dbq.c && $$4xx.b() == dbq.c && $$4xx.a($$8)) {
               $$4.setValue(((dcf)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof buv $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            etw $$8 = dbm.b($$0, $$6, $$1, $$2);
            ((dbm)$$5x.a()).a(dbn.m).forEach($$4xx -> {
               if ($$4xx.a() == dbq.a && $$4xx.b() == dbq.c && $$4xx.a($$8)) {
                  $$4.setValue(((dcf)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cvx $$0, bui $$1, BiConsumer<jp<bvy>, bwb> $$2) {
      a($$0, ($$2x, $$3) -> ((dbm)$$2x.a()).a(dbn.l).forEach($$4 -> {
            if (((dbm)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cvx $$0, buh $$1, BiConsumer<jp<bvy>, bwb> $$2) {
      a($$0, ($$2x, $$3) -> ((dbm)$$2x.a()).a(dbn.l).forEach($$4 -> {
            if (((dbm)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arm $$0, cvx $$1, btz $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arm $$0, cvx $$1, btz $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arm $$0, cvx $$1, btz $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cvx $$0, buv $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dbm)$$2x.a()).b($$1.ea(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cvx $$0, buv $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dbm)$$2x.a()).a($$1.ea(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cvx $$0, axp<dbm> $$1) {
      dbs $$2 = $$0.a(kt.l, dbs.a);

      for (Entry<jp<dbm>> $$3 : $$2.b()) {
         jp<dbm> $$4 = (jp<dbm>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cvx $$0, ks<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dbm)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cvx $$0, ks<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cvx $$0, ks<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dbm)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dbl> a(ks<?> $$0, buv $$1, Predicate<cvx> $$2) {
      List<dbl> $$3 = new ArrayList<>();

      for (buh $$4 : buh.i) {
         cvx $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dbs $$6 = $$5.a(kt.l, dbs.a);

            for (Entry<jp<dbm>> $$7 : $$6.b()) {
               jp<dbm> $$8 = (jp<dbm>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dbl($$5, $$4, $$1));
               }
            }
         }
      }

      return ad.b($$3, $$1.ea());
   }

   public static int a(azr $$0, int $$1, int $$2, cvx $$3) {
      dbk $$4 = $$3.a(kt.C);
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

   public static cvx a(azr $$0, cvx $$1, int $$2, kd $$3, Optional<? extends jt<dbm>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jp<dbm>>>map(jt::a).orElseGet(() -> $$3.e(ly.aM).c().map($$0xx -> $$0xx)));
   }

   public static cvx a(azr $$0, cvx $$1, int $$2, Stream<jp<dbm>> $$3) {
      List<dbp> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cwb.qQ)) {
         $$1 = new cvx(cwb.uy);
      }

      for (dbp $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<dbp> b(azr $$0, cvx $$1, int $$2, Stream<jp<dbm>> $$3) {
      List<dbp> $$4 = Lists.newArrayList();
      dbk $$5 = $$1.a(kt.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azj.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dbp> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bqj.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ad.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bqj.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dbp> $$0, dbp $$1) {
      $$0.removeIf($$1x -> !dbm.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jp<dbm>> $$0, jp<dbm> $$1) {
      for (jp<dbm> $$2 : $$0) {
         if (!dbm.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dbp> a(int $$0, cvx $$1, Stream<jp<dbm>> $$2) {
      List<dbp> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cwb.qQ);
      $$2.filter($$2x -> ((dbm)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dbm $$3x = (dbm)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dbp($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cvx $$0, kd $$1, alg<dcu> $$2, brw $$3, azr $$4) {
      dcu $$5 = $$1.e(ly.aN).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jp<dbm> var1, int var2, dbl var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jp<dbm> var1, int var2);
   }
}
