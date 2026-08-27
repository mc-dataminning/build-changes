import java.util.EnumSet;

public class bxr extends bwm {
   private final bql a;

   public bxr(bql $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bwm.a.c, bwm.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gn();
   }

   @Override
   public boolean a() {
      if (!this.a.r()) {
         return false;
      } else if (this.a.bf()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else {
         bpp $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((box)$$0) < 144.0 && $$0.ej() != null ? false : this.a.gn();
         }
      }
   }

   @Override
   public void c() {
      this.a.K().n();
      this.a.x(true);
   }

   @Override
   public void d() {
      this.a.x(false);
   }
}
