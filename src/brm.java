import java.util.EnumSet;

public class brm extends bqh {
   private final bkh a;

   public brm(bkh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bqh.a.c, bqh.a.a));
   }

   @Override
   public boolean b() {
      return this.a.ge();
   }

   @Override
   public boolean a() {
      if (!this.a.s()) {
         return false;
      } else if (this.a.ba()) {
         return false;
      } else if (!this.a.aA()) {
         return false;
      } else {
         bjm $$0 = this.a.O_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f($$0) < 144.0 && $$0.eg() != null ? false : this.a.ge();
         }
      }
   }

   @Override
   public void c() {
      this.a.L().n();
      this.a.y(true);
   }

   @Override
   public void d() {
      this.a.y(false);
   }
}
