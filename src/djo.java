import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djo extends dke implements drl {
   public static final dyh b = dyg.I;
   private static final fcr a = dke.b(12.0, 0.0, 4.0);

   protected djo(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends djo> a();

   protected void a(dxq $$0, dgf $$1, dho $$2, azh $$3, ji $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dxq $$0, dgf $$1, ji $$2) {
      if ($$0.c(b)) {
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
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return a;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jn.b);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }
}
