import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doa extends dpp {
   public static final MapCodec<doa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayf.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, doa::new)
   );
   protected final ayf b;

   @Override
   public MapCodec<? extends doa> a() {
      return a;
   }

   public doa(ayf $$0, eas.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(eat $$0, diq $$1, iv $$2) {
      return this.b.a();
   }
}
