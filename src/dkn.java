import com.mojang.serialization.MapCodec;

public class dkn extends dmi implements dna {
   public static final MapCodec<dkn> b = b(dkn::new);
   public static final dtt c = dts.C;
   public static final dtt d = dts.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dkn> a() {
      return b;
   }

   public dkn(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ji.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == epf.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dtc $$0, dcw $$1, jd $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dtc $$0, dcw $$1, jd $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$1.ac() && (long)$$1.z.a(200) <= $$1.Z() % 200L && $$2.v() == $$1.a(dyy.a.b, $$2.u(), $$2.w()) - 1) {
         ays.a($$0.c(a).o(), $$1, $$2, 0.125, lm.aT, bqc.a(1, 2));
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }
}
