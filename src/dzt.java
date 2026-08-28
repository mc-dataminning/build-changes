import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record dzt(ke e) implements dzg {
   public static MapCodec<dzt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ke.f.optionalFieldOf("offset", ke.g).forGetter(dzt::g)).apply($$0, dzt::new));

   @Override
   public dzh<?> a() {
      return dzh.m;
   }

   public boolean a(dcz $$0, ja $$1) {
      return $$0.a(null, ewp.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public ke g() {
      return this.e;
   }
}
