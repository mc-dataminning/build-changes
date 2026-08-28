import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eye extends exv {
   public static final MapCodec<eye> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kr.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, eye::new)
   );
   private final kr b;

   private eye(List<ezr> $$0, kr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exx<eye> b() {
      return exy.k;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> exv.a<?> a(kt<T> $$0, T $$1) {
      return a($$2 -> new eye($$2, kr.a().a($$0, $$1).a()));
   }
}
