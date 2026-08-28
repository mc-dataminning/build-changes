import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dch(dbt d) implements dcd {
   public static final MapCodec<dch> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dch::new));

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dch> a() {
      return a;
   }

   public dbt b() {
      return this.d;
   }
}
