import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcz(dcd c) implements dcp {
   public static final MapCodec<dcz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcd.b.fieldOf("value").forGetter(dcz::b)).apply($$0, dcz::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   public dcd b() {
      return this.c;
   }
}
