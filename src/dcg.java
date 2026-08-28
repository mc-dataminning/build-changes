import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcg(dbr c) implements dcd {
   public static final MapCodec<dcg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbr.b.fieldOf("factor").forGetter(dcg::b)).apply($$0, dcg::new));

   @Override
   public float a(int $$0, azl $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dcg> a() {
      return a;
   }

   public dbr b() {
      return this.c;
   }
}
