import javax.annotation.Nullable;

public class cmc extends cma implements bws {
   private static final int b = 50;
   private static final int c = 70;
   private static final alc<Boolean> d = alg.a(cmc.class, ale.k);
   public static final String a = "sheared";

   public static bxi.a go() {
      return cma.m().a(bxj.s, 16.0);
   }

   public cmc(bvm<? extends cmc> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("sheared", this.gp());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gp() {
      return this.al.a(d);
   }

   public void x(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(cxo.sJ) && this.a()) {
         if (this.dV() instanceof ash $$3) {
            this.a($$3, axg.h, $$2);
            this.a(ecj.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bte.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected axe u() {
      return axf.cn;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.cp;
   }

   @Override
   protected axe o_() {
      return axf.co;
   }

   @Override
   protected axe p() {
      return axf.cr;
   }

   @Override
   protected cpz a(cxk $$0, float $$1, @Nullable cxk $$2) {
      cpz $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cqb $$4) {
         $$4.a(new buk(bum.s, 100));
      }

      return $$3;
   }

   @Override
   protected int x() {
      return 50;
   }

   @Override
   protected int gm() {
      return 70;
   }

   @Override
   public void a(ash $$0, axg $$1, cxk $$2) {
      $$0.a(null, this, axf.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.x(true);
   }

   private void d(ash $$0, cxk $$1) {
      this.a($$0, ewd.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dr()));
   }

   @Override
   public boolean a() {
      return !this.gp() && this.bL();
   }
}
