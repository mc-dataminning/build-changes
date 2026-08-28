import java.util.EnumSet;

public class cbr extends cai {
   private final cma a;

   public cbr(cma $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cai.a.c, cai.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bD()) {
         return false;
      } else if (this.a.be()) {
         return false;
      } else if (!this.a.aE()) {
         return false;
      } else if (this.a.U) {
         return false;
      } else {
         cms $$0 = this.a.gq();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cb != null;
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
