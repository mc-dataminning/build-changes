import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhd(dgh c) implements dgt {
   public static final MapCodec<dhd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgh.b.fieldOf("value").forGetter(dhd::b)).apply($$0, dhd::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   public dgh b() {
      return this.c;
   }
}
