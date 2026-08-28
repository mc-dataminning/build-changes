import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfd(deo c) implements dfa {
   public static final MapCodec<dfd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deo.b.fieldOf("factor").forGetter(dfd::b)).apply($$0, dfd::new));

   @Override
   public float a(int $$0, azs $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dfd> a() {
      return a;
   }

   public deo b() {
      return this.c;
   }
}
