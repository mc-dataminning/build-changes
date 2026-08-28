import java.util.EnumSet;

public class cdi extends ccd {
   private final bwc a;

   public cdi(bwc $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccd.a.c, ccd.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gp();
   }

   @Override
   public boolean b() {
      if (!this.a.p()) {
         return false;
      } else if (this.a.bm()) {
         return false;
      } else if (!this.a.aJ()) {
         return false;
      } else {
         bvf $$0 = this.a.ag_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((buj)$$0) < 144.0 && $$0.eq() != null ? false : this.a.gp();
         }
      }
   }

   @Override
   public void d() {
      this.a.L().m();
      this.a.y(true);
   }

   @Override
   public void e() {
      this.a.y(false);
   }
}
