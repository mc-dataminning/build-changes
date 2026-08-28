import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzo implements dzb {
   public static final MapCodec<dzo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", kd.g).forGetter($$0x -> $$0x.e), dsc.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dzo::new)
   );
   private final kd e;
   private final dsc f;

   protected dzo(kd $$0, dsc $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dct $$0, iz $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dzc<?> a() {
      return dzc.g;
   }
}
