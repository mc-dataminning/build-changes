import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cwx extends cxd {
   protected static final Map<dke, Pair<Predicate<daz>, Consumer<daz>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dkg.i,
         Pair.of(cwx::b, a(dkg.cK.m())),
         dkg.lg,
         Pair.of(cwx::b, a(dkg.cK.m())),
         dkg.j,
         Pair.of(cwx::b, a(dkg.cK.m())),
         dkg.k,
         Pair.of(cwx::b, a(dkg.j.m())),
         dkg.tl,
         Pair.of((Predicate<daz>)$$0 -> true, a(dkg.j.m(), cxl.ec))
      )
   );

   public cwx(cyw $$0, float $$1, float $$2, cxd.a $$3) {
      super($$3.a($$0, awp.bD, $$1, $$2, false));
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      Pair<Predicate<daz>, Consumer<daz>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bsy.e;
      } else {
         Predicate<daz> $$4 = (Predicate<daz>)$$3.getFirst();
         Consumer<daz> $$5 = (Consumer<daz>)$$3.getSecond();
         if ($$4.test($$0)) {
            cpr $$6 = $$0.o();
            $$1.a($$6, $$2, awa.mL, awb.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bvy.d($$0.p()));
               }
            }

            return bsy.a;
         } else {
            return bsy.e;
         }
      }
   }

   public static Consumer<daz> a(dxq $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ecp.c, $$1.a(), ecp.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<daz> a(dxq $$0, dgy $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ecp.c, $$2.a(), ecp.a.a($$2.o(), $$0));
         dke.a($$2.q(), $$2.a(), $$2.k(), new cxh($$1));
      };
   }

   public static boolean b(daz $$0) {
      return $$0.k() != jn.a && $$0.q().a_($$0.a().d()).l();
   }
}
