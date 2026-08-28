import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class div extends djl implements dqr {
   public static final dxn d = dxm.J;
   private static final fbt a = djl.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected div(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends div> a();

   protected void a(dww $$0, dfm $$1, dgw $$2, azh $$3, ji $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dww $$0, dfm $$1, ji $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jn $$3 : jn.values()) {
            if ($$1.b_($$2.a($$3)).a(awv.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return a;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jn.b);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(d);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(d) ? esz.c.a(false) : super.b_($$0);
   }
}
