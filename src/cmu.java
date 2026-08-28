import javax.annotation.Nullable;

public class cmu extends bwv {
   public final cmx a;
   public final String b;
   private final bwy c;

   public cmu(cmx $$0, String $$1, float $$2, float $$3) {
      super($$0.an(), $$0.dV());
      this.c = bwy.b($$2, $$3);
      this.i_();
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   protected void a(akr.a $$0) {
   }

   @Override
   protected void a(ua $$0) {
   }

   @Override
   protected void b(ua $$0) {
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Nullable
   @Override
   public daa dI() {
      return this.a.dI();
   }

   @Override
   public final boolean a(aru $$0, bvk $$1, float $$2) {
      return this.d($$1) ? false : this.a.a($$0, this, $$1, $$2);
   }

   @Override
   public boolean u(bwv $$0) {
      return this == $$0 || this.a == $$0;
   }

   @Override
   public zj<aby> a(ars $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bwy a(byi $$0) {
      return this.c;
   }

   @Override
   public boolean dT() {
      return false;
   }
}
