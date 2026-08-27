import java.util.EnumSet;

public class cav extends bzm {
   private final cle a;

   public cav(cle $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzm.a.c, bzm.a.a));
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
         clw $$0 = this.a.gp();
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
