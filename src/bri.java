import java.util.EnumSet;

public class bri extends brt {
   private final bla a;
   private final crs b;

   public bri(bla $$0, crs $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(brt.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ag().a(arf.h)) {
         ht $$1 = this.a.dl().c();
         dgw $$2 = this.b.a_($$1);
         return $$2.a(cuv.qC) || $$2.k(this.b, $$1) == ejy.a();
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
      this.a.K().a();
   }
}
