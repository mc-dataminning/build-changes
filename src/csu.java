import java.util.List;
import javax.annotation.Nullable;

public class csu extends crw {
   public csu(bwr<? extends csu> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csu(djm $$0, bxj $$1, czn $$2) {
      super(bwr.aV, $$0, $$1, $$2);
   }

   public csu(djm $$0, double $$1, double $$2, double $$3, czn $$4) {
      super(bwr.aV, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected czj g() {
      return czr.wz;
   }

   @Override
   public void a(arq $$0, czn $$1, @Nullable bwi $$2) {
      dbj $$3 = $$1.a(kk.R, dbj.a);
      float $$4 = $$1.a(kk.S, 1.0F);
      Iterable<bvm> $$5 = $$3.a();
      fex $$6 = this.cQ().c(4.0, 2.0, 4.0);
      List<bxj> $$7 = this.dU().a(bxj.class, $$6);
      if (!$$7.isEmpty()) {
         bwi $$8 = this.z();

         for (bxj $$9 : $$7) {
            if ($$9.fK()) {
               double $$10 = this.g($$9);
               if ($$10 < 16.0) {
                  double $$11;
                  if ($$9 == $$2) {
                     $$11 = 1.0;
                  } else {
                     $$11 = 1.0 - Math.sqrt($$10) / 4.0;
                  }

                  for (bvm $$13 : $$5) {
                     jf<bvk> $$14 = $$13.c();
                     if ($$14.a().a()) {
                        $$14.a().a($$0, this, this.q(), $$9, $$13.e(), $$11);
                     } else {
                        int $$15 = $$13.a($$2x -> (int)($$11 * (double)$$2x * (double)$$4 + 0.5));
                        bvm $$16 = new bvm($$14, $$15, $$13.e(), $$13.f(), $$13.g());
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
