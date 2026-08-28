import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgv(dgs c) implements dhe {
   public static final MapCodec<dgv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgs.b.fieldOf("value").forGetter(dgv::b)).apply($$0, dgv::new));

   @Override
   public float a(int $$0, azx $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   public dgs b() {
      return this.c;
   }
}
