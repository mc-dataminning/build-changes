import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emo implements ems {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<emo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aU).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, emo::new)
   );
   private final ale<eqn> d;

   public emo(ale<eqn> $$0) {
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
   public emt<?> a() {
      return emt.d;
   }
}
