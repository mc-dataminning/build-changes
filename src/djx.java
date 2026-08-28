import com.mojang.serialization.MapCodec;

public class djx extends djl {
   public static final MapCodec<djx> a = b(djx::new);
   public static final dxv b = dxm.az;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final fbt e = djl.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final fbt f = djl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   protected djx(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
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
               dww $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return e;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return f;
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
      for (jn $$3 : jn.c.a) {
         dww $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awv.b)) {
            return false;
         }
      }

      dww $$5 = $$1.a_($$2.e());
      return ($$5.a(djn.ed) || $$5.a(awp.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      $$3.a($$1.ak().k(), 1.0F);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
