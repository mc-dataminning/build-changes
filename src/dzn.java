import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzn implements dza {
   public static final MapCodec<dzn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", kd.g).forGetter($$0x -> $$0x.e), dsb.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dzn::new)
   );
   private final kd e;
   private final dsb f;

   protected dzn(kd $$0, dsb $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dcs $$0, iz $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dzb<?> a() {
      return dzb.g;
   }
}
