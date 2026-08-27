import javax.annotation.Nullable;

public class cfl extends cfg {
   @Nullable
   private esj b;

   public cfl(cfe $$0) {
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
   public esj g() {
      return this.b;
   }

   @Override
   public cfu<cfl> i() {
      return cfu.k;
   }
}
