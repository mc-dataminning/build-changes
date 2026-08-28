import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzh implements dyz {
   public static final MapCodec<dzh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyz.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dzh::new)
   );
   private final dyz e;

   public dzh(dyz $$0) {
      this.e = $$0;
   }

   public boolean a(dcr $$0, iz $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dza<?> a() {
      return dza.k;
   }
}
