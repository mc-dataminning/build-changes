import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record dzz(ke e) implements dzm {
   public static MapCodec<dzz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ke.f.optionalFieldOf("offset", ke.g).forGetter(dzz::g)).apply($$0, dzz::new));

   @Override
   public dzn<?> a() {
      return dzn.m;
   }

   public boolean a(ddb $$0, ja $$1) {
      return $$0.a(null, ewv.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public ke g() {
      return this.e;
   }
}
