import javax.annotation.Nullable;

public class cdd extends bof {
   public final cdf b;
   public final String c;
   private final boi d;

   public cdd(cdf $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dJ());
      this.d = boi.b($$2, $$3);
      this.k_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sy $$0) {
   }

   @Override
   protected void b(sy $$0) {
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Nullable
   @Override
   public cpq dw() {
      return this.b.dw();
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean s(bof $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public xz<aai> df() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boi a(bpi $$0) {
      return this.d;
   }

   @Override
   public boolean dH() {
      return false;
   }
}
