import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dii extends diz {
   public static final dxv<jn> a = dnl.aF;
   public static final dxp b = dxo.v;

   protected dii(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dii> a();

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bsl.a;
   }

   protected abstract void a(dgj var1, ji var2, coy var3);

   @Override
   public dwy a(dah $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dua $$5 = $$1.c_($$2);
         if ($$5 instanceof dto) {
            if ($$1 instanceof ard) {
               bsh.a($$1, $$2, (dto)$$5);
               ((dto)$$5).a((ard)$$1, fbb.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return csd.a($$1.c_($$2));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dua> dub<T> a(dgj $$0, duc<T> $$1, duc<? extends dto> $$2) {
      return $$0 instanceof ard $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dto.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
