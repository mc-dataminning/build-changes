import java.util.EnumSet;

public class cbs extends can {
   private final bum a;

   public cbs(bum $$0) {
      this.a = $$0;
      this.a(EnumSet.of(can.a.c, can.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gq();
   }

   @Override
   public boolean a() {
      if (!this.a.s()) {
         return false;
      } else if (this.a.bh()) {
         return false;
      } else if (!this.a.aE()) {
         return false;
      } else {
         btp $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bsu)$$0) < 144.0 && $$0.em() != null ? false : this.a.gq();
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
