import javax.annotation.Nullable;

public class cjh extends cjc {
   @Nullable
   private eyw b;

   public cjh(cja $$0) {
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
   public eyw g() {
      return this.b;
   }

   @Override
   public cjq<cjh> i() {
      return cjq.k;
   }
}
