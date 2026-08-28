import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class evo implements evs {
   public static final MapCodec<evo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezt.a.fieldOf("loot_table").forGetter($$0x -> $$0x.b)).apply($$0, evo::new)
   );
   private final alf<ezt> b;

   public evo(alf<ezt> $$0) {
      this.b = $$0;
   }

   @Override
   public tz a(azv $$0, @Nullable tz $$1) {
      tz $$2 = $$1 == null ? new tz() : $$1.i();
      $$2.a("LootTable", ezt.a, this.b);
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public evt<?> a() {
      return evt.d;
   }
}
