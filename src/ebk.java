import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ebk extends dyo {
   public static final Codec<ebk> d = a(ebk::new);

   public ebk(dyo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      dcl $$1 = dcl.a($$0.f());
      hv $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dyo.b($$2, (Consumer<dzg>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dzg $$0, dyo.a $$1, hv $$2, dcl $$3) {
      List<ebj.i> $$4 = Lists.newLinkedList();
      ebj.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, dzd $$6) {
      hv.a $$7 = new hv.a();
      int $$8 = $$0.J_();
      dyg $$9 = $$6.b();
      int $$10 = $$9.i();

      for (int $$11 = $$4.h(); $$11 <= $$4.k(); $$11++) {
         for (int $$12 = $$4.j(); $$12 <= $$4.m(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.t($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.t($$7) && !$$0.a_($$7).k()) {
                     break;
                  }

                  $$0.a($$7, cwb.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public dyx<?> e() {
      return dyx.p;
   }
}
