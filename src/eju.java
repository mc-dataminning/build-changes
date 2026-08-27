import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eju implements ejy {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eju> a = RecordCodecBuilder.create($$0 -> $$0.group(ajv.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, eju::new));
   private final ajv d;

   public eju(ajv $$0) {
      this.d = $$0;
   }

   @Override
   public to a(axt $$0, @Nullable to $$1) {
      to $$2 = $$1 == null ? new to() : $$1.h();
      ajv.a.encodeStart(uc.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ejz<?> a() {
      return ejz.d;
   }
}
