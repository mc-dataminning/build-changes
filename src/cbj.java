import java.util.EnumSet;

public class cbj extends caa {
   private final clt a;

   public cbj(clt $$0) {
      this.a = $$0;
      this.a(EnumSet.of(caa.a.c, caa.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bF()) {
         return false;
      } else if (this.a.bg()) {
         return false;
      } else if (!this.a.aG()) {
         return false;
      } else if (this.a.U) {
         return false;
      } else {
         cml $$0 = this.a.gn();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.ce != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.J().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
