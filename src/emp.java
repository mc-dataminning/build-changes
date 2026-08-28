import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emp implements emt {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<emp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aU).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, emp::new)
   );
   private final ale<eqo> d;

   public emp(ale<eqo> $$0) {
      this.d = $$0;
   }

   @Override
   public us a(azh $$0, @Nullable us $$1) {
      us $$2 = $$1 == null ? new us() : $$1.i();
      ale.a(lq.aU).encodeStart(vg.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public emu<?> a() {
      return emu.d;
   }
}
