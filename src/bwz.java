import java.util.EnumSet;

public class bwz extends bxb {
   private final bpa a;
   private bog b;
   private int c;

   public bwz(bpa $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bvb.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.u() && !this.a.gg()) {
         bog $$0 = this.a.R_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ek();
            int $$1 = $$0.el();
            return $$1 != this.c && this.a(this.b, byu.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bog $$0 = this.a.R_();
      if ($$0 != null) {
         this.c = $$0.el();
      }

      super.c();
   }
}
