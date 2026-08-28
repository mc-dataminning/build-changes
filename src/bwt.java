import javax.annotation.Nullable;

public class bwt extends cjv {
   private static final akj<Integer> bN = akn.a(bwt.class, akl.b);

   public bwt(bwm<? extends bwt> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected lv q() {
      return lx.aS;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bN, 0);
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      return bwm.ag.a($$0, bwl.e);
   }

   @Override
   protected awm t() {
      return awn.lk;
   }

   @Override
   protected awm u() {
      return awn.lh;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.lj;
   }

   @Override
   protected awm l_() {
      return awn.li;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.s($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void k_() {
      super.k_();
      int $$0 = this.x();
      if ($$0 > 0) {
         this.s($$0 - 1);
      }

      this.dV().a(lx.aT, this.d(0.6), this.dD(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(bN, $$0);
   }

   public int x() {
      return this.al.a(bN);
   }

   public static boolean a(bwm<? extends bxc> $$0, djm $$1, bwl $$2, iu $$3, azv $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dmc.J);
   }
}
