import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxr extends dvc {
   public static final Codec<dxr> d = a(dxr::new);

   public dxr(dvc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      czn $$1 = czn.a($$0.f());
      gw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dvc.b($$2, (Consumer<dvu>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dvu $$0, dvc.a $$1, gw $$2, czn $$3) {
      List<dxq.i> $$4 = Lists.newLinkedList();
      dxq.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, dvr $$6) {
      gw.a $$7 = new gw.a();
      int $$8 = $$0.H_();
      duu $$9 = $$6.b();
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

                  $$0.a($$7, cte.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public dvl<?> e() {
      return dvl.p;
   }
}
