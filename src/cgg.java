import java.util.EnumSet;

public class cgg extends cfb {
   private final bzb a;

   public cgg(bzb $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cfb.a.c, cfb.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gu();
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.gu();
      if (!$$0 && !this.a.m()) {
         return false;
      } else if (this.a.bi()) {
         return false;
      } else if (!this.a.aH()) {
         return false;
      } else {
         byf $$1 = this.a.T_();
         if ($$1 == null) {
            return true;
         } else {
            return this.a.g((bxe)$$1) < 144.0 && $$1.er() != null ? false : $$0;
         }
      }
   }

   @Override
   public void d() {
      this.a.N().m();
      this.a.x(true);
   }

   @Override
   public void e() {
      this.a.x(false);
   }
}
