import java.util.EnumSet;

public class bve extends bvg {
   private final bnf a;
   private bmk b;
   private int c;

   public bve(bnf $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(btg.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.u() && !this.a.ge()) {
         bmk $$0 = this.a.R_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ej();
            int $$1 = $$0.ek();
            return $$1 != this.c && this.a(this.b, bwy.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bmk $$0 = this.a.R_();
      if ($$0 != null) {
         this.c = $$0.ek();
      }

      super.c();
   }
}
