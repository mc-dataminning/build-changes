import java.util.EnumSet;

public class cco extends cbk {
   private final cih a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cco(cih $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cbk.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gF() && this.a.bX()) {
         eyw $$0 = cfh.a(this.a, 5, 4);
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
      return !this.a.gF() && !this.a.P().m() && this.a.bX();
   }

   @Override
   public void a() {
      if (!this.a.gF() && this.a.dV().a(this.a(50)) == 0) {
         btr $$0 = this.a.cX();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cnx $$1) {
            int $$2 = this.a.gL();
            int $$3 = this.a.gR();
            if ($$3 > 0 && this.a.dV().a($$3) < $$2) {
               this.a.g($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bM();
         this.a.gW();
         this.a.dS().a(this.a, (byte)6);
      }
   }
}
