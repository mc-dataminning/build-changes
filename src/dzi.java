import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzi implements dza {
   public static final MapCodec<dzi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dza.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dzi::new)
   );
   private final dza e;

   public dzi(dza $$0) {
      this.e = $$0;
   }

   public boolean a(dcs $$0, iz $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dzb<?> a() {
      return dzb.k;
   }
}
