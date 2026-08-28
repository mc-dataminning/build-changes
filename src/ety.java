import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ety extends ete {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ako.a(lu.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, ety::new)
   );
   private final jm<cul> b;

   private ety(List<evc> $$0, jm<cul> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etg<ety> b() {
      return eth.f;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      return $$0.a(this.b.a());
   }
}
