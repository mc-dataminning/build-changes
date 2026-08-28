import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emp extends emk {
   public static final MapCodec<emp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bri.b(emk.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, emp::new)
   );
   private final bri<emk> b;

   public emp(bri<emk> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(bac $$0, eeg $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public eml<?> a() {
      return eml.f;
   }
}
