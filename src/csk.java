import java.util.List;
import javax.annotation.Nullable;

public class csk extends crm {
   public csk(bwo<? extends csk> $$0, dja $$1) {
      super($$0, $$1);
   }

   public csk(dja $$0, bxe $$1, czd $$2) {
      super(bwo.aV, $$0, $$1, $$2);
   }

   public csk(dja $$0, double $$1, double $$2, double $$3, czd $$4) {
      super(bwo.aV, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected cyz g() {
      return czh.wz;
   }

   @Override
   public void a(arq $$0, czd $$1, @Nullable bwf $$2) {
      daz $$3 = $$1.a(kj.R, daz.a);
      float $$4 = $$1.a(kj.S, 1.0F);
      Iterable<bvj> $$5 = $$3.a();
      fel $$6 = this.cR().c(4.0, 2.0, 4.0);
      List<bxe> $$7 = this.dV().a(bxe.class, $$6);
      if (!$$7.isEmpty()) {
         bwf $$8 = this.z();

         for (bxe $$9 : $$7) {
            if ($$9.fL()) {
               double $$10 = this.g($$9);
               if ($$10 < 16.0) {
                  double $$11;
                  if ($$9 == $$2) {
                     $$11 = 1.0;
                  } else {
                     $$11 = 1.0 - Math.sqrt($$10) / 4.0;
                  }

                  for (bvj $$13 : $$5) {
                     je<bvh> $$14 = $$13.c();
                     if ($$14.a().a()) {
                        $$14.a().a($$0, this, this.q(), $$9, $$13.e(), $$11);
                     } else {
                        int $$15 = $$13.a($$2x -> (int)($$11 * (double)$$2x * (double)$$4 + 0.5));
                        bvj $$16 = new bvj($$14, $$15, $$13.e(), $$13.f(), $$13.g());
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
