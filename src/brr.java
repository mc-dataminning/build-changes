import java.util.EnumSet;

public class brr extends brt {
   private final bjt a;
   private biy b;
   private int c;

   public brr(bjt $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bpt.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.p() && !this.a.ga()) {
         biy $$0 = this.a.I_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eh();
            int $$1 = $$0.ei();
            return $$1 != this.c && this.a(this.b, btk.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      biy $$0 = this.a.I_();
      if ($$0 != null) {
         this.c = $$0.ei();
      }

      super.c();
   }
}
