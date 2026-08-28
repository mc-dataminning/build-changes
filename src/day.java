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

public class day {
   public static int a(jn<daw> $$0, cvl $$1) {
      dbc $$2 = $$1.a(kr.k, dbc.a);
      return $$2.a($$0);
   }

   public static dbc a(cvl $$0, Consumer<dbc.a> $$1) {
      kq<dbc> $$2 = d($$0);
      dbc $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dbc.a;
      } else {
         dbc.a $$4 = new dbc.a($$3);
         $$1.accept($$4);
         dbc $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cvl $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cvl $$0, dbc $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dbc b(cvl $$0) {
      return $$0.a(d($$0), dbc.a);
   }

   private static kq<dbc> d(cvl $$0) {
      return $$0.a(cvo.uy) ? kr.A : kr.k;
   }

   public static boolean c(cvl $$0) {
      return !$$0.a(kr.k, dbc.a).d() || !$$0.a(kr.A, dbc.a).d();
   }

   public static int a(arg $$0, cvl $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((daw)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arg $$0, cvl $$1, cvl $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((daw)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arg $$0, cvl $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((daw)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arg $$0, @Nullable btj $$1, btj $$2, int $$3) {
      if ($$1 instanceof buf $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((daw)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cvl a(daz $$0) {
      cvl $$1 = new cvl(cvo.uy);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cvl $$0, day.b $$1) {
      dbc $$2 = $$0.a(kr.k, dbc.a);

      for (Entry<jn<daw>> $$3 : $$2.b()) {
         $$1.accept((jn<daw>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cvl $$0, btr $$1, buf $$2, day.a $$3) {
      if (!$$0.f()) {
         dbc $$4 = $$0.a(kr.k);
         if ($$4 != null && !$$4.d()) {
            dav $$5 = new dav($$0, $$1, $$2);

            for (Entry<jn<daw>> $$6 : $$4.b()) {
               jn<daw> $$7 = (jn<daw>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(buf $$0, day.a $$1) {
      for (btr $$2 : btr.values()) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arg $$0, buf $$1, bsb $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arg $$0, buf $$1, bsb $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arg $$0, cvl $$1, btj $$2, bsb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((daw)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arg $$0, cvl $$1, btj $$2, bsb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((daw)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arg $$0, cvl $$1, btj $$2, bsb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((daw)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arg $$0, cvl $$1, btj $$2, bsb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((daw)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arg $$0, btj $$1, bsb $$2) {
      if ($$2.d() instanceof buf $$3) {
         a($$0, $$1, $$2, $$3.dW());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arg $$0, btj $$1, bsb $$2, @Nullable cvl $$3) {
      if ($$1 instanceof buf $$4) {
         a($$4, ($$3x, $$4x, $$5x) -> ((daw)$$3x.a()).a($$0, $$4x, $$5x, dba.c, $$1, $$2));
      }

      if ($$3 != null && $$2.d() instanceof buf $$5) {
         a($$3, btr.a, $$5, ($$3x, $$4, $$5x) -> ((daw)$$3x.a()).a($$0, $$4, $$5x, dba.a, $$1, $$2));
      }
   }

   public static void a(arg $$0, buf $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arg $$0, cvl $$1, buf $$2, btr $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((daw)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(buf $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cvl $$0, buf $$1, btr $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((daw)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arg $$0, buf $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (btj)$$1));
   }

   public static int a(jn<daw> $$0, buf $$1) {
      Iterable<cvl> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cvl $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arg $$0, cvl $$1, btj $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((daw)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arg $$0, cvl $$1, btj $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((daw)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arg $$0, cvl $$1, cvl $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((daw)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arg $$0, cvl $$1, coi $$2, Consumer<cvg> $$3) {
      buf $$5 = $$2.s() instanceof buf $$4 ? $$4 : null;
      dav $$6 = new dav($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((daw)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arg $$0, cvl $$1, @Nullable buf $$2, btj $$3, @Nullable btr $$4, eye $$5, dua $$6, Consumer<cvg> $$7) {
      dav $$8 = new dav($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((daw)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arg $$0, cvl $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((daw)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arg $$0, buf $$1, bsb $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azk $$5 = $$1.dV();
      a($$1, ($$5x, $$6, $$7x) -> {
         est $$8 = daw.b($$0, $$6, $$1, $$2);
         ((daw)$$5x.a()).a(dax.m).forEach($$4xx -> {
            if ($$4xx.a() == dba.c && $$4xx.b() == dba.c && $$4xx.a($$8)) {
               $$4.setValue(((dbp)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof buf $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            est $$8 = daw.b($$0, $$6, $$1, $$2);
            ((daw)$$5x.a()).a(dax.m).forEach($$4xx -> {
               if ($$4xx.a() == dba.a && $$4xx.b() == dba.c && $$4xx.a($$8)) {
                  $$4.setValue(((dbp)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cvl $$0, bts $$1, BiConsumer<jn<bvh>, bvk> $$2) {
      a($$0, ($$2x, $$3) -> ((daw)$$2x.a()).a(dax.l).forEach($$4 -> {
            if (((daw)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cvl $$0, btr $$1, BiConsumer<jn<bvh>, bvk> $$2) {
      a($$0, ($$2x, $$3) -> ((daw)$$2x.a()).a(dax.l).forEach($$4 -> {
            if (((daw)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arg $$0, cvl $$1, btj $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arg $$0, cvl $$1, btj $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arg $$0, cvl $$1, btj $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cvl $$0, buf $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((daw)$$2x.a()).b($$1.dV(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cvl $$0, buf $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((daw)$$2x.a()).a($$1.dV(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cvl $$0, axi<daw> $$1) {
      dbc $$2 = $$0.a(kr.k, dbc.a);

      for (Entry<jn<daw>> $$3 : $$2.b()) {
         jn<daw> $$4 = (jn<daw>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cvl $$0, kq<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((daw)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cvl $$0, kq<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cvl $$0, kq<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((daw)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dav> a(kq<?> $$0, buf $$1, Predicate<cvl> $$2) {
      List<dav> $$3 = new ArrayList<>();

      for (btr $$4 : btr.values()) {
         cvl $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dbc $$6 = $$5.a(kr.k, dbc.a);

            for (Entry<jn<daw>> $$7 : $$6.b()) {
               jn<daw> $$8 = (jn<daw>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dav($$5, $$4, $$1));
               }
            }
         }
      }

      return ad.b($$3, $$1.dV());
   }

   public static int a(azk $$0, int $$1, int $$2, cvl $$3) {
      if ($$3.N() <= 0) {
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

   public static cvl a(azk $$0, cvl $$1, int $$2, kb $$3, Optional<? extends jr<daw>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jn<daw>>>map(jr::a).orElseGet(() -> $$3.d(lv.aL).i().map($$0xx -> $$0xx)));
   }

   public static cvl a(azk $$0, cvl $$1, int $$2, Stream<jn<daw>> $$3) {
      List<daz> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cvo.qQ)) {
         $$1 = new cvl(cvo.uy);
      }

      for (daz $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<daz> b(azk $$0, cvl $$1, int $$2, Stream<jn<daw>> $$3) {
      List<daz> $$4 = Lists.newArrayList();
      int $$5 = $$1.N();
      if ($$5 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5 / 4 + 1) + $$0.a($$5 / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azc.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<daz> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bpx.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ad.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bpx.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<daz> $$0, daz $$1) {
      $$0.removeIf($$1x -> !daw.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jn<daw>> $$0, jn<daw> $$1) {
      for (jn<daw> $$2 : $$0) {
         if (!daw.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<daz> a(int $$0, cvl $$1, Stream<jn<daw>> $$2) {
      List<daz> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cvo.qQ);
      $$2.filter($$2x -> ((daw)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         daw $$3x = (daw)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new daz($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cvl $$0, kb $$1, ala<dce> $$2, bri $$3, azk $$4) {
      dce $$5 = $$1.d(lv.aM).a($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jn<daw> var1, int var2, dav var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jn<daw> var1, int var2);
   }
}
