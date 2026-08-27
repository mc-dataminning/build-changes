import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ekt implements ekx {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ekt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akg.a(le.aU).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, ekt::new)
   );
   private final akg<eoq> d;

   public ekt(akg<eoq> $$0) {
      this.d = $$0;
   }

   @Override
   public ua a(ayg $$0, @Nullable ua $$1) {
      ua $$2 = $$1 == null ? new ua() : $$1.h();
      akg.a(le.aU).encodeStart(uo.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eky<?> a() {
      return eky.d;
   }
}
