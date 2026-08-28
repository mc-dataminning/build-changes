import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dho(dgs c) implements dhe {
   public static final MapCodec<dho> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgs.b.fieldOf("value").forGetter(dho::b)).apply($$0, dho::new));

   @Override
   public float a(int $$0, azx $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   public dgs b() {
      return this.c;
   }
}
