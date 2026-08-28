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

public class dby {
   public static int a(jq<dbw> $$0, cwf $$1) {
      dcc $$2 = $$1.a(ku.l, dcc.a);
      return $$2.a($$0);
   }

   public static dcc a(cwf $$0, Consumer<dcc.a> $$1) {
      kt<dcc> $$2 = d($$0);
      dcc $$3 = $$0.a($$2);
      if ($$3 == null) {
         return dcc.a;
      } else {
         dcc.a $$4 = new dcc.a($$3);
         $$1.accept($$4);
         dcc $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(cwf $$0) {
      return $$0.b(d($$0));
   }

   public static void a(cwf $$0, dcc $$1) {
      $$0.b(d($$0), $$1);
   }

   public static dcc b(cwf $$0) {
      return $$0.a(d($$0), dcc.a);
   }

   private static kt<dcc> d(cwf $$0) {
      return $$0.a(cwj.uO) ? ku.I : ku.l;
   }

   public static boolean c(cwf $$0) {
      return !$$0.a(ku.l, dcc.a).d() || !$$0.a(ku.I, dcc.a).d();
   }

   public static int a(arq $$0, cwf $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbw)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arq $$0, cwf $$1, cwf $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$3x, $$4x) -> ((dbw)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(arq $$0, cwf $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbw)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(arq $$0, @Nullable bui $$1, bui $$2, int $$3) {
      if ($$1 instanceof bve $$4) {
         MutableFloat $$5 = new MutableFloat((float)$$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dbw)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static cwf a(dbz $$0) {
      cwf $$1 = new cwf(cwj.uO);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }

   private static void a(cwf $$0, dby.b $$1) {
      dcc $$2 = $$0.a(ku.l, dcc.a);

      for (Entry<jq<dbw>> $$3 : $$2.b()) {
         $$1.accept((jq<dbw>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(cwf $$0, buq $$1, bve $$2, dby.a $$3) {
      if (!$$0.f()) {
         dcc $$4 = $$0.a(ku.l);
         if ($$4 != null && !$$4.d()) {
            dbv $$5 = new dbv($$0, $$1, $$2);

            for (Entry<jq<dbw>> $$6 : $$4.b()) {
               jq<dbw> $$7 = (jq<dbw>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(bve $$0, dby.a $$1) {
      for (buq $$2 : buq.i) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(arq $$0, bve $$1, bsy $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(arq $$0, bve $$1, bsy $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(arq $$0, cwf $$1, bui $$2, bsy $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbw)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(arq $$0, cwf $$1, bui $$2, bsy $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbw)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(arq $$0, cwf $$1, bui $$2, bsy $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbw)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(arq $$0, cwf $$1, bui $$2, bsy $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dbw)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(arq $$0, bui $$1, bsy $$2) {
      if ($$2.d() instanceof bve $$3) {
         a($$0, $$1, $$2, $$3.ec());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(arq $$0, bui $$1, bsy $$2, @Nullable cwf $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(arq $$0, bui $$1, bsy $$2, @Nullable cwf $$3, @Nullable Consumer<cwb> $$4) {
      if ($$1 instanceof bve $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dbw)$$3x.a()).a($$0, $$4x, $$5x, dca.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof bve $$6) {
            a($$3, buq.a, $$6, ($$3x, $$4x, $$5) -> ((dbw)$$3x.a()).a($$0, $$4x, $$5, dca.a, $$1, $$2));
         } else if ($$4 != null) {
            dbv $$7 = new dbv($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dbw)$$4x.a()).a($$0, $$5, $$7, dca.a, $$1, $$2));
         }
      }
   }

   public static void a(arq $$0, bve $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(arq $$0, cwf $$1, bve $$2, buq $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dbw)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(bve $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(cwf $$0, bve $$1, buq $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dbw)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(arq $$0, bve $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bui)$$1));
   }

   public static int a(jq<dbw> $$0, bve $$1) {
      Iterable<cwf> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (cwf $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(arq $$0, cwf $$1, bui $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat((float)$$3);
      a($$1, ($$4x, $$5) -> ((dbw)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(arq $$0, cwf $$1, bui $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dbw)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(arq $$0, cwf $$1, cwf $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dbw)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(arq $$0, cwf $$1, cpk $$2, Consumer<cwb> $$3) {
      bve $$5 = $$2.s() instanceof bve $$4 ? $$4 : null;
      dbv $$6 = new dbv($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dbw)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(arq $$0, cwf $$1, @Nullable bve $$2, bui $$3, @Nullable buq $$4, ezr $$5, dvo $$6, Consumer<cwb> $$7) {
      dbv $$8 = new dbv($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dbw)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(arq $$0, cwf $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat((float)$$2);
      a($$1, ($$3x, $$4) -> ((dbw)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(arq $$0, bve $$1, bsy $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      azv $$5 = $$1.eb();
      a($$1, ($$5x, $$6, $$7x) -> {
         eug $$8 = dbw.b($$0, $$6, $$1, $$2);
         ((dbw)$$5x.a()).a(dbx.m).forEach($$4xx -> {
            if ($$4xx.a() == dca.c && $$4xx.b() == dca.c && $$4xx.a($$8)) {
               $$4.setValue(((dcp)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof bve $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            eug $$8 = dbw.b($$0, $$6, $$1, $$2);
            ((dbw)$$5x.a()).a(dbx.m).forEach($$4xx -> {
               if ($$4xx.a() == dca.a && $$4xx.b() == dca.c && $$4xx.a($$8)) {
                  $$4.setValue(((dcp)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(cwf $$0, bur $$1, BiConsumer<jq<bwh>, bwk> $$2) {
      a($$0, ($$2x, $$3) -> ((dbw)$$2x.a()).a(dbx.l).forEach($$4 -> {
            if (((dbw)$$2x.a()).g().h().contains($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static void a(cwf $$0, buq $$1, BiConsumer<jq<bwh>, bwk> $$2) {
      a($$0, ($$2x, $$3) -> ((dbw)$$2x.a()).a(dbx.l).forEach($$4 -> {
            if (((dbw)$$2x.a()).a($$1)) {
               $$2.accept($$4.c(), $$4.a($$3, $$1));
            }
         }));
   }

   public static int a(arq $$0, cwf $$1, bui $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(arq $$0, cwf $$1, bui $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(arq $$0, cwf $$1, bui $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(cwf $$0, bve $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dbw)$$2x.a()).b($$1.eb(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(cwf $$0, bve $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dbw)$$2x.a()).a($$1.eb(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(cwf $$0, axt<dbw> $$1) {
      dcc $$2 = $$0.a(ku.l, dcc.a);

      for (Entry<jq<dbw>> $$3 : $$2.b()) {
         jq<dbw> $$4 = (jq<dbw>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cwf $$0, kt<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dbw)$$2x.a()).i().b($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(cwf $$0, kt<List<T>> $$1) {
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
   public static <T> Pair<T, Integer> c(cwf $$0, kt<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dbw)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<dbv> a(kt<?> $$0, bve $$1, Predicate<cwf> $$2) {
      List<dbv> $$3 = new ArrayList<>();

      for (buq $$4 : buq.i) {
         cwf $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            dcc $$6 = $$5.a(ku.l, dcc.a);

            for (Entry<jq<dbw>> $$7 : $$6.b()) {
               jq<dbw> $$8 = (jq<dbw>)$$7.getKey();
               if ($$8.a().i().b($$0) && $$8.a().a($$4)) {
                  $$3.add(new dbv($$5, $$4, $$1));
               }
            }
         }
      }

      return ae.b($$3, $$1.eb());
   }

   public static int a(azv $$0, int $$1, int $$2, cwf $$3) {
      dbu $$4 = $$3.a(ku.C);
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

   public static cwf a(azv $$0, cwf $$1, int $$2, ke $$3, Optional<? extends ju<dbw>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jq<dbw>>>map(ju::a).orElseGet(() -> $$3.e(ma.aM).c().map($$0xx -> $$0xx)));
   }

   public static cwf a(azv $$0, cwf $$1, int $$2, Stream<jq<dbw>> $$3) {
      List<dbz> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(cwj.qQ)) {
         $$1 = new cwf(cwj.uO);
      }

      for (dbz $$5 : $$4) {
         $$1.a($$5.a, $$5.b);
      }

      return $$1;
   }

   public static List<dbz> b(azv $$0, cwf $$1, int $$2, Stream<jq<dbw>> $$3) {
      List<dbz> $$4 = Lists.newArrayList();
      dbu $$5 = $$1.a(ku.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = azn.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE);
         List<dbz> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bqs.a($$0, $$7).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ae.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bqs.a($$0, $$7).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<dbz> $$0, dbz $$1) {
      $$0.removeIf($$1x -> !dbw.a($$1.a, $$1x.a));
   }

   public static boolean a(Collection<jq<dbw>> $$0, jq<dbw> $$1) {
      for (jq<dbw> $$2 : $$0) {
         if (!dbw.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<dbz> a(int $$0, cwf $$1, Stream<jq<dbw>> $$2) {
      List<dbz> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(cwj.qQ);
      $$2.filter($$2x -> ((dbw)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dbw $$3x = (dbw)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new dbz($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(cwf $$0, ke $$1, alk<dde> $$2, bsf $$3, azv $$4) {
      dde $$5 = $$1.e(ma.aN).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jq<dbw> var1, int var2, dbv var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jq<dbw> var1, int var2);
   }
}
