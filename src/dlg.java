import com.mojang.serialization.MapCodec;

public class dlg extends dff {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final dsy b = dlj.d;

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   public dlg(dsg.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dsh $$0, dcd $$1, ja $$2, cmh $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsd $$3) {
      if (!$$3.bW()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.g() instanceof cry && new cxk($$4, $$5, $$0, $$6).b() ? bqf.e : bqf.a;
   }

   private static void d(dsh $$0, dcd $$1, ja $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(dsh $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, cua $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpo.a(1, 5));
      }
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dcd $$0, ja $$1) {
      double $$2 = 0.5625;
      aym $$3 = $$0.z;

      for (jf $$4 : jf.values()) {
         ja $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            jf.a $$6 = $$4.o();
            double $$7 = $$6 == jf.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jf.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jf.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(le.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }
}
