import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class euk extends ern {
   public static final MapCodec<euk> d = a(euk::new);

   public euk(ern.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      dtl $$1 = dtl.a($$0.f());
      iv $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ern.b($$2, (Consumer<esf>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(esf $$0, ern.a $$1, iv $$2, dtl $$3) {
      List<euj.i> $$4 = Lists.newLinkedList();
      euj.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, esc $$6) {
      iv.a $$7 = new iv.a();
      int $$8 = $$0.G_();
      erf $$9 = $$6.b();
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

                  $$0.a($$7, dmt.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public erw<?> e() {
      return erw.p;
   }
}
