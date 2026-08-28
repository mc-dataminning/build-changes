import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbu(dbr c) implements dcd {
   public static final MapCodec<dbu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbr.b.fieldOf("value").forGetter(dbu::b)).apply($$0, dbu::new));

   @Override
   public float a(int $$0, azl $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dbu> a() {
      return a;
   }

   public dbr b() {
      return this.c;
   }
}
