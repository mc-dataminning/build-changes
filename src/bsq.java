import java.util.EnumSet;

public class bsq extends btb {
   private final bmh a;
   private final cti b;

   public bsq(bmh $$0, cti $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(btb.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ai().a(ase.h)) {
         hx $$1 = this.a.dm().c();
         dja $$2 = this.b.a_($$1);
         return $$2.a(cwl.qP) || $$2.k(this.b, $$1) == emc.a();
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
