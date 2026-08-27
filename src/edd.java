import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class edd implements edh {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<edd> a = RecordCodecBuilder.create($$0 -> $$0.group(ahd.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, edd::new));
   private final ahd d;

   public edd(ahd $$0) {
      this.d = $$0;
   }

   @Override
   public sl a(aup $$0, @Nullable sl $$1) {
      sl $$2 = $$1 == null ? new sl() : $$1.h();
      ahd.a.encodeStart(sz.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public edi<?> a() {
      return edi.d;
   }
}
