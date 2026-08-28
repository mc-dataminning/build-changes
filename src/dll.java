import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dll extends dna {
   public static final MapCodec<dll> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayo.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dll::new)
   );
   private final ayo b;

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(ayo $$0, dxn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dxo $$0, dge $$1, jh $$2) {
      return this.b.a();
   }
}
