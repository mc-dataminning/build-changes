import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esp extends eru {
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alc.a(lq.G).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, esp::new)
   );
   private final ji<cuk> b;

   private esp(List<ets> $$0, ji<cuk> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erw<esp> b() {
      return erx.f;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      return $$0.a(this.b.a(), $$0.I());
   }
}
