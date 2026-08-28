import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eco implements ecg {
   public static final MapCodec<eco> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecg.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eco::new)
   );
   private final ecg e;

   public eco(ecg $$0) {
      this.e = $$0;
   }

   public boolean a(dfs $$0, jg $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ech<?> a() {
      return ech.k;
   }
}
