import javax.annotation.Nullable;

public class ckw extends cku implements bvm {
   private static final int c = 50;
   private static final int d = 70;
   private static final akk<Boolean> e = ako.a(ckw.class, akm.k);
   public static final String b = "sheared";

   public static bwc.a gy() {
      return cku.q().a(bwd.s, 16.0);
   }

   public ckw(bug<? extends ckw> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("sheared", this.gz());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gz() {
      return this.am.a(e);
   }

   public void x(boolean $$0) {
      this.am.a(e, $$0);
   }

   @Override
   protected bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(cwb.rW) && this.a()) {
         this.a(awl.h);
         this.a(eaa.M, $$0);
         if (!this.dX().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bry.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awj w() {
      return awk.cn;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.cp;
   }

   @Override
   protected awj o_() {
      return awk.co;
   }

   @Override
   protected awj t() {
      return awk.cr;
   }

   @Override
   protected cop a(cvx $$0, float $$1, @Nullable cvx $$2) {
      cop $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cor $$4) {
         $$4.a(new bte(btg.s, 100));
      }

      return $$3;
   }

   @Override
   protected int gv() {
      return 50;
   }

   @Override
   protected int gw() {
      return 70;
   }

   @Override
   public void a(awl $$0) {
      this.dX().a(null, this, awk.cq, $$0, 1.0F, 1.0F);
      this.gC();
      this.x(true);
   }

   private void gC() {
      this.a(ets.aM, $$0 -> this.a($$0, this.dt()));
   }

   @Override
   public boolean a() {
      return !this.gz() && this.bM();
   }
}
