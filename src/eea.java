import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eea extends ebe {
   public static final Codec<eea> d = a(eea::new);

   public eea(ebe.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      dfa $$1 = dfa.a($$0.f());
      hz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ebe.b($$2, (Consumer<ebw>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ebw $$0, ebe.a $$1, hz $$2, dfa $$3) {
      List<edz.i> $$4 = Lists.newLinkedList();
      edz.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, ebt $$6) {
      hz.a $$7 = new hz.a();
      int $$8 = $$0.J_();
      eaw $$9 = $$6.b();
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

                  $$0.a($$7, cyq.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public ebn<?> e() {
      return ebn.p;
   }
}
