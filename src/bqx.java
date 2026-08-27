import java.util.EnumSet;

public class bqx extends bps {
   private final bjs a;

   public bqx(bjs $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bps.a.c, bps.a.a));
   }

   @Override
   public boolean b() {
      return this.a.fZ();
   }

   @Override
   public boolean a() {
      if (!this.a.p()) {
         return false;
      } else if (this.a.ba()) {
         return false;
      } else if (!this.a.aA()) {
         return false;
      } else {
         biw $$0 = this.a.I_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f($$0) < 144.0 && $$0.ef() != null ? false : this.a.fZ();
         }
      }
   }

   @Override
   public void c() {
      this.a.H().n();
      this.a.y(true);
   }

   @Override
   public void d() {
      this.a.y(false);
   }
}
