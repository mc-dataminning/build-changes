import java.util.EnumSet;

public class cbk extends cbm {
   private final btl a;
   private bso b;
   private int c;

   public cbk(btl $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bzm.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.gp()) {
         bso $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eo();
            int $$1 = $$0.ep();
            return $$1 != this.c && this.a(this.b, cdf.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bso $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.ep();
      }

      super.c();
   }
}
