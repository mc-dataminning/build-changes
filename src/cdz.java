import java.util.EnumSet;

public class cdz extends cec {
   private final bwb a;
   private bve b;
   private int c;

   public cdz(bwb $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(ccc.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.gv()) {
         bve $$0 = this.a.T_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.et();
            int $$1 = $$0.eu();
            return $$1 != this.c && this.a(this.b, cfv.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bve $$0 = this.a.T_();
      if ($$0 != null) {
         this.c = $$0.eu();
      }

      super.d();
   }
}
