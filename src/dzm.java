import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzm implements dyz {
   public static final MapCodec<dzm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", kd.g).forGetter($$0x -> $$0x.e), dsa.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dzm::new)
   );
   private final kd e;
   private final dsa f;

   protected dzm(kd $$0, dsa $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dcr $$0, iz $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dza<?> a() {
      return dza.g;
   }
}
