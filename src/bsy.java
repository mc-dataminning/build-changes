import java.util.EnumSet;

public class bsy extends brt {
   private final blt a;

   public bsy(blt $$0) {
      this.a = $$0;
      this.a(EnumSet.of(brt.a.c, brt.a.a));
   }

   @Override
   public boolean b() {
      return this.a.ge();
   }

   @Override
   public boolean a() {
      if (!this.a.s()) {
         return false;
      } else if (this.a.ba()) {
         return false;
      } else if (!this.a.aA()) {
         return false;
      } else {
         bky $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f($$0) < 144.0 && $$0.eg() != null ? false : this.a.ge();
         }
      }
   }

   @Override
   public void c() {
      this.a.L().n();
      this.a.y(true);
   }

   @Override
   public void d() {
      this.a.y(false);
   }
}
