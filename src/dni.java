import com.mojang.serialization.MapCodec;

public class dni extends dfi {
   public static final MapCodec<dni> a = b(dni::new);
   public static final dtl b = dtb.aw;
   protected static final float c = 6.0F;
   protected static final exa d = dfi.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   protected dni(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return d;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.u($$2.c())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.c(), this.o());
               $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
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
      dsl $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(avw.af) || $$3.a(avw.H)) {
            ja $$4 = $$2.d();

            for (jf $$5 : jf.c.a) {
               dsl $$6 = $$1.a_($$4.a($$5));
               eoj $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(awc.a) || $$6.a(dfk.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }
}
