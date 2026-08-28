import java.util.EnumSet;

public class ccx extends cbt {
   private final ciq a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public ccx(ciq $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cbt.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gM() && this.a.cb()) {
         ezh $$0 = cfq.a(this.a, 5, 4);
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
      return !this.a.gM() && !this.a.P().m() && this.a.cb();
   }

   @Override
   public void a() {
      if (!this.a.gM() && this.a.ea().a(this.a(50)) == 0) {
         btz $$0 = this.a.db();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof coh $$1) {
            int $$2 = this.a.gS();
            int $$3 = this.a.gY();
            if ($$3 > 0 && this.a.ea().a($$3) < $$2) {
               this.a.g($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bQ();
         this.a.hd();
         this.a.dX().a(this.a, (byte)6);
      }
   }
}
