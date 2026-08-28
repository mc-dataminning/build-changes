import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class erg extends eoj {
   public static final MapCodec<erg> d = a(erg::new);

   public erg(eoj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      dqw $$1 = dqw.a($$0.f());
      ji $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eoj.b($$2, (Consumer<epb>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(epb $$0, eoj.a $$1, ji $$2, dqw $$3) {
      List<erf.i> $$4 = Lists.newLinkedList();
      erf.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, eoy $$6) {
      ji.a $$7 = new ji.a();
      int $$8 = $$0.G_();
      eob $$9 = $$6.b();
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

                  $$0.a($$7, dkg.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public eos<?> e() {
      return eos.p;
   }
}
