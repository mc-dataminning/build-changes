import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class egk implements ego {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egk> a = RecordCodecBuilder.create($$0 -> $$0.group(ajc.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, egk::new));
   private final ajc d;

   public egk(ajc $$0) {
      this.d = $$0;
   }

   @Override
   public sy a(awt $$0, @Nullable sy $$1) {
      sy $$2 = $$1 == null ? new sy() : $$1.h();
      ajc.a.encodeStart(tm.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public egp<?> a() {
      return egp.d;
   }
}
