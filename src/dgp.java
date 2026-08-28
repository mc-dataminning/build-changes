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

public class dgp {
   public static int a(jg<dgn> $$0, daa $$1) {
      dgt $$2 = $$1.a(kl.l, dgt.a);
      return $$2.a($$0);
   }

   public static dgt a(daa $$0, Consumer<dgt.a> $$1) {
      kk<dgt> $$2 = d($$0);
      dgt $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dgt.a;
      } else {
         dgt.a $$4 = new dgt.a($$3);
         $$1.accept($$4);
         dgt $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(daa $$0) {
      return $$0.c(d($$0));
   }

   public static void a(daa $$0, dgt $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dgt b(daa $$0) {
      return $$0.a(d($$0), dgt.a);
   }

   private static kk<dgt> d(daa $$0) {
      return $$0.a(dae.vG) ? kl.J : kl.l;
   }

   public static boolean c(daa $$0) {
      return !$$0.a(kl.l, dgt.a).d() || !$$0.a(kl.J, dgt.a).d();
   }

   public static int a(aru $$0, daa $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dgn)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aru $$0, daa $$1, daa $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dgn)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(aru $$0, daa $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dgn)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aru $$0, @Nullable bwv $$1, bwv $$2, int $$3) {
      if ($$1 instanceof bxw $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dgn)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static daa a(dgq $$0) {
      daa $$1 = new daa(dae.vG);
      $$1.a($$0.b(), $$0.c());
      return $$1;
   }

   private static void a(daa $$0, dgp.b $$1) {
      dgt $$2 = $$0.a(kl.l, dgt.a);

      for (Entry<jg<dgn>> $$3 : $$2.b()) {
         $$1.accept((jg<dgn>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(daa $$0, bxf $$1, bxw $$2, dgp.a $$3) {
      if (!$$0.f()) {
         dgt $$4 = $$0.a(kl.l);
         if ($$4 != null && !$$4.d()) {
            dgm $$5 = new dgm($$0, $$1, $$2);

            for (Entry<jg<dgn>> $$6 : $$4.b()) {
               jg<dgn> $$7 = (jg<dgn>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bxw $$0, dgp.a $$1) {
      for (bxf $$2 : bxf.j) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(aru $$0, bxw $$1, bvk $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(aru $$0, bxw $$1, bvk $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(aru $$0, daa $$1, bwv $$2, bvk $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgn)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(aru $$0, daa $$1, bwv $$2, bvk $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgn)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(aru $$0, daa $$1, bwv $$2, bvk $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgn)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(aru $$0, daa $$1, bwv $$2, bvk $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dgn)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(aru $$0, bwv $$1, bvk $$2) {
      if ($$2.d() instanceof bxw $$3) {
         a($$0, $$1, $$2, $$3.dZ());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(aru $$0, bwv $$1, bvk $$2, @Nullable daa $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(aru $$0, bwv $$1, bvk $$2, @Nullable daa $$3, @Nullable Consumer<czw> $$4) {
      if ($$1 instanceof bxw $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dgn)$$3x.a()).a($$0, $$4x, $$5x, dgr.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bxw $$6) {
            a($$3, bxf.a, $$6, ($$3x, $$4x, $$5) -> ((dgn)$$3x.a()).a($$0, $$4x, $$5, dgr.a, $$1, $$2));
         } else if ($$4 != null) {
            dgm $$7 = new dgm($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dgn)$$4x.a()).a($$0, $$5, $$7, dgr.a, $$1, $$2));
         }
      }
   }

   public static void a(aru $$0, bxw $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(aru $$0, daa $$1, bxw $$2, bxf $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dgn)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bxw $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(daa $$0, bxw $$1, bxf $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dgn)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(aru $$0, bxw $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bwv)$$1));
   }

   public static int a(jg<dgn> $$0, bxw $$1) {
      Iterable<daa> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (daa $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(aru $$0, daa $$1, bwv $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dgn)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(aru $$0, daa $$1, bwv $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dgn)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(aru $$0, daa $$1, daa $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dgn)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(aru $$0, daa $$1, csu $$2, Consumer<czw> $$3) {
      bxw $$5 = $$2.q() instanceof bxw $$4 ? $$4 : null;
      dgm $$6 = new dgm($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dgn)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(aru $$0, daa $$1, @Nullable bxw $$2, bwv $$3, @Nullable bxf $$4, ffs $$5, ebg $$6, Consumer<czw> $$7) {
      dgm $$8 = new dgm($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dgn)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(aru $$0, daa $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dgn)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(aru $$0, bxw $$1, bvk $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azz $$5 = $$1.dY();
      a($$1, ($$5x, $$6, $$7x) -> {
         faj $$8 = dgn.b($$0, $$6, $$1, $$2);
         ((dgn)$$5x.a()).a(dgo.m).forEach($$4xx -> {
            if ($$4xx.a() == dgr.c && $$4xx.b() == dgr.c && $$4xx.a($$8)) {
               $$4.setValue(((dhg)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bxw $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            faj $$8 = dgn.b($$0, $$6, $$1, $$2);
            ((dgn)$$5x.a()).a(dgo.m).forEach($$4xx -> {
               if ($$4xx.a() == dgr.a && $$4xx.b() == dgr.c && $$4xx.a($$8)) {
                  $$4.setValue(((dhg)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(daa $$0, bxg $$1, BiConsumer<jg<byx>, bza> $$2) {
      a($$0, ($$2x, $$3) -> ((dgn)$$2x.a()).a(dgo.l).forEach($$4 -> {
            if (((dgn)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(daa $$0, bxf $$1, BiConsumer<jg<byx>, bza> $$2) {
      a($$0, ($$2x, $$3) -> ((dgn)$$2x.a()).a(dgo.l).forEach($$4 -> {
            if (((dgn)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(aru $$0, daa $$1, bwv $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(aru $$0, daa $$1, bwv $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(aru $$0, daa $$1, bwv $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(daa $$0, bxw $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dgn)$$2x.a()).b($$1.dY(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(daa $$0, bxw $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dgn)$$2x.a()).a($$1.dY(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(daa $$0, axv<dgn> $$1) {
      dgt $$2 = $$0.a(kl.l, dgt.a);

      for (Entry<jg<dgn>> $$3 : $$2.b()) {
         jg<dgn> $$4 = (jg<dgn>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(daa $$0, kk<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dgn)$$2x.a()).i().c($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(daa $$0, kk<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(daa $$0, kk<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dgn)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dgm> a(kk<?> $$0, bxw $$1, Predicate<daa> $$2) {
      List<dgm> $$3 = new ArrayList<>();

      for (bxf $$4 : bxf.j) {
         daa $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dgt $$6 = $$5.a(kl.l, dgt.a);

            for (Entry<jg<dgn>> $$7 : $$6.b()) {
               jg<dgn> $$8 = (jg<dgn>)$$7.getKey();
               if ($$8.a().i().c($$0) && $$8.a().a($$4)) {
                  $$3.add(new dgm($$5, $$4, $$1));
               }
            }
         }
      }

      return ag.b($$3, $$1.dY());
   }

   public static int a(azz $$0, int $$1, int $$2, daa $$3) {
      dgl $$4 = $$3.a(kl.C);
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

   public static daa a(azz $$0, daa $$1, int $$2, ju $$3, Optional<? extends jk<dgn>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jg<dgn>>>map(jk::a).orElseGet(() -> $$3.f(mi.aR).c().map($$0xx -> $$0xx)));
   }

   public static daa a(azz $$0, daa $$1, int $$2, Stream<jg<dgn>> $$3) {
      List<dgq> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(dae.rF)) {
         $$1 = new daa(dae.vG);
      }

      for (dgq $$5 : $$4) {
         $$1.a($$5.b(), $$5.c());
      }

      return $$1;
   }

   public static List<dgq> b(azz $$0, daa $$1, int $$2, Stream<jg<dgn>> $$3) {
      List<dgq> $$4 = Lists.newArrayList();
      dgl $$5 = $$1.a(kl.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azq.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dgq> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bte.a($$0, $$7, dgq::a).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ag.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bte.a($$0, $$7, dgq::a).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dgq> $$0, dgq $$1) {
      $$0.removeIf($$1x -> !dgn.a($$1.b(), $$1x.b()));
   }

   public static boolean a(Collection<jg<dgn>> $$0, jg<dgn> $$1) {
      for (jg<dgn> $$2 : $$0) {
         if (!dgn.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dgq> a(int $$0, daa $$1, Stream<jg<dgn>> $$2) {
      List<dgq> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(dae.rF);
      $$2.filter($$2x -> ((dgn)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dgn $$3x = (dgn)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dgq($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(daa $$0, ju $$1, alj<dhv> $$2, bur $$3, azz $$4) {
      dhv $$5 = $$1.f(mi.aQ).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jg<dgn> var1, int var2, dgm var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jg<dgn> var1, int var2);
   }
}
