import com.mojang.serialization.MapCodec;

public class dnl extends dfr implements dfl {
   public static final MapCodec<dnl> a = b(dnl::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dtl c = dtb.as;
   private static final exa e = dfi.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final exa f = dfi.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   public dnl(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud(cug.wu);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsl $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dsl $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dxh.c, $$2, dxh.a.a($$5));
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if ($$3 instanceof btc && $$3.am() != bsn.Q && $$3.am() != bsn.h) {
         $$3.a($$0, new ewh(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.dw() || $$3.af != $$3.dC())) {
            double $$4 = Math.abs($$3.dw() - $$3.ad);
            double $$5 = Math.abs($$3.dC() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().t(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cug.ry) ? bqj.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cud(cug.wu, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avh.zs, avi.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dsl $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dxh.c, $$2, dxh.a.a($$3, $$8));
         return bqh.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
