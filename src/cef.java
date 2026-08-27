import javax.annotation.Nullable;

public class cef extends cea {
   @Nullable
   private ept b;

   public cef(cdy $$0) {
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
   public ept g() {
      return this.b;
   }

   @Override
   public ceo<cef> i() {
      return ceo.k;
   }
}
