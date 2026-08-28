import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eak implements eac {
   public static final MapCodec<eak> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eac.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eak::new)
   );
   private final eac e;

   public eak(eac $$0) {
      this.e = $$0;
   }

   public boolean a(ddq $$0, jd $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ead<?> a() {
      return ead.k;
   }
}
