import java.util.EnumSet;

public class bpf extends bpu {
   private final bjh a;

   public bpf(bjh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bpu.a.a, bpu.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ch() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean J_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<gu> $$0 = gu.b(
         arp.a(this.a.dp() - 1.0), this.a.dq(), arp.a(this.a.dv() - 1.0), arp.a(this.a.dp() + 1.0), arp.a(this.a.dr() + 8.0), arp.a(this.a.dv() + 1.0)
      );
      gu $$1 = null;

      for (gu $$2 : $$0) {
         if (this.a(this.a.dK(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = gu.a(this.a.dp(), this.a.dr() + 8.0, this.a.dv());
      }

      this.a.H().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new ehe((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bje.a, this.a.dn());
   }

   private boolean a(cpp $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(csn.nd)) && $$2.a($$0, $$1, eat.a);
   }
}
