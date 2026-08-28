import javax.annotation.Nullable;

public class cih extends cic {
   @Nullable
   private exa b;

   public cih(cia $$0) {
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
   public exa g() {
      return this.b;
   }

   @Override
   public ciq<cih> i() {
      return ciq.k;
   }
}
