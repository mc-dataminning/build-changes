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

public class dcf {
   public static int a(jq<dcd> $$0, cwm $$1) {
      dcj $$2 = $$1.a(ku.l, dcj.a);
      return $$2.a($$0);
   }

   public static dcj a(cwm $$0, Consumer<dcj.a> $$1) {
      kt<dcj> $$2 = d($$0);
      dcj $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dcj.a;
      } else {
         dcj.a $$4 = new dcj.a($$3);
         $$1.accept($$4);
         dcj $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cwm $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cwm $$0, dcj $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dcj b(cwm $$0) {
      return $$0.a(d($$0), dcj.a);
   }

   private static kt<dcj> d(cwm $$0) {
      return $$0.a(cwq.uO) ? ku.I : ku.l;
   }

   public static boolean c(cwm $$0) {
      return !$$0.a(ku.l, dcj.a).d() || !$$0.a(ku.I, dcj.a).d();
   }

   public static int a(arp $$0, cwm $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcd)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arp $$0, cwm $$1, cwm $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dcd)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arp $$0, cwm $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcd)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arp $$0, @Nullable bul $$1, bul $$2, int $$3) {
      if ($$1 instanceof bvh $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dcd)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cwm a(dcg $$0) {
      cwm $$1 = new cwm(cwq.uO);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cwm $$0, dcf.b $$1) {
      dcj $$2 = $$0.a(ku.l, dcj.a);

      for (Entry<jq<dcd>> $$3 : $$2.b()) {
         $$1.accept((jq<dcd>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cwm $$0, but $$1, bvh $$2, dcf.a $$3) {
      if (!$$0.f()) {
         dcj $$4 = $$0.a(ku.l);
         if ($$4 != null && !$$4.d()) {
            dcc $$5 = new dcc($$0, $$1, $$2);

            for (Entry<jq<dcd>> $$6 : $$4.b()) {
               jq<dcd> $$7 = (jq<dcd>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bvh $$0, dcf.a $$1) {
      for (but $$2 : but.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arp $$0, bvh $$1, btb $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arp $$0, bvh $$1, btb $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arp $$0, cwm $$1, bul $$2, btb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcd)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arp $$0, cwm $$1, bul $$2, btb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcd)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arp $$0, cwm $$1, bul $$2, btb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcd)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arp $$0, cwm $$1, bul $$2, btb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dcd)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arp $$0, bul $$1, btb $$2) {
      if ($$2.d() instanceof bvh $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arp $$0, bul $$1, btb $$2, @Nullable cwm $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arp $$0, bul $$1, btb $$2, @Nullable cwm $$3, @Nullable Consumer<cwi> $$4) {
      if ($$1 instanceof bvh $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dcd)$$3x.a()).a($$0, $$4x, $$5x, dch.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bvh $$6) {
            a($$3, but.a, $$6, ($$3x, $$4x, $$5) -> ((dcd)$$3x.a()).a($$0, $$4x, $$5, dch.a, $$1, $$2));
         } else if ($$4 != null) {
            dcc $$7 = new dcc($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dcd)$$4x.a()).a($$0, $$5, $$7, dch.a, $$1, $$2));
         }
      }
   }

   public static void a(arp $$0, bvh $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arp $$0, cwm $$1, bvh $$2, but $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dcd)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bvh $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cwm $$0, bvh $$1, but $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dcd)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arp $$0, bvh $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bul)$$1));
   }

   public static int a(jq<dcd> $$0, bvh $$1) {
      Iterable<cwm> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cwm $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arp $$0, cwm $$1, bul $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dcd)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arp $$0, cwm $$1, bul $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dcd)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arp $$0, cwm $$1, cwm $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dcd)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arp $$0, cwm $$1, cpn $$2, Consumer<cwi> $$3) {
      bvh $$5 = $$2.p() instanceof bvh $$4 ? $$4 : null;
      dcc $$6 = new dcc($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dcd)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arp $$0, cwm $$1, @Nullable bvh $$2, bul $$3, @Nullable but $$4, ezy $$5, dvv $$6, Consumer<cwi> $$7) {
      dcc $$8 = new dcc($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dcd)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arp $$0, cwm $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dcd)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arp $$0, bvh $$1, btb $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azu $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         eun $$8 = dcd.b($$0, $$6, $$1, $$2);
         ((dcd)$$5x.a()).a(dce.m).forEach($$4xx -> {
            if ($$4xx.a() == dch.c && $$4xx.b() == dch.c && $$4xx.a($$8)) {
               $$4.setValue(((dcw)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bvh $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            eun $$8 = dcd.b($$0, $$6, $$1, $$2);
            ((dcd)$$5x.a()).a(dce.m).forEach($$4xx -> {
               if ($$4xx.a() == dch.a && $$4xx.b() == dch.c && $$4xx.a($$8)) {
                  $$4.setValue(((dcw)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cwm $$0, buu $$1, BiConsumer<jq<bwk>, bwn> $$2) {
      a($$0, ($$2x, $$3) -> ((dcd)$$2x.a()).a(dce.l).forEach($$4 -> {
            if (((dcd)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cwm $$0, but $$1, BiConsumer<jq<bwk>, bwn> $$2) {
      a($$0, ($$2x, $$3) -> ((dcd)$$2x.a()).a(dce.l).forEach($$4 -> {
            if (((dcd)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arp $$0, cwm $$1, bul $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arp $$0, cwm $$1, bul $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arp $$0, cwm $$1, bul $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cwm $$0, bvh $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dcd)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cwm $$0, bvh $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dcd)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cwm $$0, axs<dcd> $$1) {
      dcj $$2 = $$0.a(ku.l, dcj.a);

      for (Entry<jq<dcd>> $$3 : $$2.b()) {
         jq<dcd> $$4 = (jq<dcd>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cwm $$0, kt<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dcd)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cwm $$0, kt<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cwm $$0, kt<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dcd)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dcc> a(kt<?> $$0, bvh $$1, Predicate<cwm> $$2) {
      List<dcc> $$3 = new ArrayList<>();

      for (but $$4 : but.i) {
         cwm $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dcj $$6 = $$5.a(ku.l, dcj.a);

            for (Entry<jq<dcd>> $$7 : $$6.b()) {
               jq<dcd> $$8 = (jq<dcd>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dcc($$5, $$4, $$1));
               }
            }
         }
      }

      return ae.b($$3, $$1.dY());
   }

   public static int a(azu $$0, int $$1, int $$2, cwm $$3) {
      dcb $$4 = $$3.a(ku.C);
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

   public static cwm a(azu $$0, cwm $$1, int $$2, ke $$3, Optional<? extends ju<dcd>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jq<dcd>>>map(ju::a).orElseGet(() -> $$3.e(ma.aM).c().map($$0xx -> $$0xx)));
   }

   public static cwm a(azu $$0, cwm $$1, int $$2, Stream<jq<dcd>> $$3) {
      List<dcg> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cwq.qQ)) {
         $$1 = new cwm(cwq.uO);
      }

      for (dcg $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<dcg> b(azu $$0, cwm $$1, int $$2, Stream<jq<dcd>> $$3) {
      List<dcg> $$4 = Lists.newArrayList();
      dcb $$5 = $$1.a(ku.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azm.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dcg> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bqv.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ae.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bqv.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dcg> $$0, dcg $$1) {
      $$0.removeIf($$1x -> !dcd.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jq<dcd>> $$0, jq<dcd> $$1) {
      for (jq<dcd> $$2 : $$0) {
         if (!dcd.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dcg> a(int $$0, cwm $$1, Stream<jq<dcd>> $$2) {
      List<dcg> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cwq.qQ);
      $$2.filter($$2x -> ((dcd)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dcd $$3x = (dcd)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dcg($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cwm $$0, ke $$1, ali<ddl> $$2, bsi $$3, azu $$4) {
      ddl $$5 = $$1.e(ma.aN).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jq<dcd> var1, int var2, dcc var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jq<dcd> var1, int var2);
   }
}
