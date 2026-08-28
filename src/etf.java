import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class etf extends eqi {
   public static final MapCodec<etf> d = a(etf::new);

   public etf(eqi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      dsm $$1 = dsm.a($$0.f());
      iu $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eqi.b($$2, (Consumer<era>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(era $$0, eqi.a $$1, iu $$2, dsm $$3) {
      List<ete.i> $$4 = Lists.newLinkedList();
      ete.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, eqx $$6) {
      iu.a $$7 = new iu.a();
      int $$8 = $$0.G_();
      eqa $$9 = $$6.b();
      int $$10 = $$9.i();

      for (int $$11 = $$4.h(); $$11 <= $$4.k(); $$11++) {
         for (int $$12 = $$4.j(); $$12 <= $$4.m(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.v($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.v($$7) && !$$0.a_($$7).n()) {
                     break;
                  }

                  $$0.a($$7, dlw.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public eqr<?> e() {
      return eqr.p;
   }
}
