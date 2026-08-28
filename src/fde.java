import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fde extends fcg {
   public static final MapCodec<fde> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(dce.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, fde::new));
   private final jg<dce> b;

   private fde(List<fec> $$0, jg<dce> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fci<fde> b() {
      return fcj.F;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      $$0.a(kl.R, dcg.a, this.b, dcg::b);
      return $$0;
   }

   public static fcg.a<?> a(jg<dce> $$0) {
      return a($$1 -> new fde($$1, $$0));
   }
}
