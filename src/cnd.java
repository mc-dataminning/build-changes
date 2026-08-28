import javax.annotation.Nullable;

public class cnd extends bxe {
   public final cng a;
   public final String b;
   private final bxh c;

   public cnd(cng $$0, String $$1, float $$2, float $$3) {
      super($$0.an(), $$0.dV());
      this.c = bxh.b($$2, $$3);
      this.i_();
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   protected void a(aky.a $$0) {
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
   public dak dI() {
      return this.a.dI();
   }

   @Override
   public final boolean a(asb $$0, bvt $$1, float $$2) {
      return this.d($$1) ? false : this.a.a($$0, this, $$1, $$2);
   }

   @Override
   public boolean u(bxe $$0) {
      return this == $$0 || this.a == $$0;
   }

   @Override
   public zo<acf> a(arz $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bxh a(byr $$0) {
      return this.c;
   }

   @Override
   public boolean dT() {
      return false;
   }
}
