import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxm extends dux {
   public static final Codec<dxm> d = a(dxm::new);

   public dxm(dux.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      cyw $$1 = cyw.a($$0.f());
      gv $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dux.b($$2, (Consumer<dvp>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dvp $$0, dux.a $$1, gv $$2, cyw $$3) {
      List<dxl.i> $$4 = Lists.newLinkedList();
      dxl.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, dvm $$6) {
      gv.a $$7 = new gv.a();
      int $$8 = $$0.C_();
      dup $$9 = $$6.b();
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

                  $$0.a($$7, csl.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public dvg<?> e() {
      return dvg.p;
   }
}
