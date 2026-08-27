import java.util.EnumSet;

public class boe extends bmv {
   private final bxw a;

   public boe(bxw $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bmv.a.c, bmv.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bs()) {
         return false;
      } else if (this.a.aV()) {
         return false;
      } else if (!this.a.ay()) {
         return false;
      } else if (this.a.S) {
         return false;
      } else {
         byo $$0 = this.a.fY();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.f($$0) > 16.0 ? false : $$0.bR != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.J().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
