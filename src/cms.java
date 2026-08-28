import javax.annotation.Nullable;

public class cms extends bwt {
   public final cmv a;
   public final String b;
   private final bww c;

   public cms(cmv $$0, String $$1, float $$2, float $$3) {
      super($$0.an(), $$0.dV());
      this.c = bww.b($$2, $$3);
      this.i_();
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   protected void a(akp.a $$0) {
   }

   @Override
   protected void a(tz $$0) {
   }

   @Override
   protected void b(tz $$0) {
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Nullable
   @Override
   public czy dI() {
      return this.a.dI();
   }

   @Override
   public final boolean a(ars $$0, bvi $$1, float $$2) {
      return this.d($$1) ? false : this.a.a($$0, this, $$1, $$2);
   }

   @Override
   public boolean u(bwt $$0) {
      return this == $$0 || this.a == $$0;
   }

   @Override
   public zh<abw> a(arq $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bww a(byg $$0) {
      return this.c;
   }

   @Override
   public boolean dT() {
      return false;
   }
}
