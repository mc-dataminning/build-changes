import java.util.EnumSet;

public class cck extends ccv {
   private final bvz a;
   private final dgz b;

   public cck(bvz $$0, dgz $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccv.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(axo.h)) {
         jh $$1 = this.a.dw().d();
         dxo $$2 = this.b.a_($$1);
         return $$2.a(dkf.rr) || $$2.g(this.b, $$1) == fci.a();
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
