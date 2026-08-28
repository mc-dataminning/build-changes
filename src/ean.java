import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ean implements eaf {
   public static final MapCodec<ean> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaf.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, ean::new)
   );
   private final eaf e;

   public ean(eaf $$0) {
      this.e = $$0;
   }

   public boolean a(dds $$0, jd $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eag<?> a() {
      return eag.k;
   }
}
