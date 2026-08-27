import java.util.EnumSet;

public class cbm extends cbo {
   private final btn a;
   private bsq b;
   private int c;

   public cbm(btn $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bzo.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.gp()) {
         bsq $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eo();
            int $$1 = $$0.ep();
            return $$1 != this.c && this.a(this.b, cdh.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bsq $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.ep();
      }

      super.c();
   }
}
