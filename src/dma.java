import com.mojang.serialization.MapCodec;

public class dma extends dqm {
   public static final MapCodec<dma> a = b(dma::new);

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   protected dma(dyl.d $$0) {
      super(10.0F, $$0);
      this.l(
         this.B
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
      );
   }

   @Override
   public dym a(dbn $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dym a(dgv $$0, jj $$1, dym $$2) {
      dym $$3 = $$0.a_($$1.e());
      dym $$4 = $$0.a_($$1.d());
      dym $$5 = $$0.a_($$1.f());
      dym $$6 = $$0.a_($$1.i());
      dym $$7 = $$0.a_($$1.g());
      dym $$8 = $$0.a_($$1.h());
      dku $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dkw.kX) || $$3.a(dkw.fU)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dkw.kX)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dkw.kX)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dkw.kX)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dkw.kX)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dkw.kX)));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dkw.kX) || $$4 == jo.a && $$6.a(dkw.fU);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      dym $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jo $$5 : jo.c.a) {
         jj $$6 = $$2.a($$5);
         dym $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dym $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dkw.fU)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dkw.fU);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
