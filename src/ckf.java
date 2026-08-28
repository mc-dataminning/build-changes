import javax.annotation.Nullable;

public class ckf extends ckd implements buv {
   private static final int c = 50;
   private static final int d = 70;
   private static final akg<Boolean> e = akk.a(ckf.class, aki.k);
   public static final String b = "sheared";

   public static bvl.a gr() {
      return ckd.q().a(bvm.s, 16.0);
   }

   public ckf(btq<? extends ckf> $$0, dds $$1) {
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
      $$0.a("sheared", this.gs());
   }

   @Override
   public void a(uf $$0) {
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
   protected brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(cvo.rW) && this.a()) {
         this.a(awe.h);
         this.a(dyx.M, $$0);
         if (!this.dS().B) {
            $$2.a(1, $$0, d($$1));
         }

         return brk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awc w() {
      return awd.cn;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.cp;
   }

   @Override
   protected awc n_() {
      return awd.co;
   }

   @Override
   protected awc t() {
      return awd.cr;
   }

   @Override
   protected cnw a(cvl $$0, float $$1, @Nullable cvl $$2) {
      cnw $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cny $$4) {
         $$4.a(new bsq(bss.s, 100));
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
   public void a(awe $$0) {
      this.dS().a(null, this, awd.cq, $$0, 1.0F, 1.0F);
      this.gv();
      this.x(true);
   }

   private void gv() {
      this.a(esp.aO, $$0 -> this.a($$0, this.do()));
   }

   @Override
   public boolean a() {
      return !this.gs() && this.bI();
   }
}
