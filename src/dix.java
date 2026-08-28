import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dix extends djn implements dqt {
   public static final dxp d = dxo.J;
   private static final fbv a = djn.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dix(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dix> a();

   protected void a(dwy $$0, dfo $$1, dgy $$2, azh $$3, ji $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dwy $$0, dfo $$1, ji $$2) {
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
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return a;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jn.b);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(d);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(d) ? etb.c.a(false) : super.b_($$0);
   }
}
