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

public class dac {
   public static int a(jm<daa> $$0, cuo $$1) {
      dag $$2 = $$1.a(kq.k, dag.a);
      return $$2.a($$0);
   }

   public static dag a(cuo $$0, Consumer<dag.a> $$1) {
      kp<dag> $$2 = d($$0);
      dag $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dag.a;
      } else {
         dag.a $$4 = new dag.a($$3);
         $$1.accept($$4);
         dag $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cuo $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cuo $$0, dag $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dag b(cuo $$0) {
      return $$0.a(d($$0), dag.a);
   }

   private static kp<dag> d(cuo $$0) {
      return $$0.a(cur.uw) ? kq.y : kq.k;
   }

   public static boolean c(cuo $$0) {
      return !$$0.a(kq.k, dag.a).d() || !$$0.a(kq.y, dag.a).d();
   }

   public static int a(aqt $$0, cuo $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((daa)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aqt $$0, cuo $$1, cuo $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((daa)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(aqt $$0, cuo $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((daa)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aqt $$0, @Nullable bsq $$1, bsq $$2, int $$3) {
      if ($$1 instanceof btl $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((daa)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   private static void a(cuo $$0, dac.b $$1) {
      dag $$2 = $$0.a(kq.k, dag.a);

      for (Entry<jm<daa>> $$3 : $$2.b()) {
         $$1.accept((jm<daa>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cuo $$0, bsx $$1, btl $$2, dac.a $$3) {
      if (!$$0.e()) {
         dag $$4 = $$0.a(kq.k);
         if ($$4 != null && !$$4.d()) {
            czz $$5 = new czz($$0, $$1, $$2);

            for (Entry<jm<daa>> $$6 : $$4.b()) {
               jm<daa> $$7 = (jm<daa>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(btl $$0, dac.a $$1) {
      for (bsx $$2 : bsx.values()) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(aqt $$0, btl $$1, brj $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(aqt $$0, btl $$1, brj $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(aqt $$0, cuo $$1, bsq $$2, brj $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((daa)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(aqt $$0, cuo $$1, bsq $$2, brj $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((daa)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(aqt $$0, cuo $$1, bsq $$2, brj $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((daa)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(aqt $$0, cuo $$1, bsq $$2, brj $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((daa)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(aqt $$0, bsq $$1, brj $$2) {
      if ($$2.d() instanceof btl $$3) {
         a($$0, $$1, $$2, $$3.eU());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(aqt $$0, bsq $$1, brj $$2, @Nullable cuo $$3) {
      if ($$1 instanceof btl $$4) {
         a($$4, ($$3x, $$4x, $$5x) -> ((daa)$$3x.a()).a($$0, $$4x, $$5x, dae.c, $$1, $$2));
      }

      if ($$3 != null && $$2.d() instanceof btl $$5) {
         a($$3, bsx.a, $$5, ($$3x, $$4, $$5x) -> ((daa)$$3x.a()).a($$0, $$4, $$5x, dae.a, $$1, $$2));
      }
   }

   public static void a(aqt $$0, btl $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(aqt $$0, cuo $$1, btl $$2, bsx $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((daa)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(btl $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cuo $$0, btl $$1, bsx $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((daa)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(aqt $$0, btl $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bsq)$$1));
   }

   public static int a(jm<daa> $$0, btl $$1) {
      Iterable<cuo> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cuo $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(aqt $$0, cuo $$1, bsq $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((daa)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(aqt $$0, cuo $$1, bsq $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((daa)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(aqt $$0, cuo $$1, cuo $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((daa)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(aqt $$0, cuo $$1, cnb $$2, Consumer<cuj> $$3) {
      btl $$5 = $$2.s() instanceof btl $$4 ? $$4 : null;
      czz $$6 = new czz($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((daa)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(aqt $$0, cuo $$1, @Nullable btl $$2, bsq $$3, @Nullable bsx $$4, eww $$5, dta $$6, Consumer<cuj> $$7) {
      czz $$8 = new czz($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((daa)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(aqt $$0, cuo $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((daa)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(aqt $$0, btl $$1, brj $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      ayv $$5 = $$1.dT();
      a($$1, ($$5x, $$6, $$7x) -> {
         erl $$8 = daa.b($$0, $$6, $$1, $$2);
         ((daa)$$5x.a()).a(dab.m).forEach($$4xx -> {
            if ($$4xx.a() == dae.c && $$4xx.b() == dae.c && $$4xx.a($$8)) {
               $$4.setValue(((das)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof btl $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            erl $$8 = daa.b($$0, $$6, $$1, $$2);
            ((daa)$$5x.a()).a(dab.m).forEach($$4xx -> {
               if ($$4xx.a() == dae.a && $$4xx.b() == dae.c && $$4xx.a($$8)) {
                  $$4.setValue(((das)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cuo $$0, bsy $$1, BiConsumer<jm<bup>, bus> $$2) {
      a($$0, ($$2x, $$3) -> ((daa)$$2x.a()).a(dab.l).forEach($$4 -> {
            if (((daa)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cuo $$0, bsx $$1, BiConsumer<jm<bup>, bus> $$2) {
      a($$0, ($$2x, $$3) -> ((daa)$$2x.a()).a(dab.l).forEach($$4 -> {
            if (((daa)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(aqt $$0, cuo $$1, bsq $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(aqt $$0, cuo $$1, bsq $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(aqt $$0, cuo $$1, bsq $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(btl $$0, float $$1) {
      MutableFloat $$2 = new MutableFloat($$1);
      a($$0, ($$2x, $$3, $$4) -> ((daa)$$2x.a()).b($$0.dT(), $$3, $$2));
      return Math.max(0.0F, $$2.floatValue());
   }

   public static float b(btl $$0) {
      MutableFloat $$1 = new MutableFloat(0.0F);
      a($$0, ($$2, $$3, $$4) -> $$2.a().a($$0.dT(), $$3, $$1));
      return $$1.floatValue();
   }

   public static boolean a(cuo $$0, awt<daa> $$1) {
      dag $$2 = $$0.a(kq.k, dag.a);

      for (Entry<jm<daa>> $$3 : $$2.b()) {
         jm<daa> $$4 = (jm<daa>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cuo $$0, kp<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((daa)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cuo $$0, kp<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cuo $$0, kp<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((daa)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<czz> a(kp<?> $$0, btl $$1, Predicate<cuo> $$2) {
      List<czz> $$3 = new ArrayList<>();

      for (bsx $$4 : bsx.values()) {
         cuo $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dag $$6 = $$5.a(kq.k, dag.a);

            for (Entry<jm<daa>> $$7 : $$6.b()) {
               jm<daa> $$8 = (jm<daa>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new czz($$5, $$4, $$1));
               }
            }
         }
      }

      return ad.b($$3, $$1.dT());
   }

   public static int a(ayv $$0, int $$1, int $$2, cuo $$3) {
      cuj $$4 = $$3.g();
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

   public static cuo a(ayv $$0, cuo $$1, int $$2, ka $$3, Optional<? extends jq<daa>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jm<daa>>>map(jq::a).orElseGet(() -> $$3.d(lu.aL).i().map($$0xx -> $$0xx)));
   }

   public static cuo a(ayv $$0, cuo $$1, int $$2, Stream<jm<daa>> $$3) {
      List<dad> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cur.qP)) {
         $$1 = new cuo(cur.uw);
      }

      for (dad $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<dad> b(ayv $$0, cuo $$1, int $$2, Stream<jm<daa>> $$3) {
      List<dad> $$4 = Lists.newArrayList();
      cuj $$5 = $$1.g();
      int $$6 = $$5.g();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ayn.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<dad> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bpd.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ad.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bpd.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dad> $$0, dad $$1) {
      $$0.removeIf($$1x -> !daa.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jm<daa>> $$0, jm<daa> $$1) {
      for (jm<daa> $$2 : $$0) {
         if (!daa.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dad> a(int $$0, cuo $$1, Stream<jm<daa>> $$2) {
      List<dad> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cur.qP);
      $$2.filter($$2x -> ((daa)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         daa $$3x = (daa)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dad($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cuo $$0, ka $$1, akp<dbh> $$2, bqo $$3, ayv $$4) {
      dbh $$5 = $$1.d(lu.aM).a($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jm<daa> var1, int var2, czz var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jm<daa> var1, int var2);
   }
}
