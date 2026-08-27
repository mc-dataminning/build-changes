import com.mojang.serialization.MapCodec;

public class des extends cys {
   public static final MapCodec<des> a = b(des::new);
   public static final dma b = dev.d;

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public des(dli.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, chl $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, bnq $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.d() instanceof cmw && new crk($$4, $$5, $$0, $$6).b() ? bly.e : bly.a;
   }

   private static void d(dlj $$0, cvr $$1, hz $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean e_(dlj $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, cpd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && ctn.a(ctp.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(cvr $$0, hz $$1) {
      double $$2 = 0.5625;
      awp $$3 = $$0.z;

      for (ie $$4 : ie.values()) {
         hz $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ie.a $$6 = $$4.o();
            double $$7 = $$6 == ie.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ie.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ie.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(jt.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }
}
