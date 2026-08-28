import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record ece(ki e) implements ebr {
   public static MapCodec<ece> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ki.f.optionalFieldOf("offset", ki.g).forGetter(ece::g)).apply($$0, ece::new));

   @Override
   public ebs<?> a() {
      return ebs.m;
   }

   public boolean a(dfd $$0, je $$1) {
      return $$0.a(null, ezj.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public ki g() {
      return this.e;
   }
}
