import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class euf extends eri {
   public static final MapCodec<euf> d = a(euf::new);

   public euf(eri.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      dtg $$1 = dtg.a($$0.f());
      iv $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eri.b($$2, (Consumer<esa>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(esa $$0, eri.a $$1, iv $$2, dtg $$3) {
      List<eue.i> $$4 = Lists.newLinkedList();
      eue.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, erx $$6) {
      iv.a $$7 = new iv.a();
      int $$8 = $$0.G_();
      era $$9 = $$6.b();
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

                  $$0.a($$7, dmo.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public err<?> e() {
      return err.p;
   }
}
