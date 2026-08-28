import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record edd(kl e) implements ecq {
   public static MapCodec<edd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kl.f.optionalFieldOf("offset", kl.g).forGetter(edd::g)).apply($$0, edd::new));

   @Override
   public ecr<?> a() {
      return ecr.m;
   }

   public boolean a(dgd $$0, jh $$1) {
      return $$0.a(null, fai.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kl g() {
      return this.e;
   }
}
