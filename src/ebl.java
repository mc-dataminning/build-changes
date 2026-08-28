import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ebl implements ebd {
   public static final MapCodec<ebl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebd.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, ebl::new)
   );
   private final ebd e;

   public ebl(ebd $$0) {
      this.e = $$0;
   }

   public boolean a(dep $$0, je $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ebe<?> a() {
      return ebe.k;
   }
}
