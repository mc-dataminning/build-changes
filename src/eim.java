import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eim extends efq {
   public static final Codec<eim> d = a(eim::new);

   public eim(efq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      dit $$1 = dit.a($$0.f());
      id $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new efq.b($$2, (Consumer<egi>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(egi $$0, efq.a $$1, id $$2, dit $$3) {
      List<eil.i> $$4 = Lists.newLinkedList();
      eil.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, egf $$6) {
      id.a $$7 = new id.a();
      int $$8 = $$0.I_();
      efi $$9 = $$6.b();
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

                  $$0.a($$7, dcj.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public efz<?> e() {
      return efz.p;
   }
}
