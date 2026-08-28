import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dal(daj c) implements dau {
   public static final MapCodec<dal> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(daj.b.fieldOf("value").forGetter(dal::b)).apply($$0, dal::new));

   @Override
   public float a(int $$0, ayw $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   public daj b() {
      return this.c;
   }
}
