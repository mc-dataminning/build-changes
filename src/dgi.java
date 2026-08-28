import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgi(dfm c) implements dfy {
   public static final MapCodec<dgi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfm.b.fieldOf("value").forGetter(dgi::b)).apply($$0, dgi::new));

   @Override
   public float a(int $$0, azt $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   public dfm b() {
      return this.c;
   }
}
