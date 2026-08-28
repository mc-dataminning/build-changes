import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cww extends cvz {
   protected static final Map<dkd, Pair<Predicate<daz>, Consumer<daz>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dkf.i,
         Pair.of(cww::b, a(dkf.cK.m())),
         dkf.lg,
         Pair.of(cww::b, a(dkf.cK.m())),
         dkf.j,
         Pair.of(cww::b, a(dkf.cK.m())),
         dkf.k,
         Pair.of(cww::b, a(dkf.j.m())),
         dkf.tj,
         Pair.of((Predicate<daz>)$$0 -> true, a(dkf.j.m(), cxk.ea))
      )
   );

   public cww(cyx $$0, float $$1, float $$2, cxc.a $$3) {
      super($$0, axk.bD, $$1, $$2, $$3);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      Pair<Predicate<daz>, Consumer<daz>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bta.e;
      } else {
         Predicate<daz> $$4 = (Predicate<daz>)$$3.getFirst();
         Consumer<daz> $$5 = (Consumer<daz>)$$3.getSecond();
         if ($$4.test($$0)) {
            cpo $$6 = $$0.o();
            $$1.a($$6, $$2, awv.mL, aww.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bvx.d($$0.p()));
               }
            }

            return bta.a;
         } else {
            return bta.e;
         }
      }
   }

   public static Consumer<daz> a(dxo $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(eck.c, $$1.a(), eck.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<daz> a(dxo $$0, dgy $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(eck.c, $$2.a(), eck.a.a($$2.o(), $$0));
         dkd.a($$2.q(), $$2.a(), $$2.k(), new cxg($$1));
      };
   }

   public static boolean b(daz $$0) {
      return $$0.k() != jm.a && $$0.q().a_($$0.a().d()).l();
   }
}
