import javax.annotation.Nullable;

public class caf extends caa {
   @Nullable
   private elb b;

   public caf(bzy $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dk();
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
   public elb g() {
      return this.b;
   }

   @Override
   public cao<caf> i() {
      return cao.k;
   }
}
