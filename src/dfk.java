import com.mojang.serialization.MapCodec;

public class dfk extends dey {
   public static final MapCodec<dfk> a = b(dfk::new);
   public static final int b = 6;
   public static final dtb c = dsr.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ewj[] g = new ewj[]{
      dey.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dey.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dey.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dey.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dey.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dey.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dey.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   protected dfk(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      cuj $$7 = $$0.g();
      if ($$0.a(awx.aJ) && $$1.c(c) == 0 && dey.a($$7) instanceof dfn $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, avz.dr, awa.e, 1.0F, 1.0F);
         $$2.b($$3, dfo.a($$8));
         $$2.a($$4, dwu.c, $$3);
         $$4.b(awj.c.b($$7));
         return bqv.a;
      } else {
         return bqv.d;
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqt.a;
         }

         if ($$3.b(bqs.a).e()) {
            return bqt.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqt a(dby $$0, iz $$1, dsb $$2, cmw $$3) {
      if (!$$3.t(false)) {
         return bqt.e;
      } else {
         $$3.a(awj.U);
         $$3.gm().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dwu.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dwu.f, $$1);
         }

         return bqt.a;
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
