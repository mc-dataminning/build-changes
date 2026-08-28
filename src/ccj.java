import java.util.EnumSet;

public class ccj extends ccl {
   private final buk a;
   private btn b;
   private int c;

   public ccj(buk $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cal.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.gq()) {
         btn $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eo();
            int $$1 = $$0.ep();
            return $$1 != this.c && this.a(this.b, cee.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      btn $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.ep();
      }

      super.c();
   }
}
