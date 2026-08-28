import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cwe extends cvh {
   protected static final Map<djl, Pair<Predicate<dah>, Consumer<dah>>> a = Maps.newHashMap(
      ImmutableMap.of(
         djn.i,
         Pair.of(cwe::b, a(djn.cK.m())),
         djn.lg,
         Pair.of(cwe::b, a(djn.cK.m())),
         djn.j,
         Pair.of(cwe::b, a(djn.cK.m())),
         djn.k,
         Pair.of(cwe::b, a(djn.j.m())),
         djn.tj,
         Pair.of((Predicate<dah>)$$0 -> true, a(djn.j.m(), cws.ea))
      )
   );

   public cwe(cyf $$0, float $$1, float $$2, cwk.a $$3) {
      super($$0, awp.bD, $$1, $$2, $$3);
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      Pair<Predicate<dah>, Consumer<dah>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bsj.e;
      } else {
         Predicate<dah> $$4 = (Predicate<dah>)$$3.getFirst();
         Consumer<dah> $$5 = (Consumer<dah>)$$3.getSecond();
         if ($$4.test($$0)) {
            cow $$6 = $$0.o();
            $$1.a($$6, $$2, awa.mL, awb.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bvg.d($$0.p()));
               }
            }

            return bsj.a;
         } else {
            return bsj.e;
         }
      }
   }

   public static Consumer<dah> a(dww $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ebs.c, $$1.a(), ebs.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dah> a(dww $$0, dgg $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ebs.c, $$2.a(), ebs.a.a($$2.o(), $$0));
         djl.a($$2.q(), $$2.a(), $$2.k(), new cwo($$1));
      };
   }

   public static boolean b(dah $$0) {
      return $$0.k() != jn.a && $$0.q().a_($$0.a().d()).l();
   }
}
