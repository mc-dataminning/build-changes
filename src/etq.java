import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class etq extends eqt {
   public static final MapCodec<etq> d = a(etq::new);

   public etq(eqt.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      dst $$1 = dst.a($$0.f());
      iu $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eqt.b($$2, (Consumer<erl>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(erl $$0, eqt.a $$1, iu $$2, dst $$3) {
      List<etp.i> $$4 = Lists.newLinkedList();
      etp.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, eri $$6) {
      iu.a $$7 = new iu.a();
      int $$8 = $$0.G_();
      eql $$9 = $$6.b();
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

                  $$0.a($$7, dmc.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public erc<?> e() {
      return erc.p;
   }
}
