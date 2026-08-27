import java.util.EnumSet;

public class bum extends bth {
   private final bng a;

   public bum(bng $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bth.a.c, bth.a.a));
   }

   @Override
   public boolean b() {
      return this.a.ge();
   }

   @Override
   public boolean a() {
      if (!this.a.u()) {
         return false;
      } else if (this.a.bc()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else {
         bml $$0 = this.a.R_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f($$0) < 144.0 && $$0.eh() != null ? false : this.a.ge();
         }
      }
   }

   @Override
   public void c() {
      this.a.N().n();
      this.a.y(true);
   }

   @Override
   public void d() {
      this.a.y(false);
   }
}
