import java.util.EnumSet;

public class ceh extends ces {
   private final bxy a;
   private final djz b;

   public ceh(bxy $$0, djz $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ces.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.an().a(axj.h)) {
         iw $$1 = this.a.dv().d();
         ebg $$2 = this.b.a_($$1);
         return $$2.a(dng.rx) || $$2.g(this.b, $$1) == fgj.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      this.a.N().a();
   }
}
