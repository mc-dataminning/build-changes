import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eod extends elg {
   public static final MapCodec<eod> d = a(eod::new);

   public eod(elg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      doa $$1 = doa.a($$0.f());
      jf $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new elg.b($$2, (Consumer<ely>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ely $$0, elg.a $$1, jf $$2, doa $$3) {
      List<eoc.i> $$4 = Lists.newLinkedList();
      eoc.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, elv $$6) {
      jf.a $$7 = new jf.a();
      int $$8 = $$0.H_();
      eky $$9 = $$6.b();
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

                  $$0.a($$7, dho.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public elp<?> e() {
      return elp.p;
   }
}
