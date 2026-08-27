import javax.annotation.Nullable;

public class cav extends caq {
   @Nullable
   private elt b;

   public cav(cao $$0) {
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
   public elt g() {
      return this.b;
   }

   @Override
   public cbe<cav> i() {
      return cbe.k;
   }
}
