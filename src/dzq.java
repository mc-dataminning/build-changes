import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzq implements dzd {
   public static final MapCodec<dzq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", kd.g).forGetter($$0x -> $$0x.e), dse.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dzq::new)
   );
   private final kd e;
   private final dse f;

   protected dzq(kd $$0, dse $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dcv $$0, iz $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dze<?> a() {
      return dze.g;
   }
}
