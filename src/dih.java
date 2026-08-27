import com.mojang.serialization.MapCodec;

public class dih extends dch {
   public static final MapCodec<dih> a = b(dih::new);
   public static final dpz b = dik.d;

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   public dih(dph.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, cka $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqa $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.f() instanceof cpq && new cux($$4, $$5, $$0, $$6).b() ? boh.e : boh.a;
   }

   private static void d(dpi $$0, czg $$1, id $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean e_(dpi $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, crs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cxa.a(cxc.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(czg $$0, id $$1) {
      double $$2 = 0.5625;
      axt $$3 = $$0.z;

      for (ij $$4 : ij.values()) {
         id $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ij.a $$6 = $$4.o();
            double $$7 = $$6 == ij.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ij.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ij.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(kh.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }
}
