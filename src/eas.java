import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eas(kh e) implements eaf {
   public static MapCodec<eas> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kh.f.optionalFieldOf("offset", kh.g).forGetter(eas::g)).apply($$0, eas::new));

   @Override
   public eag<?> a() {
      return eag.m;
   }

   public boolean a(dds $$0, jd $$1) {
      return $$0.a(null, exs.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kh g() {
      return this.e;
   }
}
