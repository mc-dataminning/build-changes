import java.util.EnumSet;

public class ccm extends cbh {
   private final bvg a;

   public ccm(bvg $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbh.a.c, cbh.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gp();
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
         buk $$0 = this.a.R_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bto)$$0) < 144.0 && $$0.em() != null ? false : this.a.gp();
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
