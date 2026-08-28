import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esg extends erw {
   public static final MapCodec<esg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kj.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, esg::new)
   );
   private final kj b;

   private esg(List<etu> $$0, kj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ery<esg> b() {
      return erz.k;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> erw.a<?> a(kl<T> $$0, T $$1) {
      return a($$2 -> new esg($$2, kj.a().a($$0, $$1).a()));
   }
}
