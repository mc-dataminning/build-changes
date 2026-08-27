import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class edk implements edo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<edk> a = RecordCodecBuilder.create($$0 -> $$0.group(ahg.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, edk::new));
   private final ahg d;

   public edk(ahg $$0) {
      this.d = $$0;
   }

   @Override
   public sn a(auv $$0, @Nullable sn $$1) {
      sn $$2 = $$1 == null ? new sn() : $$1.h();
      ahg.a.encodeStart(tb.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public edp<?> a() {
      return edp.d;
   }
}
