import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ede implements ecq {
   public static final MapCodec<ede> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", kl.g).forGetter($$0x -> $$0x.e), dvo.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, ede::new)
   );
   private final kl e;
   private final dvo f;

   protected ede(kl $$0, dvo $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dgd $$0, jh $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ecr<?> a() {
      return ecr.g;
   }
}
