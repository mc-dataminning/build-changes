import com.mojang.serialization.MapCodec;

public class deo extends cyo {
   public static final MapCodec<deo> a = b(deo::new);
   public static final dlw b = der.d;

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   public deo(dle.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, chh $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bno $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.d() instanceof cms && new crg($$4, $$5, $$0, $$6).b() ? blw.e : blw.a;
   }

   private static void d(dlf $$0, cvn $$1, hz $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean e_(dlf $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, coz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && ctj.a(ctl.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(cvn $$0, hz $$1) {
      double $$2 = 0.5625;
      awo $$3 = $$0.z;

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
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }
}
