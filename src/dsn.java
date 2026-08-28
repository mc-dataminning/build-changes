import com.mojang.serialization.MapCodec;

public class dsn extends dmf {
   public static final MapCodec<dsn> a = b(dsn::new);
   public static final eay b = dsq.b;

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   public dsn(eag.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(eah $$0, dja $$1, iu $$2, crc $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bwf $$3) {
      if (!$$3.ce()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (bud)($$0.h() instanceof cxl && new dcw($$4, $$5, $$0, $$6).b() ? bud.e : bud.a);
   }

   private static void d(eah $$0, dja $$1, iu $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(eah $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, czd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bto.a(1, 5));
      }
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dja $$0, iu $$1) {
      double $$2 = 0.5625;
      azv $$3 = $$0.A;

      for (ja $$4 : ja.values()) {
         iu $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            ja.a $$6 = $$4.o();
            double $$7 = $$6 == ja.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ja.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ja.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ls.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }
}
