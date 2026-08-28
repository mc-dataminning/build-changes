import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgo(dfs c) implements dge {
   public static final MapCodec<dgo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfs.b.fieldOf("value").forGetter(dgo::b)).apply($$0, dgo::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dfs b() {
      return this.c;
   }
}
