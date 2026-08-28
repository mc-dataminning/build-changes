import javax.annotation.Nullable;

public class ckn extends ckl implements bvd {
   private static final int c = 50;
   private static final int d = 70;
   private static final akh<Boolean> e = akl.a(ckn.class, akj.k);
   public static final String b = "sheared";

   public static bvt.a gr() {
      return ckl.q().a(bvu.s, 16.0);
   }

   public ckn(bty<? extends ckn> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("sheared", this.gs());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gs() {
      return this.am.a(e);
   }

   public void x(boolean $$0) {
      this.am.a(e, $$0);
   }

   @Override
   protected brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(cvw.rW) && this.a()) {
         this.a(awh.h);
         this.a(dzp.M, $$0);
         if (!this.dS().B) {
            $$2.a(1, $$0, d($$1));
         }

         return brs.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awf w() {
      return awg.cn;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.cp;
   }

   @Override
   protected awf o_() {
      return awg.co;
   }

   @Override
   protected awf t() {
      return awg.cr;
   }

   @Override
   protected coe a(cvs $$0, float $$1, @Nullable cvs $$2) {
      coe $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cog $$4) {
         $$4.a(new bsy(bta.s, 100));
      }

      return $$3;
   }

   @Override
   protected int go() {
      return 50;
   }

   @Override
   protected int gp() {
      return 70;
   }

   @Override
   public void a(awh $$0) {
      this.dS().a(null, this, awg.cq, $$0, 1.0F, 1.0F);
      this.gv();
      this.x(true);
   }

   private void gv() {
      this.a(eth.aM, $$0 -> this.a($$0, this.do()));
   }

   @Override
   public boolean a() {
      return !this.gs() && this.bI();
   }
}
