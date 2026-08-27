import java.util.EnumSet;

public class byj extends bym {
   private final bql a;
   private bpp b;
   private int c;

   public byj(bql $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bwm.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.r() && !this.a.gn()) {
         bpp $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ej();
            int $$1 = $$0.ek();
            return $$1 != this.c && this.a(this.b, caf.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bpp $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.ek();
      }

      super.c();
   }
}
