import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record ehh(jz e) implements egu {
   public static MapCodec<ehh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jz.g.optionalFieldOf("offset", jz.i).forGetter(ehh::g)).apply($$0, ehh::new));

   @Override
   public egv<?> a() {
      return egv.m;
   }

   public boolean a(djo $$0, iu $$1) {
      return $$0.a(null, fen.b().a($$1));
   }

   public jz g() {
      return this.e;
   }
}
