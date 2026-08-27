import javax.annotation.Nullable;

public class cfx extends cep {
   public cfx(bol<? extends cfx> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bQ.a(3, new bxn<>(this, cgp.class, true));
      super.B();
   }

   @Override
   protected ato y() {
      return atp.BT;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.BV;
   }

   @Override
   protected ato n_() {
      return atp.BU;
   }

   @Override
   ato w() {
      return atp.BW;
   }

   @Override
   protected void a(bne $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ces $$4 && $$4.gm()) {
         $$4.gn();
         this.a((cwd)cpt.ui);
      }
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      this.a(bom.a, new cpq(cpt.oP));
   }

   @Override
   protected void b(awt $$0, bmj $$1) {
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      bpp $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(bqe.c).a(4.0);
      this.A();
      return $$4;
   }

   @Override
   public boolean B(bof $$0) {
      if (!super.B($$0)) {
         return false;
      } else {
         if ($$0 instanceof box) {
            ((box)$$0).b(new bns(bnu.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cig b(cpq $$0, float $$1) {
      cig $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bns $$0) {
      return $$0.a(bnu.t) ? false : super.c($$0);
   }
}
