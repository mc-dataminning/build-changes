import java.util.List;
import javax.annotation.Nullable;

public class cth extends csj {
   public cth(bxe<? extends cth> $$0, djz $$1) {
      super($$0, $$1);
   }

   public cth(djz $$0, bxw $$1, daa $$2) {
      super(bxe.aW, $$0, $$1, $$2);
   }

   public cth(djz $$0, double $$1, double $$2, double $$3, daa $$4) {
      super(bxe.aW, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected czw g() {
      return dae.wz;
   }

   @Override
   public void a(aru $$0, daa $$1, @Nullable bwv $$2) {
      dbw $$3 = $$1.a(kl.R, dbw.a);
      float $$4 = $$1.a(kl.S, 1.0F);
      Iterable<bvz> $$5 = $$3.a();
      ffn $$6 = this.cR().c(4.0, 2.0, 4.0);
      List<bxw> $$7 = this.dV().a(bxw.class, $$6);
      if (!$$7.isEmpty()) {
         bwv $$8 = this.z();

         for (bxw $$9 : $$7) {
            if ($$9.fL()) {
               double $$10 = this.g($$9);
               if ($$10 < 16.0) {
                  double $$11;
                  if ($$9 == $$2) {
                     $$11 = 1.0;
                  } else {
                     $$11 = 1.0 - Math.sqrt($$10) / 4.0;
                  }

                  for (bvz $$13 : $$5) {
                     jg<bvx> $$14 = $$13.c();
                     if ($$14.a().a()) {
                        $$14.a().a($$0, this, this.q(), $$9, $$13.e(), $$11);
                     } else {
                        int $$15 = $$13.a($$2x -> (int)($$11 * (double)$$2x * (double)$$4 + 0.5));
                        bvz $$16 = new bvz($$14, $$15, $$13.e(), $$13.f(), $$13.g());
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
