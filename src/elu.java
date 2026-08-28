import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elu extends eix {
   public static final MapCodec<elu> d = a(elu::new);

   public elu(eix.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      dlv $$1 = dlv.a($$0.f());
      ja $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eix.b($$2, (Consumer<ejp>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ejp $$0, eix.a $$1, ja $$2, dlv $$3) {
      List<elt.i> $$4 = Lists.newLinkedList();
      elt.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ejm $$6) {
      ja.a $$7 = new ja.a();
      int $$8 = $$0.I_();
      eip $$9 = $$6.b();
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

                  $$0.a($$7, dfk.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public ejg<?> e() {
      return ejg.p;
   }
}
