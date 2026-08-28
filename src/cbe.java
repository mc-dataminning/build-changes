import java.util.EnumSet;

public class cbe extends bzz {
   private final bty a;

   public cbe(bty $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzz.a.c, bzz.a.a));
   }

   @Override
   public boolean b() {
      return this.a.go();
   }

   @Override
   public boolean a() {
      if (!this.a.s()) {
         return false;
      } else if (this.a.bi()) {
         return false;
      } else if (!this.a.aF()) {
         return false;
      } else {
         btb $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bsg)$$0) < 144.0 && $$0.ej() != null ? false : this.a.go();
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
