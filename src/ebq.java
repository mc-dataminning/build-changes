import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebq implements ebu {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ebq> a = RecordCodecBuilder.create($$0 -> $$0.group(agm.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, ebq::new));
   private final agm d;

   public ebq(agm $$0) {
      this.d = $$0;
   }

   @Override
   public sd a(atw $$0, @Nullable sd $$1) {
      sd $$2 = $$1 == null ? new sd() : $$1.h();
      agm.a.encodeStart(sr.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ebv<?> a() {
      return ebv.d;
   }
}
