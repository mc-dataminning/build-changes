import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ety extends erb {
   public static final MapCodec<ety> d = a(ety::new);

   public ety(erb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      dsz $$1 = dsz.a($$0.f());
      iu $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new erb.b($$2, (Consumer<ert>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ert $$0, erb.a $$1, iu $$2, dsz $$3) {
      List<etx.i> $$4 = Lists.newLinkedList();
      etx.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5, erq $$6) {
      iu.a $$7 = new iu.a();
      int $$8 = $$0.G_();
      eqt $$9 = $$6.b();
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

                  $$0.a($$7, dmh.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public erk<?> e() {
      return erk.p;
   }
}
