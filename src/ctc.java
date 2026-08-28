public class ctc extends ctx {
   public ctc(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      if (!$$3.a(dfj.fy) || $$3.c(dhw.c)) {
         return bqg.e;
      } else if ($$1.B) {
         return bqg.a;
      } else {
         dsk $$4 = $$3.a(dhw.c, Boolean.valueOf(true));
         dfh.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dfj.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dsp.b $$5 = dhw.b().a($$1, $$2);
         if ($$5 != null) {
            ja $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dfj.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqg.c;
      }
   }

   @Override
   public int a(cuc $$0, btb $$1) {
      return 0;
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      ewb $$4 = a($$0, $$1, dbo.b.a);
      if ($$4.c() == ewd.a.b && $$0.a_($$4.a()).a(dfj.fy)) {
         return bqh.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aqm $$5) {
            ja $$6 = $$5.a(awi.a, $$1.dq(), 100, false);
            if ($$6 != null) {
               cmv $$7 = new cmv($$0, $$1.dv(), $$1.e(0.5), $$1.dB());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dxg.K, $$7.do(), dxg.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aqn $$8) {
                  am.n.a($$8, $$6);
               }

               float $$9 = ayg.i($$0.z.i(), 0.33F, 0.5F);
               $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avh.ii, avi.g, 1.0F, $$9);
               $$3.a(1, $$1);
               $$1.b(avr.c.b(this));
               $$1.a($$2, true);
               return bqh.a($$3);
            }
         }

         return bqh.b($$3);
      }
   }
}
