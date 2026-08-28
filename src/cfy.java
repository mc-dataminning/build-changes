import java.util.EnumSet;

public class cfy extends cga {
   private final bya a;
   private bxe b;
   private int c;

   public cfy(bya $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cea.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.gr()) {
         bxe $$0 = this.a.e();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eu();
            int $$1 = $$0.ev();
            return $$1 != this.c && this.a(this.b, cht.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.g(this.b);
      bxe $$0 = this.a.e();
      if ($$0 != null) {
         this.c = $$0.ev();
      }

      super.d();
   }
}
