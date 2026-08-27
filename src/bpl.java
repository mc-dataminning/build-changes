import java.util.EnumSet;

public class bpl extends bpw {
   private final bjd a;
   private final cpq b;

   public bpl(bjd $$0, cpq $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bpw.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ag().a(apr.f)) {
         gw $$1 = this.a.dk().c();
         dfe $$2 = this.b.a_($$1);
         return $$2.a(csr.qC) || $$2.k(this.b, $$1) == ehy.a();
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
