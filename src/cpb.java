import java.util.List;

public class cpb extends coz {
   public static final float e = 4.0F;

   public cpb(bup<? extends cpb> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpb(dff $$0, bve $$1, ezr $$2) {
      super(bup.A, $$1, $$2, $$0);
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);
      if ($$0.d() != ezp.a.c || !this.e(((ezo)$$0).a())) {
         if (!this.dY().C) {
            List<bve> $$1 = this.dY().a(bve.class, this.cT().c(4.0, 2.0, 4.0));
            bub $$2 = new bub(this.dY(), this.dD(), this.dF(), this.dJ());
            bui $$3 = this.s();
            if ($$3 instanceof bve) {
               $$2.a((bve)$$3);
            }

            $$2.a(ls.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new btn(btp.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bve $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dD(), $$4.dF(), $$4.dJ());
                     break;
                  }
               }
            }

            this.dY().c(2006, this.dy(), this.bd() ? -1 : 1);
            this.dY().b($$2);
            this.av();
         }
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      return false;
   }

   @Override
   protected lq q() {
      return ls.h;
   }

   @Override
   protected boolean o() {
      return false;
   }
}
