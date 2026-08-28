import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzp implements dzc {
   public static final MapCodec<dzp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", kd.g).forGetter($$0x -> $$0x.e), dsd.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dzp::new)
   );
   private final kd e;
   private final dsd f;

   protected dzp(kd $$0, dsd $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dcu $$0, iz $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dzd<?> a() {
      return dzd.g;
   }
}
