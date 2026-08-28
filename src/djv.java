import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djv extends dkl implements drp {
   public static final dyl d = dyk.D;
   private static final fcr a = dkl.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected djv(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends djv> a();

   protected void a(dxu $$0, dgm $$1, dhw $$2, bam $$3, jh $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dxu $$0, dgm $$1, jh $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$1.b_($$2.a($$3)).a(aya.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(aya.a) && $$1.e() == 8));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return a;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(d);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }
}
