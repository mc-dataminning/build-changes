import javax.annotation.Nullable;

public class cni extends cmq {
   private int f = 200;

   public cni(bsm<? extends cni> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cni(dcf $$0, btb $$1, cuc $$2, @Nullable cuc $$3) {
      super(bsm.aV, $$1, $$0, $$2, $$3);
   }

   public cni(dcf $$0, double $$1, double $$2, double $$3, cuc $$4, @Nullable cuc $$5) {
      super(bsm.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B && !this.b) {
         this.dQ().a(lj.R, this.dv(), this.dx(), this.dB(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(btb $$0) {
      super.a($$0);
      bro $$1 = new bro(brq.x, this.f, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cuc y() {
      return new cuc(cuf.vp);
   }
}
