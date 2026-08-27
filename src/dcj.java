import com.mojang.serialization.MapCodec;

public class dcj extends dby {
   public static final MapCodec<dcj> a = b(dcj::new);
   public static final dpz b = dpp.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final est e = dby.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final est f = dby.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   protected dcj(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      ib $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.n());
               doz $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return e;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return f;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      for (ih $$3 : ih.c.a) {
         doz $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(avh.b)) {
            return false;
         }
      }

      doz $$5 = $$1.a_($$2.d());
      return ($$5.a(dca.dQ) || $$5.a(avc.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      $$3.a($$1.ai().j(), 1.0F);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
