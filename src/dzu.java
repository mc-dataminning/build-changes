import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzu implements dzm {
   public static final MapCodec<dzu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzm.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dzu::new)
   );
   private final dzm e;

   public dzu(dzm $$0) {
      this.e = $$0;
   }

   public boolean a(ddb $$0, ja $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dzn<?> a() {
      return dzn.k;
   }
}
