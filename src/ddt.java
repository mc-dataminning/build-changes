import com.mojang.serialization.MapCodec;

public class ddt extends dfn implements dgf {
   public static final MapCodec<ddt> b = b(ddt::new);
   public static final dmv c = dmu.C;
   public static final dmv d = dmu.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<ddt> a() {
      return b;
   }

   public ddt(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ehs.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(c) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dme $$0, cwe $$1, ib $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dme $$0, cwe $$1, ib $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$1.aa() && (long)$$1.z.a(200) <= $$1.X() % 200L && $$2.v() == $$1.a(drq.a.b, $$2.u(), $$2.w()) - 1) {
         awp.a($$0.c(a).o(), $$1, $$2, 0.125, kb.aQ, blw.a(1, 2));
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
      if ($$0.aa() && $$3 instanceof cjf && ((cjf)$$3).K()) {
         ib $$4 = $$2.a();
         if ($$0.h($$4)) {
            bow $$5 = bol.ak.a($$0);
            if ($$5 != null) {
               $$5.e(eov.c($$4.c()));
               bof $$6 = $$3.w();
               $$5.b($$6 instanceof apb ? (apb)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, atp.za, atq.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dme $$0) {
      return true;
   }
}
