import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqk extends enn {
   public static final MapCodec<eqk> d = a(eqk::new);

   public eqk(enn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      dqf $$1 = dqf.a($$0.f());
      ji $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new enn.b($$2, (Consumer<eof>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(eof $$0, enn.a $$1, ji $$2, dqf $$3) {
      List<eqj.i> $$4 = Lists.newLinkedList();
      eqj.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dhh $$0, dhf $$1, dyu $$2, azh $$3, enf $$4, dfp $$5, eoc $$6) {
      ji.a $$7 = new ji.a();
      int $$8 = $$0.L_();
      enf $$9 = $$6.b();
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

                  $$0.a($$7, djp.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public enw<?> e() {
      return enw.p;
   }
}
