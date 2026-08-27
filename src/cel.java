import javax.annotation.Nullable;

public class cel extends cee {
   private static final bry ch = bsb.y.n().a(0.5F).b(0.665F);

   public cel(bsb<? extends cel> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void y() {
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new cae(this, 2.0));
      this.cb.a(2, new byx(this, 1.0));
      this.cb.a(3, new cat(this, 1.25, $$0 -> $$0.a(awm.aa), false));
      this.cb.a(4, new bzk(this, 1.25));
      this.cb.a(5, new cay(this, 1.0));
      this.cb.a(6, new bzt(this, cly.class, 6.0F));
      this.cb.a(7, new cag(this));
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.aa);
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 10.0).a(btv.r, 0.2F);
   }

   @Override
   protected avn u() {
      return avo.gb;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.gd;
   }

   @Override
   protected avn n_() {
      return avo.gc;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fn() {
      return 0.4F;
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.a(cuk.rV) && !this.o_()) {
         $$0.a(avo.ge, 1.0F, 1.0F);
         cuh $$3 = cuj.a($$2, $$0, cuk.sb.v());
         $$0.a($$1, $$3);
         return bqa.a(this.dU().C);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cel b(aqt $$0, brp $$1) {
      return bsb.y.a((dca)$$0);
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? ch : super.e($$0);
   }
}
