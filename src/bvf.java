import java.util.EnumSet;

public class bvf extends bvu {
   private final bpf a;

   public bvf(bpf $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvu.a.a, bvu.a.b));
   }

   @Override
   public boolean a() {
      return this.a.cf() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean S_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<ib> $$0 = ib.b(
         awm.a(this.a.do() - 1.0), this.a.dp(), awm.a(this.a.du() - 1.0), awm.a(this.a.do() + 1.0), awm.a(this.a.dq() + 8.0), awm.a(this.a.du() + 1.0)
      );
      ib $$1 = null;

      for (ib $$2 : $$0) {
         if (this.a(this.a.dJ(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ib.a(this.a.do(), this.a.dq() + 8.0, this.a.du());
      }

      this.a.N().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new eov((double)this.a.bl, (double)this.a.bm, (double)this.a.bn));
      this.a.a(bpc.a, this.a.dm());
   }

   private boolean a(cwh $$0, ib $$1) {
      dme $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(czh.nd)) && $$2.a($$0, $$1, eih.a);
   }
}
