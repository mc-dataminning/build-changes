import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfp(dfm c) implements dfy {
   public static final MapCodec<dfp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfm.b.fieldOf("value").forGetter(dfp::b)).apply($$0, dfp::new));

   @Override
   public float a(int $$0, azt $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dfp> a() {
      return a;
   }

   public dfm b() {
      return this.c;
   }
}
