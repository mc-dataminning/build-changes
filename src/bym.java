import java.util.EnumSet;

public class bym extends byx {
   private final bsc a;
   private final dad b;

   public bym(bsc $$0, dad $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(byx.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ai().a(avu.h)) {
         in $$1 = this.a.dn().c();
         dqh $$2 = this.b.a_($$1);
         return $$2.a(ddg.qP) || $$2.k(this.b, $$1) == euf.a();
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
