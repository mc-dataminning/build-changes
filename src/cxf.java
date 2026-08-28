import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cxf extends cwi {
   protected static final Map<dkm, Pair<Predicate<dbi>, Consumer<dbi>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dko.i,
         Pair.of(cxf::b, a(dko.cK.m())),
         dko.kZ,
         Pair.of(cxf::b, a(dko.cK.m())),
         dko.j,
         Pair.of(cxf::b, a(dko.cK.m())),
         dko.k,
         Pair.of(cxf::b, a(dko.j.m())),
         dko.tc,
         Pair.of((Predicate<dbi>)$$0 -> true, a(dko.j.m(), cxt.dY))
      )
   );

   public cxf(czg $$0, float $$1, float $$2, cxl.a $$3) {
      super($$0, axu.bD, $$1, $$2, $$3);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      Pair<Predicate<dbi>, Consumer<dbi>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return btj.e;
      } else {
         Predicate<dbi> $$4 = (Predicate<dbi>)$$3.getFirst();
         Consumer<dbi> $$5 = (Consumer<dbi>)$$3.getSecond();
         if ($$4.test($$0)) {
            cpx $$6 = $$0.o();
            $$1.a($$6, $$2, axf.mF, axg.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bwg.d($$0.p()));
               }
            }

            return btj.a;
         } else {
            return btj.e;
         }
      }
   }

   public static Consumer<dbi> a(dxv $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ecr.c, $$1.a(), ecr.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dbi> a(dxv $$0, dhh $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ecr.c, $$2.a(), ecr.a.a($$2.o(), $$0));
         dkm.a($$2.q(), $$2.a(), $$2.k(), new cxp($$1));
      };
   }

   public static boolean b(dbi $$0) {
      return $$0.k() != jm.a && $$0.q().a_($$0.a().d()).l();
   }
}
