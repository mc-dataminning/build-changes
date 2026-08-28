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

public class dds {
   public static int a(jq<ddq> $$0, cxg $$1) {
      ddw $$2 = $$1.a(ku.l, ddw.a);
      return $$2.a($$0);
   }

   public static ddw a(cxg $$0, Consumer<ddw.a> $$1) {
      kt<ddw> $$2 = d($$0);
      ddw $$3 = $$0.a($$2);
      if ($$3 == null) {
         return ddw.a;
      } else {
         ddw.a $$4 = new ddw.a($$3);
         $$1.accept($$4);
         ddw $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cxg $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cxg $$0, ddw $$1) {
      $$0.b(d($$0), $$1);
   }

   public static ddw b(cxg $$0) {
      return $$0.a(d($$0), ddw.a);
   }

   private static kt<ddw> d(cxg $$0) {
      return $$0.a(cxk.vv) ? ku.I : ku.l;
   }

   public static boolean c(cxg $$0) {
      return !$$0.a(ku.l, ddw.a).d() || !$$0.a(ku.I, ddw.a).d();
   }

   public static int a(arx $$0, cxg $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((ddq)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arx $$0, cxg $$1, cxg $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((ddq)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arx $$0, cxg $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((ddq)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arx $$0, @Nullable bvb $$1, bvb $$2, int $$3) {
      if ($$1 instanceof bvx $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((ddq)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cxg a(ddt $$0) {
      cxg $$1 = new cxg(cxk.vv);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cxg $$0, dds.b $$1) {
      ddw $$2 = $$0.a(ku.l, ddw.a);

      for (Entry<jq<ddq>> $$3 : $$2.b()) {
         $$1.accept((jq<ddq>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cxg $$0, bvj $$1, bvx $$2, dds.a $$3) {
      if (!$$0.f()) {
         ddw $$4 = $$0.a(ku.l);
         if ($$4 != null && !$$4.d()) {
            ddp $$5 = new ddp($$0, $$1, $$2);

            for (Entry<jq<ddq>> $$6 : $$4.b()) {
               jq<ddq> $$7 = (jq<ddq>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bvx $$0, dds.a $$1) {
      for (bvj $$2 : bvj.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arx $$0, bvx $$1, btr $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arx $$0, bvx $$1, btr $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arx $$0, cxg $$1, bvb $$2, btr $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddq)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arx $$0, cxg $$1, bvb $$2, btr $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddq)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arx $$0, cxg $$1, bvb $$2, btr $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddq)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arx $$0, cxg $$1, bvb $$2, btr $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((ddq)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arx $$0, bvb $$1, btr $$2) {
      if ($$2.d() instanceof bvx $$3) {
         a($$0, $$1, $$2, $$3.ea());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arx $$0, bvb $$1, btr $$2, @Nullable cxg $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arx $$0, bvb $$1, btr $$2, @Nullable cxg $$3, @Nullable Consumer<cxc> $$4) {
      if ($$1 instanceof bvx $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((ddq)$$3x.a()).a($$0, $$4x, $$5x, ddu.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bvx $$6) {
            a($$3, bvj.a, $$6, ($$3x, $$4x, $$5) -> ((ddq)$$3x.a()).a($$0, $$4x, $$5, ddu.a, $$1, $$2));
         } else if ($$4 != null) {
            ddp $$7 = new ddp($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((ddq)$$4x.a()).a($$0, $$5, $$7, ddu.a, $$1, $$2));
         }
      }
   }

   public static void a(arx $$0, bvx $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arx $$0, cxg $$1, bvx $$2, bvj $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((ddq)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bvx $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cxg $$0, bvx $$1, bvj $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((ddq)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arx $$0, bvx $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bvb)$$1));
   }

   public static int a(jq<ddq> $$0, bvx $$1) {
      Iterable<cxg> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cxg $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arx $$0, cxg $$1, bvb $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((ddq)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arx $$0, cxg $$1, bvb $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((ddq)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arx $$0, cxg $$1, cxg $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((ddq)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arx $$0, cxg $$1, cqh $$2, Consumer<cxc> $$3) {
      bvx $$5 = $$2.p() instanceof bvx $$4 ? $$4 : null;
      ddp $$6 = new ddp($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((ddq)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arx $$0, cxg $$1, @Nullable bvx $$2, bvb $$3, @Nullable bvj $$4, fbr $$5, dxo $$6, Consumer<cxc> $$7) {
      ddp $$8 = new ddp($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((ddq)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arx $$0, cxg $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((ddq)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arx $$0, bvx $$1, btr $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      bac $$5 = $$1.dZ();
      a($$1, ($$5x, $$6, $$7x) -> {
         ewi $$8 = ddq.b($$0, $$6, $$1, $$2);
         ((ddq)$$5x.a()).a(ddr.m).forEach($$4xx -> {
            if ($$4xx.a() == ddu.c && $$4xx.b() == ddu.c && $$4xx.a($$8)) {
               $$4.setValue(((dej)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bvx $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            ewi $$8 = ddq.b($$0, $$6, $$1, $$2);
            ((ddq)$$5x.a()).a(ddr.m).forEach($$4xx -> {
               if ($$4xx.a() == ddu.a && $$4xx.b() == ddu.c && $$4xx.a($$8)) {
                  $$4.setValue(((dej)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cxg $$0, bvk $$1, BiConsumer<jq<bxa>, bxd> $$2) {
      a($$0, ($$2x, $$3) -> ((ddq)$$2x.a()).a(ddr.l).forEach($$4 -> {
            if (((ddq)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cxg $$0, bvj $$1, BiConsumer<jq<bxa>, bxd> $$2) {
      a($$0, ($$2x, $$3) -> ((ddq)$$2x.a()).a(ddr.l).forEach($$4 -> {
            if (((ddq)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arx $$0, cxg $$1, bvb $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arx $$0, cxg $$1, bvb $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arx $$0, cxg $$1, bvb $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cxg $$0, bvx $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((ddq)$$2x.a()).b($$1.dZ(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cxg $$0, bvx $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((ddq)$$2x.a()).a($$1.dZ(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cxg $$0, aya<ddq> $$1) {
      ddw $$2 = $$0.a(ku.l, ddw.a);

      for (Entry<jq<ddq>> $$3 : $$2.b()) {
         jq<ddq> $$4 = (jq<ddq>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cxg $$0, kt<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((ddq)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cxg $$0, kt<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cxg $$0, kt<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((ddq)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<ddp> a(kt<?> $$0, bvx $$1, Predicate<cxg> $$2) {
      List<ddp> $$3 = new ArrayList<>();

      for (bvj $$4 : bvj.i) {
         cxg $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            ddw $$6 = $$5.a(ku.l, ddw.a);

            for (Entry<jq<ddq>> $$7 : $$6.b()) {
               jq<ddq> $$8 = (jq<ddq>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new ddp($$5, $$4, $$1));
               }
            }
         }
      }

      return ae.b($$3, $$1.dZ());
   }

   public static int a(bac $$0, int $$1, int $$2, cxg $$3) {
      ddo $$4 = $$3.a(ku.C);
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

   public static cxg a(bac $$0, cxg $$1, int $$2, ke $$3, Optional<? extends ju<ddq>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jq<ddq>>>map(ju::a).orElseGet(() -> $$3.e(mb.aO).c().map($$0xx -> $$0xx)));
   }

   public static cxg a(bac $$0, cxg $$1, int $$2, Stream<jq<ddq>> $$3) {
      List<ddt> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cxk.rw)) {
         $$1 = new cxg(cxk.vv);
      }

      for (ddt $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<ddt> b(bac $$0, cxg $$1, int $$2, Stream<jq<ddq>> $$3) {
      List<ddt> $$4 = Lists.newArrayList();
      ddo $$5 = $$1.a(ku.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azu.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<ddt> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            brl.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ae.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               brl.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<ddt> $$0, ddt $$1) {
      $$0.removeIf($$1x -> !ddq.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jq<ddq>> $$0, jq<ddq> $$1) {
      for (jq<ddq> $$2 : $$0) {
         if (!ddq.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<ddt> a(int $$0, cxg $$1, Stream<jq<ddq>> $$2) {
      List<ddt> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cxk.rw);
      $$2.filter($$2x -> ((ddq)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         ddq $$3x = (ddq)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new ddt($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cxg $$0, ke $$1, alo<dey> $$2, bsy $$3, bac $$4) {
      dey $$5 = $$1.e(mb.aP).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jq<ddq> var1, int var2, ddp var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jq<ddq> var1, int var2);
   }
}
