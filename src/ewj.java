import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewj extends ewa {
   public static final MapCodec<ewj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kr.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, ewj::new)
   );
   private final kr b;

   private ewj(List<exy> $$0, kr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ewc<ewj> b() {
      return ewd.k;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> ewa.a<?> a(kt<T> $$0, T $$1) {
      return a($$2 -> new ewj($$2, kr.a().a($$0, $$1).a()));
   }
}
