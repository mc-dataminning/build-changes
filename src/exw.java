import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class exw extends exf {
   public static final MapCodec<exw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.b(mc.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, exw::new)
   );
   private final axf<cwj> b;

   private exw(List<ezb> $$0, axf<cwj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exh<exw> b() {
      return exi.G;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      ke<cwj> $$2 = $$1.d().K_().e(mc.I);
      Optional<jr<cwj>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kv.Z, $$3.get());
      }

      return $$0;
   }

   public static exf.a<?> a(axf<cwj> $$0) {
      return a($$1 -> new exw($$1, $$0));
   }
}
