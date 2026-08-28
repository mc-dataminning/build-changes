import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record efj(kl e) implements eew {
   public static MapCodec<efj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kl.g.optionalFieldOf("offset", kl.h).forGetter(efj::g)).apply($$0, efj::new));

   @Override
   public eex<?> a() {
      return eex.m;
   }

   public boolean a(dif $$0, jh $$1) {
      return $$0.a(null, fco.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kl g() {
      return this.e;
   }
}
