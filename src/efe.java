import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efe implements eeq {
   public static final MapCodec<efe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", kl.h).forGetter($$0x -> $$0x.e), dxo.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, efe::new)
   );
   private final kl e;
   private final dxo f;

   protected efe(kl $$0, dxo $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dhx $$0, jh $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eer<?> a() {
      return eer.g;
   }
}
