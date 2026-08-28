import com.mojang.serialization.MapCodec;

public class dfj extends dey {
   public static final MapCodec<dfj> a = b(dfj::new);
   public static final dtb b = dsr.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final ewj e = dey.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ewj f = dey.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   protected dfj(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
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
               dsb $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return e;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return f;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      for (je $$3 : je.c.a) {
         dsb $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awu.b)) {
            return false;
         }
      }

      dsb $$5 = $$1.a_($$2.d());
      return ($$5.a(dfa.dQ) || $$5.a(awo.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      $$3.a($$1.aj().j(), 1.0F);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
