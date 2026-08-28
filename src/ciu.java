public abstract class ciu extends ciz {
   private static final bwl bG = bwr.C.n().a(0.5F).b(0.665F);

   public ciu(bwr<? extends ciu> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cey(this, 2.0));
      this.bD.a(2, new cdr(this, 1.0));
      this.bD.a(3, new cfn(this, 1.25, $$0 -> $$0.a(axk.ae), false));
      this.bD.a(4, new cee(this, 1.25));
      this.bD.a(5, new cfs(this, 1.0));
      this.bD.a(6, new cen(this, crj.class, 6.0F));
      this.bD.a(7, new cfa(this));
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.ae);
   }

   public static byo.a q() {
      return ciz.gy().a(byp.s, 10.0).a(byp.v, 0.2F);
   }

   @Override
   protected awm u() {
      return awn.gf;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.gh;
   }

   @Override
   protected awm l_() {
      return awn.gg;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.gj, 0.15F, 1.0F);
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if ($$2.a(czo.ro) && !this.n_()) {
         $$0.a(awn.gi, 1.0F, 1.0F);
         czk $$3 = czn.a($$2, $$0, czo.ru.m());
         $$0.a($$1, $$3);
         return bug.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bG : super.e($$0);
   }
}
