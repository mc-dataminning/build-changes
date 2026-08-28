import java.util.EnumSet;

public class cdw extends cdy {
   private final bvx a;
   private bva b;
   private int c;

   public cdw(bvx $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cby.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.gu()) {
         bva $$0 = this.a.T_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eu();
            int $$1 = $$0.ev();
            return $$1 != this.c && this.a(this.b, cfr.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bva $$0 = this.a.T_();
      if ($$0 != null) {
         this.c = $$0.ev();
      }

      super.d();
   }
}
