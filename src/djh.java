import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djh extends djy {
   public static final dys<jm> a = dok.aF;
   public static final dym b = dyl.r;

   protected djh(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends djh> a();

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return btj.a;
   }

   protected abstract void a(dhi var1, jh var2, cpx var3);

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dux $$5 = $$1.c_($$2);
         if ($$5 instanceof dul) {
            if ($$1 instanceof ash) {
               btf.a($$1, $$2, (dul)$$5);
               ((dul)$$5).a((ash)$$1, fby.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return ctc.a($$1.c_($$2));
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dux> duy<T> a(dhi $$0, duz<T> $$1, duz<? extends dul> $$2) {
      return $$0 instanceof ash $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dul.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
