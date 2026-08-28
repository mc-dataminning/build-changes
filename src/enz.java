import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class enz extends elc {
   public static final MapCodec<enz> d = a(enz::new);

   public enz(elc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      dnx $$1 = dnx.a($$0.f());
      je $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new elc.b($$2, (Consumer<elu>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(elu $$0, elc.a $$1, je $$2, dnx $$3) {
      List<eny.i> $$4 = Lists.newLinkedList();
      eny.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, elr $$6) {
      je.a $$7 = new je.a();
      int $$8 = $$0.G_();
      eku $$9 = $$6.b();
      int $$10 = $$9.i();

      for (int $$11 = $$4.h(); $$11 <= $$4.k(); $$11++) {
         for (int $$12 = $$4.j(); $$12 <= $$4.m(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.u($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.u($$7) && !$$0.a_($$7).n()) {
                     break;
                  }

                  $$0.a($$7, dhl.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public ell<?> e() {
      return ell.p;
   }
}
