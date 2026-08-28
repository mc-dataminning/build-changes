import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esp implements est {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.bi).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, esp::new)
   );
   private final akt<ewt> d;

   public esp(akt<ewt> $$0) {
      this.d = $$0;
   }

   @Override
   public tq a(azh $$0, @Nullable tq $$1) {
      tq $$2 = $$1 == null ? new tq() : $$1.i();
      akt.a(mc.bi).encodeStart(ue.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public esu<?> a() {
      return esu.d;
   }
}
