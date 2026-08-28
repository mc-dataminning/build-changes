import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ehv implements ehn {
   public static final MapCodec<ehv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehn.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, ehv::new)
   );
   private final ehn e;

   public ehv(ehn $$0) {
      this.e = $$0;
   }

   public boolean a(djz $$0, iu $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eho<?> a() {
      return eho.k;
   }
}
