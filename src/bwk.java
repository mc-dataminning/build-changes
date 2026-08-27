import java.util.EnumSet;

public class bwk extends bvb {
   private final cgp a;

   public bwk(cgp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvb.a.c, bvb.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bx()) {
         return false;
      } else if (this.a.aZ()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else if (this.a.S) {
         return false;
      } else {
         chh $$0 = this.a.gg();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.f($$0) > 16.0 ? false : $$0.bW != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.N().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
