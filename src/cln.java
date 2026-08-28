import javax.annotation.Nullable;

public class cln extends cli {
   @Nullable
   private fcu b;

   public cln(clg $$0) {
      super($$0);
   }

   @Override
   public void a(arn $$0) {
      if (this.b == null) {
         this.b = this.a.dt();
      }
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public void c() {
      this.b = null;
   }

   @Override
   public float e() {
      return 1.0F;
   }

   @Nullable
   @Override
   public fcu f() {
      return this.b;
   }

   @Override
   public clw<cln> h() {
      return clw.k;
   }
}
