import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eih implements ehz {
   public static final MapCodec<eih> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehz.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eih::new)
   );
   private final ehz e;

   public eih(ehz $$0) {
      this.e = $$0;
   }

   public boolean a(dkl $$0, iv $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eia<?> a() {
      return eia.k;
   }
}
