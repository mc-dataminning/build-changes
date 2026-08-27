import java.util.EnumSet;

public class bzk extends byb {
   private final cjt a;

   public bzk(cjt $$0) {
      this.a = $$0;
      this.a(EnumSet.of(byb.a.c, byb.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bB()) {
         return false;
      } else if (this.a.bc()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else if (this.a.U) {
         return false;
      } else {
         ckl $$0 = this.a.gp();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cc != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.K().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
