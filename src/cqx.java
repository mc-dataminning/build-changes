import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cqx extends cpy {
   protected static final Map<dby, Pair<Predicate<cuq>, Consumer<cuq>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dca.i,
         Pair.of(cqx::b, b(dca.cC.n())),
         dca.kE,
         Pair.of(cqx::b, b(dca.cC.n())),
         dca.j,
         Pair.of(cqx::b, b(dca.cC.n())),
         dca.k,
         Pair.of(cqx::b, b(dca.j.n())),
         dca.sH,
         Pair.of((Predicate<cuq>)$$0 -> true, a(dca.j.n(), crm.dN))
      )
   );

   public cqx(csv $$0, cre.a $$1) {
      super($$0, avc.bB, $$1);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      Pair<Predicate<cuq>, Consumer<cuq>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return boa.d;
      } else {
         Predicate<cuq> $$4 = (Predicate<cuq>)$$3.getFirst();
         Consumer<cuq> $$5 = (Consumer<cuq>)$$3.getSecond();
         if ($$4.test($$0)) {
            cjt $$6 = $$0.o();
            $$1.a($$6, $$2, aum.lY, aun.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bqo.d($$0.p()));
               }
            }

            return boa.a($$1.B);
         } else {
            return boa.d;
         }
      }
   }

   public static Consumer<cuq> b(doz $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dts.c, $$1.a(), dts.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cuq> a(doz $$0, cyw $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dts.c, $$2.a(), dts.a.a($$2.o(), $$0));
         dby.a($$2.q(), $$2.a(), $$2.k(), new crj($$1));
      };
   }

   public static boolean b(cuq $$0) {
      return $$0.k() != ih.a && $$0.q().a_($$0.a().c()).i();
   }
}
