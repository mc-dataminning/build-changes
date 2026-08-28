import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzd implements dza {
   private final kd e;
   private final je f;
   public static final MapCodec<dzd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", kd.g).forGetter($$0x -> $$0x.e), je.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dzd::new)
   );

   public dzd(kd $$0, je $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dcs $$0, iz $$1) {
      iz $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dzb<?> a() {
      return dzb.d;
   }
}
