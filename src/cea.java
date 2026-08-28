import java.util.EnumSet;

public class cea extends ccv {
   private final bwu a;

   public cea(bwu $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccv.a.c, ccv.a.a));
   }

   @Override
   public boolean c() {
      return this.a.go();
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
         bvx $$0 = this.a.ah_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bvb)$$0) < 144.0 && $$0.eq() != null ? false : this.a.go();
         }
      }
   }

   @Override
   public void d() {
      this.a.L().o();
      this.a.y(true);
   }

   @Override
   public void e() {
      this.a.y(false);
   }
}
