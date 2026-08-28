import java.util.EnumSet;

public class cgo extends cgq {
   private final byq a;
   private bxu b;
   private int c;

   public cgo(byq $$0) {
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
            this.b = $$0.eu();
            int $$1 = $$0.ev();
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
         this.c = $$0.ev();
      }

      super.d();
   }
}
