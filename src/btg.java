import java.util.EnumSet;

public class btg extends bsb {
   private final bmb a;

   public btg(bmb $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsb.a.c, bsb.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gf();
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
         blg $$0 = this.a.Q_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f($$0) < 144.0 && $$0.ei() != null ? false : this.a.gf();
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
