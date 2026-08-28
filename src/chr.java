import javax.annotation.Nullable;

public class chr extends chm {
   @Nullable
   private evz b;

   public chr(chk $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dn();
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
   public evz g() {
      return this.b;
   }

   @Override
   public cia<chr> i() {
      return cia.k;
   }
}
