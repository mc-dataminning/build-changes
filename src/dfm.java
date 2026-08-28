import com.mojang.serialization.MapCodec;

public class dfm extends dfb {
   public static final MapCodec<dfm> a = b(dfm::new);
   public static final dte b = dsu.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final ewm e = dfb.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ewm f = dfb.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   protected dfm(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      iz $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dse $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return e;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return f;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      for (je $$3 : je.c.a) {
         dse $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awv.b)) {
            return false;
         }
      }

      dse $$5 = $$1.a_($$2.d());
      return ($$5.a(dfd.dQ) || $$5.a(awp.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      $$3.a($$1.aj().j(), 1.0F);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
