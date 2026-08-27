import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxo extends duz {
   public static final Codec<dxo> d = a(dxo::new);

   public dxo(duz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      cyy $$1 = cyy.a($$0.f());
      gu $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new duz.b($$2, (Consumer<dvr>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dvr $$0, duz.a $$1, gu $$2, cyy $$3) {
      List<dxn.i> $$4 = Lists.newLinkedList();
      dxn.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, dvo $$6) {
      gu.a $$7 = new gu.a();
      int $$8 = $$0.C_();
      dur $$9 = $$6.b();
      int $$10 = $$9.h();

      for (int $$11 = $$4.g(); $$11 <= $$4.j(); $$11++) {
         for (int $$12 = $$4.i(); $$12 <= $$4.l(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.t($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.t($$7) && !$$0.a_($$7).k()) {
                     break;
                  }

                  $$0.a($$7, csn.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public dvi<?> e() {
      return dvi.p;
   }
}
