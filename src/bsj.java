import java.util.EnumSet;

public class bsj extends bre {
   private final ble a;

   public bsj(ble $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bre.a.c, bre.a.a));
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
         bkj $$0 = this.a.P_();
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
