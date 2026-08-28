import javax.annotation.Nullable;

public class cld extends bvs {
   public final clg a;
   public final String b;
   private final bvv c;

   public cld(clg $$0, String $$1, float $$2, float $$3) {
      super($$0.aq(), $$0.dV());
      this.c = bvv.b($$2, $$3);
      this.i_();
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void a(tw $$0) {
   }

   @Override
   protected void b(tw $$0) {
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Nullable
   @Override
   public cxy dI() {
      return this.a.dI();
   }

   @Override
   public final boolean a(arn $$0, buh $$1, float $$2) {
      return this.d($$1) ? false : this.a.a($$0, this, $$1, $$2);
   }

   @Override
   public boolean u(bvs $$0) {
      return this == $$0 || this.a == $$0;
   }

   @Override
   public zc<abr> a(arl $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bvv a(bxd $$0) {
      return this.c;
   }

   @Override
   public boolean dT() {
      return false;
   }
}
