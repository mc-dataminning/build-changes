import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class euz implements evd {
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.bp).fieldOf("loot_table").forGetter($$0x -> $$0x.b)).apply($$0, euz::new)
   );
   private final alf<eze> b;

   public euz(alf<eze> $$0) {
      this.b = $$0;
   }

   @Override
   public tz a(azv $$0, @Nullable tz $$1) {
      tz $$2 = $$1 == null ? new tz() : $$1.i();
      $$2.a("LootTable", alf.a(mg.bp), this.b);
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eve<?> a() {
      return eve.d;
   }
}
