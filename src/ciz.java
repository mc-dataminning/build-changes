import javax.annotation.Nullable;

public class ciz extends ciu {
   @Nullable
   private eye b;

   public ciz(cis $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dq();
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
   public eye g() {
      return this.b;
   }

   @Override
   public cji<ciz> i() {
      return cji.k;
   }
}
