import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhg(dgs d) implements dhc {
   public static final MapCodec<dhg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgs.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dhg::new));

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      $$3.e(this.d.a($$1));
   }

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   public dgs b() {
      return this.d;
   }
}
