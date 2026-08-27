import java.util.EnumSet;

public class bps extends bqd {
   private final bjk a;
   private final cpx b;

   public bps(bjk $$0, cpx $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bqd.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ag().a(apx.f)) {
         gw $$1 = this.a.dl().c();
         dfl $$2 = this.b.a_($$1);
         return $$2.a(csy.qC) || $$2.k(this.b, $$1) == eif.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void e() {
      this.a.K().a();
   }
}
