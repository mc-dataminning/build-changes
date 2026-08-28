import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhj(dgu c) implements dhg {
   public static final MapCodec<dhj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgu.b.fieldOf("factor").forGetter(dhj::b)).apply($$0, dhj::new));

   @Override
   public float a(int $$0, azz $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dgu b() {
      return this.c;
   }
}
