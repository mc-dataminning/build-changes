import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cxa extends cwd {
   protected static final Map<dke, Pair<Predicate<dbd>, Consumer<dbd>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dkg.i,
         Pair.of(cxa::b, a(dkg.cK.m())),
         dkg.kZ,
         Pair.of(cxa::b, a(dkg.cK.m())),
         dkg.j,
         Pair.of(cxa::b, a(dkg.cK.m())),
         dkg.k,
         Pair.of(cxa::b, a(dkg.j.m())),
         dkg.tc,
         Pair.of((Predicate<dbd>)$$0 -> true, a(dkg.j.m(), cxo.dY))
      )
   );

   public cxa(czb $$0, float $$1, float $$2, cxg.a $$3) {
      super($$0, axu.bD, $$1, $$2, $$3);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      Pair<Predicate<dbd>, Consumer<dbd>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bte.e;
      } else {
         Predicate<dbd> $$4 = (Predicate<dbd>)$$3.getFirst();
         Consumer<dbd> $$5 = (Consumer<dbd>)$$3.getSecond();
         if ($$4.test($$0)) {
            cps $$6 = $$0.o();
            $$1.a($$6, $$2, axf.mE, axg.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bwb.d($$0.p()));
               }
            }

            return bte.a;
         } else {
            return bte.e;
         }
      }
   }

   public static Consumer<dbd> a(dxn $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ecj.c, $$1.a(), ecj.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dbd> a(dxn $$0, dgz $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ecj.c, $$2.a(), ecj.a.a($$2.o(), $$0));
         dke.a($$2.q(), $$2.a(), $$2.k(), new cxk($$1));
      };
   }

   public static boolean b(dbd $$0) {
      return $$0.k() != jm.a && $$0.q().a_($$0.a().d()).l();
   }
}
