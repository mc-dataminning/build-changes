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

public class dgz {
   public static int a(jg<dgx> $$0, dak $$1) {
      dhd $$2 = $$1.a(kl.l, dhd.a);
      return $$2.a($$0);
   }

   public static dhd a(dak $$0, Consumer<dhd.a> $$1) {
      kk<dhd> $$2 = d($$0);
      dhd $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dhd.a;
      } else {
         dhd.a $$4 = new dhd.a($$3);
         $$1.accept($$4);
         dhd $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(dak $$0) {
      return $$0.c(d($$0));
   }

   public static void a(dak $$0, dhd $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dhd b(dak $$0) {
      return $$0.a(d($$0), dhd.a);
   }

   private static kk<dhd> d(dak $$0) {
      return $$0.a(dao.vG) ? kl.J : kl.l;
   }

   public static boolean c(dak $$0) {
      return !$$0.a(kl.l, dhd.a).d() || !$$0.a(kl.J, dhd.a).d();
   }

   public static int a(asb $$0, dak $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dgx)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(asb $$0, dak $$1, dak $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dgx)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(asb $$0, dak $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dgx)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(asb $$0, @Nullable bxe $$1, bxe $$2, int $$3) {
      if ($$1 instanceof byf $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dgx)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static dak a(dha $$0) {
      dak $$1 = new dak(dao.vG);
      $$1.a($$0.b(), $$0.c());
      return $$1;
   }

   private static void a(dak $$0, dgz.b $$1) {
      dhd $$2 = $$0.a(kl.l, dhd.a);

      for (Entry<jg<dgx>> $$3 : $$2.b()) {
         $$1.accept((jg<dgx>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(dak $$0, bxo $$1, byf $$2, dgz.a $$3) {
      if (!$$0.f()) {
         dhd $$4 = $$0.a(kl.l);
         if ($$4 != null && !$$4.d()) {
            dgw $$5 = new dgw($$0, $$1, $$2);

            for (Entry<jg<dgx>> $$6 : $$4.b()) {
               jg<dgx> $$7 = (jg<dgx>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(byf $$0, dgz.a $$1) {
      for (bxo $$2 : bxo.j) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(asb $$0, byf $$1, bvt $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(asb $$0, byf $$1, bvt $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(asb $$0, dak $$1, bxe $$2, bvt $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgx)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(asb $$0, dak $$1, bxe $$2, bvt $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgx)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(asb $$0, dak $$1, bxe $$2, bvt $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgx)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(asb $$0, dak $$1, bxe $$2, bvt $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgx)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(asb $$0, bxe $$1, bvt $$2) {
      if ($$2.d() instanceof byf $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(asb $$0, bxe $$1, bvt $$2, @Nullable dak $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(asb $$0, bxe $$1, bvt $$2, @Nullable dak $$3, @Nullable Consumer<dag> $$4) {
      if ($$1 instanceof byf $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dgx)$$3x.a()).a($$0, $$4x, $$5x, dhb.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof byf $$6) {
            a($$3, bxo.a, $$6, ($$3x, $$4x, $$5) -> ((dgx)$$3x.a()).a($$0, $$4x, $$5, dhb.a, $$1, $$2));
         } else if ($$4 != null) {
            dgw $$7 = new dgw($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dgx)$$4x.a()).a($$0, $$5, $$7, dhb.a, $$1, $$2));
         }
      }
   }

   public static void a(asb $$0, byf $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(asb $$0, dak $$1, byf $$2, bxo $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dgx)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(byf $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(dak $$0, byf $$1, bxo $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dgx)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(asb $$0, byf $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bxe)$$1));
   }

   public static int a(jg<dgx> $$0, byf $$1) {
      Iterable<dak> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (dak $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(asb $$0, dak $$1, bxe $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dgx)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(asb $$0, dak $$1, bxe $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dgx)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(asb $$0, dak $$1, dak $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dgx)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(asb $$0, dak $$1, ctd $$2, Consumer<dag> $$3) {
      byf $$5 = $$2.q() instanceof byf $$4 ? $$4 : null;
      dgw $$6 = new dgw($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dgx)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(asb $$0, dak $$1, @Nullable byf $$2, bxe $$3, @Nullable bxo $$4, fgc $$5, ebq $$6, Consumer<dag> $$7) {
      dgw $$8 = new dgw($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dgx)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(asb $$0, dak $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dgx)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(asb $$0, byf $$1, bvt $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      bai $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         fat $$8 = dgx.b($$0, $$6, $$1, $$2);
         ((dgx)$$5x.a()).a(dgy.m).forEach($$4xx -> {
            if ($$4xx.a() == dhb.c && $$4xx.b() == dhb.c && $$4xx.a($$8)) {
               $$4.setValue(((dhq)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof byf $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            fat $$8 = dgx.b($$0, $$6, $$1, $$2);
            ((dgx)$$5x.a()).a(dgy.m).forEach($$4xx -> {
               if ($$4xx.a() == dhb.a && $$4xx.b() == dhb.c && $$4xx.a($$8)) {
                  $$4.setValue(((dhq)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(dak $$0, bxp $$1, BiConsumer<jg<bzg>, bzj> $$2) {
      a($$0, ($$2x, $$3) -> ((dgx)$$2x.a()).a(dgy.l).forEach($$4 -> {
            if (((dgx)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(dak $$0, bxo $$1, BiConsumer<jg<bzg>, bzj> $$2) {
      a($$0, ($$2x, $$3) -> ((dgx)$$2x.a()).a(dgy.l).forEach($$4 -> {
            if (((dgx)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(asb $$0, dak $$1, bxe $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(asb $$0, dak $$1, bxe $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(asb $$0, dak $$1, bxe $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(dak $$0, byf $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dgx)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(dak $$0, byf $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dgx)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(dak $$0, ayc<dgx> $$1) {
      dhd $$2 = $$0.a(kl.l, dhd.a);

      for (Entry<jg<dgx>> $$3 : $$2.b()) {
         jg<dgx> $$4 = (jg<dgx>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(dak $$0, kk<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dgx)$$2x.a()).i().c($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(dak $$0, kk<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(dak $$0, kk<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dgx)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dgw> a(kk<?> $$0, byf $$1, Predicate<dak> $$2) {
      List<dgw> $$3 = new ArrayList<>();

      for (bxo $$4 : bxo.j) {
         dak $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dhd $$6 = $$5.a(kl.l, dhd.a);

            for (Entry<jg<dgx>> $$7 : $$6.b()) {
               jg<dgx> $$8 = (jg<dgx>)$$7.getKey();
               if ($$8.a().i().c($$0) && $$8.a().a($$4)) {
                  $$3.add(new dgw($$5, $$4, $$1));
               }
            }
         }
      }

      return ag.b($$3, $$1.dY());
   }

   public static int a(bai $$0, int $$1, int $$2, dak $$3) {
      dgv $$4 = $$3.a(kl.C);
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

   public static dak a(bai $$0, dak $$1, int $$2, ju $$3, Optional<? extends jk<dgx>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jg<dgx>>>map(jk::a).orElseGet(() -> $$3.f(mi.aR).c().map($$0xx -> $$0xx)));
   }

   public static dak a(bai $$0, dak $$1, int $$2, Stream<jg<dgx>> $$3) {
      List<dha> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(dao.rF)) {
         $$1 = new dak(dao.vG);
      }

      for (dha $$5 : $$4) {
         $$1.a($$5.b(), $$5.c());
      }

      return $$1;
   }

   public static List<dha> b(bai $$0, dak $$1, int $$2, Stream<jg<dgx>> $$3) {
      List<dha> $$4 = Lists.newArrayList();
      dgv $$5 = $$1.a(kl.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azz.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dha> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            btn.a($$0, $$7, dha::a).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ag.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               btn.a($$0, $$7, dha::a).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dha> $$0, dha $$1) {
      $$0.removeIf($$1x -> !dgx.a($$1.b(), $$1x.b()));
   }

   public static boolean a(Collection<jg<dgx>> $$0, jg<dgx> $$1) {
      for (jg<dgx> $$2 : $$0) {
         if (!dgx.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dha> a(int $$0, dak $$1, Stream<jg<dgx>> $$2) {
      List<dha> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(dao.rF);
      $$2.filter($$2x -> ((dgx)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dgx $$3x = (dgx)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dha($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(dak $$0, ju $$1, alq<dif> $$2, bva $$3, bai $$4) {
      dif $$5 = $$1.f(mi.aQ).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jg<dgx> var1, int var2, dgw var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jg<dgx> var1, int var2);
   }
}
