import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgl(dfx d) implements dgh {
   public static final MapCodec<dgl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfx.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dgl::new));

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      $$3.e(this.d.a($$1));
   }

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   public dfx b() {
      return this.d;
   }
}
