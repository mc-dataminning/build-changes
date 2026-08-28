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

public class dbp {
   public static int a(jo<dbn> $$0, cvs $$1) {
      dbt $$2 = $$1.a(ks.k, dbt.a);
      return $$2.a($$0);
   }

   public static dbt a(cvs $$0, Consumer<dbt.a> $$1) {
      kr<dbt> $$2 = d($$0);
      dbt $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dbt.a;
      } else {
         dbt.a $$4 = new dbt.a($$3);
         $$1.accept($$4);
         dbt $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cvs $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cvs $$0, dbt $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dbt b(cvs $$0) {
      return $$0.a(d($$0), dbt.a);
   }

   private static kr<dbt> d(cvs $$0) {
      return $$0.a(cvw.uy) ? ks.D : ks.k;
   }

   public static boolean c(cvs $$0) {
      return !$$0.a(ks.k, dbt.a).d() || !$$0.a(ks.D, dbt.a).d();
   }

   public static int a(arj $$0, cvs $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbn)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arj $$0, cvs $$1, cvs $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dbn)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arj $$0, cvs $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbn)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arj $$0, @Nullable btr $$1, btr $$2, int $$3) {
      if ($$1 instanceof bun $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dbn)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cvs a(dbq $$0) {
      cvs $$1 = new cvs(cvw.uy);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cvs $$0, dbp.b $$1) {
      dbt $$2 = $$0.a(ks.k, dbt.a);

      for (Entry<jo<dbn>> $$3 : $$2.b()) {
         $$1.accept((jo<dbn>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cvs $$0, btz $$1, bun $$2, dbp.a $$3) {
      if (!$$0.f()) {
         dbt $$4 = $$0.a(ks.k);
         if ($$4 != null && !$$4.d()) {
            dbm $$5 = new dbm($$0, $$1, $$2);

            for (Entry<jo<dbn>> $$6 : $$4.b()) {
               jo<dbn> $$7 = (jo<dbn>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bun $$0, dbp.a $$1) {
      for (btz $$2 : btz.values()) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arj $$0, bun $$1, bsj $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arj $$0, bun $$1, bsj $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arj $$0, cvs $$1, btr $$2, bsj $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbn)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arj $$0, cvs $$1, btr $$2, bsj $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbn)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arj $$0, cvs $$1, btr $$2, bsj $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbn)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arj $$0, cvs $$1, btr $$2, bsj $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbn)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arj $$0, btr $$1, bsj $$2) {
      if ($$2.d() instanceof bun $$3) {
         a($$0, $$1, $$2, $$3.dW());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arj $$0, btr $$1, bsj $$2, @Nullable cvs $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arj $$0, btr $$1, bsj $$2, @Nullable cvs $$3, @Nullable Consumer<cvn> $$4) {
      if ($$1 instanceof bun $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dbn)$$3x.a()).a($$0, $$4x, $$5x, dbr.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bun $$6) {
            a($$3, btz.a, $$6, ($$3x, $$4x, $$5) -> ((dbn)$$3x.a()).a($$0, $$4x, $$5, dbr.a, $$1, $$2));
         } else if ($$4 != null) {
            dbm $$7 = new dbm($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dbn)$$4x.a()).a($$0, $$5, $$7, dbr.a, $$1, $$2));
         }
      }
   }

   public static void a(arj $$0, bun $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arj $$0, cvs $$1, bun $$2, btz $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dbn)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bun $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cvs $$0, bun $$1, btz $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dbn)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arj $$0, bun $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (btr)$$1));
   }

   public static int a(jo<dbn> $$0, bun $$1) {
      Iterable<cvs> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cvs $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arj $$0, cvs $$1, btr $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dbn)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arj $$0, cvs $$1, btr $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dbn)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arj $$0, cvs $$1, cvs $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dbn)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arj $$0, cvs $$1, cor $$2, Consumer<cvn> $$3) {
      bun $$5 = $$2.s() instanceof bun $$4 ? $$4 : null;
      dbm $$6 = new dbm($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dbn)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arj $$0, cvs $$1, @Nullable bun $$2, btr $$3, @Nullable btz $$4, eyw $$5, dus $$6, Consumer<cvn> $$7) {
      dbm $$8 = new dbm($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dbn)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arj $$0, cvs $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbn)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arj $$0, bun $$1, bsj $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azn $$5 = $$1.dV();
      a($$1, ($$5x, $$6, $$7x) -> {
         etl $$8 = dbn.b($$0, $$6, $$1, $$2);
         ((dbn)$$5x.a()).a(dbo.m).forEach($$4xx -> {
            if ($$4xx.a() == dbr.c && $$4xx.b() == dbr.c && $$4xx.a($$8)) {
               $$4.setValue(((dcg)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bun $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            etl $$8 = dbn.b($$0, $$6, $$1, $$2);
            ((dbn)$$5x.a()).a(dbo.m).forEach($$4xx -> {
               if ($$4xx.a() == dbr.a && $$4xx.b() == dbr.c && $$4xx.a($$8)) {
                  $$4.setValue(((dcg)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cvs $$0, bua $$1, BiConsumer<jo<bvp>, bvs> $$2) {
      a($$0, ($$2x, $$3) -> ((dbn)$$2x.a()).a(dbo.l).forEach($$4 -> {
            if (((dbn)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cvs $$0, btz $$1, BiConsumer<jo<bvp>, bvs> $$2) {
      a($$0, ($$2x, $$3) -> ((dbn)$$2x.a()).a(dbo.l).forEach($$4 -> {
            if (((dbn)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arj $$0, cvs $$1, btr $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arj $$0, cvs $$1, btr $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arj $$0, cvs $$1, btr $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cvs $$0, bun $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dbn)$$2x.a()).b($$1.dV(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cvs $$0, bun $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dbn)$$2x.a()).a($$1.dV(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cvs $$0, axl<dbn> $$1) {
      dbt $$2 = $$0.a(ks.k, dbt.a);

      for (Entry<jo<dbn>> $$3 : $$2.b()) {
         jo<dbn> $$4 = (jo<dbn>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cvs $$0, kr<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dbn)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cvs $$0, kr<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cvs $$0, kr<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dbn)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dbm> a(kr<?> $$0, bun $$1, Predicate<cvs> $$2) {
      List<dbm> $$3 = new ArrayList<>();

      for (btz $$4 : btz.values()) {
         cvs $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dbt $$6 = $$5.a(ks.k, dbt.a);

            for (Entry<jo<dbn>> $$7 : $$6.b()) {
               jo<dbn> $$8 = (jo<dbn>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dbm($$5, $$4, $$1));
               }
            }
         }
      }

      return ad.b($$3, $$1.dV());
   }

   public static int a(azn $$0, int $$1, int $$2, cvs $$3) {
      if ($$3.M() <= 0) {
         return 0;
      } else {
         if ($$2 > 15) {
            $$2 = 15;
         }

         int $$4 = $$0.a(8) + 1 + ($$2 >> 1) + $$0.a($$2 + 1);
         if ($$1 == 0) {
            return Math.max($$4 / 3, 1);
         } else {
            return $$1 == 1 ? $$4 * 2 / 3 + 1 : Math.max($$4, $$2 * 2);
         }
      }
   }

   public static cvs a(azn $$0, cvs $$1, int $$2, kc $$3, Optional<? extends js<dbn>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jo<dbn>>>map(js::a).orElseGet(() -> $$3.e(lw.aN).c().map($$0xx -> $$0xx)));
   }

   public static cvs a(azn $$0, cvs $$1, int $$2, Stream<jo<dbn>> $$3) {
      List<dbq> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cvw.qQ)) {
         $$1 = new cvs(cvw.uy);
      }

      for (dbq $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<dbq> b(azn $$0, cvs $$1, int $$2, Stream<jo<dbn>> $$3) {
      List<dbq> $$4 = Lists.newArrayList();
      int $$5 = $$1.M();
      if ($$5 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5 / 4 + 1) + $$0.a($$5 / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azf.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dbq> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bqf.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ad.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bqf.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dbq> $$0, dbq $$1) {
      $$0.removeIf($$1x -> !dbn.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jo<dbn>> $$0, jo<dbn> $$1) {
      for (jo<dbn> $$2 : $$0) {
         if (!dbn.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dbq> a(int $$0, cvs $$1, Stream<jo<dbn>> $$2) {
      List<dbq> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cvw.qQ);
      $$2.filter($$2x -> ((dbn)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dbn $$3x = (dbn)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dbq($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cvs $$0, kc $$1, ald<dcv> $$2, brq $$3, azn $$4) {
      dcv $$5 = $$1.e(lw.aO).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jo<dbn> var1, int var2, dbm var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jo<dbn> var1, int var2);
   }
}
