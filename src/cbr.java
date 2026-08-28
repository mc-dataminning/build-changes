import java.util.EnumSet;

public class cbr extends cam {
   private final bul a;

   public cbr(bul $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cam.a.c, cam.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gl();
   }

   @Override
   public boolean b() {
      if (!this.a.s()) {
         return false;
      } else if (this.a.bi()) {
         return false;
      } else if (!this.a.aF()) {
         return false;
      } else {
         btn $$0 = this.a.T_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bsr)$$0) < 144.0 && $$0.ej() != null ? false : this.a.gl();
         }
      }
   }

   @Override
   public void d() {
      this.a.N().n();
      this.a.x(true);
   }

   @Override
   public void e() {
      this.a.x(false);
   }
}
