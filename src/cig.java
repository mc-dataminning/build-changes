import javax.annotation.Nullable;

public class cig extends cib {
   @Nullable
   private evp b;

   public cig(chz $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dn();
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
   public evp g() {
      return this.b;
   }

   @Override
   public cip<cig> i() {
      return cip.k;
   }
}
