import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record ebq(ki e) implements ebd {
   public static MapCodec<ebq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ki.f.optionalFieldOf("offset", ki.g).forGetter(ebq::g)).apply($$0, ebq::new));

   @Override
   public ebe<?> a() {
      return ebe.m;
   }

   public boolean a(dep $$0, je $$1) {
      return $$0.a(null, eyu.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public ki g() {
      return this.e;
   }
}
