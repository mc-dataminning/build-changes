import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record ecz(kl e) implements ecm {
   public static MapCodec<ecz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kl.f.optionalFieldOf("offset", kl.g).forGetter(ecz::g)).apply($$0, ecz::new));

   @Override
   public ecn<?> a() {
      return ecn.m;
   }

   public boolean a(dfy $$0, jh $$1) {
      return $$0.a(null, fae.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kl g() {
      return this.e;
   }
}
