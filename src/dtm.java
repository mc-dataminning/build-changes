import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtm extends doa {
   public static final MapCodec<dtm> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayf.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dtm::new)
   );

   @Override
   public MapCodec<dtm> a() {
      return c;
   }

   public dtm(ayf $$0, eas.d $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      ear.a($$0, $$1, $$2, $$3);
   }
}
