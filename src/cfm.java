import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cfm extends cej {
   protected static final Map<cpn, Pair<Predicate<cij>, Consumer<cij>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cpo.i,
         Pair.of(cfm::b, b(cpo.cC.n())),
         cpo.kE,
         Pair.of(cfm::b, b(cpo.cC.n())),
         cpo.j,
         Pair.of(cfm::b, b(cpo.cC.n())),
         cpo.k,
         Pair.of(cfm::b, b(cpo.j.n())),
         cpo.rG,
         Pair.of((Predicate<cij>)$$0 -> true, a(cpo.j.n(), cgc.ds))
      )
   );

   protected cfm(chm $$0, int $$1, float $$2, cfu.a $$3) {
      super((float)$$1, $$2, $$0, amw.by, $$3);
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      Pair<Predicate<cij>, Consumer<cij>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bdx.d;
      } else {
         Predicate<cij> $$4 = (Predicate<cij>)$$3.getFirst();
         Consumer<cij> $$5 = (Consumer<cij>)$$3.getSecond();
         if ($$4.test($$0)) {
            byo $$6 = $$0.o();
            $$1.a($$6, $$2, amh.kL, ami.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bdx.a($$1.B);
         } else {
            return bdx.d;
         }
      }
   }

   public static Consumer<cij> b(dcb $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dgl.c, $$1.a(), dgl.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cij> a(dcb $$0, cml $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dgl.c, $$2.a(), dgl.a.a($$2.o(), $$0));
         cpn.a($$2.q(), $$2.a(), $$2.k(), new cfz($$1));
      };
   }

   public static boolean b(cij $$0) {
      return $$0.k() != ha.a && $$0.q().a_($$0.a().c()).i();
   }
}
