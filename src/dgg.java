import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgg(dfs d) implements dgc {
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfs.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dgg::new));

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      $$3.e(this.d.a($$1));
   }

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   public dfs b() {
      return this.d;
   }
}
