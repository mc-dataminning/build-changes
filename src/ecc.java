import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ecc extends dzg {
   public static final Codec<ecc> d = a(ecc::new);

   public ecc(dzg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      ddc $$1 = ddc.a($$0.f());
      hx $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dzg.b($$2, (Consumer<dzy>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dzy $$0, dzg.a $$1, hx $$2, ddc $$3) {
      List<ecb.i> $$4 = Lists.newLinkedList();
      ecb.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cuk $$0, cui $$1, dle $$2, auv $$3, dyy $$4, csw $$5, dzv $$6) {
      hx.a $$7 = new hx.a();
      int $$8 = $$0.J_();
      dyy $$9 = $$6.b();
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

                  $$0.a($$7, cws.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public dzp<?> e() {
      return dzp.p;
   }
}
