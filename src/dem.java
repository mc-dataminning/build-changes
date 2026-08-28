import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dem(ddy d) implements dei {
   public static final MapCodec<dem> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddy.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dem::new));

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public ddy b() {
      return this.d;
   }
}
