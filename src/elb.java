import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elb extends eif {
   public static final MapCodec<elb> d = a(elb::new);

   public elb(eif.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      dlh $$1 = dlh.a($$0.f());
      iz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eif.b($$2, (Consumer<eix>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(eix $$0, eif.a $$1, iz $$2, dlh $$3) {
      List<ela.i> $$4 = Lists.newLinkedList();
      ela.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, eiu $$6) {
      iz.a $$7 = new iz.a();
      int $$8 = $$0.I_();
      ehx $$9 = $$6.b();
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

                  $$0.a($$7, dew.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public eio<?> e() {
      return eio.p;
   }
}
