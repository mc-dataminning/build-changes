import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eds implements edw {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eds> a = RecordCodecBuilder.create($$0 -> $$0.group(ahh.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, eds::new));
   private final ahh d;

   public eds(ahh $$0) {
      this.d = $$0;
   }

   @Override
   public so a(auw $$0, @Nullable so $$1) {
      so $$2 = $$1 == null ? new so() : $$1.h();
      ahh.a.encodeStart(tc.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public edx<?> a() {
      return edx.d;
   }
}
