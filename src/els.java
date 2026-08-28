import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class els extends eiw {
   public static final MapCodec<els> d = a(els::new);

   public els(eiw.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      dlu $$1 = dlu.a($$0.f());
      ja $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eiw.b($$2, (Consumer<ejo>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ejo $$0, eiw.a $$1, ja $$2, dlu $$3) {
      List<elr.i> $$4 = Lists.newLinkedList();
      elr.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ejl $$6) {
      ja.a $$7 = new ja.a();
      int $$8 = $$0.I_();
      eio $$9 = $$6.b();
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

                  $$0.a($$7, dfj.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public ejf<?> e() {
      return ejf.p;
   }
}
