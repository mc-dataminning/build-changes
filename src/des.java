import com.mojang.serialization.MapCodec;

public class des extends cwz implements cwt {
   public static final MapCodec<des> a = b(des::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dkh c = djx.as;
   private static final emm e = cwq.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final emm f = cwq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public des(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy(cnb.wi);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(djh $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         djh $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dnr.c, $$2, dnr.a.a($$5));
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if ($$3 instanceof bml && $$3.ai() != blz.O && $$3.ai() != blz.h) {
         $$3.a($$0, new elt(0.8F, 0.75, 0.8F));
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
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      int $$6 = $$0.c(c);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cnb.rv)) {
         return bkb.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new cmy(cnb.wi, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, ars.yv, art.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         djh $$9 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(dnr.c, $$2, dnr.a.a($$3, $$9));
         return bkb.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
