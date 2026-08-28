import java.util.List;
import javax.annotation.Nullable;

public class ctq extends css {
   public ctq(bxn<? extends ctq> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public ctq(dkj $$0, byf $$1, dak $$2) {
      super(bxn.aW, $$0, $$1, $$2);
   }

   public ctq(dkj $$0, double $$1, double $$2, double $$3, dak $$4) {
      super(bxn.aW, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dag g() {
      return dao.wz;
   }

   @Override
   public void a(asb $$0, dak $$1, @Nullable bxe $$2) {
      dcg $$3 = $$1.a(kl.R, dcg.a);
      float $$4 = $$1.a(kl.S, 1.0F);
      Iterable<bwi> $$5 = $$3.a();
      ffx $$6 = this.cR().c(4.0, 2.0, 4.0);
      List<byf> $$7 = this.dV().a(byf.class, $$6);
      if (!$$7.isEmpty()) {
         bxe $$8 = this.z();

         for (byf $$9 : $$7) {
            if ($$9.fL()) {
               double $$10 = this.g($$9);
               if ($$10 < 16.0) {
                  double $$11;
                  if ($$9 == $$2) {
                     $$11 = 1.0;
                  } else {
                     $$11 = 1.0 - Math.sqrt($$10) / 4.0;
                  }

                  for (bwi $$13 : $$5) {
                     jg<bwg> $$14 = $$13.c();
                     if ($$14.a().a()) {
                        $$14.a().a($$0, this, this.q(), $$9, $$13.e(), $$11);
                     } else {
                        int $$15 = $$13.a($$2x -> (int)($$11 * (double)$$2x * (double)$$4 + 0.5));
                        bwi $$16 = new bwi($$14, $$15, $$13.e(), $$13.f(), $$13.g());
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
