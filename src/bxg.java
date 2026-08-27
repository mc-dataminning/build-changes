import javax.annotation.Nullable;

public class bxg extends bxb {
   @Nullable
   private ehd b;

   public bxg(bwz $$0) {
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
   public ehd g() {
      return this.b;
   }

   @Override
   public bxp<bxg> i() {
      return bxp.k;
   }
}
