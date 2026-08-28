import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fso(float b, float c) implements fsp {
   public static final MapCodec<fso> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayy.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fso::b), ayy.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fso::c))
            .apply($$0, fso::new)
   );

   public fso() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2) {
      return djx.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fso> a() {
      return a;
   }
}
