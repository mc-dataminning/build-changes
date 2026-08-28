import com.mojang.serialization.MapCodec;

public class djq extends dlk implements dmc {
   public static final MapCodec<djq> b = b(djq::new);
   public static final dsv c = dsu.C;
   public static final dsv d = dsu.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<djq> a() {
      return b;
   }

   public djq(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eny.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(c) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dse $$0, dca $$1, iz $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dse $$0, dca $$1, iz $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$1.ac() && (long)$$1.z.a(200) <= $$1.Z() % 200L && $$2.v() == $$1.a(dxw.a.b, $$2.u(), $$2.w()) - 1) {
         azd.a($$0.c(a).o(), $$1, $$2, 0.125, li.aT, bqh.a(1, 2));
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
      if ($$0.ac() && $$3 instanceof coe && ((coe)$$3).K()) {
         iz $$4 = $$2.a();
         if ($$0.h($$4)) {
            btq $$5 = btc.am.a($$0);
            if ($$5 != null) {
               $$5.e(evt.c($$4.c()));
               bsw $$6 = $$3.s();
               $$5.b($$6 instanceof arg ? (arg)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, awa.zE, awb.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean e_(dse $$0) {
      return true;
   }
}
