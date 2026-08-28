import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fom(float b, float c) implements fon {
   public static final MapCodec<fom> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fom::b), ays.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fom::c))
            .apply($$0, fom::new)
   );

   public fom() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2) {
      return dhn.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fom> a() {
      return a;
   }
}
