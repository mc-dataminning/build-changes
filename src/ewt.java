import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ewt implements ewx {
   public static final MapCodec<ewt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fay.a.fieldOf("loot_table").forGetter($$0x -> $$0x.b)).apply($$0, ewt::new)
   );
   private final alq<fay> b;

   public ewt(alq<fay> $$0) {
      this.b = $$0;
   }

   @Override
   public ua a(bai $$0, @Nullable ua $$1) {
      ua $$2 = $$1 == null ? new ua() : $$1.l();
      $$2.a("LootTable", fay.a, this.b);
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ewy<?> a() {
      return ewy.d;
   }
}
