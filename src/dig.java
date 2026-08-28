import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dig extends dix {
   public static final dxt<jn> a = dnj.aF;
   public static final dxn b = dxm.v;

   protected dig(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dig> a();

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bsj.a;
   }

   protected abstract void a(dgh var1, ji var2, cow var3);

   @Override
   public dww a(daf $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dty $$5 = $$1.c_($$2);
         if ($$5 instanceof dtm) {
            if ($$1 instanceof ard) {
               bsf.a($$1, $$2, (dtm)$$5);
               ((dtm)$$5).a((ard)$$1, faz.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return csb.a($$1.c_($$2));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dty> dtz<T> a(dgh $$0, dua<T> $$1, dua<? extends dtm> $$2) {
      return $$0 instanceof ard $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dtm.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
