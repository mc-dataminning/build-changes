import java.util.EnumSet;

public class caq extends bzm {
   private final cgi a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public caq(cgi $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzm.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gE() && this.a.bS()) {
         euk $$0 = cdj.a(this.a, 5, 4);
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
      this.a.K().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean b() {
      return !this.a.gE() && !this.a.K().l() && this.a.bS();
   }

   @Override
   public void e() {
      if (!this.a.gE() && this.a.el().a(this.a(50)) == 0) {
         bru $$0 = this.a.cT();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof clw $$1) {
            int $$2 = this.a.gK();
            int $$3 = this.a.gP();
            if ($$3 > 0 && this.a.el().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.w(5);
         }

         this.a.bH();
         this.a.gU();
         this.a.dP().a(this.a, (byte)6);
      }
   }
}
