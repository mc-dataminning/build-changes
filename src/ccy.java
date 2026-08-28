import java.util.EnumSet;

public class ccy extends cbt {
   private final bvs a;

   public ccy(bvs $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbt.a.c, cbt.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gv();
   }

   @Override
   public boolean b() {
      if (!this.a.q()) {
         return false;
      } else if (this.a.bn()) {
         return false;
      } else if (!this.a.aJ()) {
         return false;
      } else {
         buv $$0 = this.a.T_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((btz)$$0) < 144.0 && $$0.es() != null ? false : this.a.gv();
         }
      }
   }

   @Override
   public void d() {
      this.a.P().o();
      this.a.y(true);
   }

   @Override
   public void e() {
      this.a.y(false);
   }
}
