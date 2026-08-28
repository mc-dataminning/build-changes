import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbs(dbd c) implements dbp {
   public static final MapCodec<dbs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbd.b.fieldOf("factor").forGetter(dbs::b)).apply($$0, dbs::new));

   @Override
   public float a(int $$0, azk $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dbs> a() {
      return a;
   }

   public dbd b() {
      return this.c;
   }
}
