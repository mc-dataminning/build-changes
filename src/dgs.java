import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgs(dge d) implements dgo {
   public static final MapCodec<dgs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dge.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dgs::new));

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
      $$3.e(this.d.a($$1));
   }

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   public dge b() {
      return this.d;
   }
}
