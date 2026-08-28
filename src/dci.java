import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dci(dbt c) implements dcf {
   public static final MapCodec<dci> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.b.fieldOf("factor").forGetter(dci::b)).apply($$0, dci::new));

   @Override
   public float a(int $$0, azr $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   public dbt b() {
      return this.c;
   }
}
