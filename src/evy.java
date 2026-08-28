import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evy extends evp {
   public static final MapCodec<evy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kr.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, evy::new)
   );
   private final kr b;

   private evy(List<exn> $$0, kr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evr<evy> b() {
      return evs.k;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> evp.a<?> a(kt<T> $$0, T $$1) {
      return a($$2 -> new evy($$2, kr.a().a($$0, $$1).a()));
   }
}
