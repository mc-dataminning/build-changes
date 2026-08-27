import javax.annotation.Nullable;

public class bxf extends bxa {
   @Nullable
   private ehf b;

   public bxf(bwy $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.di();
      }
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public float f() {
      return 1.0F;
   }

   @Nullable
   @Override
   public ehf g() {
      return this.b;
   }

   @Override
   public bxo<bxf> i() {
      return bxo.k;
   }
}
