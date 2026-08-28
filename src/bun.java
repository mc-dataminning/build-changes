import org.jetbrains.annotations.Nullable;

public class bun extends chl {
   private static final akk<Integer> cg = ako.a(bun.class, akm.b);

   public bun(bug<? extends bun> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected lo q() {
      return lq.aP;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      return bug.W.a($$0, buf.e);
   }

   @Override
   protected awj t() {
      return awk.kK;
   }

   @Override
   protected awj w() {
      return awk.kH;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.kJ;
   }

   @Override
   protected awj o_() {
      return awk.kI;
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(uj $$0) {
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

      this.dX().a(lq.aQ, this.d(0.6), this.dF(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
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

   public static boolean a(bug<? extends buv> $$0, dfl $$1, buf $$2, jg $$3, azr $$4) {
      return $$3.v() <= $$1.N() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dia.G);
   }
}
