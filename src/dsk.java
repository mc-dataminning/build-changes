import com.mojang.serialization.MapCodec;

public class dsk extends dke {
   public static final MapCodec<dsk> a = b(dsk::new);
   public static final dyq b = dyg.az;
   private static final fcr c = dke.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dsk> a() {
      return a;
   }

   protected dsk(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.u($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.d(), this.m());
               $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 260);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$5 + 1)), 260);
            }
         }
      }
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
      dxq $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(awp.ah) || $$3.a(awp.J)) {
            ji $$4 = $$2.e();

            for (jn $$5 : jn.c.a) {
               dxq $$6 = $$1.a_($$4.a($$5));
               etw $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(awv.a) || $$6.a(dkg.lk)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }
}
