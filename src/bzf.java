import javax.annotation.Nullable;

public class bzf extends bkq {
   public final bzh b;
   public final String c;
   private final bkr d;

   public bzf(bzh $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dN());
      this.d = bkr.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void b_() {
   }

   @Override
   protected void a(rz $$0) {
   }

   @Override
   protected void b(rz $$0) {
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Nullable
   @Override
   public clj dA() {
      return this.b.dA();
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bkq $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public wk<yd> dk() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bkr a(bls $$0) {
      return this.d;
   }

   @Override
   public boolean dL() {
      return false;
   }
}
