import com.mojang.serialization.MapCodec;

public class dra extends dku {
   public static final MapCodec<dra> a = b(dra::new);
   public static final dzd b = drd.b;

   @Override
   public MapCodec<dra> a() {
      return a;
   }

   public dra(dyl.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dym $$0, dhp $$1, jj $$2, cqi $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bvs $$3) {
      if (!$$3.ce()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (btq)($$0.h() instanceof cwf && new dbn($$4, $$5, $$0, $$6).b() ? btq.e : btq.a);
   }

   private static void e(dym $$0, dhp $$1, jj $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dym $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, cxy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btb.a(1, 5));
      }
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dhp $$0, jj $$1) {
      double $$2 = 0.5625;
      azs $$3 = $$0.A;

      for (jo $$4 : jo.values()) {
         jj $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jo.a $$6 = $$4.o();
            double $$7 = $$6 == jo.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jo.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jo.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(lq.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }
}
