import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ebv extends dyz {
   public static final Codec<ebv> d = a(ebv::new);

   public ebv(dyz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      dcv $$1 = dcv.a($$0.f());
      hx $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dyz.b($$2, (Consumer<dzr>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dzr $$0, dyz.a $$1, hx $$2, dcv $$3) {
      List<ebu.i> $$4 = Lists.newLinkedList();
      ebu.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, dzo $$6) {
      hx.a $$7 = new hx.a();
      int $$8 = $$0.J_();
      dyr $$9 = $$6.b();
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

                  $$0.a($$7, cwl.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public dzi<?> e() {
      return dzi.p;
   }
}
