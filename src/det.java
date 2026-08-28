import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record det(def d) implements dep {
   public static final MapCodec<det> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(def.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, det::new));

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public def b() {
      return this.d;
   }
}
