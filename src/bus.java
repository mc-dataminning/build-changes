import org.jetbrains.annotations.Nullable;

public class bus extends chq {
   private static final akl<Integer> cg = akp.a(bus.class, akn.b);

   public bus(bul<? extends bus> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected lp q() {
      return lr.aP;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      return bul.W.a($$0, buk.e);
   }

   @Override
   protected awk t() {
      return awl.kK;
   }

   @Override
   protected awk w() {
      return awl.kH;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.kJ;
   }

   @Override
   protected awk o_() {
      return awl.kI;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.t($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void n_() {
      super.n_();
      int $$0 = this.y();
      if ($$0 > 0) {
         this.t($$0 - 1);
      }

      this.dX().a(lr.aQ, this.d(0.6), this.dF(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.t(100);
      }

      return $$2;
   }

   private void t(int $$0) {
      this.am.a(cg, $$0);
   }

   public int y() {
      return this.am.a(cg);
   }

   public static boolean a(bul<? extends bva> $$0, dfr $$1, buk $$2, jh $$3, azs $$4) {
      return $$3.v() <= $$1.N() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dig.G);
   }
}
