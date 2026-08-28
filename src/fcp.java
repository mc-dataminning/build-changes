import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcp extends fcg {
   public static final MapCodec<fcp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kj.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, fcp::new)
   );
   private final kj b;

   private fcp(List<fec> $$0, kj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fci<fcp> b() {
      return fcj.k;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> fcg.a<?> a(kk<T> $$0, T $$1) {
      return a($$2 -> new fcp($$2, kj.a().a($$0, $$1).a()));
   }
}
