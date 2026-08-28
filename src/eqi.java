import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqi extends enl {
   public static final MapCodec<eqi> d = a(eqi::new);

   public eqi(enl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      dqd $$1 = dqd.a($$0.f());
      ji $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new enl.b($$2, (Consumer<eod>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(eod $$0, enl.a $$1, ji $$2, dqd $$3) {
      List<eqh.i> $$4 = Lists.newLinkedList();
      eqh.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, eoa $$6) {
      ji.a $$7 = new ji.a();
      int $$8 = $$0.L_();
      end $$9 = $$6.b();
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

                  $$0.a($$7, djn.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public enu<?> e() {
      return enu.p;
   }
}
