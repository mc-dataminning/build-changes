import java.util.EnumSet;

public class bpi extends bpt {
   private final bja a;
   private final cpl b;

   public bpi(bja $$0, cpl $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bpt.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ag().a(apo.f)) {
         gu $$1 = this.a.dk().c();
         dez $$2 = this.b.a_($$1);
         return $$2.a(csm.qC) || $$2.k(this.b, $$1) == eht.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      this.a.F().a();
   }
}
