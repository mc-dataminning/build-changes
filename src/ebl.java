import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebl implements ebp {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ebl> a = RecordCodecBuilder.create($$0 -> $$0.group(agi.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, ebl::new));
   private final agi d;

   public ebl(agi $$0) {
      this.d = $$0;
   }

   @Override
   public rz a(ats $$0, @Nullable rz $$1) {
      rz $$2 = $$1 == null ? new rz() : $$1.h();
      agi.a.encodeStart(sn.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ebq<?> a() {
      return ebq.d;
   }
}
