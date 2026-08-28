import java.util.EnumSet;

public class cdp extends cea {
   private final bxg a;
   private final dja b;

   public cdp(bxg $$0, dja $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cea.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(axf.h)) {
         iu $$1 = this.a.dv().d();
         eah $$2 = this.b.a_($$1);
         return $$2.a(dmh.rx) || $$2.g(this.b, $$1) == ffh.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      this.a.N().a();
   }
}
