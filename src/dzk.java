import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzk implements dzc {
   public static final MapCodec<dzk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzc.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dzk::new)
   );
   private final dzc e;

   public dzk(dzc $$0) {
      this.e = $$0;
   }

   public boolean a(dcu $$0, iz $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dzd<?> a() {
      return dzd.k;
   }
}
