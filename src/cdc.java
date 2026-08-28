import java.util.EnumSet;

public class cdc extends cdn {
   private final bwt a;
   private final dhp b;

   public cdc(bwt $$0, dhp $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cdn.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(axd.h)) {
         jj $$1 = this.a.dv().d();
         dym $$2 = this.b.a_($$1);
         return $$2.a(dkw.rt) || $$2.g(this.b, $$1) == fdl.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      this.a.N().a();
   }
}
