import java.util.EnumSet;

public class cdg extends ccc {
   private final ciz a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cdg(ciz $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccc.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gM() && this.a.cc()) {
         ezr $$0 = cfz.a(this.a, 5, 4);
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
      return !this.a.gM() && !this.a.P().m() && this.a.cc();
   }

   @Override
   public void a() {
      if (!this.a.gM() && this.a.eb().a(this.a(50)) == 0) {
         bui $$0 = this.a.dc();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cor $$1) {
            int $$2 = this.a.gS();
            int $$3 = this.a.gY();
            if ($$3 > 0 && this.a.eb().a($$3) < $$2) {
               this.a.g($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bR();
         this.a.hd();
         this.a.dY().a(this.a, (byte)6);
      }
   }
}
