import java.util.EnumSet;

public class bpq extends bqb {
   private final bji a;
   private final cpv b;

   public bpq(bji $$0, cpv $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bqb.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ag().a(apw.f)) {
         gw $$1 = this.a.dl().c();
         dfj $$2 = this.b.a_($$1);
         return $$2.a(csw.qC) || $$2.k(this.b, $$1) == eid.a();
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
