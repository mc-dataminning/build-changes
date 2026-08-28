import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class don extends dqc {
   public static final MapCodec<don> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayj.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, don::new)
   );
   protected final ayj b;

   @Override
   public MapCodec<? extends don> a() {
      return a;
   }

   public don(ayj $$0, ebf.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(ebg $$0, djd $$1, iw $$2) {
      return this.b.a();
   }
}
