import com.mojang.serialization.MapCodec;

public class diu extends dij {
   public static final MapCodec<diu> a = b(diu::new);
   public static final dwn b = dwe.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final fal e = dij.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final fal f = dij.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   protected diu(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      jh $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dvo $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return e;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return f;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      for (jm $$3 : jm.c.a) {
         dvo $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axj.b)) {
            return false;
         }
      }

      dvo $$5 = $$1.a_($$2.e());
      return ($$5.a(dil.dQ) || $$5.a(axd.I)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      $$3.a($$1.ai().k(), 1.0F);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
