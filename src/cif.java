import javax.annotation.Nullable;

public class cif extends cia {
   @Nullable
   private eww b;

   public cif(chy $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.do();
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
   public eww g() {
      return this.b;
   }

   @Override
   public cio<cif> i() {
      return cio.k;
   }
}
