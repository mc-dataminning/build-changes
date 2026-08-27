import java.util.EnumSet;

public class bru extends brw {
   private final bjw a;
   private bjb b;
   private int c;

   public bru(bjw $$0) {
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
            this.b = $$0.eh();
            int $$1 = $$0.ei();
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
         this.c = $$0.ei();
      }

      super.c();
   }
}
