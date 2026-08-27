import javax.annotation.Nullable;

public class bxu extends bxp {
   @Nullable
   private ehh b;

   public bxu(bxn $$0) {
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
   public ehh g() {
      return this.b;
   }

   @Override
   public byd<bxu> i() {
      return byd.k;
   }
}
