import javax.annotation.Nullable;

public class cii extends cid {
   @Nullable
   private evr b;

   public cii(cib $$0) {
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
   public evr g() {
      return this.b;
   }

   @Override
   public cir<cii> i() {
      return cir.k;
   }
}
