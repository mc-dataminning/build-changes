import javax.annotation.Nullable;

public class chh extends chc {
   @Nullable
   private ewu b;

   public chh(cha $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.ds();
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
   public ewu g() {
      return this.b;
   }

   @Override
   public chq<chh> i() {
      return chq.k;
   }
}
