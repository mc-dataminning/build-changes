import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class epf extends emi {
   public static final MapCodec<epf> d = a(epf::new);

   public epf(emi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      dpd $$1 = dpd.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new emi.b($$2, (Consumer<ena>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ena $$0, emi.a $$1, jh $$2, dpd $$3) {
      List<epe.i> $$4 = Lists.newLinkedList();
      epe.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, emx $$6) {
      jh.a $$7 = new jh.a();
      int $$8 = $$0.K_();
      ema $$9 = $$6.b();
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

                  $$0.a($$7, dis.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public emr<?> e() {
      return emr.p;
   }
}
