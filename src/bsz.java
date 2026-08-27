import java.util.EnumSet;

public class bsz extends btk {
   private final bmq a;
   private final ctx b;

   public bsz(bmq $$0, ctx $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(btk.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(asl.h)) {
         hx $$1 = this.a.dl().c();
         djp $$2 = this.b.a_($$1);
         return $$2.a(cxa.qP) || $$2.k(this.b, $$1) == ems.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      this.a.M().a();
   }
}
