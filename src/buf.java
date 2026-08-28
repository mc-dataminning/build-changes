import org.jetbrains.annotations.Nullable;

public class buf extends chc {
   private static final akh<Integer> cg = akl.a(buf.class, akj.b);

   public buf(bty<? extends buf> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected lm q() {
      return lo.aP;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      return bty.W.a($$0, btx.e);
   }

   @Override
   protected awf t() {
      return awg.kK;
   }

   @Override
   protected awf w() {
      return awg.kH;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.kJ;
   }

   @Override
   protected awf o_() {
      return awg.kI;
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(ug $$0) {
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

      this.dS().a(lo.aQ, this.d(0.6), this.dA(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
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

   public static boolean a(bty<? extends bun> $$0, dez $$1, btx $$2, jf $$3, azn $$4) {
      return $$3.v() <= $$1.N() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dho.G);
   }
}
