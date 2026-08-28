import java.util.EnumSet;

public class cbw extends can {
   private final cmf a;

   public cbw(cmf $$0) {
      this.a = $$0;
      this.a(EnumSet.of(can.a.c, can.a.a));
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
         cmx $$0 = this.a.gq();
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
