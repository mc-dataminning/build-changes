import javax.annotation.Nullable;

public class ckk extends cki implements bva {
   private static final int c = 50;
   private static final int d = 70;
   private static final akg<Boolean> e = akk.a(ckk.class, aki.k);
   public static final String b = "sheared";

   public static bvq.a gs() {
      return cki.q().a(bvr.s, 16.0);
   }

   public ckk(btv<? extends ckk> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("sheared", this.gt());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gt() {
      return this.am.a(e);
   }

   public void x(boolean $$0) {
      this.am.a(e, $$0);
   }

   @Override
   protected brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(cvt.rW) && this.a()) {
         this.a(awf.h);
         this.a(dzl.M, $$0);
         if (!this.dS().B) {
            $$2.a(1, $$0, d($$1));
         }

         return brp.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awd w() {
      return awe.cn;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.cp;
   }

   @Override
   protected awd n_() {
      return awe.co;
   }

   @Override
   protected awd t() {
      return awe.cr;
   }

   @Override
   protected cob a(cvp $$0, float $$1, @Nullable cvp $$2) {
      cob $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cod $$4) {
         $$4.a(new bsv(bsx.s, 100));
      }

      return $$3;
   }

   @Override
   protected int gp() {
      return 50;
   }

   @Override
   protected int gq() {
      return 70;
   }

   @Override
   public void a(awf $$0) {
      this.dS().a(null, this, awe.cq, $$0, 1.0F, 1.0F);
      this.gw();
      this.x(true);
   }

   private void gw() {
      this.a(etd.aO, $$0 -> this.a($$0, this.do()));
   }

   @Override
   public boolean a() {
      return !this.gt() && this.bI();
   }
}
