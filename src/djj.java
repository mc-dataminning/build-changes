import com.mojang.serialization.MapCodec;

public class djj extends dld implements dlv {
   public static final MapCodec<djj> b = b(djj::new);
   public static final dso c = dsn.C;
   public static final dso d = dsn.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<djj> a() {
      return b;
   }

   public djj(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enr.c;
      return this.n().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(c) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(drx $$0, dbt $$1, iz $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(drx $$0, dbt $$1, iz $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$1.ac() && (long)$$1.z.a(200) <= $$1.Z() % 200L && $$2.v() == $$1.a(dxp.a.b, $$2.u(), $$2.w()) - 1) {
         ayy.a($$0.c(a).o(), $$1, $$2, 0.125, lj.aT, bqa.a(1, 2));
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
      if ($$0.ac() && $$3 instanceof cnx && ((cnx)$$3).K()) {
         iz $$4 = $$2.a();
         if ($$0.h($$4)) {
            btj $$5 = bsv.am.a($$0);
            if ($$5 != null) {
               $$5.e(evm.c($$4.c()));
               bsp $$6 = $$3.s();
               $$5.b($$6 instanceof arc ? (arc)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, avw.zE, avx.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }
}
