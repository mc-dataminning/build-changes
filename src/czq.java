import com.mojang.serialization.MapCodec;

public class czq extends czf {
   public static final MapCodec<czq> a = b(czq::new);
   public static final dne b = dmu.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final epo e = czf.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final epo f = czf.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<czq> a() {
      return a;
   }

   protected czq(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      ib $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dme $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return e;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return f;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      for (ih $$3 : ih.c.a) {
         dme $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(auj.b)) {
            return false;
         }
      }

      dme $$5 = $$1.a_($$2.d());
      return ($$5.a(czh.dQ) || $$5.a(aue.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      $$3.a($$1.ah().j(), 1.0F);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
