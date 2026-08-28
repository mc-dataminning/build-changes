import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dze implements dyw {
   public static final MapCodec<dze> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyw.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dze::new)
   );
   private final dyw e;

   public dze(dyw $$0) {
      this.e = $$0;
   }

   public boolean a(dco $$0, iz $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dyx<?> a() {
      return dyx.k;
   }
}
