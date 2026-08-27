import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class emp extends ejt {
   public static final Codec<emp> d = a(emp::new);

   public emp(ejt.d $$0) {
      super($$0);
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      dmd $$1 = dmd.a($$0.f());
      ir $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ejt.c($$2, (Consumer<ekl>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ekl $$0, ejt.b $$1, ir $$2, dmd $$3) {
      List<emo.i> $$4 = Lists.newLinkedList();
      emo.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, eki $$6) {
      ir.a $$7 = new ir.a();
      int $$8 = $$0.J_();
      ejl $$9 = $$6.b();
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

                  $$0.a($$7, dfe.q.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public ekc<?> f() {
      return ekc.p;
   }
}
