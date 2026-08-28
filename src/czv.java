import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czv(czt c) implements dae {
   public static final MapCodec<czv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czt.b.fieldOf("value").forGetter(czv::b)).apply($$0, czv::new));

   @Override
   public float a(int $$0, ayo $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   public czt b() {
      return this.c;
   }
}
