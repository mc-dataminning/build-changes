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

public class dcz {
   public static int a(jr<dcx> $$0, cwn $$1) {
      ddd $$2 = $$1.a(kv.l, ddd.a);
      return $$2.a($$0);
   }

   public static ddd a(cwn $$0, Consumer<ddd.a> $$1) {
      ku<ddd> $$2 = d($$0);
      ddd $$3 = $$0.a($$2);
      if ($$3 == null) {
         return ddd.a;
      } else {
         ddd.a $$4 = new ddd.a($$3);
         $$1.accept($$4);
         ddd $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cwn $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cwn $$0, ddd $$1) {
      $$0.b(d($$0), $$1);
   }

   public static ddd b(cwn $$0) {
      return $$0.a(d($$0), ddd.a);
   }

   private static ku<ddd> d(cwn $$0) {
      return $$0.a(cwr.vv) ? kv.I : kv.l;
   }

   public static boolean c(cwn $$0) {
      return !$$0.a(kv.l, ddd.a).d() || !$$0.a(kv.I, ddd.a).d();
   }

   public static int a(arc $$0, cwn $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcx)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arc $$0, cwn $$1, cwn $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dcx)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arc $$0, cwn $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcx)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arc $$0, @Nullable buj $$1, buj $$2, int $$3) {
      if ($$1 instanceof bvf $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dcx)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cwn a(dda $$0) {
      cwn $$1 = new cwn(cwr.vv);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cwn $$0, dcz.b $$1) {
      ddd $$2 = $$0.a(kv.l, ddd.a);

      for (Entry<jr<dcx>> $$3 : $$2.b()) {
         $$1.accept((jr<dcx>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cwn $$0, bur $$1, bvf $$2, dcz.a $$3) {
      if (!$$0.f()) {
         ddd $$4 = $$0.a(kv.l);
         if ($$4 != null && !$$4.d()) {
            dcw $$5 = new dcw($$0, $$1, $$2);

            for (Entry<jr<dcx>> $$6 : $$4.b()) {
               jr<dcx> $$7 = (jr<dcx>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bvf $$0, dcz.a $$1) {
      for (bur $$2 : bur.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arc $$0, bvf $$1, bsz $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arc $$0, bvf $$1, bsz $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arc $$0, cwn $$1, buj $$2, bsz $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcx)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arc $$0, cwn $$1, buj $$2, bsz $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcx)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arc $$0, cwn $$1, buj $$2, bsz $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcx)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arc $$0, cwn $$1, buj $$2, bsz $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcx)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arc $$0, buj $$1, bsz $$2) {
      if ($$2.d() instanceof bvf $$3) {
         a($$0, $$1, $$2, $$3.ea());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arc $$0, buj $$1, bsz $$2, @Nullable cwn $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arc $$0, buj $$1, bsz $$2, @Nullable cwn $$3, @Nullable Consumer<cwj> $$4) {
      if ($$1 instanceof bvf $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dcx)$$3x.a()).a($$0, $$4x, $$5x, ddb.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bvf $$6) {
            a($$3, bur.a, $$6, ($$3x, $$4x, $$5) -> ((dcx)$$3x.a()).a($$0, $$4x, $$5, ddb.a, $$1, $$2));
         } else if ($$4 != null) {
            dcw $$7 = new dcw($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dcx)$$4x.a()).a($$0, $$5, $$7, ddb.a, $$1, $$2));
         }
      }
   }

   public static void a(arc $$0, bvf $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arc $$0, cwn $$1, bvf $$2, bur $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dcx)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bvf $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cwn $$0, bvf $$1, bur $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dcx)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arc $$0, bvf $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (buj)$$1));
   }

   public static int a(jr<dcx> $$0, bvf $$1) {
      Iterable<cwn> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cwn $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arc $$0, cwn $$1, buj $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dcx)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arc $$0, cwn $$1, buj $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dcx)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arc $$0, cwn $$1, cwn $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dcx)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arc $$0, cwn $$1, cpo $$2, Consumer<cwj> $$3) {
      bvf $$5 = $$2.p() instanceof bvf $$4 ? $$4 : null;
      dcw $$6 = new dcw($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dcx)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arc $$0, cwn $$1, @Nullable bvf $$2, buj $$3, @Nullable bur $$4, fay $$5, dwv $$6, Consumer<cwj> $$7) {
      dcw $$8 = new dcw($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dcx)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arc $$0, cwn $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcx)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arc $$0, bvf $$1, bsz $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azg $$5 = $$1.dZ();
      a($$1, ($$5x, $$6, $$7x) -> {
         evp $$8 = dcx.b($$0, $$6, $$1, $$2);
         ((dcx)$$5x.a()).a(dcy.m).forEach($$4xx -> {
            if ($$4xx.a() == ddb.c && $$4xx.b() == ddb.c && $$4xx.a($$8)) {
               $$4.setValue(((ddq)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bvf $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            evp $$8 = dcx.b($$0, $$6, $$1, $$2);
            ((dcx)$$5x.a()).a(dcy.m).forEach($$4xx -> {
               if ($$4xx.a() == ddb.a && $$4xx.b() == ddb.c && $$4xx.a($$8)) {
                  $$4.setValue(((ddq)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cwn $$0, bus $$1, BiConsumer<jr<bwi>, bwl> $$2) {
      a($$0, ($$2x, $$3) -> ((dcx)$$2x.a()).a(dcy.l).forEach($$4 -> {
            if (((dcx)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cwn $$0, bur $$1, BiConsumer<jr<bwi>, bwl> $$2) {
      a($$0, ($$2x, $$3) -> ((dcx)$$2x.a()).a(dcy.l).forEach($$4 -> {
            if (((dcx)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arc $$0, cwn $$1, buj $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arc $$0, cwn $$1, buj $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arc $$0, cwn $$1, buj $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cwn $$0, bvf $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dcx)$$2x.a()).b($$1.dZ(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cwn $$0, bvf $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dcx)$$2x.a()).a($$1.dZ(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cwn $$0, axe<dcx> $$1) {
      ddd $$2 = $$0.a(kv.l, ddd.a);

      for (Entry<jr<dcx>> $$3 : $$2.b()) {
         jr<dcx> $$4 = (jr<dcx>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cwn $$0, ku<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dcx)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cwn $$0, ku<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cwn $$0, ku<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dcx)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dcw> a(ku<?> $$0, bvf $$1, Predicate<cwn> $$2) {
      List<dcw> $$3 = new ArrayList<>();

      for (bur $$4 : bur.i) {
         cwn $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            ddd $$6 = $$5.a(kv.l, ddd.a);

            for (Entry<jr<dcx>> $$7 : $$6.b()) {
               jr<dcx> $$8 = (jr<dcx>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dcw($$5, $$4, $$1));
               }
            }
         }
      }

      return af.b($$3, $$1.dZ());
   }

   public static int a(azg $$0, int $$1, int $$2, cwn $$3) {
      dcv $$4 = $$3.a(kv.C);
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

   public static cwn a(azg $$0, cwn $$1, int $$2, kf $$3, Optional<? extends jv<dcx>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jr<dcx>>>map(jv::a).orElseGet(() -> $$3.e(mc.aO).c().map($$0xx -> $$0xx)));
   }

   public static cwn a(azg $$0, cwn $$1, int $$2, Stream<jr<dcx>> $$3) {
      List<dda> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cwr.rw)) {
         $$1 = new cwn(cwr.vv);
      }

      for (dda $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<dda> b(azg $$0, cwn $$1, int $$2, Stream<jr<dcx>> $$3) {
      List<dda> $$4 = Lists.newArrayList();
      dcv $$5 = $$1.a(kv.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ayy.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dda> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bqt.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, af.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bqt.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dda> $$0, dda $$1) {
      $$0.removeIf($$1x -> !dcx.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jr<dcx>> $$0, jr<dcx> $$1) {
      for (jr<dcx> $$2 : $$0) {
         if (!dcx.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dda> a(int $$0, cwn $$1, Stream<jr<dcx>> $$2) {
      List<dda> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cwr.rw);
      $$2.filter($$2x -> ((dcx)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dcx $$3x = (dcx)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dda($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cwn $$0, kf $$1, akt<def> $$2, bsg $$3, azg $$4) {
      def $$5 = $$1.e(mc.aP).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jr<dcx> var1, int var2, dcw var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jr<dcx> var1, int var2);
   }
}
