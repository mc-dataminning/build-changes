import java.util.EnumSet;

public class cgz extends chb {
   private final bzb a;
   private byf b;
   private int c;

   public cgz(bzb $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cfb.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.m() && !this.a.gu()) {
         byf $$0 = this.a.T_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eu();
            int $$1 = $$0.ev();
            return $$1 != this.c && this.a(this.b, ciu.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.g(this.b);
      byf $$0 = this.a.T_();
      if ($$0 != null) {
         this.c = $$0.ev();
      }

      super.d();
   }
}
