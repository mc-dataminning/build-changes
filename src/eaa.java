import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eaa(ke e) implements dzn {
   public static MapCodec<eaa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ke.f.optionalFieldOf("offset", ke.g).forGetter(eaa::g)).apply($$0, eaa::new));

   @Override
   public dzo<?> a() {
      return dzo.m;
   }

   public boolean a(ddc $$0, ja $$1) {
      return $$0.a(null, ewx.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public ke g() {
      return this.e;
   }
}
