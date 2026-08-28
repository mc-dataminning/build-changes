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

public class dae {
   public static int a(jm<dac> $$0, cuq $$1) {
      dai $$2 = $$1.a(kq.k, dai.a);
      return $$2.a($$0);
   }

   public static dai a(cuq $$0, Consumer<dai.a> $$1) {
      kp<dai> $$2 = d($$0);
      dai $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dai.a;
      } else {
         dai.a $$4 = new dai.a($$3);
         $$1.accept($$4);
         dai $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cuq $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cuq $$0, dai $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dai b(cuq $$0) {
      return $$0.a(d($$0), dai.a);
   }

   private static kp<dai> d(cuq $$0) {
      return $$0.a(cut.uw) ? kq.y : kq.k;
   }

   public static boolean c(cuq $$0) {
      return !$$0.a(kq.k, dai.a).d() || !$$0.a(kq.y, dai.a).d();
   }

   public static int a(aqu $$0, cuq $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dac)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aqu $$0, cuq $$1, cuq $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dac)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(aqu $$0, cuq $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dac)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aqu $$0, @Nullable bsr $$1, bsr $$2, int $$3) {
      if ($$1 instanceof btn $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dac)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   private static void a(cuq $$0, dae.b $$1) {
      dai $$2 = $$0.a(kq.k, dai.a);

      for (Entry<jm<dac>> $$3 : $$2.b()) {
         $$1.accept((jm<dac>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cuq $$0, bsy $$1, btn $$2, dae.a $$3) {
      if (!$$0.e()) {
         dai $$4 = $$0.a(kq.k);
         if ($$4 != null && !$$4.d()) {
            dab $$5 = new dab($$0, $$1, $$2);

            for (Entry<jm<dac>> $$6 : $$4.b()) {
               jm<dac> $$7 = (jm<dac>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(btn $$0, dae.a $$1) {
      for (bsy $$2 : bsy.values()) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(aqu $$0, btn $$1, brk $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(aqu $$0, btn $$1, brk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(aqu $$0, cuq $$1, bsr $$2, brk $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dac)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(aqu $$0, cuq $$1, bsr $$2, brk $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dac)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(aqu $$0, cuq $$1, bsr $$2, brk $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dac)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(aqu $$0, cuq $$1, bsr $$2, brk $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dac)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(aqu $$0, bsr $$1, brk $$2) {
      if ($$2.d() instanceof btn $$3) {
         a($$0, $$1, $$2, $$3.eT());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(aqu $$0, bsr $$1, brk $$2, @Nullable cuq $$3) {
      if ($$1 instanceof btn $$4) {
         a($$4, ($$3x, $$4x, $$5x) -> ((dac)$$3x.a()).a($$0, $$4x, $$5x, dag.c, $$1, $$2));
      }

      if ($$3 != null && $$2.d() instanceof btn $$5) {
         a($$3, bsy.a, $$5, ($$3x, $$4, $$5x) -> ((dac)$$3x.a()).a($$0, $$4, $$5x, dag.a, $$1, $$2));
      }
   }

   public static void a(aqu $$0, btn $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(aqu $$0, cuq $$1, btn $$2, bsy $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dac)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(btn $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cuq $$0, btn $$1, bsy $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dac)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(aqu $$0, btn $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bsr)$$1));
   }

   public static int a(jm<dac> $$0, btn $$1) {
      Iterable<cuq> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cuq $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(aqu $$0, cuq $$1, bsr $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dac)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(aqu $$0, cuq $$1, bsr $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dac)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(aqu $$0, cuq $$1, cuq $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dac)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(aqu $$0, cuq $$1, cnd $$2, Consumer<cul> $$3) {
      btn $$5 = $$2.s() instanceof btn $$4 ? $$4 : null;
      dab $$6 = new dab($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dac)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(aqu $$0, cuq $$1, @Nullable btn $$2, bsr $$3, @Nullable bsy $$4, exc $$5, dtc $$6, Consumer<cul> $$7) {
      dab $$8 = new dab($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dac)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(aqu $$0, cuq $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dac)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(aqu $$0, btn $$1, brk $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      ayw $$5 = $$1.dR();
      a($$1, ($$5x, $$6, $$7x) -> {
         err $$8 = dac.b($$0, $$6, $$1, $$2);
         ((dac)$$5x.a()).a(dad.m).forEach($$4xx -> {
            if ($$4xx.a() == dag.c && $$4xx.b() == dag.c && $$4xx.a($$8)) {
               $$4.setValue(((dau)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof btn $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            err $$8 = dac.b($$0, $$6, $$1, $$2);
            ((dac)$$5x.a()).a(dad.m).forEach($$4xx -> {
               if ($$4xx.a() == dag.a && $$4xx.b() == dag.c && $$4xx.a($$8)) {
                  $$4.setValue(((dau)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cuq $$0, bsz $$1, BiConsumer<jm<bur>, buu> $$2) {
      a($$0, ($$2x, $$3) -> ((dac)$$2x.a()).a(dad.l).forEach($$4 -> {
            if (((dac)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cuq $$0, bsy $$1, BiConsumer<jm<bur>, buu> $$2) {
      a($$0, ($$2x, $$3) -> ((dac)$$2x.a()).a(dad.l).forEach($$4 -> {
            if (((dac)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(aqu $$0, cuq $$1, bsr $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(aqu $$0, cuq $$1, bsr $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(aqu $$0, cuq $$1, bsr $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cuq $$0, btn $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dac)$$2x.a()).b($$1.dR(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cuq $$0, btn $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dac)$$2x.a()).a($$1.dR(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cuq $$0, awu<dac> $$1) {
      dai $$2 = $$0.a(kq.k, dai.a);

      for (Entry<jm<dac>> $$3 : $$2.b()) {
         jm<dac> $$4 = (jm<dac>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cuq $$0, kp<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dac)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cuq $$0, kp<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cuq $$0, kp<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dac)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dab> a(kp<?> $$0, btn $$1, Predicate<cuq> $$2) {
      List<dab> $$3 = new ArrayList<>();

      for (bsy $$4 : bsy.values()) {
         cuq $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dai $$6 = $$5.a(kq.k, dai.a);

            for (Entry<jm<dac>> $$7 : $$6.b()) {
               jm<dac> $$8 = (jm<dac>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dab($$5, $$4, $$1));
               }
            }
         }
      }

      return ad.b($$3, $$1.dR());
   }

   public static int a(ayw $$0, int $$1, int $$2, cuq $$3) {
      cul $$4 = $$3.g();
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

   public static cuq a(ayw $$0, cuq $$1, int $$2, ka $$3, Optional<? extends jq<dac>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jm<dac>>>map(jq::a).orElseGet(() -> $$3.d(lu.aL).i().map($$0xx -> $$0xx)));
   }

   public static cuq a(ayw $$0, cuq $$1, int $$2, Stream<jm<dac>> $$3) {
      List<daf> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cut.qP)) {
         $$1 = new cuq(cut.uw);
      }

      for (daf $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<daf> b(ayw $$0, cuq $$1, int $$2, Stream<jm<dac>> $$3) {
      List<daf> $$4 = Lists.newArrayList();
      cul $$5 = $$1.g();
      int $$6 = $$5.g();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ayo.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<daf> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bpe.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ad.c($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bpe.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<daf> $$0, daf $$1) {
      $$0.removeIf($$1x -> !dac.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jm<dac>> $$0, jm<dac> $$1) {
      for (jm<dac> $$2 : $$0) {
         if (!dac.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<daf> a(int $$0, cuq $$1, Stream<jm<dac>> $$2) {
      List<daf> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cut.qP);
      $$2.filter($$2x -> ((dac)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dac $$3x = (dac)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new daf($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cuq $$0, ka $$1, akq<dbj> $$2, bqp $$3, ayw $$4) {
      dbj $$5 = $$1.d(lu.aM).a($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jm<dac> var1, int var2, dab var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jm<dac> var1, int var2);
   }
}
