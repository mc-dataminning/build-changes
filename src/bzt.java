import javax.annotation.Nullable;

public class bzt extends bzo {
   @Nullable
   private ejz b;

   public bzt(bzm $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dl();
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
   public ejz g() {
      return this.b;
   }

   @Override
   public cac<bzt> i() {
      return cac.k;
   }
}
