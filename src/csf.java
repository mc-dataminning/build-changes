import java.util.List;
import javax.annotation.Nullable;

public class csf extends crh {
   public csf(bwm<? extends csf> $$0, div $$1) {
      super($$0, $$1);
   }

   public csf(div $$0, bxc $$1, cyy $$2) {
      super(bwm.aV, $$0, $$1, $$2);
   }

   public csf(div $$0, double $$1, double $$2, double $$3, cyy $$4) {
      super(bwm.aV, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected cyu g() {
      return czc.wu;
   }

   @Override
   public void a(arq $$0, cyy $$1, @Nullable bwd $$2) {
      dau $$3 = $$1.a(kj.R, dau.a);
      float $$4 = $$1.a(kj.S, 1.0F);
      Iterable<bvh> $$5 = $$3.a();
      fed $$6 = this.cR().c(4.0, 2.0, 4.0);
      List<bxc> $$7 = this.dV().a(bxc.class, $$6);
      if (!$$7.isEmpty()) {
         bwd $$8 = this.z();

         for (bxc $$9 : $$7) {
            if ($$9.fK()) {
               double $$10 = this.g($$9);
               if ($$10 < 16.0) {
                  double $$11;
                  if ($$9 == $$2) {
                     $$11 = 1.0;
                  } else {
                     $$11 = 1.0 - Math.sqrt($$10) / 4.0;
                  }

                  for (bvh $$13 : $$5) {
                     je<bvf> $$14 = $$13.c();
                     if ($$14.a().a()) {
                        $$14.a().a($$0, this, this.q(), $$9, $$13.e(), $$11);
                     } else {
                        int $$15 = $$13.a($$2x -> (int)($$11 * (double)$$2x * (double)$$4 + 0.5));
                        bvh $$16 = new bvh($$14, $$15, $$13.e(), $$13.f(), $$13.g());
                        if (!$$16.a(20)) {
                           $$9.b($$16, $$8);
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
