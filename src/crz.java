import java.util.List;
import javax.annotation.Nullable;

public class crz extends crb {
   public crz(bwj<? extends crz> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crz(dip $$0, bwz $$1, cys $$2) {
      super(bwj.aV, $$0, $$1, $$2);
   }

   public crz(dip $$0, double $$1, double $$2, double $$3, cys $$4) {
      super(bwj.aV, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(aro $$0, cys $$1, @Nullable bwa $$2) {
      dao $$3 = $$1.a(kj.R, dao.a);
      float $$4 = $$1.a(kj.S, 1.0F);
      Iterable<bve> $$5 = $$3.a();
      fdr $$6 = this.cR().c(4.0, 2.0, 4.0);
      List<bwz> $$7 = this.dV().a(bwz.class, $$6);
      if (!$$7.isEmpty()) {
         bwa $$8 = this.z();

         for (bwz $$9 : $$7) {
            if ($$9.fK()) {
               double $$10 = this.g($$9);
               if ($$10 < 16.0) {
                  double $$11;
                  if ($$9 == $$2) {
                     $$11 = 1.0;
                  } else {
                     $$11 = 1.0 - Math.sqrt($$10) / 4.0;
                  }

                  for (bve $$13 : $$5) {
                     je<bvc> $$14 = $$13.c();
                     if ($$14.a().a()) {
                        $$14.a().a($$0, this, this.q(), $$9, $$13.e(), $$11);
                     } else {
                        int $$15 = $$13.a($$2x -> (int)($$11 * (double)$$2x * (double)$$4 + 0.5));
                        bve $$16 = new bve($$14, $$15, $$13.e(), $$13.f(), $$13.g());
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
