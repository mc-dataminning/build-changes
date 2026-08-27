import com.mojang.serialization.MapCodec;

public class dat extends cut {
   public static final MapCodec<dat> a = b(dat::new);
   public static final dhn b = daw.d;

   @Override
   public MapCodec<dat> a() {
      return a;
   }

   public dat(dgv.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cdm $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bki $$3) {
      if (!$$3.bS()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      clb $$6 = $$3.b($$4);
      return $$6.d() instanceof ciu && new cnj($$3, $$4, $$6, $$5).b() ? biq.d : biq.a;
   }

   private static void d(dgw $$0, crs $$1, ht $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(dgw $$0) {
      return $$0.c(b);
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, clb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cpo.a(cpq.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(crs $$0, ht $$1) {
      double $$2 = 0.5625;
      ato $$3 = $$0.z;

      for (hx $$4 : hx.values()) {
         ht $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            hx.a $$6 = $$4.o();
            double $$7 = $$6 == hx.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == hx.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == hx.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(jm.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }
}
