import javax.annotation.Nullable;

public class bzk extends bkv {
   public final bzm b;
   public final String c;
   private final bkw d;

   public bzk(bzm $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dN());
      this.d = bkw.b($$2, $$3);
      this.k_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sd $$0) {
   }

   @Override
   protected void b(sd $$0) {
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Nullable
   @Override
   public clo dA() {
      return this.b.dA();
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bkv $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public wo<yh> dk() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bkw a(blx $$0) {
      return this.d;
   }

   @Override
   public boolean dL() {
      return false;
   }
}
