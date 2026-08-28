import com.mojang.serialization.MapCodec;

public class dft extends dfi {
   public static final MapCodec<dft> a = b(dft::new);
   public static final dtl b = dtb.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final exa e = dfi.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final exa f = dfi.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   protected dft(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      ja $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dsl $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return e;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return f;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      for (jf $$3 : jf.c.a) {
         dsl $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awc.b)) {
            return false;
         }
      }

      dsl $$5 = $$1.a_($$2.d());
      return ($$5.a(dfk.dQ) || $$5.a(avw.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      $$3.a($$1.aj().k(), 1.0F);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
