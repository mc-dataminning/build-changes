import javax.annotation.Nullable;

public class ckd extends ccw {
   private final ckc a;

   public ckd(ckc $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dU().a(this.a.dz(), this.a.dB(), this.a.dF(), 10.0);
   }

   @Override
   public void a() {
      ard $$0 = (ard)this.a.dU();
      bsw $$1 = $$0.d_(this.a.du());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bvx $$2 = bvi.aw.a($$0, bvh.k);
      if ($$2 != null) {
         $$2.e(this.a.dz(), this.a.dB(), this.a.dF());
         $$2.a(true);
         $$0.b($$2);
         cna $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cjw $$5 = this.a($$1);
               if ($$5 != null) {
                  cna $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.dX().a(0.0, 1.1485), 0.0, this.a.dX().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cjw a(bsw $$0) {
      ckc $$1 = bvi.bf.a(this.a.dU(), bvh.k);
      if ($$1 != null) {
         $$1.a((ard)this.a.dU(), $$0, bvh.k, null);
         $$1.a_(this.a.dz(), this.a.dB(), this.a.dF());
         $$1.aj = 60;
         $$1.ga();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cna a(bsw $$0, cjw $$1) {
      cna $$2 = bvi.be.a($$1.dU(), bvh.k);
      if ($$2 != null) {
         $$2.a((ard)$$1.dU(), $$0, bvh.k, null);
         $$2.a_($$1.dz(), $$1.dB(), $$1.dF());
         $$2.aj = 60;
         $$2.ga();
         if ($$2.a(bvj.f).f()) {
            $$2.a(bvj.f, new cxh(cxl.qn));
         }

         this.a($$2, bvj.a, $$0);
         this.a($$2, bvj.f, $$0);
      }

      return $$2;
   }

   private void a(cna $$0, bvj $$1, bsw $$2) {
      cxh $$3 = $$0.a($$1);
      $$3.b(kv.l, ddx.a);
      ddt.a($$3, $$0.dU().F_(), dff.a, $$2, $$0.dX());
      $$0.a($$1, $$3);
   }
}
