import java.util.EnumSet;

public class brd extends bpu {
   private final cav a;

   public brd(cav $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bpu.a.c, bpu.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bv()) {
         return false;
      } else if (this.a.aX()) {
         return false;
      } else if (!this.a.aA()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         cbn $$0 = this.a.fZ();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.f($$0) > 16.0 ? false : $$0.bQ != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.H().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
