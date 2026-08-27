import java.util.EnumSet;

public class cap extends bzl {
   private final cgi a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cap(cgi $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzl.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gN() && this.a.bX()) {
         ewu $$0 = cdi.a(this.a, 5, 4);
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.c;
            this.d = $$0.d;
            this.e = $$0.e;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.a.J().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean b() {
      return !this.a.gN() && !this.a.J().l() && this.a.bX();
   }

   @Override
   public void e() {
      if (!this.a.gN() && this.a.et().a(this.a(50)) == 0) {
         brv $$0 = this.a.cY();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cly $$1) {
            int $$2 = this.a.gT();
            int $$3 = this.a.gY();
            if ($$3 > 0 && this.a.et().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.x(5);
         }

         this.a.bM();
         this.a.hd();
         this.a.dU().a(this.a, (byte)6);
      }
   }
}
