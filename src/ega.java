import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ega extends ede {
   public static final Codec<ega> d = a(ega::new);

   public ega(ede.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      dgo $$1 = dgo.a($$0.f());
      ib $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ede.b($$2, (Consumer<edw>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(edw $$0, ede.a $$1, ib $$2, dgo $$3) {
      List<efz.i> $$4 = Lists.newLinkedList();
      efz.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cxw $$0, cxu $$1, doy $$2, axd $$3, ecw $$4, cwi $$5, edt $$6) {
      ib.a $$7 = new ib.a();
      int $$8 = $$0.I_();
      ecw $$9 = $$6.b();
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

                  $$0.a($$7, dae.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public edn<?> e() {
      return edn.p;
   }
}
