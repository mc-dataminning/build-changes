import javax.annotation.Nullable;

public abstract class bxa implements bxi {
   protected final bwy a;

   public bxa(bwy $$0) {
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
   public void a(bwx $$0, gv $$1, bhe $$2, @Nullable cbl $$3) {
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
   public ehf g() {
      return null;
   }

   @Override
   public float a(bhe $$0, float $$1) {
      return $$1;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dn().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return 0.7F / $$1 / $$0;
   }
}
