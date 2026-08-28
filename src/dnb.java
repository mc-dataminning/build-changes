import com.mojang.serialization.MapCodec;

public class dnb extends dfh implements dfb {
   public static final MapCodec<dnb> a = b(dnb::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dtb c = dsr.as;
   private static final ewj e = dey.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ewj f = dey.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   public dnb(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo(cur.wr);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsb $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dsb $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dwu.c, $$2, dwu.a.a($$5));
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if ($$3 instanceof bto && $$3.ak() != bsz.Q && $$3.ak() != bsz.h) {
         $$3.a($$0, new evq(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.du() || $$3.af != $$3.dA())) {
            double $$4 = Math.abs($$3.du() - $$3.ad);
            double $$5 = Math.abs($$3.dA() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cur.ry) ? bqv.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cuo(cur.wr, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avz.zp, awa.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dsb $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dwu.c, $$2, dwu.a.a($$3, $$8));
         return bqt.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
