import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eeh extends ebl {
   public static final Codec<eeh> d = a(eeh::new);

   public eeh(ebl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      dfe $$1 = dfe.a($$0.f());
      hz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ebl.b($$2, (Consumer<ecd>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ecd $$0, ebl.a $$1, hz $$2, dfe $$3) {
      List<eeg.i> $$4 = Lists.newLinkedList();
      eeg.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, eca $$6) {
      hz.a $$7 = new hz.a();
      int $$8 = $$0.J_();
      ebd $$9 = $$6.b();
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

                  $$0.a($$7, cyu.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public ebu<?> e() {
      return ebu.p;
   }
}
