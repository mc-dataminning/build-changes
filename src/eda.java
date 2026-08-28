import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eda implements ecm {
   public static final MapCodec<eda> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", kl.g).forGetter($$0x -> $$0x.e), dvj.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eda::new)
   );
   private final kl e;
   private final dvj f;

   protected eda(kl $$0, dvj $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dfy $$0, jh $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ecn<?> a() {
      return ecn.g;
   }
}
