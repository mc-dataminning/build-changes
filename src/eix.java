import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eix(ka e) implements eik {
   public static MapCodec<eix> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ka.g.optionalFieldOf("offset", ka.i).forGetter(eix::g)).apply($$0, eix::new));

   @Override
   public eil<?> a() {
      return eil.m;
   }

   public boolean a(dkw $$0, iv $$1) {
      return $$0.a(null, fgh.b().a($$1));
   }

   public ka g() {
      return this.e;
   }
}
