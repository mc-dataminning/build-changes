import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eia(jz e) implements ehn {
   public static MapCodec<eia> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jz.g.optionalFieldOf("offset", jz.i).forGetter(eia::g)).apply($$0, eia::new));

   @Override
   public eho<?> a() {
      return eho.m;
   }

   public boolean a(djz $$0, iu $$1) {
      return $$0.a(null, ffh.b().a($$1));
   }

   public jz g() {
      return this.e;
   }
}
