import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djg extends djx {
   public static final dyr<jm> a = doj.aF;
   public static final dyl b = dyk.r;

   protected djg(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends djg> a();

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bti.a;
   }

   protected abstract void a(dhh var1, jh var2, cpw var3);

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         duw $$5 = $$1.c_($$2);
         if ($$5 instanceof duk) {
            if ($$1 instanceof ash) {
               bte.a($$1, $$2, (duk)$$5);
               ((duk)$$5).a((ash)$$1, fbx.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return ctb.a($$1.c_($$2));
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends duw> dux<T> a(dhh $$0, duy<T> $$1, duy<? extends duk> $$2) {
      return $$0 instanceof ash $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> duk.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
