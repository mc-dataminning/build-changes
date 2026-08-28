import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eek(km e) implements edx {
   public static MapCodec<eek> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(km.g.optionalFieldOf("offset", km.h).forGetter(eek::g)).apply($$0, eek::new));

   @Override
   public edy<?> a() {
      return edy.m;
   }

   public boolean a(dhe $$0, ji $$1) {
      return $$0.a(null, fbp.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public km g() {
      return this.e;
   }
}
