import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class evt implements evx {
   public static final MapCodec<evt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezy.a.fieldOf("loot_table").forGetter($$0x -> $$0x.b)).apply($$0, evt::new)
   );
   private final alf<ezy> b;

   public evt(alf<ezy> $$0) {
      this.b = $$0;
   }

   @Override
   public tz a(azv $$0, @Nullable tz $$1) {
      tz $$2 = $$1 == null ? new tz() : $$1.i();
      $$2.a("LootTable", ezy.a, this.b);
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public evy<?> a() {
      return evy.d;
   }
}
