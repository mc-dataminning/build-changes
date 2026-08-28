import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyl extends eyc {
   public static final MapCodec<eyl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kr.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, eyl::new)
   );
   private final kr b;

   private eyl(List<ezy> $$0, kr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eye<eyl> b() {
      return eyf.k;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> eyc.a<?> a(kt<T> $$0, T $$1) {
      return a($$2 -> new eyl($$2, kr.a().a($$0, $$1).a()));
   }
}
