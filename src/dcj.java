import com.mojang.serialization.MapCodec;

public class dcj extends cwj {
   public static final MapCodec<dcj> a = b(dcj::new);
   public static final djr b = dcm.d;

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   public dcj(diz.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cfb $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, blp $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      cmr $$6 = $$3.b($$4);
      return $$6.d() instanceof ckk && new cpa($$3, $$4, $$6, $$5).b() ? bjv.d : bjv.a;
   }

   private static void d(dja $$0, cti $$1, hx $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(dja $$0) {
      return $$0.c(b);
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, cmr $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cre.a(crg.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(cti $$0, hx $$1) {
      double $$2 = 0.5625;
      aup $$3 = $$0.z;

      for (ic $$4 : ic.values()) {
         hx $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ic.a $$6 = $$4.o();
            double $$7 = $$6 == ic.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ic.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ic.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(jr.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }
}
