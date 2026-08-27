import java.util.EnumSet;

public class bwa extends bwl {
   private final bpq a;
   private final cwz b;

   public bwa(bpq $$0, cwz $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bwl.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(auq.h)) {
         ib $$1 = this.a.dm().c();
         dmz $$2 = this.b.a_($$1);
         return $$2.a(dac.qP) || $$2.k(this.b, $$1) == eqh.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.a.I().a();
   }
}
