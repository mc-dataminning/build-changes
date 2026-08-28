import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ewj implements ewn {
   public static final MapCodec<ewj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fao.a.fieldOf("loot_table").forGetter($$0x -> $$0x.b)).apply($$0, ewj::new)
   );
   private final alj<fao> b;

   public ewj(alj<fao> $$0) {
      this.b = $$0;
   }

   @Override
   public ua a(azz $$0, @Nullable ua $$1) {
      ua $$2 = $$1 == null ? new ua() : $$1.l();
      $$2.a("LootTable", fao.a, this.b);
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ewo<?> a() {
      return ewo.d;
   }
}
