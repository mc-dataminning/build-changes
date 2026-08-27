import java.util.EnumSet;

public class bqy extends bpu {
   private final bwj a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public bqy(bwj $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bpu.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.go() && this.a.bO()) {
         ehe $$0 = btp.a(this.a, 5, 4);
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
      this.a.H().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean b() {
      return !this.a.go() && !this.a.H().l() && this.a.bO();
   }

   @Override
   public void e() {
      if (!this.a.go() && this.a.ee().a(this.a(50)) == 0) {
         bii $$0 = this.a.cQ();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cbn $$1) {
            int $$2 = this.a.gu();
            int $$3 = this.a.gA();
            if ($$3 > 0 && this.a.ee().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bA();
         this.a.gF();
         this.a.dK().a(this.a, (byte)6);
      }
   }
}
