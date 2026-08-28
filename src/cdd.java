import java.util.EnumSet;

public class cdd extends cby {
   private final bvx a;

   public cdd(bvx $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cby.a.c, cby.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gu();
   }

   @Override
   public boolean b() {
      if (!this.a.q()) {
         return false;
      } else if (this.a.bn()) {
         return false;
      } else if (!this.a.aK()) {
         return false;
      } else {
         bva $$0 = this.a.T_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bue)$$0) < 144.0 && $$0.es() != null ? false : this.a.gu();
         }
      }
   }

   @Override
   public void d() {
      this.a.P().o();
      this.a.y(true);
   }

   @Override
   public void e() {
      this.a.y(false);
   }
}
