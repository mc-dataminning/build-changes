import java.util.EnumSet;

public class cco extends ccz {
   private final bwd a;
   private final dha b;

   public cco(bwd $$0, dha $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccz.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(axy.h)) {
         jh $$1 = this.a.dv().d();
         dxn $$2 = this.b.a_($$1);
         return $$2.a(dkg.rk) || $$2.g(this.b, $$1) == fcj.a();
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
      this.a.J().a();
   }
}
