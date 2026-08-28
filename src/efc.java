import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record efc(kl e) implements eep {
   public static MapCodec<efc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kl.f.optionalFieldOf("offset", kl.g).forGetter(efc::g)).apply($$0, efc::new));

   @Override
   public eeq<?> a() {
      return eeq.m;
   }

   public boolean a(dhy $$0, jh $$1) {
      return $$0.a(null, fcj.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kl g() {
      return this.e;
   }
}
