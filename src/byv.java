import java.util.EnumSet;

public class byv extends bxq {
   private final brp a;

   public byv(brp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bxq.a.c, bxq.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gn();
   }

   @Override
   public boolean a() {
      if (!this.a.r()) {
         return false;
      } else if (this.a.bf()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else {
         bqt $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bqa)$$0) < 144.0 && $$0.ej() != null ? false : this.a.gn();
         }
      }
   }

   @Override
   public void c() {
      this.a.K().n();
      this.a.x(true);
   }

   @Override
   public void d() {
      this.a.x(false);
   }
}
