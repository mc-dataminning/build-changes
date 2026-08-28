import java.util.EnumSet;

public class cab extends cam {
   private final btp a;
   private final dcw b;

   public cab(btp $$0, dcw $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cam.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aA || this.a.az;
      if ($$0 && this.a.am().a(awi.h)) {
         jd $$1 = this.a.do().d();
         dtc $$2 = this.b.a_($$1);
         return $$2.a(dga.qP) || $$2.k(this.b, $$1) == exs.a();
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
      this.a.L().a();
   }
}
