import java.util.EnumSet;

public class bud extends bug {
   private final bmg a;
   private bll b;
   private int c;

   public bud(bmg $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bsg.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.u() && !this.a.gf()) {
         bll $$0 = this.a.R_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ei();
            int $$1 = $$0.ej();
            return $$1 != this.c && this.a(this.b, bvx.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bll $$0 = this.a.R_();
      if ($$0 != null) {
         this.c = $$0.ej();
      }

      super.c();
   }
}
