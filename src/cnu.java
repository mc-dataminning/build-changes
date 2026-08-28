public class cnu extends cnc {
   private int f = 200;

   public cnu(bsz<? extends cnu> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cnu(dbx $$0, bto $$1, cuo $$2) {
      super(bsz.aV, $$1, $$0, $$2);
   }

   public cnu(dbx $$0, double $$1, double $$2, double $$3, cuo $$4) {
      super(bsz.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && !this.b) {
         this.dP().a(li.R, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bto $$0) {
      super.a($$0);
      bsb $$1 = new bsb(bsd.x, this.f, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cuo x() {
      return new cuo(cur.vp);
   }
}
