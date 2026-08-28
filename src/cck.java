import java.util.EnumSet;

public class cck extends ccm {
   private final bul a;
   private btn b;
   private int c;

   public cck(bul $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cam.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.s() && !this.a.gk()) {
         btn $$0 = this.a.T_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ek();
            int $$1 = $$0.el();
            return $$1 != this.c && this.a(this.b, cef.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      btn $$0 = this.a.T_();
      if ($$0 != null) {
         this.c = $$0.el();
      }

      super.d();
   }
}
