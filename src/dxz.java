import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxz extends dvk {
   public static final Codec<dxz> d = a(dxz::new);

   public dxz(dvk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      czj $$1 = czj.a($$0.f());
      gw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dvk.b($$2, (Consumer<dwc>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dwc $$0, dvk.a $$1, gw $$2, czj $$3) {
      List<dxy.i> $$4 = Lists.newLinkedList();
      dxy.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, dvz $$6) {
      gw.a $$7 = new gw.a();
      int $$8 = $$0.H_();
      dvc $$9 = $$6.b();
      int $$10 = $$9.h();

      for (int $$11 = $$4.g(); $$11 <= $$4.j(); $$11++) {
         for (int $$12 = $$4.i(); $$12 <= $$4.l(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.t($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.t($$7) && !$$0.a_($$7).k()) {
                     break;
                  }

                  $$0.a($$7, csy.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public dvt<?> e() {
      return dvt.p;
   }
}
