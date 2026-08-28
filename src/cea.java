import java.util.EnumSet;

public class cea extends ced {
   private final bwc a;
   private bvf b;
   private int c;

   public cea(bwc $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(ccd.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.p() && !this.a.gp()) {
         bvf $$0 = this.a.ag_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eq();
            int $$1 = $$0.er();
            return $$1 != this.c && this.a(this.b, cfw.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bvf $$0 = this.a.ag_();
      if ($$0 != null) {
         this.c = $$0.er();
      }

      super.d();
   }
}
