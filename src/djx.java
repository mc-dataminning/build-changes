import com.mojang.serialization.MapCodec;

public class djx extends dlr implements dmj {
   public static final MapCodec<djx> b = b(djx::new);
   public static final dtc c = dtb.C;
   public static final dtc d = dtb.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<djx> a() {
      return b;
   }

   public djx(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, jf.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eok.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(c) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dsl $$0, dcg $$1, ja $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dsl $$0, dcg $$1, ja $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$1.ac() && (long)$$1.z.a(200) <= $$1.Z() % 200L && $$2.v() == $$1.a(dyg.a.b, $$2.u(), $$2.w()) - 1) {
         ayk.a($$0.c(a).o(), $$1, $$2, 0.125, lj.aT, bps.a(1, 2));
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }
}
