import java.util.EnumSet;

public class cdk extends cdv {
   private final bxb a;
   private final dip b;

   public cdk(bxb $$0, dip $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cdv.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aw || this.a.av;
      if ($$0 && this.a.aq().a(axd.h)) {
         iu $$1 = this.a.dv().d();
         dzo $$2 = this.b.a_($$1);
         return $$2.a(dlw.rt) || $$2.g(this.b, $$1) == fen.a();
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
