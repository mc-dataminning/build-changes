import java.util.EnumSet;

public class bph extends bps {
   private final biy a;
   private final cpk b;

   public bph(biy $$0, cpk $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bps.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ag().a(apm.f)) {
         gv $$1 = this.a.dk().c();
         dey $$2 = this.b.a_($$1);
         return $$2.a(csl.qC) || $$2.k(this.b, $$1) == ehv.a();
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
