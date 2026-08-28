import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dal(czq c) implements dab {
   public static final MapCodec<dal> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czq.b.fieldOf("value").forGetter(dal::b)).apply($$0, dal::new));

   @Override
   public float a(cua $$0, int $$1, aym $$2, float $$3) {
      return this.c.a($$1);
   }

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   public czq b() {
      return this.c;
   }
}
