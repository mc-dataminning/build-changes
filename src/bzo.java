import java.util.EnumSet;

public class bzo extends bzz {
   private final btd a;
   private final dcf b;

   public bzo(btd $$0, dcf $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzz.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.al().a(awa.h)) {
         ja $$1 = this.a.dq().c();
         dsk $$2 = this.b.a_($$1);
         return $$2.a(dfj.qP) || $$2.k(this.b, $$1) == ewv.a();
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
