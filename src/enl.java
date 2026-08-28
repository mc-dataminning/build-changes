import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class enl extends eko {
   public static final MapCodec<enl> d = a(enl::new);

   public enl(eko.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      dnj $$1 = dnj.a($$0.f());
      je $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eko.b($$2, (Consumer<elg>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(elg $$0, eko.a $$1, je $$2, dnj $$3) {
      List<enk.i> $$4 = Lists.newLinkedList();
      enk.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, eld $$6) {
      je.a $$7 = new je.a();
      int $$8 = $$0.G_();
      ekg $$9 = $$6.b();
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

                  $$0.a($$7, dgx.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public ekx<?> e() {
      return ekx.p;
   }
}
