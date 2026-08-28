import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ele extends eii {
   public static final MapCodec<ele> d = a(ele::new);

   public ele(eii.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      dlk $$1 = dlk.a($$0.f());
      iz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eii.b($$2, (Consumer<eja>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(eja $$0, eii.a $$1, iz $$2, dlk $$3) {
      List<eld.i> $$4 = Lists.newLinkedList();
      eld.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, eix $$6) {
      iz.a $$7 = new iz.a();
      int $$8 = $$0.I_();
      eia $$9 = $$6.b();
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

                  $$0.a($$7, dez.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public eir<?> e() {
      return eir.p;
   }
}
