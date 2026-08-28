import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record ect(kk e) implements ecg {
   public static MapCodec<ect> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kk.f.optionalFieldOf("offset", kk.g).forGetter(ect::g)).apply($$0, ect::new));

   @Override
   public ech<?> a() {
      return ech.m;
   }

   public boolean a(dfs $$0, jg $$1) {
      return $$0.a(null, ezy.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kk g() {
      return this.e;
   }
}
