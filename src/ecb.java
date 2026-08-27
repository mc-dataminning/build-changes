import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ecb extends dzf {
   public static final Codec<ecb> d = a(ecb::new);

   public ecb(dzf.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      ddb $$1 = ddb.a($$0.f());
      hx $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dzf.b($$2, (Consumer<dzx>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dzx $$0, dzf.a $$1, hx $$2, ddb $$3) {
      List<eca.i> $$4 = Lists.newLinkedList();
      eca.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cuj $$0, cuh $$1, dld $$2, auu $$3, dyx $$4, csv $$5, dzu $$6) {
      hx.a $$7 = new hx.a();
      int $$8 = $$0.J_();
      dyx $$9 = $$6.b();
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

                  $$0.a($$7, cwr.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public dzo<?> e() {
      return dzo.p;
   }
}
