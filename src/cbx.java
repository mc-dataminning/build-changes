import java.util.EnumSet;

public class cbx extends cca {
   private final btz a;
   private btc b;
   private int c;

   public cbx(btz $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(caa.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.gn()) {
         btc $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ek();
            int $$1 = $$0.el();
            return $$1 != this.c && this.a(this.b, cdt.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      btc $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.el();
      }

      super.c();
   }
}
