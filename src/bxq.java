import javax.annotation.Nullable;

public class bxq extends bxl {
   @Nullable
   private ehp b;

   public bxq(bxj $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dj();
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
   public ehp g() {
      return this.b;
   }

   @Override
   public bxz<bxq> i() {
      return bxz.k;
   }
}
