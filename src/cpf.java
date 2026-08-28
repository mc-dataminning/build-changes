import java.util.List;

public class cpf extends cpd {
   public static final float d = 4.0F;

   public cpf(buq<? extends cpf> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cpf(dgg $$0, bvf $$1, fay $$2) {
      super(buq.J, $$1, $$2, $$0);
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if ($$0.d() != faw.a.c || !this.e(((fav)$$0).a())) {
         if (!this.dW().C) {
            List<bvf> $$1 = this.dW().a(bvf.class, this.cR().c(4.0, 2.0, 4.0));
            buc $$2 = new buc(this.dW(), this.dB(), this.dD(), this.dH());
            buj $$3 = this.p();
            if ($$3 instanceof bvf) {
               $$2.a((bvf)$$3);
            }

            $$2.a(lt.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.c()) / (float)$$2.g());
            $$2.a(new bto(btq.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bvf $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dB(), $$4.dD(), $$4.dH());
                     break;
                  }
               }
            }

            this.dW().c(2006, this.dw(), this.bb() ? -1 : 1);
            this.dW().b($$2);
            this.at();
         }
      }
   }

   @Override
   protected lr s() {
      return lt.h;
   }

   @Override
   protected boolean m() {
      return false;
   }
}
