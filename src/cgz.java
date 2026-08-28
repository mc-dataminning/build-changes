import javax.annotation.Nullable;

public class cgz extends bzw {
   private final cgy a;

   public cgz(cgy $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dP().a(this.a.du(), this.a.dw(), this.a.dA(), 10.0);
   }

   @Override
   public void e() {
      aqk $$0 = (aqk)this.a.dP();
      bqb $$1 = $$0.d_(this.a.dp());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bsx $$2 = bsj.am.a((dcd)$$0);
      if ($$2 != null) {
         $$2.e(this.a.du(), this.a.dw(), this.a.dA());
         $$2.a(true);
         $$0.b($$2);
         cjv $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cgs $$5 = this.a($$1);
               if ($$5 != null) {
                  cjv $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.dS().a(0.0, 1.1485), 0.0, this.a.dS().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cgs a(bqb $$0) {
      cgy $$1 = bsj.aO.a(this.a.dP());
      if ($$1 != null) {
         $$1.a((aqk)this.a.dP(), $$0, btc.k, null);
         $$1.a_(this.a.du(), this.a.dw(), this.a.dA());
         $$1.am = 60;
         $$1.fQ();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cjv a(bqb $$0, cgs $$1) {
      cjv $$2 = bsj.aN.a($$1.dP());
      if ($$2 != null) {
         $$2.a((aqk)$$1.dP(), $$0, btc.k, null);
         $$2.a_($$1.du(), $$1.dw(), $$1.dA());
         $$2.am = 60;
         $$2.fQ();
         if ($$2.a(bsk.f).e()) {
            $$2.a(bsk.f, new cua(cud.pG));
         }

         this.a($$2, bsk.a);
         this.a($$2, bsk.f);
      }

      return $$2;
   }

   private void a(cjv $$0, bsk $$1) {
      cua $$2 = $$0.a($$1);
      $$2.b(kn.k, czp.a);
      czl.a($$2, daw.a, $$0.dP(), $$0.dp(), $$0.dS());
      $$0.a($$1, $$2);
   }
}
