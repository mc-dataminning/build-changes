import java.util.EnumSet;

public class cdc extends cby {
   private final civ a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cdc(civ $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cby.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gL() && this.a.cb()) {
         ezn $$0 = cfv.a(this.a, 5, 4);
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.d;
            this.d = $$0.e;
            this.e = $$0.f;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.a.P().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean c() {
      return !this.a.gL() && !this.a.P().m() && this.a.cb();
   }

   @Override
   public void a() {
      if (!this.a.gL() && this.a.ea().a(this.a(50)) == 0) {
         bue $$0 = this.a.db();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof com $$1) {
            int $$2 = this.a.gR();
            int $$3 = this.a.gX();
            if ($$3 > 0 && this.a.ea().a($$3) < $$2) {
               this.a.g($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bQ();
         this.a.hc();
         this.a.dX().a(this.a, (byte)6);
      }
   }
}
