import javax.annotation.Nullable;

public class cag extends blp {
   public final cai b;
   public final String c;
   private final blq d;

   public cag(cai $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dM());
      this.d = blq.b($$2, $$3);
      this.k_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sl $$0) {
   }

   @Override
   protected void b(sl $$0) {
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Nullable
   @Override
   public cmr dz() {
      return this.b.dz();
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(blp $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public xd<yx> dj() {
      throw new UnsupportedOperationException();
   }

   @Override
   public blq a(bmr $$0) {
      return this.d;
   }

   @Override
   public boolean dK() {
      return false;
   }
}
