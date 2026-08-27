import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dnu implements dnm {
   public static final Codec<dnu> a = RecordCodecBuilder.create($$0 -> $$0.group(dnm.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dnu::new));
   private final dnm e;

   public dnu(dnm $$0) {
      this.e = $$0;
   }

   public boolean a(csm $$0, ht $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dnn<?> a() {
      return dnn.k;
   }
}
