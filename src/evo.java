import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evo extends euu {
   public static final MapCodec<evo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(akz.a(lv.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, evo::new)
   );
   private final jn<cvk> b;

   private evo(List<ews> $$0, jn<cvk> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public euw<evo> b() {
      return eux.f;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      return $$0.a(this.b.a());
   }
}
