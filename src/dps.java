import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dps extends dij {
   public static final MapCodec<dps> a = b(dps::new);
   public static final int b = 8;
   public static final dwn c = dwe.aF;
   protected static final fal[] d = new fal[]{
      fai.a(),
      dij.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   protected dps(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected fal b_(dvo $$0, dek $$1, jh $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected fal c(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   protected float c(dvo $$0, dek $$1, jh $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      dvo $$3 = $$1.a_($$2.e());
      if ($$3.a(axd.cq)) {
         return false;
      } else {
         return $$3.a(axd.cr) ? true : dij.a($$3.g($$1, $$2.e()), jm.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$1.a(dfo.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dvo $$0, czw $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jm.b : true;
      }
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }
}
