import java.util.EnumSet;

public class cas extends cam {
   private final btp a;
   private btn b;
   private final float c;

   public cas(btp $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(cam.a.c, cam.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.cS()) {
         return false;
      } else {
         this.b = this.a.p();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.g((bsr)this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aF() ? false : this.a.dS().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.aF();
   }

   @Override
   public void d() {
      exa $$0 = this.a.ds();
      exa $$1 = new exa(this.b.du() - this.a.du(), 0.0, this.b.dA() - this.a.dA());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.n($$1.c, (double)this.c, $$1.e);
   }
}
