import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqj extends enm {
   public static final MapCodec<eqj> d = a(eqj::new);

   public eqj(enm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      dqe $$1 = dqe.a($$0.f());
      ji $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new enm.b($$2, (Consumer<eoe>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(eoe $$0, enm.a $$1, ji $$2, dqe $$3) {
      List<eqi.i> $$4 = Lists.newLinkedList();
      eqi.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dhg $$0, dhe $$1, dyt $$2, azh $$3, ene $$4, dfo $$5, eob $$6) {
      ji.a $$7 = new ji.a();
      int $$8 = $$0.L_();
      ene $$9 = $$6.b();
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

                  $$0.a($$7, djo.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public env<?> e() {
      return env.p;
   }
}
