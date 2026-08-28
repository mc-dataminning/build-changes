import com.mojang.serialization.MapCodec;

public class drq extends djl {
   public static final MapCodec<drq> a = b(drq::new);
   public static final dxv b = dxm.az;
   protected static final float c = 6.0F;
   protected static final fbt d = djl.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   protected drq(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return d;
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.u($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.d(), this.m());
               $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      dww $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(awp.ah) || $$3.a(awp.J)) {
            ji $$4 = $$2.e();

            for (jn $$5 : jn.c.a) {
               dww $$6 = $$1.a_($$4.a($$5));
               esy $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(awv.a) || $$6.a(djn.lk)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }
}
