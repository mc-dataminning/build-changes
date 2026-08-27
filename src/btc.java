import java.util.EnumSet;

public class btc extends bte {
   private final ble a;
   private bkj b;
   private int c;

   public btc(ble $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bre.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.ge()) {
         bkj $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ei();
            int $$1 = $$0.ej();
            return $$1 != this.c && this.a(this.b, buv.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bkj $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.ej();
      }

      super.c();
   }
}
