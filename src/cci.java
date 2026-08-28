import java.util.EnumSet;

public class cci extends cck {
   private final buj a;
   private btl b;
   private int c;

   public cci(buj $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cak.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.s() && !this.a.gm()) {
         btl $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.el();
            int $$1 = $$0.em();
            return $$1 != this.c && this.a(this.b, ced.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      btl $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.em();
      }

      super.d();
   }
}
