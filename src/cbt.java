import java.util.EnumSet;

public class cbt extends cak {
   private final cmd a;

   public cbt(cmd $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cak.a.c, cak.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bE()) {
         return false;
      } else if (this.a.bf()) {
         return false;
      } else if (!this.a.aF()) {
         return false;
      } else if (this.a.U) {
         return false;
      } else {
         cmv $$0 = this.a.gm();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cd != null;
         }
      }
   }

   @Override
   public void d() {
      this.a.J().n();
   }

   @Override
   public void e() {
      this.a.f(null);
   }
}
