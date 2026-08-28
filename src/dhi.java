import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhi(dgu d) implements dhe {
   public static final MapCodec<dhi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgu.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dhi::new));

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      $$3.e(this.d.a($$1));
   }

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public dgu b() {
      return this.d;
   }
}
