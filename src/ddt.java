import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddt(ddf d) implements ddp {
   public static final MapCodec<ddt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddf.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, ddt::new));

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<ddt> a() {
      return a;
   }

   public ddf b() {
      return this.d;
   }
}
