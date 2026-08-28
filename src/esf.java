import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esf extends erv {
   public static final MapCodec<esf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kj.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, esf::new)
   );
   private final kj b;

   private esf(List<ett> $$0, kj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erx<esf> b() {
      return ery.k;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> erv.a<?> a(kl<T> $$0, T $$1) {
      return a($$2 -> new esf($$2, kj.a().a($$0, $$1).a()));
   }
}
