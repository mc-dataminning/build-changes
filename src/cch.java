import java.util.EnumSet;

public class cch extends cbc {
   private final bvb a;

   public cch(bvb $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbc.a.c, cbc.a.a));
   }

   @Override
   public boolean c() {
      return this.a.go();
   }

   @Override
   public boolean b() {
      if (!this.a.q()) {
         return false;
      } else if (this.a.bl()) {
         return false;
      } else if (!this.a.aH()) {
         return false;
      } else {
         buf $$0 = this.a.R_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((btj)$$0) < 144.0 && $$0.em() != null ? false : this.a.go();
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
