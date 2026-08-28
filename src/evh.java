import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class evh implements evl {
   public static final MapCodec<evh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.bq).fieldOf("loot_table").forGetter($$0x -> $$0x.b)).apply($$0, evh::new)
   );
   private final alf<ezm> b;

   public evh(alf<ezm> $$0) {
      this.b = $$0;
   }

   @Override
   public tz a(azv $$0, @Nullable tz $$1) {
      tz $$2 = $$1 == null ? new tz() : $$1.i();
      $$2.a("LootTable", alf.a(mg.bq), this.b);
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public evm<?> a() {
      return evm.d;
   }
}
