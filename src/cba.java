import java.util.EnumSet;

public class cba extends bzw {
   private final cgs a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cba(cgs $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzw.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.gC() && this.a.bS()) {
         evz $$0 = cdt.a(this.a, 5, 4);
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
      return !this.a.gC() && !this.a.K().l() && this.a.bS();
   }

   @Override
   public void e() {
      if (!this.a.gC() && this.a.dS().a(this.a(50)) == 0) {
         bsd $$0 = this.a.cT();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cmh $$1) {
            int $$2 = this.a.gI();
            int $$3 = this.a.gN();
            if ($$3 > 0 && this.a.dS().a($$3) < $$2) {
               this.a.h($$1);
               return;
            }

            this.a.v(5);
         }

         this.a.bH();
         this.a.gS();
         this.a.dP().a(this.a, (byte)6);
      }
   }
}
