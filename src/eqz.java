import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqz extends eoc {
   public static final MapCodec<eqz> d = a(eqz::new);

   public eqz(eoc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      dqu $$1 = dqu.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eoc.b($$2, (Consumer<eou>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(eou $$0, eoc.a $$1, jh $$2, dqu $$3) {
      List<eqy.i> $$4 = Lists.newLinkedList();
      eqy.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dhy $$0, dhw $$1, dzj $$2, bam $$3, enu $$4, dgg $$5, eor $$6) {
      jh.a $$7 = new jh.a();
      int $$8 = $$0.L_();
      enu $$9 = $$6.b();
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
   public eol<?> e() {
      return eol.p;
   }
}
