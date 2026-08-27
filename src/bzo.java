import javax.annotation.Nullable;

public class bzo extends bzj {
   @Nullable
   private eju b;

   public bzo(bzh $$0) {
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
   public eju g() {
      return this.b;
   }

   @Override
   public bzx<bzo> i() {
      return bzx.k;
   }
}
