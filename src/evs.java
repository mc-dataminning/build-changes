import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evs extends evj {
   public static final MapCodec<evs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kq.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, evs::new)
   );
   private final kq b;

   private evs(List<exh> $$0, kq $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evl<evs> b() {
      return evm.k;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> evj.a<?> a(ks<T> $$0, T $$1) {
      return a($$2 -> new evs($$2, kq.a().a($$0, $$1).a()));
   }
}
