import javax.annotation.Nullable;

public class chp extends cam {
   private final cho a;

   public chp(cho $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dP().a(this.a.du(), this.a.dw(), this.a.dA(), 10.0);
   }

   @Override
   public void a() {
      aqu $$0 = (aqu)this.a.dP();
      bqp $$1 = $$0.d_(this.a.dp());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      btm $$2 = bsx.am.a((dcw)$$0);
      if ($$2 != null) {
         $$2.e(this.a.du(), this.a.dw(), this.a.dA());
         $$2.a(true);
         $$0.b($$2);
         ckl $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               chi $$5 = this.a($$1);
               if ($$5 != null) {
                  ckl $$6 = this.a($$1, $$5);
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
   private chi a(bqp $$0) {
      cho $$1 = bsx.aO.a(this.a.dP());
      if ($$1 != null) {
         $$1.a((aqu)this.a.dP(), $$0, btr.k, null);
         $$1.a_(this.a.du(), this.a.dw(), this.a.dA());
         $$1.am = 60;
         $$1.fS();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private ckl a(bqp $$0, chi $$1) {
      ckl $$2 = bsx.aN.a($$1.dP());
      if ($$2 != null) {
         $$2.a((aqu)$$1.dP(), $$0, btr.k, null);
         $$2.a_($$1.du(), $$1.dw(), $$1.dA());
         $$2.am = 60;
         $$2.fS();
         if ($$2.a(bsy.f).e()) {
            $$2.a(bsy.f, new cuq(cut.pG));
         }

         this.a($$2, bsy.a, $$0);
         this.a($$2, bsy.f, $$0);
      }

      return $$2;
   }

   private void a(ckl $$0, bsy $$1, bqp $$2) {
      cuq $$3 = $$0.a($$1);
      $$3.b(kq.k, dai.a);
      dae.a($$3, $$0.dP().H_(), dbp.a, $$2, $$0.dS());
      $$0.a($$1, $$3);
   }
}
