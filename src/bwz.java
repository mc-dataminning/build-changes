import java.util.EnumSet;

public class bwz extends bvu {
   private final bpt a;

   public bwz(bpt $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvu.a.c, bvu.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gl();
   }

   @Override
   public boolean a() {
      if (!this.a.u()) {
         return false;
      } else if (this.a.bc()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else {
         box $$0 = this.a.R_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f($$0) < 144.0 && $$0.eg() != null ? false : this.a.gl();
         }
      }
   }

   @Override
   public void c() {
      this.a.N().n();
      this.a.y(true);
   }

   @Override
   public void d() {
      this.a.y(false);
   }
}
