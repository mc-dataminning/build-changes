import java.util.EnumSet;

public class cgy extends chb {
   private final bzb a;
   private byf b;
   private int c;

   public cgy(bzb $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cfb.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.gu()) {
         byf $$0 = this.a.e();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.er();
            int $$1 = $$0.et();
            return $$1 != this.c && this.a(this.b, ciu.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.g(this.b);
      byf $$0 = this.a.e();
      if ($$0 != null) {
         this.c = $$0.et();
      }

      super.d();
   }
}
