import java.util.EnumSet;

public class bpj extends bpu {
   private final bja a;
   private final cpm b;

   public bpj(bja $$0, cpm $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bpu.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ag().a(apo.f)) {
         gu $$1 = this.a.dk().c();
         dfa $$2 = this.b.a_($$1);
         return $$2.a(csn.qC) || $$2.k(this.b, $$1) == ehu.a();
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
