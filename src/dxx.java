import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxx extends dvi {
   public static final Codec<dxx> d = a(dxx::new);

   public dxx(dvi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      czh $$1 = czh.a($$0.f());
      gw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dvi.b($$2, (Consumer<dwa>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dwa $$0, dvi.a $$1, gw $$2, czh $$3) {
      List<dxw.i> $$4 = Lists.newLinkedList();
      dxw.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5, dvx $$6) {
      gw.a $$7 = new gw.a();
      int $$8 = $$0.H_();
      dva $$9 = $$6.b();
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

                  $$0.a($$7, csw.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public dvr<?> e() {
      return dvr.p;
   }
}
