import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elm extends eiq {
   public static final MapCodec<elm> d = a(elm::new);

   public elm(eiq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      dls $$1 = dls.a($$0.f());
      ja $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eiq.b($$2, (Consumer<eji>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(eji $$0, eiq.a $$1, ja $$2, dls $$3) {
      List<ell.i> $$4 = Lists.newLinkedList();
      ell.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ejf $$6) {
      ja.a $$7 = new ja.a();
      int $$8 = $$0.I_();
      eii $$9 = $$6.b();
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

                  $$0.a($$7, dfh.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public eiz<?> e() {
      return eiz.p;
   }
}
