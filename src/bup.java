import java.util.EnumSet;

public class bup extends btg {
   private final cep a;

   public bup(cep $$0) {
      this.a = $$0;
      this.a(EnumSet.of(btg.a.c, btg.a.a));
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
         cfh $$0 = this.a.ge();
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
