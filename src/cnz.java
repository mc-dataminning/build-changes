import java.util.List;

public class cnz extends cnx {
   public static final float e = 4.0F;

   public cnz(btq<? extends cnz> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cnz(dds $$0, buf $$1, eye $$2) {
      super(btq.A, $$1, $$2, $$0);
   }

   @Override
   protected void a(eyc $$0) {
      super.a($$0);
      if ($$0.c() != eyc.a.c || !this.e(((eyb)$$0).a())) {
         if (!this.dS().B) {
            List<buf> $$1 = this.dS().a(buf.class, this.cO().c(4.0, 2.0, 4.0));
            bte $$2 = new bte(this.dS(), this.dx(), this.dz(), this.dD());
            btj $$3 = this.s();
            if ($$3 instanceof buf) {
               $$2.a((buf)$$3);
            }

            $$2.a(ln.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bsq(bss.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (buf $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dx(), $$4.dz(), $$4.dD());
                     break;
                  }
               }
            }

            this.dS().c(2006, this.ds(), this.ba() ? -1 : 1);
            this.dS().b($$2);
            this.as();
         }
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      return false;
   }

   @Override
   protected ll q() {
      return ln.h;
   }

   @Override
   protected boolean o() {
      return false;
   }
}
