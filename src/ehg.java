import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ehg implements ehk {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ehg> a = RecordCodecBuilder.create($$0 -> $$0.group(ajh.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, ehg::new));
   private final ajh d;

   public ehg(ajh $$0) {
      this.d = $$0;
   }

   @Override
   public ta a(axd $$0, @Nullable ta $$1) {
      ta $$2 = $$1 == null ? new ta() : $$1.h();
      ajh.a.encodeStart(to.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ehl<?> a() {
      return ehl.d;
   }
}
