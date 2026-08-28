import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfv(dfs c) implements dge {
   public static final MapCodec<dfv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfs.b.fieldOf("value").forGetter(dfv::b)).apply($$0, dfv::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   public dfs b() {
      return this.c;
   }
}
