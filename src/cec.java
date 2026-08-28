import java.util.EnumSet;

public class cec extends cee {
   private final bwd a;
   private bvg b;
   private int c;

   public cec(bwd $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cce.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.p() && !this.a.gs()) {
         bvg $$0 = this.a.ag_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.er();
            int $$1 = $$0.es();
            return $$1 != this.c && this.a(this.b, cfx.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bvg $$0 = this.a.ag_();
      if ($$0 != null) {
         this.c = $$0.es();
      }

      super.d();
   }
}
