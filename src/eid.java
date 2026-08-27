import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eid extends efh {
   public static final Codec<eid> d = a(eid::new);

   public eid(efh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      dik $$1 = dik.a($$0.f());
      ib $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new efh.b($$2, (Consumer<efz>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(efz $$0, efh.a $$1, ib $$2, dik $$3) {
      List<eic.i> $$4 = Lists.newLinkedList();
      eic.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, efw $$6) {
      ib.a $$7 = new ib.a();
      int $$8 = $$0.I_();
      eez $$9 = $$6.b();
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

                  $$0.a($$7, dca.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public efq<?> e() {
      return efq.p;
   }
}
