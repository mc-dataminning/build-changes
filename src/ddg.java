import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddg(dck c) implements dcw {
   public static final MapCodec<ddg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dck.b.fieldOf("value").forGetter(ddg::b)).apply($$0, ddg::new));

   @Override
   public float a(int $$0, azu $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   public dck b() {
      return this.c;
   }
}
