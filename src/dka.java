import com.mojang.serialization.MapCodec;

public class dka extends dch implements dcb {
   public static final MapCodec<dka> a = b(dka::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dpz c = dpp.as;
   private static final est e = dby.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final est f = dby.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   public dka(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj(crm.wn);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(doz $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         doz $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dts.c, $$2, dts.a.a($$5));
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if ($$3 instanceof bqo && $$3.ai() != bqb.Q && $$3.ai() != bqb.h) {
         $$3.a($$0, new esa(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ac != $$3.dr() || $$3.ae != $$3.dx())) {
            double $$4 = Math.abs($$3.dr() - $$3.ac);
            double $$5 = Math.abs($$3.dx() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ai().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(crm.rx) ? boc.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new crj(crm.wn, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, aum.yW, aun.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         doz $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dts.c, $$2, dts.a.a($$3, $$8));
         return boa.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
