import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgv(dgh d) implements dgr {
   public static final MapCodec<dgv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgh.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dgv::new));

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
      $$3.e(this.d.a($$1));
   }

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   public dgh b() {
      return this.d;
   }
}
