import java.util.List;
import javax.annotation.Nullable;

public class ctf extends csh {
   public ctf(bxc<? extends ctf> $$0, djx $$1) {
      super($$0, $$1);
   }

   public ctf(djx $$0, bxu $$1, czy $$2) {
      super(bxc.aW, $$0, $$1, $$2);
   }

   public ctf(djx $$0, double $$1, double $$2, double $$3, czy $$4) {
      super(bxc.aW, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected czu g() {
      return dac.wz;
   }

   @Override
   public void a(ars $$0, czy $$1, @Nullable bwt $$2) {
      dbu $$3 = $$1.a(kk.R, dbu.a);
      float $$4 = $$1.a(kk.S, 1.0F);
      Iterable<bvx> $$5 = $$3.a();
      ffl $$6 = this.cR().c(4.0, 2.0, 4.0);
      List<bxu> $$7 = this.dV().a(bxu.class, $$6);
      if (!$$7.isEmpty()) {
         bwt $$8 = this.z();

         for (bxu $$9 : $$7) {
            if ($$9.fL()) {
               double $$10 = this.g($$9);
               if ($$10 < 16.0) {
                  double $$11;
                  if ($$9 == $$2) {
                     $$11 = 1.0;
                  } else {
                     $$11 = 1.0 - Math.sqrt($$10) / 4.0;
                  }

                  for (bvx $$13 : $$5) {
                     jf<bvv> $$14 = $$13.c();
                     if ($$14.a().a()) {
                        $$14.a().a($$0, this, this.q(), $$9, $$13.e(), $$11);
                     } else {
                        int $$15 = $$13.a($$2x -> (int)($$11 * (double)$$2x * (double)$$4 + 0.5));
                        bvx $$16 = new bvx($$14, $$15, $$13.e(), $$13.f(), $$13.g());
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
