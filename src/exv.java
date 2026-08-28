import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class exv extends exe {
   public static final MapCodec<exv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.b(mc.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, exv::new)
   );
   private final axf<cwi> b;

   private exv(List<eza> $$0, axf<cwi> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exg<exv> b() {
      return exh.G;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      ke<cwi> $$2 = $$1.d().K_().e(mc.I);
      Optional<jr<cwi>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kv.Z, $$3.get());
      }

      return $$0;
   }

   public static exe.a<?> a(axf<cwi> $$0) {
      return a($$1 -> new exv($$1, $$0));
   }
}
