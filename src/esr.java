import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esr extends erw {
   public static final MapCodec<esr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alc.a(lq.G).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, esr::new)
   );
   private final ji<cum> b;

   private esr(List<etu> $$0, ji<cum> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ery<esr> b() {
      return erz.f;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      return $$0.a(this.b.a(), $$0.I());
   }
}
