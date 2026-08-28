import javax.annotation.Nullable;

public class cjh extends ccd {
   private final cjg a;

   public cjh(cjg $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dW().a(this.a.dB(), this.a.dD(), this.a.dH(), 10.0);
   }

   @Override
   public void a() {
      arc $$0 = (arc)this.a.dW();
      bsg $$1 = $$0.d_(this.a.dw());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bve $$2 = buq.aw.a($$0, bup.k);
      if ($$2 != null) {
         $$2.e(this.a.dB(), this.a.dD(), this.a.dH());
         $$2.a(true);
         $$0.b($$2);
         cme $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cja $$5 = this.a($$1);
               if ($$5 != null) {
                  cme $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.dZ().a(0.0, 1.1485), 0.0, this.a.dZ().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cja a(bsg $$0) {
      cjg $$1 = buq.bf.a(this.a.dW(), bup.k);
      if ($$1 != null) {
         $$1.a((arc)this.a.dW(), $$0, bup.k, null);
         $$1.a_(this.a.dB(), this.a.dD(), this.a.dH());
         $$1.aj = 60;
         $$1.aj();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cme a(bsg $$0, cja $$1) {
      cme $$2 = buq.be.a($$1.dW(), bup.k);
      if ($$2 != null) {
         $$2.a((arc)$$1.dW(), $$0, bup.k, null);
         $$2.a_($$1.dB(), $$1.dD(), $$1.dH());
         $$2.aj = 60;
         $$2.aj();
         if ($$2.a(bur.f).f()) {
            $$2.a(bur.f, new cwn(cwr.ql));
         }

         this.a($$2, bur.a, $$0);
         this.a($$2, bur.f, $$0);
      }

      return $$2;
   }

   private void a(cme $$0, bur $$1, bsg $$2) {
      cwn $$3 = $$0.a($$1);
      $$3.b(kv.l, ddd.a);
      dcz.a($$3, $$0.dW().K_(), del.a, $$2, $$0.dZ());
      $$0.a($$1, $$3);
   }
}
