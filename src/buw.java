import org.jetbrains.annotations.Nullable;

public class buw extends chu {
   private static final ako<Integer> cg = aks.a(buw.class, akq.b);

   public buw(bup<? extends buw> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected lq q() {
      return ls.aP;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      return bup.W.a($$0, buo.e);
   }

   @Override
   protected awn t() {
      return awo.kK;
   }

   @Override
   protected awn w() {
      return awo.kH;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.kJ;
   }

   @Override
   protected awn o_() {
      return awo.kI;
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(un $$0) {
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

      this.dY().a(ls.aQ, this.d(0.6), this.dG(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
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

   public static boolean a(bup<? extends bve> $$0, dfw $$1, buo $$2, jh $$3, azv $$4) {
      return $$3.v() <= $$1.N() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dil.G);
   }
}
