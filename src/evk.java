import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class evk extends esn {
   public static final MapCodec<evk> d = a(evk::new);

   public evk(esn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      dui $$1 = dui.a($$0.f());
      iw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new esn.b($$2, (Consumer<etf>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(etf $$0, esn.a $$1, iw $$2, dui $$3) {
      List<evj.i> $$4 = Lists.newLinkedList();
      evj.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, etc $$6) {
      iw.a $$7 = new iw.a();
      int $$8 = $$0.K_();
      esf $$9 = $$6.b();
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

                  $$0.a($$7, dnq.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public esw<?> e() {
      return esw.p;
   }
}
