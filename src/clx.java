import javax.annotation.Nullable;

public class clx extends bwf {
   public final cma a;
   public final String b;
   private final bwi c;

   public clx(cma $$0, String $$1, float $$2, float $$3) {
      super($$0.aq(), $$0.dV());
      this.c = bwi.b($$2, $$3);
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
   public boolean bG() {
      return true;
   }

   @Nullable
   @Override
   public czd dI() {
      return this.a.dI();
   }

   @Override
   public final boolean a(arq $$0, buu $$1, float $$2) {
      return this.d($$1) ? false : this.a.a($$0, this, $$1, $$2);
   }

   @Override
   public boolean u(bwf $$0) {
      return this == $$0 || this.a == $$0;
   }

   @Override
   public zf<abu> a(aro $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bwi a(bxq $$0) {
      return this.c;
   }

   @Override
   public boolean dT() {
      return false;
   }
}
