import com.mojang.serialization.MapCodec;

public class dpu extends dmi {
   public static final MapCodec<dpu> b = b(dpu::new);
   public static final dyh c = dyg.A;

   @Override
   public MapCodec<dpu> a() {
      return b;
   }

   public dpu(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, jn.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dhc $$0, dho $$1, ji $$2) {
      if (!$$0.w_() && !$$1.U().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(dgz $$0, ji $$1, dxq $$2) {
      jn $$3 = $$2.c(a);
      ji $$4 = $$1.a($$3.g());
      eve $$5 = eva.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.w_() && $$0.c(c) && !$$1.U().a($$2, this)) {
            dxq $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if ($$0.c(c) && $$1.n().a($$2, this)) {
         this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
      }
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
