import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record der(deo c) implements dfa {
   public static final MapCodec<der> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deo.b.fieldOf("value").forGetter(der::b)).apply($$0, der::new));

   @Override
   public float a(int $$0, azs $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<der> a() {
      return a;
   }

   public deo b() {
      return this.c;
   }
}
