import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record een(km e) implements eea {
   public static MapCodec<een> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(km.g.optionalFieldOf("offset", km.h).forGetter(een::g)).apply($$0, een::new));

   @Override
   public eeb<?> a() {
      return eeb.m;
   }

   public boolean a(dhh $$0, ji $$1) {
      return $$0.a(null, fbs.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public km g() {
      return this.e;
   }
}
