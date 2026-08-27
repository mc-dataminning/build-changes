import java.util.EnumSet;

public class bzg extends byb {
   private final bsa a;

   public bzg(bsa $$0) {
      this.a = $$0;
      this.a(EnumSet.of(byb.a.c, byb.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gp();
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
         bre $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bql)$$0) < 144.0 && $$0.ek() != null ? false : this.a.gp();
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
