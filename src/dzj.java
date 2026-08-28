import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzj implements dzb {
   public static final MapCodec<dzj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzb.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dzj::new)
   );
   private final dzb e;

   public dzj(dzb $$0) {
      this.e = $$0;
   }

   public boolean a(dct $$0, iz $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dzc<?> a() {
      return dzc.k;
   }
}
