import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ewh implements ewl {
   public static final MapCodec<ewh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fam.a.fieldOf("loot_table").forGetter($$0x -> $$0x.b)).apply($$0, ewh::new)
   );
   private final alh<fam> b;

   public ewh(alh<fam> $$0) {
      this.b = $$0;
   }

   @Override
   public tz a(azx $$0, @Nullable tz $$1) {
      tz $$2 = $$1 == null ? new tz() : $$1.l();
      $$2.a("LootTable", fam.a, this.b);
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ewm<?> a() {
      return ewm.d;
   }
}
