import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class emj extends ejm {
   public static final MapCodec<emj> d = a(emj::new);

   public emj(ejm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      dmk $$1 = dmk.a($$0.f());
      jd $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ejm.b($$2, (Consumer<eke>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(eke $$0, ejm.a $$1, jd $$2, dmk $$3) {
      List<emi.i> $$4 = Lists.newLinkedList();
      emi.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, ekb $$6) {
      jd.a $$7 = new jd.a();
      int $$8 = $$0.I_();
      eje $$9 = $$6.b();
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

                  $$0.a($$7, dfy.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public ejv<?> e() {
      return ejv.p;
   }
}
