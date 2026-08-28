import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ets extends esy {
   public static final MapCodec<ets> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(akn.a(lu.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, ets::new)
   );
   private final jm<cuj> b;

   private ets(List<euw> $$0, jm<cuj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eta<ets> b() {
      return etb.f;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      return $$0.a(this.b.a());
   }
}
