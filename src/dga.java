import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dga(dfm d) implements dfw {
   public static final MapCodec<dga> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfm.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dga::new));

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      $$3.e(this.d.a($$1));
   }

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   public dfm b() {
      return this.d;
   }
}
