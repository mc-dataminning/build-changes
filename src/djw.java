import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djw extends dkm implements drq {
   public static final dym d = dyl.D;
   private static final fcs a = dkm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected djw(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends djw> a();

   protected void a(dxv $$0, dgn $$1, dhx $$2, bam $$3, jh $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dxv $$0, dgn $$1, jh $$2) {
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
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(aya.a) && $$1.e() == 8));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return a;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(d);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(d) ? ety.c.a(false) : super.b_($$0);
   }
}
