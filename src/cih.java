import javax.annotation.Nullable;

public class cih extends cic {
   @Nullable
   private exc b;

   public cih(cia $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dm();
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
   public exc g() {
      return this.b;
   }

   @Override
   public ciq<cih> i() {
      return ciq.k;
   }
}
