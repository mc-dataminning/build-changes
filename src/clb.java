import javax.annotation.Nullable;

public class clb extends ckz implements bvr {
   private static final int c = 50;
   private static final int d = 70;
   private static final akl<Boolean> e = akp.a(clb.class, akn.k);
   public static final String b = "sheared";

   public static bwh.a gx() {
      return ckz.q().a(bwi.s, 16.0);
   }

   public clb(bul<? extends clb> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("sheared", this.gy());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gy() {
      return this.am.a(e);
   }

   public void x(boolean $$0) {
      this.am.a(e, $$0);
   }

   @Override
   protected bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(cwf.rW) && this.a()) {
         this.a(awm.h, $$2);
         this.a(eag.M, $$0);
         if (!this.dX().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bsd.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awk w() {
      return awl.cn;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.cp;
   }

   @Override
   protected awk o_() {
      return awl.co;
   }

   @Override
   protected awk t() {
      return awl.cr;
   }

   @Override
   protected cou a(cwb $$0, float $$1, @Nullable cwb $$2) {
      cou $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cow $$4) {
         $$4.a(new btj(btl.s, 100));
      }

      return $$3;
   }

   @Override
   protected int gu() {
      return 50;
   }

   @Override
   protected int gv() {
      return 70;
   }

   @Override
   public void a(awm $$0, cwb $$1) {
      this.dX().a(null, this, awl.cq, $$0, 1.0F, 1.0F);
      this.k($$1);
      this.x(true);
   }

   private void k(cwb $$0) {
      this.a(ety.aQ, $$0, $$0x -> this.a($$0x, this.dt()));
   }

   @Override
   public boolean a() {
      return !this.gy() && this.bM();
   }
}
