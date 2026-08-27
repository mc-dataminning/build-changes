import java.util.EnumSet;

public class bxd extends bvu {
   private final chi a;

   public bxd(chi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvu.a.c, bvu.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bx()) {
         return false;
      } else if (this.a.aZ()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else if (this.a.S) {
         return false;
      } else {
         cia $$0 = this.a.gl();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.f($$0) > 16.0 ? false : $$0.bX != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.N().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
