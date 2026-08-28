import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqz extends djl {
   public static final MapCodec<dqz> a = b(dqz::new);
   public static final int b = 8;
   public static final dxv c = dxm.aI;
   protected static final fbt[] d = new fbt[]{
      fbq.a(),
      djl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dqz> a() {
      return a;
   }

   protected dqz(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
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
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected fbt b_(dww $$0, dfm $$1, ji $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected fbt c(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Override
   protected float c(dww $$0, dfm $$1, ji $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      dww $$3 = $$1.a_($$2.e());
      if ($$3.a(awp.cr)) {
         return false;
      } else {
         return $$3.a(awp.cs) ? true : djl.a($$3.g($$1, $$2.e()), jn.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.a(dgq.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dww $$0, daf $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jn.b : true;
      }
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }
}
