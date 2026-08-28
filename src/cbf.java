import java.util.EnumSet;

public class cbf extends bzw {
   private final clp a;

   public cbf(clp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzw.a.c, bzw.a.a));
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
         cmh $$0 = this.a.gn();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cd != null;
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
