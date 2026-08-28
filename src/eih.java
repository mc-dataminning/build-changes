import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eih(ka e) implements ehu {
   public static MapCodec<eih> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ka.g.optionalFieldOf("offset", ka.i).forGetter(eih::g)).apply($$0, eih::new));

   @Override
   public ehv<?> a() {
      return ehv.m;
   }

   public boolean a(dkg $$0, iv $$1) {
      return $$0.a(null, ffo.b().a($$1));
   }

   public ka g() {
      return this.e;
   }
}
