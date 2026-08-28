import javax.annotation.Nullable;

public class cmh extends bwi {
   public final cmk a;
   public final String b;
   private final bwl c;

   public cmh(cmk $$0, String $$1, float $$2, float $$3) {
      super($$0.an(), $$0.dU());
      this.c = bwl.b($$2, $$3);
      this.i_();
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Override
   protected void a(tz $$0) {
   }

   @Override
   protected void b(tz $$0) {
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Nullable
   @Override
   public czn dH() {
      return this.a.dH();
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      return this.d($$1) ? false : this.a.a($$0, this, $$1, $$2);
   }

   @Override
   public boolean u(bwi $$0) {
      return this == $$0 || this.a == $$0;
   }

   @Override
   public zf<abu> a(aro $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bwl a(bxv $$0) {
      return this.c;
   }

   @Override
   public boolean dS() {
      return false;
   }
}
