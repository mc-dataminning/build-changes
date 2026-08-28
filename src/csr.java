import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csr(ji<djs> c) implements csv {
   public static final MapCodec<csr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jt.a(mg.aG).fieldOf("biomes").forGetter(csr::b)).apply($$0, csr::new));

   public boolean a(csx $$0) {
      return this.c.a($$0.c());
   }

   @Override
   public MapCodec<csr> a() {
      return a;
   }

   public ji<djs> b() {
      return this.c;
   }
}
