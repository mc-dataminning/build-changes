import org.jetbrains.annotations.Nullable;

public class bvx extends civ {
   private static final alc<Integer> ch = alg.a(bvx.class, ale.b);

   public bvx(bvq<? extends bvx> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected lq p() {
      return ls.aQ;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   @Nullable
   @Override
   public bva a(ash $$0, bva $$1) {
      return bvq.ah.a($$0, bvp.e);
   }

   @Override
   protected axe t() {
      return axf.ld;
   }

   @Override
   protected axe u() {
      return axf.la;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.lc;
   }

   @Override
   protected axe o_() {
      return axf.lb;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.s($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void d_() {
      super.d_();
      int $$0 = this.x();
      if ($$0 > 0) {
         this.s($$0 - 1);
      }

      this.dV().a(ls.aR, this.d(0.6), this.dD(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(ch, $$0);
   }

   public int x() {
      return this.al.a(ch);
   }

   public static boolean a(bvq<? extends bwf> $$0, dhy $$1, bvp $$2, jh $$3, bam $$4) {
      return $$3.v() <= $$1.O() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dkn.J);
   }
}
