import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbw(dbt c) implements dcf {
   public static final MapCodec<dbw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.b.fieldOf("value").forGetter(dbw::b)).apply($$0, dbw::new));

   @Override
   public float a(int $$0, azr $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   public dbt b() {
      return this.c;
   }
}
