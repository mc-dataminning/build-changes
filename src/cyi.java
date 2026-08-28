import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cyi extends cyo {
   protected static final Map<dlu, Pair<Predicate<dcn>, Consumer<dcn>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dlw.i,
         Pair.of(cyi::b, a(dlw.cK.m())),
         dlw.lg,
         Pair.of(cyi::b, a(dlw.cK.m())),
         dlw.j,
         Pair.of(cyi::b, a(dlw.cK.m())),
         dlw.k,
         Pair.of(cyi::b, a(dlw.j.m())),
         dlw.tn,
         Pair.of((Predicate<dcn>)$$0 -> true, a(dlw.j.m(), cyw.ec))
      )
   );

   public cyi(dag $$0, float $$1, float $$2, cyo.a $$3) {
      super($$3.c($$0, $$1, $$2));
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      Pair<Predicate<dcn>, Consumer<dcn>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bty.e;
      } else {
         Predicate<dcn> $$4 = (Predicate<dcn>)$$3.getFirst();
         Consumer<dcn> $$5 = (Consumer<dcn>)$$3.getSecond();
         if ($$4.test($$0)) {
            cqs $$6 = $$0.o();
            $$1.a($$6, $$2, awl.mL, awm.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bwz.d($$0.p()));
               }
            }

            return bty.a;
         } else {
            return bty.e;
         }
      }
   }

   public static Consumer<dcn> a(dzo $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(eeo.c, $$1.a(), eeo.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dcn> a(dzo $$0, dio $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(eeo.c, $$2.a(), eeo.a.a($$2.o(), $$0));
         dlu.a($$2.q(), $$2.a(), $$2.k(), new cys($$1));
      };
   }

   public static boolean b(dcn $$0) {
      return $$0.k() != ja.a && $$0.q().a_($$0.a().d()).l();
   }
}
