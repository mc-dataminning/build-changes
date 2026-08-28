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

public class dbu {
   public static int a(jq<dbs> $$0, cwb $$1) {
      dby $$2 = $$1.a(ku.l, dby.a);
      return $$2.a($$0);
   }

   public static dby a(cwb $$0, Consumer<dby.a> $$1) {
      kt<dby> $$2 = d($$0);
      dby $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dby.a;
      } else {
         dby.a $$4 = new dby.a($$3);
         $$1.accept($$4);
         dby $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cwb $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cwb $$0, dby $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dby b(cwb $$0) {
      return $$0.a(d($$0), dby.a);
   }

   private static kt<dby> d(cwb $$0) {
      return $$0.a(cwf.uy) ? ku.I : ku.l;
   }

   public static boolean c(cwb $$0) {
      return !$$0.a(ku.l, dby.a).d() || !$$0.a(ku.I, dby.a).d();
   }

   public static int a(arn $$0, cwb $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbs)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arn $$0, cwb $$1, cwb $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dbs)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arn $$0, cwb $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbs)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arn $$0, @Nullable bue $$1, bue $$2, int $$3) {
      if ($$1 instanceof bva $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dbs)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cwb a(dbv $$0) {
      cwb $$1 = new cwb(cwf.uy);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cwb $$0, dbu.b $$1) {
      dby $$2 = $$0.a(ku.l, dby.a);

      for (Entry<jq<dbs>> $$3 : $$2.b()) {
         $$1.accept((jq<dbs>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cwb $$0, bum $$1, bva $$2, dbu.a $$3) {
      if (!$$0.f()) {
         dby $$4 = $$0.a(ku.l);
         if ($$4 != null && !$$4.d()) {
            dbr $$5 = new dbr($$0, $$1, $$2);

            for (Entry<jq<dbs>> $$6 : $$4.b()) {
               jq<dbs> $$7 = (jq<dbs>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bva $$0, dbu.a $$1) {
      for (bum $$2 : bum.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arn $$0, bva $$1, bsu $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arn $$0, bva $$1, bsu $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arn $$0, cwb $$1, bue $$2, bsu $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbs)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arn $$0, cwb $$1, bue $$2, bsu $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbs)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arn $$0, cwb $$1, bue $$2, bsu $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbs)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arn $$0, cwb $$1, bue $$2, bsu $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbs)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arn $$0, bue $$1, bsu $$2) {
      if ($$2.d() instanceof bva $$3) {
         a($$0, $$1, $$2, $$3.eb());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arn $$0, bue $$1, bsu $$2, @Nullable cwb $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arn $$0, bue $$1, bsu $$2, @Nullable cwb $$3, @Nullable Consumer<cvx> $$4) {
      if ($$1 instanceof bva $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dbs)$$3x.a()).a($$0, $$4x, $$5x, dbw.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bva $$6) {
            a($$3, bum.a, $$6, ($$3x, $$4x, $$5) -> ((dbs)$$3x.a()).a($$0, $$4x, $$5, dbw.a, $$1, $$2));
         } else if ($$4 != null) {
            dbr $$7 = new dbr($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dbs)$$4x.a()).a($$0, $$5, $$7, dbw.a, $$1, $$2));
         }
      }
   }

   public static void a(arn $$0, bva $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arn $$0, cwb $$1, bva $$2, bum $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dbs)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bva $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cwb $$0, bva $$1, bum $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dbs)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arn $$0, bva $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bue)$$1));
   }

   public static int a(jq<dbs> $$0, bva $$1) {
      Iterable<cwb> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cwb $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arn $$0, cwb $$1, bue $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dbs)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arn $$0, cwb $$1, bue $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dbs)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arn $$0, cwb $$1, cwb $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dbs)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arn $$0, cwb $$1, cpg $$2, Consumer<cvx> $$3) {
      bva $$5 = $$2.s() instanceof bva $$4 ? $$4 : null;
      dbr $$6 = new dbr($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dbs)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arn $$0, cwb $$1, @Nullable bva $$2, bue $$3, @Nullable bum $$4, ezn $$5, dvj $$6, Consumer<cvx> $$7) {
      dbr $$8 = new dbr($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dbs)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arn $$0, cwb $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbs)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arn $$0, bva $$1, bsu $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azs $$5 = $$1.ea();
      a($$1, ($$5x, $$6, $$7x) -> {
         euc $$8 = dbs.b($$0, $$6, $$1, $$2);
         ((dbs)$$5x.a()).a(dbt.m).forEach($$4xx -> {
            if ($$4xx.a() == dbw.c && $$4xx.b() == dbw.c && $$4xx.a($$8)) {
               $$4.setValue(((dcl)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bva $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            euc $$8 = dbs.b($$0, $$6, $$1, $$2);
            ((dbs)$$5x.a()).a(dbt.m).forEach($$4xx -> {
               if ($$4xx.a() == dbw.a && $$4xx.b() == dbw.c && $$4xx.a($$8)) {
                  $$4.setValue(((dcl)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cwb $$0, bun $$1, BiConsumer<jq<bwd>, bwg> $$2) {
      a($$0, ($$2x, $$3) -> ((dbs)$$2x.a()).a(dbt.l).forEach($$4 -> {
            if (((dbs)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cwb $$0, bum $$1, BiConsumer<jq<bwd>, bwg> $$2) {
      a($$0, ($$2x, $$3) -> ((dbs)$$2x.a()).a(dbt.l).forEach($$4 -> {
            if (((dbs)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arn $$0, cwb $$1, bue $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arn $$0, cwb $$1, bue $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arn $$0, cwb $$1, bue $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cwb $$0, bva $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dbs)$$2x.a()).b($$1.ea(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cwb $$0, bva $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dbs)$$2x.a()).a($$1.ea(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cwb $$0, axq<dbs> $$1) {
      dby $$2 = $$0.a(ku.l, dby.a);

      for (Entry<jq<dbs>> $$3 : $$2.b()) {
         jq<dbs> $$4 = (jq<dbs>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cwb $$0, kt<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dbs)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cwb $$0, kt<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cwb $$0, kt<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dbs)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dbr> a(kt<?> $$0, bva $$1, Predicate<cwb> $$2) {
      List<dbr> $$3 = new ArrayList<>();

      for (bum $$4 : bum.i) {
         cwb $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dby $$6 = $$5.a(ku.l, dby.a);

            for (Entry<jq<dbs>> $$7 : $$6.b()) {
               jq<dbs> $$8 = (jq<dbs>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dbr($$5, $$4, $$1));
               }
            }
         }
      }

      return ae.b($$3, $$1.ea());
   }

   public static int a(azs $$0, int $$1, int $$2, cwb $$3) {
      dbq $$4 = $$3.a(ku.C);
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

   public static cwb a(azs $$0, cwb $$1, int $$2, ke $$3, Optional<? extends ju<dbs>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jq<dbs>>>map(ju::a).orElseGet(() -> $$3.e(lz.aM).c().map($$0xx -> $$0xx)));
   }

   public static cwb a(azs $$0, cwb $$1, int $$2, Stream<jq<dbs>> $$3) {
      List<dbv> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cwf.qQ)) {
         $$1 = new cwb(cwf.uy);
      }

      for (dbv $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<dbv> b(azs $$0, cwb $$1, int $$2, Stream<jq<dbs>> $$3) {
      List<dbv> $$4 = Lists.newArrayList();
      dbq $$5 = $$1.a(ku.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azk.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dbv> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bqo.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ae.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bqo.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dbv> $$0, dbv $$1) {
      $$0.removeIf($$1x -> !dbs.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jq<dbs>> $$0, jq<dbs> $$1) {
      for (jq<dbs> $$2 : $$0) {
         if (!dbs.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dbv> a(int $$0, cwb $$1, Stream<jq<dbs>> $$2) {
      List<dbv> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cwf.qQ);
      $$2.filter($$2x -> ((dbs)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dbs $$3x = (dbs)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dbv($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cwb $$0, ke $$1, alh<dda> $$2, bsb $$3, azs $$4) {
      dda $$5 = $$1.e(lz.aN).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jq<dbs> var1, int var2, dbr var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jq<dbs> var1, int var2);
   }
}
