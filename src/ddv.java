import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddv(ddh d) implements ddr {
   public static final MapCodec<ddv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddh.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, ddv::new));

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public ddh b() {
      return this.d;
   }
}
