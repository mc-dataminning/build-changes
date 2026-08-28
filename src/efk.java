import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efk implements eew {
   public static final MapCodec<efk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", kl.h).forGetter($$0x -> $$0x.e), dxu.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, efk::new)
   );
   private final kl e;
   private final dxu f;

   protected efk(kl $$0, dxu $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dif $$0, jh $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eex<?> a() {
      return eex.g;
   }
}
