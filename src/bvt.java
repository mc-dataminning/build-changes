import org.jetbrains.annotations.Nullable;

public class bvt extends cir {
   private static final alc<Integer> ch = alg.a(bvt.class, ale.b);

   public bvt(bvm<? extends bvt> $$0, dha $$1) {
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
   public buw a(ash $$0, buw $$1) {
      return bvm.ah.a($$0, bvl.e);
   }

   @Override
   protected axe t() {
      return axf.lc;
   }

   @Override
   protected axe u() {
      return axf.kZ;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.lb;
   }

   @Override
   protected axe o_() {
      return axf.la;
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
   public boolean a(ash $$0, btv $$1, float $$2) {
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

   public static boolean a(bvm<? extends bwb> $$0, dhr $$1, bvl $$2, jh $$3, bam $$4) {
      return $$3.v() <= $$1.O() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dkg.J);
   }
}
