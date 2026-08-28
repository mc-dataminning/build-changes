import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgt(dge c) implements dgq {
   public static final MapCodec<dgt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dge.b.fieldOf("factor").forGetter(dgt::b)).apply($$0, dgt::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   public dge b() {
      return this.c;
   }
}
