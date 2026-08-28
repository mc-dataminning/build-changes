import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cwd extends cvg {
   protected static final Map<djk, Pair<Predicate<dag>, Consumer<dag>>> a = Maps.newHashMap(
      ImmutableMap.of(
         djm.i,
         Pair.of(cwd::b, a(djm.cK.m())),
         djm.lg,
         Pair.of(cwd::b, a(djm.cK.m())),
         djm.j,
         Pair.of(cwd::b, a(djm.cK.m())),
         djm.k,
         Pair.of(cwd::b, a(djm.j.m())),
         djm.tj,
         Pair.of((Predicate<dag>)$$0 -> true, a(djm.j.m(), cwr.ea))
      )
   );

   public cwd(cye $$0, float $$1, float $$2, cwj.a $$3) {
      super($$0, awo.bD, $$1, $$2, $$3);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      Pair<Predicate<dag>, Consumer<dag>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bsi.e;
      } else {
         Predicate<dag> $$4 = (Predicate<dag>)$$3.getFirst();
         Consumer<dag> $$5 = (Consumer<dag>)$$3.getSecond();
         if ($$4.test($$0)) {
            cov $$6 = $$0.o();
            $$1.a($$6, $$2, avz.mL, awa.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bvf.d($$0.p()));
               }
            }

            return bsi.a;
         } else {
            return bsi.e;
         }
      }
   }

   public static Consumer<dag> a(dwv $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ebr.c, $$1.a(), ebr.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dag> a(dwv $$0, dgf $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ebr.c, $$2.a(), ebr.a.a($$2.o(), $$0));
         djk.a($$2.q(), $$2.a(), $$2.k(), new cwn($$1));
      };
   }

   public static boolean b(dag $$0) {
      return $$0.k() != jn.a && $$0.q().a_($$0.a().d()).l();
   }
}
