import com.mojang.serialization.MapCodec;

public class dly extends dnt implements dol {
   public static final MapCodec<dly> b = b(dly::new);
   public static final dvf c = dve.C;
   public static final dvf d = dve.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dly> a() {
      return b;
   }

   public dly(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jj.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eqq.c;
      return this.o().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(c) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(duo $$0, deg $$1, je $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(duo $$0, deg $$1, je $$2) {
      jj $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, ert.a($$1, $$3, null));
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$1.ad() && (long)$$1.z.a(200) <= $$1.aa() % 200L && $$2.v() == $$1.a(eak.a.b, $$2.u(), $$2.w()) - 1) {
         azh.a($$0.c(a).o(), $$1, $$2, 0.125, ln.aT, bra.a(1, 2));
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }
}
