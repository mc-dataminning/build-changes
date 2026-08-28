import com.mojang.serialization.MapCodec;

public class dfq extends dff {
   public static final MapCodec<dfq> a = b(dfq::new);
   public static final dth b = dsx.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final ews e = dff.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ews f = dff.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dfq> a() {
      return a;
   }

   protected dfq(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
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
               dsh $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return e;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return f;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      for (jf $$3 : jf.c.a) {
         dsh $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awa.b)) {
            return false;
         }
      }

      dsh $$5 = $$1.a_($$2.d());
      return ($$5.a(dfh.dQ) || $$5.a(avu.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      $$3.a($$1.aj().k(), 1.0F);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
