import com.mojang.serialization.MapCodec;

public class dpz extends dmr {
   public static final MapCodec<dpz> b = b(dpz::new);
   public static final dym c = dyl.x;

   @Override
   public MapCodec<dpz> a() {
      return b;
   }

   public dpz(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dhl $$0, dhx $$1, jh $$2) {
      if (!$$0.B_() && !$$1.T().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(dhi $$0, jh $$1, dxv $$2) {
      jm $$3 = $$2.c(a);
      jh $$4 = $$1.a($$3.g());
      evf $$5 = evb.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dxv $$0) {
      return true;
   }

   @Override
   protected int b(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B_() && $$0.c(c) && !$$1.T().a($$2, this)) {
            dxv $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.C && $$0.c(c) && $$1.T().a($$2, this)) {
            this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
