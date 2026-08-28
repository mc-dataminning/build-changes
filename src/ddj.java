import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddj(ddg c) implements dds {
   public static final MapCodec<ddj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddg.b.fieldOf("value").forGetter(ddj::b)).apply($$0, ddj::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   public ddg b() {
      return this.c;
   }
}
