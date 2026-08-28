import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class err implements erv {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.bg).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, err::new)
   );
   private final aku<evv> d;

   public err(aku<evv> $$0) {
      this.d = $$0;
   }

   @Override
   public tq a(azh $$0, @Nullable tq $$1) {
      tq $$2 = $$1 == null ? new tq() : $$1.i();
      aku.a(mc.bg).encodeStart(ue.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public erw<?> a() {
      return erw.d;
   }
}
