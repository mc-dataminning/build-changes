import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlz extends dmq {
   public static final ece<jc> a = drf.e;
   public static final ebx b = ebw.u;

   protected dlz(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jc.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dlz> a();

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return but.a;
   }

   protected abstract void a(djz var1, iw var2, crz var3);

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return cvs.a($$1.c_($$2));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dye> dyf<T> a(djz $$0, dyg<T> $$1, dyg<? extends dxr> $$2) {
      return $$0 instanceof aru $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dxr.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
