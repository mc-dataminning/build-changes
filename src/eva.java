import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eva extends esd {
   public static final MapCodec<eva> d = a(eva::new);

   public eva(esd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      dty $$1 = dty.a($$0.f());
      iw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new esd.b($$2, (Consumer<esv>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(esv $$0, esd.a $$1, iw $$2, dty $$3) {
      List<euz.i> $$4 = Lists.newLinkedList();
      euz.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, ess $$6) {
      iw.a $$7 = new iw.a();
      int $$8 = $$0.K_();
      erv $$9 = $$6.b();
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

                  $$0.a($$7, dng.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public esm<?> e() {
      return esm.p;
   }
}
