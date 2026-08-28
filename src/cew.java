import java.util.EnumSet;

public class cew extends cez {
   private final bwy a;
   private bwb b;
   private int c;

   public cew(bwy $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(ccz.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.p() && !this.a.gm()) {
         bwb $$0 = this.a.ah_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ep();
            int $$1 = $$0.eq();
            return $$1 != this.c && this.a(this.b, cgs.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bwb $$0 = this.a.ah_();
      if ($$0 != null) {
         this.c = $$0.eq();
      }

      super.d();
   }
}
