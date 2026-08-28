import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcp(dbt c) implements dcf {
   public static final MapCodec<dcp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.b.fieldOf("value").forGetter(dcp::b)).apply($$0, dcp::new));

   @Override
   public float a(int $$0, azr $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public dbt b() {
      return this.c;
   }
}
