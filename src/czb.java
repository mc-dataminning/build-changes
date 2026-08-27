import com.mojang.serialization.MapCodec;

public class czb extends ctc {
   public static final MapCodec<czb> a = b(czb::new);
   public static final dfu b = cze.d;

   @Override
   public MapCodec<czb> a() {
      return a;
   }

   public czb(dfc.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, cca $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, biw $$3) {
      if (!$$3.bS()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      cjl $$6 = $$3.b($$4);
      return $$6.d() instanceof che && new clt($$3, $$4, $$6, $$5).b() ? bhe.d : bhe.a;
   }

   private static void d(dfd $$0, cqb $$1, gw $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(dfd $$0) {
      return $$0.c(b);
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, cjl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cnw.a(cny.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(cqb $$0, gw $$1) {
      double $$2 = 0.5625;
      ash $$3 = $$0.z;

      for (ha $$4 : ha.values()) {
         gw $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ha.a $$6 = $$4.o();
            double $$7 = $$6 == ha.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ha.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ha.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ip.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }
}
