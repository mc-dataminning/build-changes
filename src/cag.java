import java.util.EnumSet;

public class cag extends byx {
   private final ckp a;

   public cag(ckp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(byx.a.c, byx.a.a));
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
         clh $$0 = this.a.gp();
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
