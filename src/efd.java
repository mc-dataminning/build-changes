import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record efd(kl e) implements eeq {
   public static MapCodec<efd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kl.g.optionalFieldOf("offset", kl.h).forGetter(efd::g)).apply($$0, efd::new));

   @Override
   public eer<?> a() {
      return eer.m;
   }

   public boolean a(dhx $$0, jh $$1) {
      return $$0.a(null, fci.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kl g() {
      return this.e;
   }
}
