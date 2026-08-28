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

public class dgc {
   public static int a(jf<dga> $$0, czn $$1) {
      dgg $$2 = $$1.a(kk.l, dgg.a);
      return $$2.a($$0);
   }

   public static dgg a(czn $$0, Consumer<dgg.a> $$1) {
      kj<dgg> $$2 = d($$0);
      dgg $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dgg.a;
      } else {
         dgg.a $$4 = new dgg.a($$3);
         $$1.accept($$4);
         dgg $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(czn $$0) {
      return $$0.c(d($$0));
   }

   public static void a(czn $$0, dgg $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dgg b(czn $$0) {
      return $$0.a(d($$0), dgg.a);
   }

   private static kj<dgg> d(czn $$0) {
      return $$0.a(czr.vG) ? kk.J : kk.l;
   }

   public static boolean c(czn $$0) {
      return !$$0.a(kk.l, dgg.a).d() || !$$0.a(kk.J, dgg.a).d();
   }

   public static int a(arq $$0, czn $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dga)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arq $$0, czn $$1, czn $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dga)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arq $$0, czn $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dga)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arq $$0, @Nullable bwi $$1, bwi $$2, int $$3) {
      if ($$1 instanceof bxj $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dga)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static czn a(dgd $$0) {
      czn $$1 = new czn(czr.vG);
      $$1.a($$0.b(), $$0.c());
      return $$1;
   }

   private static void a(czn $$0, dgc.b $$1) {
      dgg $$2 = $$0.a(kk.l, dgg.a);

      for (Entry<jf<dga>> $$3 : $$2.b()) {
         $$1.accept((jf<dga>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(czn $$0, bws $$1, bxj $$2, dgc.a $$3) {
      if (!$$0.f()) {
         dgg $$4 = $$0.a(kk.l);
         if ($$4 != null && !$$4.d()) {
            dfz $$5 = new dfz($$0, $$1, $$2);

            for (Entry<jf<dga>> $$6 : $$4.b()) {
               jf<dga> $$7 = (jf<dga>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bxj $$0, dgc.a $$1) {
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

   public static float a(arq $$0, czn $$1, bwi $$2, bux $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dga)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arq $$0, czn $$1, bwi $$2, bux $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dga)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arq $$0, czn $$1, bwi $$2, bux $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dga)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arq $$0, czn $$1, bwi $$2, bux $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dga)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arq $$0, bwi $$1, bux $$2) {
      if ($$2.d() instanceof bxj $$3) {
         a($$0, $$1, $$2, $$3.dY());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arq $$0, bwi $$1, bux $$2, @Nullable czn $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arq $$0, bwi $$1, bux $$2, @Nullable czn $$3, @Nullable Consumer<czj> $$4) {
      if ($$1 instanceof bxj $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dga)$$3x.a()).a($$0, $$4x, $$5x, dge.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bxj $$6) {
            a($$3, bws.a, $$6, ($$3x, $$4x, $$5) -> ((dga)$$3x.a()).a($$0, $$4x, $$5, dge.a, $$1, $$2));
         } else if ($$4 != null) {
            dfz $$7 = new dfz($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dga)$$4x.a()).a($$0, $$5, $$7, dge.a, $$1, $$2));
         }
      }
   }

   public static void a(arq $$0, bxj $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arq $$0, czn $$1, bxj $$2, bws $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dga)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bxj $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(czn $$0, bxj $$1, bws $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dga)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arq $$0, bxj $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bwi)$$1));
   }

   public static int a(jf<dga> $$0, bxj $$1) {
      Iterable<czn> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (czn $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arq $$0, czn $$1, bwi $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dga)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arq $$0, czn $$1, bwi $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dga)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arq $$0, czn $$1, czn $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dga)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arq $$0, czn $$1, csh $$2, Consumer<czj> $$3) {
      bxj $$5 = $$2.q() instanceof bxj $$4 ? $$4 : null;
      dfz $$6 = new dfz($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dga)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arq $$0, czn $$1, @Nullable bxj $$2, bwi $$3, @Nullable bws $$4, ffc $$5, eat $$6, Consumer<czj> $$7) {
      dfz $$8 = new dfz($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dga)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arq $$0, czn $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dga)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arq $$0, bxj $$1, bux $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azv $$5 = $$1.dX();
      a($$1, ($$5x, $$6, $$7x) -> {
         ezt $$8 = dga.b($$0, $$6, $$1, $$2);
         ((dga)$$5x.a()).a(dgb.m).forEach($$4xx -> {
            if ($$4xx.a() == dge.c && $$4xx.b() == dge.c && $$4xx.a($$8)) {
               $$4.setValue(((dgt)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bxj $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            ezt $$8 = dga.b($$0, $$6, $$1, $$2);
            ((dga)$$5x.a()).a(dgb.m).forEach($$4xx -> {
               if ($$4xx.a() == dge.a && $$4xx.b() == dge.c && $$4xx.a($$8)) {
                  $$4.setValue(((dgt)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(czn $$0, bwt $$1, BiConsumer<jf<byk>, byn> $$2) {
      a($$0, ($$2x, $$3) -> ((dga)$$2x.a()).a(dgb.l).forEach($$4 -> {
            if (((dga)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(czn $$0, bws $$1, BiConsumer<jf<byk>, byn> $$2) {
      a($$0, ($$2x, $$3) -> ((dga)$$2x.a()).a(dgb.l).forEach($$4 -> {
            if (((dga)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arq $$0, czn $$1, bwi $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arq $$0, czn $$1, bwi $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arq $$0, czn $$1, bwi $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(czn $$0, bxj $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dga)$$2x.a()).b($$1.dX(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(czn $$0, bxj $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dga)$$2x.a()).a($$1.dX(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(czn $$0, axr<dga> $$1) {
      dgg $$2 = $$0.a(kk.l, dgg.a);

      for (Entry<jf<dga>> $$3 : $$2.b()) {
         jf<dga> $$4 = (jf<dga>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(czn $$0, kj<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dga)$$2x.a()).i().c($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(czn $$0, kj<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(czn $$0, kj<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dga)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dfz> a(kj<?> $$0, bxj $$1, Predicate<czn> $$2) {
      List<dfz> $$3 = new ArrayList<>();

      for (bws $$4 : bws.j) {
         czn $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dgg $$6 = $$5.a(kk.l, dgg.a);

            for (Entry<jf<dga>> $$7 : $$6.b()) {
               jf<dga> $$8 = (jf<dga>)$$7.getKey();
               if ($$8.a().i().c($$0) && $$8.a().a($$4)) {
                  $$3.add(new dfz($$5, $$4, $$1));
               }
            }
         }
      }

      return ag.b($$3, $$1.dX());
   }

   public static int a(azv $$0, int $$1, int $$2, czn $$3) {
      dfy $$4 = $$3.a(kk.C);
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

   public static czn a(azv $$0, czn $$1, int $$2, jt $$3, Optional<? extends jj<dga>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jf<dga>>>map(jj::a).orElseGet(() -> $$3.f(mh.aR).c().map($$0xx -> $$0xx)));
   }

   public static czn a(azv $$0, czn $$1, int $$2, Stream<jf<dga>> $$3) {
      List<dgd> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(czr.rF)) {
         $$1 = new czn(czr.vG);
      }

      for (dgd $$5 : $$4) {
         $$1.a($$5.b(), $$5.c());
      }

      return $$1;
   }

   public static List<dgd> b(azv $$0, czn $$1, int $$2, Stream<jf<dga>> $$3) {
      List<dgd> $$4 = Lists.newArrayList();
      dfy $$5 = $$1.a(kk.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azm.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dgd> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bsr.a($$0, $$7, dgd::a).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ag.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bsr.a($$0, $$7, dgd::a).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dgd> $$0, dgd $$1) {
      $$0.removeIf($$1x -> !dga.a($$1.b(), $$1x.b()));
   }

   public static boolean a(Collection<jf<dga>> $$0, jf<dga> $$1) {
      for (jf<dga> $$2 : $$0) {
         if (!dga.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dgd> a(int $$0, czn $$1, Stream<jf<dga>> $$2) {
      List<dgd> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(czr.rF);
      $$2.filter($$2x -> ((dga)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dga $$3x = (dga)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dgd($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(czn $$0, jt $$1, alf<dhi> $$2, bue $$3, azv $$4) {
      dhi $$5 = $$1.f(mh.aQ).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jf<dga> var1, int var2, dfz var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jf<dga> var1, int var2);
   }
}
