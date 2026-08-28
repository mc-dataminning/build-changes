import java.util.EnumSet;

public class cbu extends ccf {
   private final bvj a;
   private final dfm b;

   public cbu(bvj $$0, dfm $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(ccf.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(axg.h)) {
         jh $$1 = this.a.dv().d();
         dvv $$2 = this.b.a_($$1);
         return $$2.a(dis.qP) || $$2.g(this.b, $$1) == fap.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      this.a.J().a();
   }
}
