import com.mojang.serialization.MapCodec;

public class dej extends ddy {
   public static final MapCodec<dej> a = b(dej::new);
   public static final dsb b = drr.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final evd e = ddy.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final evd f = ddy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   protected dej(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      io $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.n());
               drb $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return e;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return f;
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
      for (it $$3 : it.c.a) {
         drb $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awb.b)) {
            return false;
         }
      }

      drb $$5 = $$1.a_($$2.d());
      return ($$5.a(dea.dQ) || $$5.a(avw.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      $$3.a($$1.ai().j(), 1.0F);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
