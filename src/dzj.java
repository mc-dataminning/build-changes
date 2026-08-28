import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzj implements dyw {
   public static final MapCodec<dzj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", kd.g).forGetter($$0x -> $$0x.e), drx.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dzj::new)
   );
   private final kd e;
   private final drx f;

   protected dzj(kd $$0, drx $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dco $$0, iz $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dyx<?> a() {
      return dyx.g;
   }
}
