public class cfo extends cex {
   private static final cmh f = new cmh(cmk.vi);
   private int g = 200;

   public cfo(blj<? extends cfo> $$0, csy $$1) {
      super($$0, $$1, f);
   }

   public cfo(csy $$0, blv $$1, cmh $$2) {
      super(blj.aS, $$1, $$0, $$2);
   }

   public cfo(csy $$0, double $$1, double $$2, double $$3, cmh $$4) {
      super(blj.aS, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && !this.b) {
         this.dM().a(jv.P, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(blv $$0) {
      super.a($$0);
      bks $$1 = new bks(bku.x, this.g, 0);
      $$0.b($$1, this.J());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }
}
