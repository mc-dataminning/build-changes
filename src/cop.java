import javax.annotation.Nullable;

public class cop extends cnw {
   private int f = 200;

   public cop(btq<? extends cop> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cop(dds $$0, buf $$1, cvl $$2, @Nullable cvl $$3) {
      super(btq.aV, $$1, $$0, $$2, $$3);
   }

   public cop(dds $$0, double $$1, double $$2, double $$3, cvl $$4, @Nullable cvl $$5) {
      super(btq.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B && !this.b) {
         this.dS().a(ln.R, this.dx(), this.dz(), this.dD(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(buf $$0) {
      super.a($$0);
      bsq $$1 = new bsq(bss.x, this.f, 0);
      $$0.b($$1, this.E());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cvl v() {
      return new cvl(cvo.vr);
   }
}
