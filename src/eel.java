import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eel(km e) implements edy {
   public static MapCodec<eel> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(km.g.optionalFieldOf("offset", km.h).forGetter(eel::g)).apply($$0, eel::new));

   @Override
   public edz<?> a() {
      return edz.m;
   }

   public boolean a(dhf $$0, ji $$1) {
      return $$0.a(null, fbq.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public km g() {
      return this.e;
   }
}
