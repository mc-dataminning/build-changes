import java.util.EnumSet;

public class ces extends cev {
   private final bwu a;
   private bvx b;
   private int c;

   public ces(bwu $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(ccv.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.p() && !this.a.go()) {
         bvx $$0 = this.a.ah_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eq();
            int $$1 = $$0.er();
            return $$1 != this.c && this.a(this.b, cgo.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bvx $$0 = this.a.ah_();
      if ($$0 != null) {
         this.c = $$0.er();
      }

      super.d();
   }
}
