import java.util.EnumSet;

public class car extends bzm {
   private final btl a;

   public car(btl $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzm.a.c, bzm.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gp();
   }

   @Override
   public boolean a() {
      if (!this.a.s()) {
         return false;
      } else if (this.a.bh()) {
         return false;
      } else if (!this.a.aE()) {
         return false;
      } else {
         bso $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bru)$$0) < 144.0 && $$0.em() != null ? false : this.a.gp();
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
