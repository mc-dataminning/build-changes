import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dla extends dlr {
   public static final ebf<ja> a = dqg.e;
   public static final eay b = eax.u;

   protected dla(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, ja.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dla> a();

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bud.a;
   }

   protected abstract void a(dja var1, iu var2, crc var3);

   @Override
   public eah a(dcw $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return cuv.a($$1.c_($$2));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dxf> dxg<T> a(dja $$0, dxh<T> $$1, dxh<? extends dws> $$2) {
      return $$0 instanceof arq $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dws.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
