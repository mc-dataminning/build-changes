import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class euy extends esb {
   public static final MapCodec<euy> d = a(euy::new);

   public euy(esb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      dtw $$1 = dtw.a($$0.f());
      iv $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new esb.b($$2, (Consumer<est>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(est $$0, esb.a $$1, iv $$2, dtw $$3) {
      List<eux.i> $$4 = Lists.newLinkedList();
      eux.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, esq $$6) {
      iv.a $$7 = new iv.a();
      int $$8 = $$0.K_();
      ert $$9 = $$6.b();
      int $$10 = $$9.i();

      for (int $$11 = $$4.h(); $$11 <= $$4.k(); $$11++) {
         for (int $$12 = $$4.j(); $$12 <= $$4.m(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.v($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.v($$7) && !$$0.a_($$7).n()) {
                     break;
                  }

                  $$0.a($$7, dne.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public esk<?> e() {
      return esk.p;
   }
}
