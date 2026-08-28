import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddu(ddf c) implements ddr {
   public static final MapCodec<ddu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddf.b.fieldOf("factor").forGetter(ddu::b)).apply($$0, ddu::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddf b() {
      return this.c;
   }
}
