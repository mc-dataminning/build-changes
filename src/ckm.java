import javax.annotation.Nullable;

public class ckm extends bvf {
   public final ckp a;
   public final String b;
   private final bvi c;

   public ckm(ckp $$0, String $$1, float $$2, float $$3) {
      super($$0.aq(), $$0.dV());
      this.c = bvi.b($$2, $$3);
      this.m_();
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   protected void a(alg.a $$0) {
   }

   @Override
   protected void a(ux $$0) {
   }

   @Override
   protected void b(ux $$0) {
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Nullable
   @Override
   public cxk dI() {
      return this.a.dI();
   }

   @Override
   public final boolean a(ash $$0, btv $$1, float $$2) {
      return this.d($$1) ? false : this.a.a($$0, this, $$1, $$2);
   }

   @Override
   public boolean u(bvf $$0) {
      return this == $$0 || this.a == $$0;
   }

   @Override
   public aac<acr> a(asf $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bvi a(bwn $$0) {
      return this.c;
   }

   @Override
   public boolean dT() {
      return false;
   }
}
