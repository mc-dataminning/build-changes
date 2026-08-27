import javax.annotation.Nullable;

public class cbc extends cax {
   @Nullable
   private emc b;

   public cbc(cav $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dj();
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
   public emc g() {
      return this.b;
   }

   @Override
   public cbl<cbc> i() {
      return cbl.k;
   }
}
