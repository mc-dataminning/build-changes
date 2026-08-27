import java.util.EnumSet;

public class caq extends bzl {
   private final btk a;

   public caq(btk $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzl.a.c, bzl.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gy();
   }

   @Override
   public boolean a() {
      if (!this.a.r()) {
         return false;
      } else if (this.a.bl()) {
         return false;
      } else if (!this.a.aE()) {
         return false;
      } else {
         bso $$0 = this.a.Q_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((brv)$$0) < 144.0 && $$0.eu() != null ? false : this.a.gy();
         }
      }
   }

   @Override
   public void c() {
      this.a.J().n();
      this.a.x(true);
   }

   @Override
   public void d() {
      this.a.x(false);
   }
}
