import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eis implements eik {
   public static final MapCodec<eis> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eik.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eis::new)
   );
   private final eik e;

   public eis(eik $$0) {
      this.e = $$0;
   }

   public boolean a(dkw $$0, iv $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eil<?> a() {
      return eil.k;
   }
}
