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

public class deb {
   public static int a(jq<ddz> $$0, cxp $$1) {
      def $$2 = $$1.a(ku.l, def.a);
      return $$2.a($$0);
   }

   public static def a(cxp $$0, Consumer<def.a> $$1) {
      kt<def> $$2 = d($$0);
      def $$3 = $$0.a($$2);
      if ($$3 == null) {
         return def.a;
      } else {
         def.a $$4 = new def.a($$3);
         $$1.accept($$4);
         def $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cxp $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cxp $$0, def $$1) {
      $$0.b(d($$0), $$1);
   }

   public static def b(cxp $$0) {
      return $$0.a(d($$0), def.a);
   }

   private static kt<def> d(cxp $$0) {
      return $$0.a(cxt.vm) ? ku.I : ku.l;
   }

   public static boolean c(cxp $$0) {
      return !$$0.a(ku.l, def.a).d() || !$$0.a(ku.I, def.a).d();
   }

   public static int a(ash $$0, cxp $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((ddz)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(ash $$0, cxp $$1, cxp $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((ddz)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(ash $$0, cxp $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((ddz)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(ash $$0, @Nullable bvk $$1, bvk $$2, int $$3) {
      if ($$1 instanceof bwg $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((ddz)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cxp a(dec $$0) {
      cxp $$1 = new cxp(cxt.vm);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cxp $$0, deb.b $$1) {
      def $$2 = $$0.a(ku.l, def.a);

      for (Entry<jq<ddz>> $$3 : $$2.b()) {
         $$1.accept((jq<ddz>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cxp $$0, bvs $$1, bwg $$2, deb.a $$3) {
      if (!$$0.f()) {
         def $$4 = $$0.a(ku.l);
         if ($$4 != null && !$$4.d()) {
            ddy $$5 = new ddy($$0, $$1, $$2);

            for (Entry<jq<ddz>> $$6 : $$4.b()) {
               jq<ddz> $$7 = (jq<ddz>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bwg $$0, deb.a $$1) {
      for (bvs $$2 : bvs.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(ash $$0, bwg $$1, bua $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(ash $$0, bwg $$1, bua $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(ash $$0, cxp $$1, bvk $$2, bua $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddz)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(ash $$0, cxp $$1, bvk $$2, bua $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddz)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(ash $$0, cxp $$1, bvk $$2, bua $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddz)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(ash $$0, cxp $$1, bvk $$2, bua $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddz)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(ash $$0, bvk $$1, bua $$2) {
      if ($$2.d() instanceof bwg $$3) {
         a($$0, $$1, $$2, $$3.ea());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(ash $$0, bvk $$1, bua $$2, @Nullable cxp $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(ash $$0, bvk $$1, bua $$2, @Nullable cxp $$3, @Nullable Consumer<cxl> $$4) {
      if ($$1 instanceof bwg $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((ddz)$$3x.a()).a($$0, $$4x, $$5x, ded.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bwg $$6) {
            a($$3, bvs.a, $$6, ($$3x, $$4x, $$5) -> ((ddz)$$3x.a()).a($$0, $$4x, $$5, ded.a, $$1, $$2));
         } else if ($$4 != null) {
            ddy $$7 = new ddy($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((ddz)$$4x.a()).a($$0, $$5, $$7, ded.a, $$1, $$2));
         }
      }
   }

   public static void a(ash $$0, bwg $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(ash $$0, cxp $$1, bwg $$2, bvs $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((ddz)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bwg $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cxp $$0, bwg $$1, bvs $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((ddz)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(ash $$0, bwg $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bvk)$$1));
   }

   public static int a(jq<ddz> $$0, bwg $$1) {
      Iterable<cxp> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cxp $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(ash $$0, cxp $$1, bvk $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((ddz)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(ash $$0, cxp $$1, bvk $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((ddz)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(ash $$0, cxp $$1, cxp $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((ddz)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(ash $$0, cxp $$1, cqq $$2, Consumer<cxl> $$3) {
      bwg $$5 = $$2.p() instanceof bwg $$4 ? $$4 : null;
      ddy $$6 = new ddy($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((ddz)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(ash $$0, cxp $$1, @Nullable bwg $$2, bvk $$3, @Nullable bvs $$4, fby $$5, dxv $$6, Consumer<cxl> $$7) {
      ddy $$8 = new ddy($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((ddz)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(ash $$0, cxp $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((ddz)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(ash $$0, bwg $$1, bua $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      bam $$5 = $$1.dZ();
      a($$1, ($$5x, $$6, $$7x) -> {
         ewp $$8 = ddz.b($$0, $$6, $$1, $$2);
         ((ddz)$$5x.a()).a(dea.m).forEach($$4xx -> {
            if ($$4xx.a() == ded.c && $$4xx.b() == ded.c && $$4xx.a($$8)) {
               $$4.setValue(((des)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bwg $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            ewp $$8 = ddz.b($$0, $$6, $$1, $$2);
            ((ddz)$$5x.a()).a(dea.m).forEach($$4xx -> {
               if ($$4xx.a() == ded.a && $$4xx.b() == ded.c && $$4xx.a($$8)) {
                  $$4.setValue(((des)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cxp $$0, bvt $$1, BiConsumer<jq<bxj>, bxm> $$2) {
      a($$0, ($$2x, $$3) -> ((ddz)$$2x.a()).a(dea.l).forEach($$4 -> {
            if (((ddz)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cxp $$0, bvs $$1, BiConsumer<jq<bxj>, bxm> $$2) {
      a($$0, ($$2x, $$3) -> ((ddz)$$2x.a()).a(dea.l).forEach($$4 -> {
            if (((ddz)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(ash $$0, cxp $$1, bvk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(ash $$0, cxp $$1, bvk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(ash $$0, cxp $$1, bvk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cxp $$0, bwg $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((ddz)$$2x.a()).b($$1.dZ(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cxp $$0, bwg $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((ddz)$$2x.a()).a($$1.dZ(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cxp $$0, ayk<ddz> $$1) {
      def $$2 = $$0.a(ku.l, def.a);

      for (Entry<jq<ddz>> $$3 : $$2.b()) {
         jq<ddz> $$4 = (jq<ddz>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cxp $$0, kt<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((ddz)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cxp $$0, kt<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cxp $$0, kt<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((ddz)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<ddy> a(kt<?> $$0, bwg $$1, Predicate<cxp> $$2) {
      List<ddy> $$3 = new ArrayList<>();

      for (bvs $$4 : bvs.i) {
         cxp $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            def $$6 = $$5.a(ku.l, def.a);

            for (Entry<jq<ddz>> $$7 : $$6.b()) {
               jq<ddz> $$8 = (jq<ddz>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new ddy($$5, $$4, $$1));
               }
            }
         }
      }

      return ae.b($$3, $$1.dZ());
   }

   public static int a(bam $$0, int $$1, int $$2, cxp $$3) {
      ddx $$4 = $$3.a(ku.C);
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

   public static cxp a(bam $$0, cxp $$1, int $$2, ke $$3, Optional<? extends ju<ddz>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jq<ddz>>>map(ju::a).orElseGet(() -> $$3.e(mb.aO).c().map($$0xx -> $$0xx)));
   }

   public static cxp a(bam $$0, cxp $$1, int $$2, Stream<jq<ddz>> $$3) {
      List<dec> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cxt.rn)) {
         $$1 = new cxp(cxt.vm);
      }

      for (dec $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<dec> b(bam $$0, cxp $$1, int $$2, Stream<jq<ddz>> $$3) {
      List<dec> $$4 = Lists.newArrayList();
      ddx $$5 = $$1.a(ku.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = bae.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dec> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bru.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ae.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bru.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dec> $$0, dec $$1) {
      $$0.removeIf($$1x -> !ddz.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jq<ddz>> $$0, jq<ddz> $$1) {
      for (jq<ddz> $$2 : $$0) {
         if (!ddz.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dec> a(int $$0, cxp $$1, Stream<jq<ddz>> $$2) {
      List<dec> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cxt.rn);
      $$2.filter($$2x -> ((ddz)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         ddz $$3x = (ddz)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dec($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cxp $$0, ke $$1, aly<dfh> $$2, bth $$3, bam $$4) {
      dfh $$5 = $$1.e(mb.aP).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jq<ddz> var1, int var2, ddy var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jq<ddz> var1, int var2);
   }
}
