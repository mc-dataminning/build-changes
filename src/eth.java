import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eth extends esy {
   public static final MapCodec<eth> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kn.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, eth::new)
   );
   private final kn b;

   private eth(List<euw> $$0, kn $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eta<eth> b() {
      return etb.k;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> esy.a<?> a(kp<T> $$0, T $$1) {
      return a($$2 -> new eth($$2, kn.a().a($$0, $$1).a()));
   }
}
