import javax.annotation.Nullable;

public class cje extends ciz {
   @Nullable
   private eys b;

   public cje(cix $$0) {
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
   public eys g() {
      return this.b;
   }

   @Override
   public cjn<cje> i() {
      return cjn.k;
   }
}
