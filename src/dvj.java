import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvj extends dlr {
   public static final MapCodec<dvj> a = b(dvj::new);
   public static final ebf<dzm> b = eax.bB;
   public static final eay c = eax.bE;

   @Override
   public MapCodec<dvj> a() {
      return a;
   }

   public dvj(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, dzm.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dzf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$0 instanceof arq $$3
         ? a($$2, dxh.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(eax.bE).orElse(false)))
         : a($$2, dxh.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(eax.bE).orElse(false)));
   }
}
