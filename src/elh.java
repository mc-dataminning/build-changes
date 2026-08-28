import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elh extends eil {
   public static final MapCodec<elh> d = a(elh::new);

   public elh(eil.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      dln $$1 = dln.a($$0.f());
      iz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eil.b($$2, (Consumer<ejd>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ejd $$0, eil.a $$1, iz $$2, dln $$3) {
      List<elg.i> $$4 = Lists.newLinkedList();
      elg.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, eja $$6) {
      iz.a $$7 = new iz.a();
      int $$8 = $$0.I_();
      eid $$9 = $$6.b();
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

                  $$0.a($$7, dfc.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public eiu<?> e() {
      return eiu.p;
   }
}
