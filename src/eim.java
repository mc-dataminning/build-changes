import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eim(ka e) implements ehz {
   public static MapCodec<eim> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ka.g.optionalFieldOf("offset", ka.i).forGetter(eim::g)).apply($$0, eim::new));

   @Override
   public eia<?> a() {
      return eia.m;
   }

   public boolean a(dkl $$0, iv $$1) {
      return $$0.a(null, fft.b().a($$1));
   }

   public ka g() {
      return this.e;
   }
}
