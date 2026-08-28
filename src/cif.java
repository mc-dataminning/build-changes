import javax.annotation.Nullable;

public abstract class cif implements cin {
   protected final cid a;

   public cif(cid $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return false;
   }

   @Override
   public void b() {
   }

   @Override
   public void c() {
   }

   @Override
   public void a(cic $$0, iz $$1, brp $$2, @Nullable cmz $$3) {
   }

   @Override
   public void d() {
   }

   @Override
   public void e() {
   }

   @Override
   public float f() {
      return 0.6F;
   }

   @Nullable
   @Override
   public evt g() {
      return null;
   }

   @Override
   public float a(brp $$0, float $$1) {
      return $$1;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.ds().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return 0.7F / $$1 / $$0;
   }
}
