import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgx(dgu c) implements dhg {
   public static final MapCodec<dgx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgu.b.fieldOf("value").forGetter(dgx::b)).apply($$0, dgx::new));

   @Override
   public float a(int $$0, azz $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   public dgu b() {
      return this.c;
   }
}
