import com.mojang.serialization.MapCodec;

public class dly extends ddy {
   public static final MapCodec<dly> a = b(dly::new);
   public static final dsb b = drr.aw;
   protected static final float c = 6.0F;
   protected static final evd d = ddy.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   protected dly(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return d;
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.u($$2.c())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.c(), this.n());
               $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      drb $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(avw.af) || $$3.a(avw.H)) {
            io $$4 = $$2.d();

            for (it $$5 : it.c.a) {
               drb $$6 = $$1.a_($$4.a($$5));
               emu $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(awb.a) || $$6.a(dea.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }
}
