import java.util.EnumSet;

public class bpw extends bqh {
   private final bjo a;
   private final cqb b;

   public bpw(bjo $$0, cqb $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bqh.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aB || this.a.aA;
      if ($$0 && this.a.ag().a(apy.h)) {
         gw $$1 = this.a.dl().c();
         dfd $$2 = this.b.a_($$1);
         return $$2.a(cte.qC) || $$2.k(this.b, $$1) == ehx.a();
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
