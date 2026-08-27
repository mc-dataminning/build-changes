import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class clu extends ckr {
   protected static final Map<cvz, Pair<Predicate<cos>, Consumer<cos>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cwb.i,
         Pair.of(clu::b, b(cwb.cC.o())),
         cwb.kE,
         Pair.of(clu::b, b(cwb.cC.o())),
         cwb.j,
         Pair.of(clu::b, b(cwb.cC.o())),
         cwb.k,
         Pair.of(clu::b, b(cwb.j.o())),
         cwb.sH,
         Pair.of((Predicate<cos>)$$0 -> true, a(cwb.j.o(), cmk.dN))
      )
   );

   protected clu(cnu $$0, int $$1, float $$2, cmc.a $$3) {
      super((float)$$1, $$2, $$0, arr.bA, $$3);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      Pair<Predicate<cos>, Consumer<cos>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bjl.d;
      } else {
         Predicate<cos> $$4 = (Predicate<cos>)$$3.getFirst();
         Consumer<cos> $$5 = (Consumer<cos>)$$3.getSecond();
         if ($$4.test($$0)) {
            cer $$6 = $$0.o();
            $$1.a($$6, $$2, arc.lz, ard.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bjl.a($$1.B);
         } else {
            return bjl.d;
         }
      }
   }

   public static Consumer<cos> b(dip $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dmz.c, $$1.a(), dmz.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cos> a(dip $$0, csx $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dmz.c, $$2.a(), dmz.a.a($$2.o(), $$0));
         cvz.a($$2.q(), $$2.a(), $$2.k(), new cmh($$1));
      };
   }

   public static boolean b(cos $$0) {
      return $$0.k() != ia.a && $$0.q().a_($$0.a().c()).i();
   }
}
