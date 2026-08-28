import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cuf extends ctg {
   protected static final Map<dfb, Pair<Predicate<cye>, Consumer<cye>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dfd.i,
         Pair.of(cuf::b, a(dfd.cC.o())),
         dfd.kE,
         Pair.of(cuf::b, a(dfd.cC.o())),
         dfd.j,
         Pair.of(cuf::b, a(dfd.cC.o())),
         dfd.k,
         Pair.of(cuf::b, a(dfd.j.o())),
         dfd.sH,
         Pair.of((Predicate<cye>)$$0 -> true, a(dfd.j.o(), cuu.dO))
      )
   );

   public cuf(cwg $$0, cum.a $$1) {
      super($$0, awp.bB, $$1);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      Pair<Predicate<cye>, Consumer<cye>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqw.e;
      } else {
         Predicate<cye> $$4 = (Predicate<cye>)$$3.getFirst();
         Consumer<cye> $$5 = (Consumer<cye>)$$3.getSecond();
         if ($$4.test($$0)) {
            cmz $$6 = $$0.o();
            $$1.a($$6, $$2, awa.mn, awb.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, btr.d($$0.p()));
               }
            }

            return bqw.a($$1.B);
         } else {
            return bqw.e;
         }
      }
   }

   public static Consumer<cye> a(dse $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dwx.c, $$1.a(), dwx.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cye> a(dse $$0, dbz $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dwx.c, $$2.a(), dwx.a.a($$2.o(), $$0));
         dfb.a($$2.q(), $$2.a(), $$2.k(), new cur($$1));
      };
   }

   public static boolean b(cye $$0) {
      return $$0.k() != je.a && $$0.q().a_($$0.a().c()).i();
   }
}
