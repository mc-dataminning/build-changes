import javax.annotation.Nullable;

public class chp extends cam {
   private final cho a;

   public chp(cho $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dO().a(this.a.dt(), this.a.dv(), this.a.dz(), 10.0);
   }

   @Override
   public void a() {
      aqu $$0 = (aqu)this.a.dO();
      bqp $$1 = $$0.d_(this.a.do());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      btm $$2 = bsx.am.a((dcw)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dt(), this.a.dv(), this.a.dz());
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
                     $$5.j(this.a.dR().a(0.0, 1.1485), 0.0, this.a.dR().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private chi a(bqp $$0) {
      cho $$1 = bsx.aO.a(this.a.dO());
      if ($$1 != null) {
         $$1.a((aqu)this.a.dO(), $$0, btr.k, null);
         $$1.a_(this.a.dt(), this.a.dv(), this.a.dz());
         $$1.am = 60;
         $$1.fR();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private ckl a(bqp $$0, chi $$1) {
      ckl $$2 = bsx.aN.a($$1.dO());
      if ($$2 != null) {
         $$2.a((aqu)$$1.dO(), $$0, btr.k, null);
         $$2.a_($$1.dt(), $$1.dv(), $$1.dz());
         $$2.am = 60;
         $$2.fR();
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
      dae.a($$3, $$0.dO().H_(), dbp.a, $$2, $$0.dR());
      $$0.a($$1, $$3);
   }
}
