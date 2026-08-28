import java.util.EnumSet;

public class ceq extends cfb {
   private final byh a;
   private final dkj b;

   public ceq(byh $$0, dkj $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cfb.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.an().a(axq.h)) {
         iw $$1 = this.a.dv().d();
         ebq $$2 = this.b.a_($$1);
         return $$2.a(dnq.rx) || $$2.g(this.b, $$1) == fgt.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean W_() {
      return true;
   }

   @Override
   public void a() {
      this.a.M().a();
   }
}
