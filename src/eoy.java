import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eoy extends emb {
   public static final MapCodec<eoy> d = a(eoy::new);

   public eoy(emb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      dow $$1 = dow.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new emb.b($$2, (Consumer<emt>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(emt $$0, emb.a $$1, jh $$2, dow $$3) {
      List<eox.i> $$4 = Lists.newLinkedList();
      eox.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, emq $$6) {
      jh.a $$7 = new jh.a();
      int $$8 = $$0.I_();
      elt $$9 = $$6.b();
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

                  $$0.a($$7, dil.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public emk<?> e() {
      return emk.p;
   }
}
