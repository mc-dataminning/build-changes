import com.mojang.serialization.MapCodec;

public class djv extends dlz implements dmr {
   public static final MapCodec<djv> b = b(djv::new);
   public static final dtt c = dts.C;
   public static final dtt d = dts.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<djv> a() {
      return b;
   }

   public djv(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, iw.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == epf.c;
      return this.n().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
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
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dtc $$0, dca $$1, ir $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dtc $$0, dca $$1, ir $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$1.ac() && (long)$$1.A.a(200) <= $$1.Z() % 200L && $$2.v() == $$1.a(dyu.a.b, $$2.u(), $$2.w()) - 1) {
         ayp.a($$0.c(a).o(), $$1, $$2, 0.125, lb.aU, bpl.a(1, 2));
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
      if ($$0.ac() && $$3 instanceof cnf && ((cnf)$$3).K()) {
         ir $$4 = $$2.a();
         if ($$0.h($$4)) {
            bsn $$5 = bsb.an.a($$0);
            if ($$5 != null) {
               $$5.e(ewu.c($$4.c()));
               brv $$6 = $$3.t();
               $$5.b($$6 instanceof aqu ? (aqu)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, avo.Ac, avq.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }
}
