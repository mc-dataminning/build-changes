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

public class dfz {
   public static int a(jf<dfx> $$0, czk $$1) {
      dgd $$2 = $$1.a(kk.l, dgd.a);
      return $$2.a($$0);
   }

   public static dgd a(czk $$0, Consumer<dgd.a> $$1) {
      kj<dgd> $$2 = d($$0);
      dgd $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dgd.a;
      } else {
         dgd.a $$4 = new dgd.a($$3);
         $$1.accept($$4);
         dgd $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(czk $$0) {
      return $$0.c(d($$0));
   }

   public static void a(czk $$0, dgd $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dgd b(czk $$0) {
      return $$0.a(d($$0), dgd.a);
   }

   private static kj<dgd> d(czk $$0) {
      return $$0.a(czo.vG) ? kk.J : kk.l;
   }

   public static boolean c(czk $$0) {
      return !$$0.a(kk.l, dgd.a).d() || !$$0.a(kk.J, dgd.a).d();
   }

   public static int a(arq $$0, czk $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dfx)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arq $$0, czk $$1, czk $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dfx)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arq $$0, czk $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dfx)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arq $$0, @Nullable bwi $$1, bwi $$2, int $$3) {
      if ($$1 instanceof bxj $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dfx)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static czk a(dga $$0) {
      czk $$1 = new czk(czo.vG);
      $$1.a($$0.b(), $$0.c());
      return $$1;
   }

   private static void a(czk $$0, dfz.b $$1) {
      dgd $$2 = $$0.a(kk.l, dgd.a);

      for (Entry<jf<dfx>> $$3 : $$2.b()) {
         $$1.accept((jf<dfx>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(czk $$0, bws $$1, bxj $$2, dfz.a $$3) {
      if (!$$0.f()) {
         dgd $$4 = $$0.a(kk.l);
         if ($$4 != null && !$$4.d()) {
            dfw $$5 = new dfw($$0, $$1, $$2);

            for (Entry<jf<dfx>> $$6 : $$4.b()) {
               jf<dfx> $$7 = (jf<dfx>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bxj $$0, dfz.a $$1) {
      for (bws $$2 : bws.j) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arq $$0, bxj $$1, bux $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arq $$0, bxj $$1, bux $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arq $$0, czk $$1, bwi $$2, bux $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfx)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arq $$0, czk $$1, bwi $$2, bux $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfx)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arq $$0, czk $$1, bwi $$2, bux $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfx)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arq $$0, czk $$1, bwi $$2, bux $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dfx)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arq $$0, bwi $$1, bux $$2) {
      if ($$2.d() instanceof bxj $$3) {
         a($$0, $$1, $$2, $$3.dY());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arq $$0, bwi $$1, bux $$2, @Nullable czk $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arq $$0, bwi $$1, bux $$2, @Nullable czk $$3, @Nullable Consumer<czg> $$4) {
      if ($$1 instanceof bxj $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dfx)$$3x.a()).a($$0, $$4x, $$5x, dgb.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bxj $$6) {
            a($$3, bws.a, $$6, ($$3x, $$4x, $$5) -> ((dfx)$$3x.a()).a($$0, $$4x, $$5, dgb.a, $$1, $$2));
         } else if ($$4 != null) {
            dfw $$7 = new dfw($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dfx)$$4x.a()).a($$0, $$5, $$7, dgb.a, $$1, $$2));
         }
      }
   }

   public static void a(arq $$0, bxj $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arq $$0, czk $$1, bxj $$2, bws $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dfx)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bxj $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(czk $$0, bxj $$1, bws $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dfx)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arq $$0, bxj $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bwi)$$1));
   }

   public static int a(jf<dfx> $$0, bxj $$1) {
      Iterable<czk> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (czk $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arq $$0, czk $$1, bwi $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dfx)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arq $$0, czk $$1, bwi $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dfx)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arq $$0, czk $$1, czk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dfx)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arq $$0, czk $$1, cse $$2, Consumer<czg> $$3) {
      bxj $$5 = $$2.q() instanceof bxj $$4 ? $$4 : null;
      dfw $$6 = new dfw($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dfx)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arq $$0, czk $$1, @Nullable bxj $$2, bwi $$3, @Nullable bws $$4, fex $$5, eao $$6, Consumer<czg> $$7) {
      dfw $$8 = new dfw($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dfx)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arq $$0, czk $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dfx)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arq $$0, bxj $$1, bux $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azv $$5 = $$1.dX();
      a($$1, ($$5x, $$6, $$7x) -> {
         ezo $$8 = dfx.b($$0, $$6, $$1, $$2);
         ((dfx)$$5x.a()).a(dfy.m).forEach($$4xx -> {
            if ($$4xx.a() == dgb.c && $$4xx.b() == dgb.c && $$4xx.a($$8)) {
               $$4.setValue(((dgq)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bxj $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            ezo $$8 = dfx.b($$0, $$6, $$1, $$2);
            ((dfx)$$5x.a()).a(dfy.m).forEach($$4xx -> {
               if ($$4xx.a() == dgb.a && $$4xx.b() == dgb.c && $$4xx.a($$8)) {
                  $$4.setValue(((dgq)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(czk $$0, bwt $$1, BiConsumer<jf<byk>, byn> $$2) {
      a($$0, ($$2x, $$3) -> ((dfx)$$2x.a()).a(dfy.l).forEach($$4 -> {
            if (((dfx)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(czk $$0, bws $$1, BiConsumer<jf<byk>, byn> $$2) {
      a($$0, ($$2x, $$3) -> ((dfx)$$2x.a()).a(dfy.l).forEach($$4 -> {
            if (((dfx)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arq $$0, czk $$1, bwi $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arq $$0, czk $$1, bwi $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arq $$0, czk $$1, bwi $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(czk $$0, bxj $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dfx)$$2x.a()).b($$1.dX(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(czk $$0, bxj $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dfx)$$2x.a()).a($$1.dX(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(czk $$0, axr<dfx> $$1) {
      dgd $$2 = $$0.a(kk.l, dgd.a);

      for (Entry<jf<dfx>> $$3 : $$2.b()) {
         jf<dfx> $$4 = (jf<dfx>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(czk $$0, kj<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dfx)$$2x.a()).i().c($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(czk $$0, kj<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(czk $$0, kj<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dfx)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dfw> a(kj<?> $$0, bxj $$1, Predicate<czk> $$2) {
      List<dfw> $$3 = new ArrayList<>();

      for (bws $$4 : bws.j) {
         czk $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dgd $$6 = $$5.a(kk.l, dgd.a);

            for (Entry<jf<dfx>> $$7 : $$6.b()) {
               jf<dfx> $$8 = (jf<dfx>)$$7.getKey();
               if ($$8.a().i().c($$0) && $$8.a().a($$4)) {
                  $$3.add(new dfw($$5, $$4, $$1));
               }
            }
         }
      }

      return ag.b($$3, $$1.dX());
   }

   public static int a(azv $$0, int $$1, int $$2, czk $$3) {
      dfv $$4 = $$3.a(kk.C);
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

   public static czk a(azv $$0, czk $$1, int $$2, jt $$3, Optional<? extends jj<dfx>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jf<dfx>>>map(jj::a).orElseGet(() -> $$3.f(mh.aR).c().map($$0xx -> $$0xx)));
   }

   public static czk a(azv $$0, czk $$1, int $$2, Stream<jf<dfx>> $$3) {
      List<dga> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(czo.rF)) {
         $$1 = new czk(czo.vG);
      }

      for (dga $$5 : $$4) {
         $$1.a($$5.b(), $$5.c());
      }

      return $$1;
   }

   public static List<dga> b(azv $$0, czk $$1, int $$2, Stream<jf<dfx>> $$3) {
      List<dga> $$4 = Lists.newArrayList();
      dfv $$5 = $$1.a(kk.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azm.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dga> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bsr.a($$0, $$7, dga::a).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ag.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bsr.a($$0, $$7, dga::a).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dga> $$0, dga $$1) {
      $$0.removeIf($$1x -> !dfx.a($$1.b(), $$1x.b()));
   }

   public static boolean a(Collection<jf<dfx>> $$0, jf<dfx> $$1) {
      for (jf<dfx> $$2 : $$0) {
         if (!dfx.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dga> a(int $$0, czk $$1, Stream<jf<dfx>> $$2) {
      List<dga> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(czo.rF);
      $$2.filter($$2x -> ((dfx)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dfx $$3x = (dfx)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dga($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(czk $$0, jt $$1, alf<dhf> $$2, bue $$3, azv $$4) {
      dhf $$5 = $$1.f(mh.aQ).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jf<dfx> var1, int var2, dfw var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jf<dfx> var1, int var2);
   }
}
