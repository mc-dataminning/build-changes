import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fda extends fcg {
   public static final MapCodec<fda> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(dag.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, fda::new));
   private final jg<dag> b;

   private fda(List<fec> $$0, jg<dag> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fci<fda> b() {
      return fcj.f;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      return $$0.a(this.b.a());
   }
}
