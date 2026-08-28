import javax.annotation.Nullable;

public class cpq extends cog {
   public cpq(bxc<? extends cpq> $$0, djx $$1) {
      super($$0, $$1);
      this.a(eyf.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bG.a(3, new cgj<>(this, cql.class, true));
      super.D();
   }

   @Override
   protected awo u() {
      return awp.DH;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.DJ;
   }

   @Override
   protected awo l_() {
      return awp.DI;
   }

   @Override
   awo m() {
      return awp.DK;
   }

   @Override
   public axt<czu> Y() {
      return null;
   }

   @Override
   public boolean g(czy $$0) {
      return !$$0.a(axm.bX) && super.g($$0);
   }

   @Override
   protected void a(ars $$0, bvi $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cok $$4 && $$4.x()) {
         $$4.gu();
         this.a($$0, dac.vw);
      }
   }

   @Override
   protected void a(azx $$0, bup $$1) {
      this.a(bxd.a, new czy(dac.pF));
   }

   @Override
   protected void a(dko $$0, azx $$1, bup $$2) {
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      bym $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bza.c).a(4.0);
      this.n();
      return $$4;
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bxu) {
            ((bxu)$$1).b(new bvx(bvz.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected csf a(czy $$0, float $$1, @Nullable czy $$2) {
      csf $$3 = super.a($$0, $$1, $$2);
      $$3.e(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bvx $$0) {
      return $$0.a(bvz.t) ? false : super.b($$0);
   }
}
