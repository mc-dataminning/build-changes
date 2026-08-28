import java.util.EnumSet;

public class cgn extends cgq {
   private final byq a;
   private bxu b;
   private int c;

   public cgn(byq $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(ceq.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.gu()) {
         bxu $$0 = this.a.e();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.er();
            int $$1 = $$0.et();
            return $$1 != this.c && this.a(this.b, cij.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.g(this.b);
      bxu $$0 = this.a.e();
      if ($$0 != null) {
         this.c = $$0.et();
      }

      super.d();
   }
}
