import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzx implements eab {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dzx> a = RecordCodecBuilder.create($$0 -> $$0.group(afw.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, dzx::new));
   private final afw d;

   public dzx(afw $$0) {
      this.d = $$0;
   }

   @Override
   public rt a(ate $$0, @Nullable rt $$1) {
      rt $$2 = $$1 == null ? new rt() : $$1.h();
      afw.a.encodeStart(sf.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eac<?> a() {
      return eac.d;
   }
}
