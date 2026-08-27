import java.util.EnumSet;

public class bzd extends bzo {
   private final bss a;
   private final daz b;

   public bzd(bss $$0, daz $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzo.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ak().a(awa.h)) {
         io $$1 = this.a.dp().c();
         drd $$2 = this.b.a_($$1);
         return $$2.a(dec.qP) || $$2.k(this.b, $$1) == evc.a();
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
      this.a.I().a();
   }
}
