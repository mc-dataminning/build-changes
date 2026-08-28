import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record ehs(jz e) implements ehf {
   public static MapCodec<ehs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jz.g.optionalFieldOf("offset", jz.i).forGetter(ehs::g)).apply($$0, ehs::new));

   @Override
   public ehg<?> a() {
      return ehg.m;
   }

   public boolean a(dju $$0, iu $$1) {
      return $$0.a(null, fez.b().a($$1));
   }

   public jz g() {
      return this.e;
   }
}
