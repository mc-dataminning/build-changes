import java.util.EnumSet;

public class btl extends bsg {
   private final bmg a;

   public btl(bmg $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsg.a.c, bsg.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gf();
   }

   @Override
   public boolean a() {
      if (!this.a.u()) {
         return false;
      } else if (this.a.bc()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else {
         bll $$0 = this.a.R_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f($$0) < 144.0 && $$0.ei() != null ? false : this.a.gf();
         }
      }
   }

   @Override
   public void c() {
      this.a.N().n();
      this.a.y(true);
   }

   @Override
   public void d() {
      this.a.y(false);
   }
}
