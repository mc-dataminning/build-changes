import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eci(kj e) implements ebv {
   public static MapCodec<eci> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kj.f.optionalFieldOf("offset", kj.g).forGetter(eci::g)).apply($$0, eci::new));

   @Override
   public ebw<?> a() {
      return ebw.m;
   }

   public boolean a(dfg $$0, jf $$1) {
      return $$0.a(null, ezn.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kj g() {
      return this.e;
   }
}
