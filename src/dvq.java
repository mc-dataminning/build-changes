import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvq extends dly {
   public static final MapCodec<dvq> a = b(dvq::new);
   public static final ebm<dzt> b = ebe.bB;
   public static final ebf c = ebe.bE;

   @Override
   public MapCodec<dvq> a() {
      return a;
   }

   public dvq(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, dzt.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dzm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$0 instanceof arq $$3
         ? a($$2, dxo.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(ebe.bE).orElse(false)))
         : a($$2, dxo.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(ebe.bE).orElse(false)));
   }
}
