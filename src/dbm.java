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

public class dbm {
   public static int a(jn<dbk> $$0, cvp $$1) {
      dbq $$2 = $$1.a(kr.k, dbq.a);
      return $$2.a($$0);
   }

   public static dbq a(cvp $$0, Consumer<dbq.a> $$1) {
      kq<dbq> $$2 = d($$0);
      dbq $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dbq.a;
      } else {
         dbq.a $$4 = new dbq.a($$3);
         $$1.accept($$4);
         dbq $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cvp $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cvp $$0, dbq $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dbq b(cvp $$0) {
      return $$0.a(d($$0), dbq.a);
   }

   private static kq<dbq> d(cvp $$0) {
      return $$0.a(cvt.uy) ? kr.D : kr.k;
   }

   public static boolean c(cvp $$0) {
      return !$$0.a(kr.k, dbq.a).d() || !$$0.a(kr.D, dbq.a).d();
   }

   public static int a(arh $$0, cvp $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbk)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arh $$0, cvp $$1, cvp $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dbk)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arh $$0, cvp $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbk)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arh $$0, @Nullable bto $$1, bto $$2, int $$3) {
      if ($$1 instanceof buk $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dbk)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cvp a(dbn $$0) {
      cvp $$1 = new cvp(cvt.uy);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cvp $$0, dbm.b $$1) {
      dbq $$2 = $$0.a(kr.k, dbq.a);

      for (Entry<jn<dbk>> $$3 : $$2.b()) {
         $$1.accept((jn<dbk>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cvp $$0, btw $$1, buk $$2, dbm.a $$3) {
      if (!$$0.f()) {
         dbq $$4 = $$0.a(kr.k);
         if ($$4 != null && !$$4.d()) {
            dbj $$5 = new dbj($$0, $$1, $$2);

            for (Entry<jn<dbk>> $$6 : $$4.b()) {
               jn<dbk> $$7 = (jn<dbk>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(buk $$0, dbm.a $$1) {
      for (btw $$2 : btw.values()) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arh $$0, buk $$1, bsg $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arh $$0, buk $$1, bsg $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arh $$0, cvp $$1, bto $$2, bsg $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbk)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arh $$0, cvp $$1, bto $$2, bsg $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbk)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arh $$0, cvp $$1, bto $$2, bsg $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbk)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arh $$0, cvp $$1, bto $$2, bsg $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbk)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arh $$0, bto $$1, bsg $$2) {
      if ($$2.d() instanceof buk $$3) {
         a($$0, $$1, $$2, $$3.dW());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arh $$0, bto $$1, bsg $$2, @Nullable cvp $$3) {
      if ($$1 instanceof buk $$4) {
         a($$4, ($$3x, $$4x, $$5x) -> ((dbk)$$3x.a()).a($$0, $$4x, $$5x, dbo.c, $$1, $$2));
      }

      if ($$3 != null && $$2.d() instanceof buk $$5) {
         a($$3, btw.a, $$5, ($$3x, $$4, $$5x) -> ((dbk)$$3x.a()).a($$0, $$4, $$5x, dbo.a, $$1, $$2));
      }
   }

   public static void a(arh $$0, buk $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arh $$0, cvp $$1, buk $$2, btw $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dbk)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(buk $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cvp $$0, buk $$1, btw $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dbk)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arh $$0, buk $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bto)$$1));
   }

   public static int a(jn<dbk> $$0, buk $$1) {
      Iterable<cvp> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cvp $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arh $$0, cvp $$1, bto $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dbk)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arh $$0, cvp $$1, bto $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dbk)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arh $$0, cvp $$1, cvp $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dbk)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arh $$0, cvp $$1, coo $$2, Consumer<cvk> $$3) {
      buk $$5 = $$2.s() instanceof buk $$4 ? $$4 : null;
      dbj $$6 = new dbj($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dbk)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arh $$0, cvp $$1, @Nullable buk $$2, bto $$3, @Nullable btw $$4, eys $$5, duo $$6, Consumer<cvk> $$7) {
      dbj $$8 = new dbj($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dbk)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arh $$0, cvp $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbk)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arh $$0, buk $$1, bsg $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azl $$5 = $$1.dV();
      a($$1, ($$5x, $$6, $$7x) -> {
         eth $$8 = dbk.b($$0, $$6, $$1, $$2);
         ((dbk)$$5x.a()).a(dbl.m).forEach($$4xx -> {
            if ($$4xx.a() == dbo.c && $$4xx.b() == dbo.c && $$4xx.a($$8)) {
               $$4.setValue(((dcd)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof buk $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            eth $$8 = dbk.b($$0, $$6, $$1, $$2);
            ((dbk)$$5x.a()).a(dbl.m).forEach($$4xx -> {
               if ($$4xx.a() == dbo.a && $$4xx.b() == dbo.c && $$4xx.a($$8)) {
                  $$4.setValue(((dcd)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cvp $$0, btx $$1, BiConsumer<jn<bvm>, bvp> $$2) {
      a($$0, ($$2x, $$3) -> ((dbk)$$2x.a()).a(dbl.l).forEach($$4 -> {
            if (((dbk)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cvp $$0, btw $$1, BiConsumer<jn<bvm>, bvp> $$2) {
      a($$0, ($$2x, $$3) -> ((dbk)$$2x.a()).a(dbl.l).forEach($$4 -> {
            if (((dbk)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arh $$0, cvp $$1, bto $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arh $$0, cvp $$1, bto $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arh $$0, cvp $$1, bto $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cvp $$0, buk $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dbk)$$2x.a()).b($$1.dV(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cvp $$0, buk $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dbk)$$2x.a()).a($$1.dV(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cvp $$0, axj<dbk> $$1) {
      dbq $$2 = $$0.a(kr.k, dbq.a);

      for (Entry<jn<dbk>> $$3 : $$2.b()) {
         jn<dbk> $$4 = (jn<dbk>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cvp $$0, kq<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dbk)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cvp $$0, kq<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cvp $$0, kq<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dbk)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dbj> a(kq<?> $$0, buk $$1, Predicate<cvp> $$2) {
      List<dbj> $$3 = new ArrayList<>();

      for (btw $$4 : btw.values()) {
         cvp $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dbq $$6 = $$5.a(kr.k, dbq.a);

            for (Entry<jn<dbk>> $$7 : $$6.b()) {
               jn<dbk> $$8 = (jn<dbk>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dbj($$5, $$4, $$1));
               }
            }
         }
      }

      return ad.b($$3, $$1.dV());
   }

   public static int a(azl $$0, int $$1, int $$2, cvp $$3) {
      if ($$3.L() <= 0) {
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

   public static cvp a(azl $$0, cvp $$1, int $$2, kb $$3, Optional<? extends jr<dbk>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jn<dbk>>>map(jr::a).orElseGet(() -> $$3.d(lv.aM).i().map($$0xx -> $$0xx)));
   }

   public static cvp a(azl $$0, cvp $$1, int $$2, Stream<jn<dbk>> $$3) {
      List<dbn> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cvt.qQ)) {
         $$1 = new cvp(cvt.uy);
      }

      for (dbn $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<dbn> b(azl $$0, cvp $$1, int $$2, Stream<jn<dbk>> $$3) {
      List<dbn> $$4 = Lists.newArrayList();
      int $$5 = $$1.L();
      if ($$5 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5 / 4 + 1) + $$0.a($$5 / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azd.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dbn> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bqc.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ad.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bqc.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dbn> $$0, dbn $$1) {
      $$0.removeIf($$1x -> !dbk.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jn<dbk>> $$0, jn<dbk> $$1) {
      for (jn<dbk> $$2 : $$0) {
         if (!dbk.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dbn> a(int $$0, cvp $$1, Stream<jn<dbk>> $$2) {
      List<dbn> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cvt.qQ);
      $$2.filter($$2x -> ((dbk)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dbk $$3x = (dbk)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dbn($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cvp $$0, kb $$1, alb<dcs> $$2, brn $$3, azl $$4) {
      dcs $$5 = $$1.d(lv.aN).a($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jn<dbk> var1, int var2, dbj var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jn<dbk> var1, int var2);
   }
}
