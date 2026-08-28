import org.jetbrains.annotations.Nullable;

public class buc extends cgz {
   private static final akg<Integer> cg = akk.a(buc.class, aki.b);

   public buc(btv<? extends buc> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected ll q() {
      return ln.aP;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      return btv.W.a($$0, btu.e);
   }

   @Override
   protected awd t() {
      return awe.kK;
   }

   @Override
   protected awd w() {
      return awe.kH;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.kJ;
   }

   @Override
   protected awd n_() {
      return awe.kI;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.t($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void m_() {
      super.m_();
      int $$0 = this.y();
      if ($$0 > 0) {
         this.t($$0 - 1);
      }

      this.dS().a(ln.aQ, this.d(0.6), this.dA(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
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

   public static boolean a(btv<? extends buk> $$0, dew $$1, btu $$2, je $$3, azl $$4) {
      return $$3.v() <= $$1.N() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dhl.G);
   }
}
