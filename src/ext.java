import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ext extends exc {
   public static final MapCodec<ext> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axe.b(mc.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ext::new)
   );
   private final axe<cwg> b;

   private ext(List<eyy> $$0, axe<cwg> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exe<ext> b() {
      return exf.G;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      ke<cwg> $$2 = $$1.d().K_().e(mc.I);
      Optional<jr<cwg>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kv.Z, $$3.get());
      }

      return $$0;
   }

   public static exc.a<?> a(axe<cwg> $$0) {
      return a($$1 -> new ext($$1, $$0));
   }
}
