import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eoo extends elr {
   public static final MapCodec<eoo> d = a(eoo::new);

   public eoo(elr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      dol $$1 = dol.a($$0.f());
      jg $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new elr.b($$2, (Consumer<emj>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(emj $$0, elr.a $$1, jg $$2, dol $$3) {
      List<eon.i> $$4 = Lists.newLinkedList();
      eon.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, emg $$6) {
      jg.a $$7 = new jg.a();
      int $$8 = $$0.I_();
      elj $$9 = $$6.b();
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

                  $$0.a($$7, dia.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public ema<?> e() {
      return ema.p;
   }
}
