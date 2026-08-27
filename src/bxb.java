import java.util.EnumSet;

public class bxb extends bxq {
   private final brb a;

   public bxb(brb $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bxq.a.a, bxq.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ci() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<id> $$0 = id.b(
         axm.a(this.a.dr() - 1.0), this.a.ds(), axm.a(this.a.dx() - 1.0), axm.a(this.a.dr() + 1.0), axm.a(this.a.dt() + 8.0), axm.a(this.a.dx() + 1.0)
      );
      id $$1 = null;

      for (id $$2 : $$0) {
         if (this.a(this.a.dM(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = id.a(this.a.dr(), this.a.dt() + 8.0, this.a.dx());
      }

      this.a.K().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new esj((double)this.a.bn, (double)this.a.bo, (double)this.a.bp));
      this.a.a(bqy.a, this.a.dp());
   }

   private boolean a(czj $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dcj.nd)) && $$2.a(elq.a);
   }
}
