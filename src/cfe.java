import javax.annotation.Nullable;

public class cfe extends cez {
   @Nullable
   private esa b;

   public cfe(cex $$0) {
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
   public esa g() {
      return this.b;
   }

   @Override
   public cfn<cfe> i() {
      return cfn.k;
   }
}
