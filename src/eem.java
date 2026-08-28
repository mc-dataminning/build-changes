import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eem(km e) implements edz {
   public static MapCodec<eem> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(km.g.optionalFieldOf("offset", km.h).forGetter(eem::g)).apply($$0, eem::new));

   @Override
   public eea<?> a() {
      return eea.m;
   }

   public boolean a(dhg $$0, ji $$1) {
      return $$0.a(null, fbr.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public km g() {
      return this.e;
   }
}
