import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cte extends csf {
   protected static final Map<dea, Pair<Predicate<cxd>, Consumer<cxd>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dec.i,
         Pair.of(cte::b, a(dec.cC.n())),
         dec.kE,
         Pair.of(cte::b, a(dec.cC.n())),
         dec.j,
         Pair.of(cte::b, a(dec.cC.n())),
         dec.k,
         Pair.of(cte::b, a(dec.j.n())),
         dec.sH,
         Pair.of((Predicate<cxd>)$$0 -> true, a(dec.j.n(), ctt.dO))
      )
   );

   public cte(cvf $$0, ctl.a $$1) {
      super($$0, avx.bB, $$1);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      Pair<Predicate<cxd>, Consumer<cxd>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bpw.d;
      } else {
         Predicate<cxd> $$4 = (Predicate<cxd>)$$3.getFirst();
         Consumer<cxd> $$5 = (Consumer<cxd>)$$3.getSecond();
         if ($$4.test($$0)) {
            cly $$6 = $$0.o();
            $$1.a($$6, $$2, avi.mn, avj.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bsq.d($$0.p()));
               }
            }

            return bpw.a($$1.B);
         } else {
            return bpw.d;
         }
      }
   }

   public static Consumer<cxd> a(drd $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dvw.c, $$1.a(), dvw.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cxd> a(drd $$0, day $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dvw.c, $$2.a(), dvw.a.a($$2.o(), $$0));
         dea.a($$2.q(), $$2.a(), $$2.k(), new ctq($$1));
      };
   }

   public static boolean b(cxd $$0) {
      return $$0.k() != it.a && $$0.q().a_($$0.a().c()).i();
   }
}
