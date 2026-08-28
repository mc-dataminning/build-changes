import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record edk(kl e) implements ecx {
   public static MapCodec<edk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kl.f.optionalFieldOf("offset", kl.g).forGetter(edk::g)).apply($$0, edk::new));

   @Override
   public ecy<?> a() {
      return ecy.m;
   }

   public boolean a(dgk $$0, jh $$1) {
      return $$0.a(null, fap.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kl g() {
      return this.e;
   }
}
