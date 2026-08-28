import javax.annotation.Nullable;

public class cnt extends cnb {
   private int f = 200;

   public cnt(bsw<? extends cnt> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnt(dcu $$0, btl $$1, cuo $$2, @Nullable cuo $$3) {
      super(bsw.aV, $$1, $$0, $$2, $$3);
   }

   public cnt(dcu $$0, double $$1, double $$2, double $$3, cuo $$4, @Nullable cuo $$5) {
      super(bsw.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B && !this.b) {
         this.dQ().a(lm.R, this.dv(), this.dx(), this.dB(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(btl $$0) {
      super.a($$0);
      bry $$1 = new bry(bsa.x, this.f, 0);
      $$0.b($$1, this.J());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cuo y() {
      return new cuo(cur.vp);
   }
}
