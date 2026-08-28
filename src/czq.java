import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class czq extends czw {
   protected static final Map<dne, Pair<Predicate<ddv>, Consumer<ddv>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dng.i,
         Pair.of(czq::b, a(dng.cN.m())),
         dng.lk,
         Pair.of(czq::b, a(dng.cN.m())),
         dng.j,
         Pair.of(czq::b, a(dng.cN.m())),
         dng.k,
         Pair.of(czq::b, a(dng.j.m())),
         dng.tr,
         Pair.of((Predicate<ddv>)$$0 -> true, a(dng.j.m(), dae.eg))
      )
   );

   public czq(dbo $$0, float $$1, float $$2, czw.a $$3) {
      super($$3.c($$0, $$1, $$2));
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      Pair<Predicate<ddv>, Consumer<ddv>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return but.e;
      } else {
         Predicate<ddv> $$4 = (Predicate<ddv>)$$3.getFirst();
         Consumer<ddv> $$5 = (Consumer<ddv>)$$3.getSecond();
         if ($$4.test($$0)) {
            crz $$6 = $$0.o();
            $$1.a($$6, $$2, awr.mP, aws.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bxw.d($$0.p()));
               }
            }

            return but.a;
         } else {
            return but.e;
         }
      }
   }

   public static Consumer<ddv> a(ebg $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(egg.c, $$1.a(), egg.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<ddv> a(ebg $$0, djy $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(egg.c, $$2.a(), egg.a.a($$2.o(), $$0));
         dne.a($$2.q(), $$2.a(), $$2.k(), new daa($$1));
      };
   }

   public static boolean b(ddv $$0) {
      return $$0.k() != jc.a && $$0.q().a_($$0.a().d()).l();
   }
}
