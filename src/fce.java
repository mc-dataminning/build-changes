import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fce extends fcg {
   public static final MapCodec<fce> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fas.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, fce::new));
   private final fas b;

   private fce(List<fec> $$0, fas $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fci<fce> b() {
      return fcj.w;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.b.a();
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static fcg.a<?> a(fas $$0) {
      return a($$1 -> new fce($$1, $$0));
   }
}
