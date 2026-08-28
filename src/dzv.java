import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzv implements dzn {
   public static final MapCodec<dzv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzn.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dzv::new)
   );
   private final dzn e;

   public dzv(dzn $$0) {
      this.e = $$0;
   }

   public boolean a(ddc $$0, ja $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dzo<?> a() {
      return dzo.k;
   }
}
