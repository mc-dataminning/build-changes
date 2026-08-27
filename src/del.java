import com.mojang.serialization.MapCodec;

public class del extends cws implements cwm {
   public static final MapCodec<del> a = b(del::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dka c = djq.as;
   private static final emf e = cwj.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final emf f = cwj.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public del(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr(cmu.wi);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dja $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dja $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dnk.c, $$2, dnk.a.a($$5));
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if ($$3 instanceof bmf && $$3.ai() != blt.O && $$3.ai() != blt.h) {
         $$3.a($$0, new elm(0.8F, 0.75, 0.8F));
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
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      int $$6 = $$0.c(c);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cmu.rv)) {
         return bjv.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new cmr(cmu.wi, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, arm.yv, arn.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dja $$9 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(dnk.c, $$2, dnk.a.a($$3, $$9));
         return bjv.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
