import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ese extends eru {
   public static final MapCodec<ese> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kj.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, ese::new)
   );
   private final kj b;

   private ese(List<ets> $$0, kj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erw<ese> b() {
      return erx.k;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> eru.a<?> a(kl<T> $$0, T $$1) {
      return a($$2 -> new ese($$2, kj.a().a($$0, $$1).a()));
   }
}
