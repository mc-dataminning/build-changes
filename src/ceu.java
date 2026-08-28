import java.util.EnumSet;

public class ceu extends cew {
   private final bwv a;
   private bvy b;
   private int c;

   public ceu(bwv $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(ccw.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.gs()) {
         bvy $$0 = this.a.ae_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.es();
            int $$1 = $$0.et();
            return $$1 != this.c && this.a(this.b, cgp.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bvy $$0 = this.a.ae_();
      if ($$0 != null) {
         this.c = $$0.et();
      }

      super.d();
   }
}
