import java.util.EnumSet;

public class btp extends bsg {
   private final cdh a;

   public btp(cdh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsg.a.c, bsg.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bx()) {
         return false;
      } else if (this.a.aZ()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         cdz $$0 = this.a.gf();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.f($$0) > 16.0 ? false : $$0.bS != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.N().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
