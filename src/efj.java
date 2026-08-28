import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efj implements eev {
   public static final MapCodec<efj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", km.h).forGetter($$0x -> $$0x.e), dxq.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, efj::new)
   );
   private final km e;
   private final dxq f;

   protected efj(km $$0, dxq $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dhy $$0, ji $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eew<?> a() {
      return eew.g;
   }
}
