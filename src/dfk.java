import com.mojang.serialization.MapCodec;

public class dfk extends dez {
   public static final MapCodec<dfk> a = b(dfk::new);
   public static final dtc b = dss.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final ewk e = dez.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ewk f = dez.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   protected dfk(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
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
               dsc $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return e;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return f;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      for (je $$3 : je.c.a) {
         dsc $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awv.b)) {
            return false;
         }
      }

      dsc $$5 = $$1.a_($$2.d());
      return ($$5.a(dfb.dQ) || $$5.a(awp.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      $$3.a($$1.aj().j(), 1.0F);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
