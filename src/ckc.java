import java.util.List;

public class ckc extends cka {
   public static final float e = 4.0F;

   public ckc(bqb<? extends ckc> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckc(cyx $$0, bqo $$1, double $$2, double $$3, double $$4) {
      super(bqb.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ery $$0) {
      super.a($$0);
      if ($$0.c() != ery.a.c || !this.e(((erx)$$0).a())) {
         if (!this.dM().B) {
            List<bqo> $$1 = this.dM().a(bqo.class, this.cH().c(4.0, 2.0, 4.0));
            bpr $$2 = new bpr(this.dM(), this.dr(), this.dt(), this.dx());
            bpv $$3 = this.u();
            if ($$3 instanceof bqo) {
               $$2.a((bqo)$$3);
            }

            $$2.a(kl.i);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.k());
            $$2.a(new bph(bpj.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bqo $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dr(), $$4.dt(), $$4.dx());
                     break;
                  }
               }
            }

            this.dM().c(2006, this.dm(), this.aU() ? -1 : 1);
            this.dM().b($$2);
            this.am();
         }
      }
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      return false;
   }

   @Override
   protected kj v() {
      return kl.i;
   }

   @Override
   protected boolean r() {
      return false;
   }
}
