import javax.annotation.Nullable;

public class chv extends chq {
   @Nullable
   private ewh b;

   public chv(cho $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dp();
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
   public ewh g() {
      return this.b;
   }

   @Override
   public cie<chv> i() {
      return cie.k;
   }
}
