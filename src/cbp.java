import java.util.EnumSet;

public class cbp extends cak {
   private final buj a;

   public cbp(buj $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cak.a.c, cak.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gm();
   }

   @Override
   public boolean b() {
      if (!this.a.s()) {
         return false;
      } else if (this.a.bi()) {
         return false;
      } else if (!this.a.aF()) {
         return false;
      } else {
         btl $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bsq)$$0) < 144.0 && $$0.ej() != null ? false : this.a.gm();
         }
      }
   }

   @Override
   public void d() {
      this.a.J().n();
      this.a.x(true);
   }

   @Override
   public void e() {
      this.a.x(false);
   }
}
