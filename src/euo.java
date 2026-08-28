import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euo implements eus {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<euo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(mg.bo).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, euo::new)
   );
   private final ald<eys> d;

   public euo(ald<eys> $$0) {
      this.d = $$0;
   }

   @Override
   public tx a(azt $$0, @Nullable tx $$1) {
      tx $$2 = $$1 == null ? new tx() : $$1.i();
      ald.a(mg.bo).encodeStart(ul.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eut<?> a() {
      return eut.d;
   }
}
