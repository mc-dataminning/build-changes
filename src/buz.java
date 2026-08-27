import java.util.EnumSet;

public class buz extends bvb {
   private final bna a;
   private bmf b;
   private int c;

   public buz(bna $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(btb.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.u() && !this.a.ge()) {
         bmf $$0 = this.a.R_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ej();
            int $$1 = $$0.ek();
            return $$1 != this.c && this.a(this.b, bwt.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bmf $$0 = this.a.R_();
      if ($$0 != null) {
         this.c = $$0.ek();
      }

      super.c();
   }
}
