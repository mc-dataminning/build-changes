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

public class ddt {
   public static int a(jq<ddr> $$0, cxk $$1) {
      ddx $$2 = $$1.a(ku.l, ddx.a);
      return $$2.a($$0);
   }

   public static ddx a(cxk $$0, Consumer<ddx.a> $$1) {
      kt<ddx> $$2 = d($$0);
      ddx $$3 = $$0.a($$2);
      if ($$3 == null) {
         return ddx.a;
      } else {
         ddx.a $$4 = new ddx.a($$3);
         $$1.accept($$4);
         ddx $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cxk $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cxk $$0, ddx $$1) {
      $$0.b(d($$0), $$1);
   }

   public static ddx b(cxk $$0) {
      return $$0.a(d($$0), ddx.a);
   }

   private static kt<ddx> d(cxk $$0) {
      return $$0.a(cxo.vm) ? ku.I : ku.l;
   }

   public static boolean c(cxk $$0) {
      return !$$0.a(ku.l, ddx.a).d() || !$$0.a(ku.I, ddx.a).d();
   }

   public static int a(ash $$0, cxk $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((ddr)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(ash $$0, cxk $$1, cxk $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((ddr)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(ash $$0, cxk $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((ddr)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(ash $$0, @Nullable bvf $$1, bvf $$2, int $$3) {
      if ($$1 instanceof bwb $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((ddr)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cxk a(ddu $$0) {
      cxk $$1 = new cxk(cxo.vm);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cxk $$0, ddt.b $$1) {
      ddx $$2 = $$0.a(ku.l, ddx.a);

      for (Entry<jq<ddr>> $$3 : $$2.b()) {
         $$1.accept((jq<ddr>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cxk $$0, bvn $$1, bwb $$2, ddt.a $$3) {
      if (!$$0.f()) {
         ddx $$4 = $$0.a(ku.l);
         if ($$4 != null && !$$4.d()) {
            ddq $$5 = new ddq($$0, $$1, $$2);

            for (Entry<jq<ddr>> $$6 : $$4.b()) {
               jq<ddr> $$7 = (jq<ddr>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bwb $$0, ddt.a $$1) {
      for (bvn $$2 : bvn.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(ash $$0, bwb $$1, btv $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(ash $$0, bwb $$1, btv $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(ash $$0, cxk $$1, bvf $$2, btv $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddr)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(ash $$0, cxk $$1, bvf $$2, btv $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddr)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(ash $$0, cxk $$1, bvf $$2, btv $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddr)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(ash $$0, cxk $$1, bvf $$2, btv $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddr)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(ash $$0, bvf $$1, btv $$2) {
      if ($$2.d() instanceof bwb $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(ash $$0, bvf $$1, btv $$2, @Nullable cxk $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(ash $$0, bvf $$1, btv $$2, @Nullable cxk $$3, @Nullable Consumer<cxg> $$4) {
      if ($$1 instanceof bwb $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((ddr)$$3x.a()).a($$0, $$4x, $$5x, ddv.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bwb $$6) {
            a($$3, bvn.a, $$6, ($$3x, $$4x, $$5) -> ((ddr)$$3x.a()).a($$0, $$4x, $$5, ddv.a, $$1, $$2));
         } else if ($$4 != null) {
            ddq $$7 = new ddq($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((ddr)$$4x.a()).a($$0, $$5, $$7, ddv.a, $$1, $$2));
         }
      }
   }

   public static void a(ash $$0, bwb $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(ash $$0, cxk $$1, bwb $$2, bvn $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((ddr)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bwb $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cxk $$0, bwb $$1, bvn $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((ddr)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(ash $$0, bwb $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bvf)$$1));
   }

   public static int a(jq<ddr> $$0, bwb $$1) {
      Iterable<cxk> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cxk $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(ash $$0, cxk $$1, bvf $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((ddr)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(ash $$0, cxk $$1, bvf $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((ddr)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(ash $$0, cxk $$1, cxk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((ddr)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(ash $$0, cxk $$1, cql $$2, Consumer<cxg> $$3) {
      bwb $$5 = $$2.p() instanceof bwb $$4 ? $$4 : null;
      ddq $$6 = new ddq($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((ddr)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(ash $$0, cxk $$1, @Nullable bwb $$2, bvf $$3, @Nullable bvn $$4, fbs $$5, dxn $$6, Consumer<cxg> $$7) {
      ddq $$8 = new ddq($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((ddr)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(ash $$0, cxk $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((ddr)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(ash $$0, bwb $$1, btv $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      bam $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         ewh $$8 = ddr.b($$0, $$6, $$1, $$2);
         ((ddr)$$5x.a()).a(dds.m).forEach($$4xx -> {
            if ($$4xx.a() == ddv.c && $$4xx.b() == ddv.c && $$4xx.a($$8)) {
               $$4.setValue(((dek)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bwb $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            ewh $$8 = ddr.b($$0, $$6, $$1, $$2);
            ((ddr)$$5x.a()).a(dds.m).forEach($$4xx -> {
               if ($$4xx.a() == ddv.a && $$4xx.b() == ddv.c && $$4xx.a($$8)) {
                  $$4.setValue(((dek)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cxk $$0, bvo $$1, BiConsumer<jq<bxe>, bxh> $$2) {
      a($$0, ($$2x, $$3) -> ((ddr)$$2x.a()).a(dds.l).forEach($$4 -> {
            if (((ddr)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cxk $$0, bvn $$1, BiConsumer<jq<bxe>, bxh> $$2) {
      a($$0, ($$2x, $$3) -> ((ddr)$$2x.a()).a(dds.l).forEach($$4 -> {
            if (((ddr)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(ash $$0, cxk $$1, bvf $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(ash $$0, cxk $$1, bvf $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(ash $$0, cxk $$1, bvf $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cxk $$0, bwb $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((ddr)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cxk $$0, bwb $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((ddr)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cxk $$0, ayk<ddr> $$1) {
      ddx $$2 = $$0.a(ku.l, ddx.a);

      for (Entry<jq<ddr>> $$3 : $$2.b()) {
         jq<ddr> $$4 = (jq<ddr>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cxk $$0, kt<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((ddr)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cxk $$0, kt<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cxk $$0, kt<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((ddr)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<ddq> a(kt<?> $$0, bwb $$1, Predicate<cxk> $$2) {
      List<ddq> $$3 = new ArrayList<>();

      for (bvn $$4 : bvn.i) {
         cxk $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            ddx $$6 = $$5.a(ku.l, ddx.a);

            for (Entry<jq<ddr>> $$7 : $$6.b()) {
               jq<ddr> $$8 = (jq<ddr>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new ddq($$5, $$4, $$1));
               }
            }
         }
      }

      return ae.b($$3, $$1.dY());
   }

   public static int a(bam $$0, int $$1, int $$2, cxk $$3) {
      ddp $$4 = $$3.a(ku.C);
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

   public static cxk a(bam $$0, cxk $$1, int $$2, ke $$3, Optional<? extends ju<ddr>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jq<ddr>>>map(ju::a).orElseGet(() -> $$3.e(mb.aN).c().map($$0xx -> $$0xx)));
   }

   public static cxk a(bam $$0, cxk $$1, int $$2, Stream<jq<ddr>> $$3) {
      List<ddu> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cxo.rn)) {
         $$1 = new cxk(cxo.vm);
      }

      for (ddu $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<ddu> b(bam $$0, cxk $$1, int $$2, Stream<jq<ddr>> $$3) {
      List<ddu> $$4 = Lists.newArrayList();
      ddp $$5 = $$1.a(ku.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = bae.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<ddu> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            brp.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ae.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               brp.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<ddu> $$0, ddu $$1) {
      $$0.removeIf($$1x -> !ddr.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jq<ddr>> $$0, jq<ddr> $$1) {
      for (jq<ddr> $$2 : $$0) {
         if (!ddr.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<ddu> a(int $$0, cxk $$1, Stream<jq<ddr>> $$2) {
      List<ddu> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cxo.rn);
      $$2.filter($$2x -> ((ddr)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         ddr $$3x = (ddr)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new ddu($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cxk $$0, ke $$1, aly<dez> $$2, btc $$3, bam $$4) {
      dez $$5 = $$1.e(mb.aO).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jq<ddr> var1, int var2, ddq var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jq<ddr> var1, int var2);
   }
}
