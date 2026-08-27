import javax.annotation.Nullable;

public class bzg extends bzb {
   @Nullable
   private eji b;

   public bzg(byz $$0) {
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
   public eji g() {
      return this.b;
   }

   @Override
   public bzp<bzg> i() {
      return bzp.k;
   }
}
