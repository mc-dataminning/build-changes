import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class efy extends edc {
   public static final Codec<efy> d = a(efy::new);

   public efy(edc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      dgm $$1 = dgm.a($$0.f());
      ib $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new edc.b($$2, (Consumer<edu>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(edu $$0, edc.a $$1, ib $$2, dgm $$3) {
      List<efx.i> $$4 = Lists.newLinkedList();
      efx.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, edr $$6) {
      ib.a $$7 = new ib.a();
      int $$8 = $$0.I_();
      ecu $$9 = $$6.b();
      int $$10 = $$9.i();

      for (int $$11 = $$4.h(); $$11 <= $$4.k(); $$11++) {
         for (int $$12 = $$4.j(); $$12 <= $$4.m(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.u($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.u($$7) && !$$0.a_($$7).k()) {
                     break;
                  }

                  $$0.a($$7, dac.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public edl<?> e() {
      return edl.p;
   }
}
