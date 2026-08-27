import java.util.EnumSet;

public class bwo extends bvf {
   private final cgt a;

   public bwo(cgt $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvf.a.c, bvf.a.a));
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
         chl $$0 = this.a.gg();
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
