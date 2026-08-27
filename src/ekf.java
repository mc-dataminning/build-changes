import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekf extends ehj {
   public static final MapCodec<ekf> d = a(ekf::new);

   public ekf(ehj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      dkl $$1 = dkl.a($$0.f());
      io $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ehj.b($$2, (Consumer<eib>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(eib $$0, ehj.a $$1, io $$2, dkl $$3) {
      List<eke.i> $$4 = Lists.newLinkedList();
      eke.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, ehy $$6) {
      io.a $$7 = new io.a();
      int $$8 = $$0.I_();
      ehb $$9 = $$6.b();
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

                  $$0.a($$7, dea.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public ehs<?> e() {
      return ehs.p;
   }
}
