import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgh(dfs c) implements dge {
   public static final MapCodec<dgh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfs.b.fieldOf("factor").forGetter(dgh::b)).apply($$0, dgh::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dfs b() {
      return this.c;
   }
}
