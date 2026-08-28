import java.util.EnumSet;

public class cdn extends cdy {
   private final bxe a;
   private final div b;

   public cdn(bxe $$0, div $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cdy.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(axf.h)) {
         iu $$1 = this.a.dv().d();
         dzz $$2 = this.b.a_($$1);
         return $$2.a(dmc.ru) || $$2.g(this.b, $$1) == fez.a();
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
