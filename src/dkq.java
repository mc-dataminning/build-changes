import com.mojang.serialization.MapCodec;

public class dkq extends dke {
   public static final MapCodec<dkq> a = b(dkq::new);
   public static final dyq b = dyg.az;
   public static final int c = 15;
   private static final fcr d = dke.b(14.0, 0.0, 16.0);
   private static final fcr e = dke.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   protected dkq(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      ji $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dxq $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 260);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 260);
            }
         }
      }
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return e;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      for (jn $$3 : jn.c.a) {
         dxq $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awv.b)) {
            return false;
         }
      }

      dxq $$5 = $$1.a_($$2.e());
      return ($$5.a(dkg.ed) || $$5.a(awp.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      $$3.a($$1.al().k(), 1.0F);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
