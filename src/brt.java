import java.util.EnumSet;

public class brt extends brw {
   private final bjw a;
   private bjb b;
   private int c;

   public brt(bjw $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bpw.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.p() && !this.a.ga()) {
         bjb $$0 = this.a.I_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ef();
            int $$1 = $$0.eg();
            return $$1 != this.c && this.a(this.b, btn.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bjb $$0 = this.a.I_();
      if ($$0 != null) {
         this.c = $$0.eg();
      }

      super.c();
   }
}
