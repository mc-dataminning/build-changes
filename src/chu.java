import javax.annotation.Nullable;

public class chu extends chp {
   @Nullable
   private ewf b;

   public chu(chn $$0) {
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
   public ewf g() {
      return this.b;
   }

   @Override
   public cid<chu> i() {
      return cid.k;
   }
}
