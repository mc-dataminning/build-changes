import java.util.EnumSet;

public class bse extends bsh {
   private final bkh a;
   private bjm b;
   private int c;

   public bse(bkh $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bqh.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.ge()) {
         bjm $$0 = this.a.O_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eg();
            int $$1 = $$0.eh();
            return $$1 != this.c && this.a(this.b, bty.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bjm $$0 = this.a.O_();
      if ($$0 != null) {
         this.c = $$0.eh();
      }

      super.c();
   }
}
