import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eln implements elr {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eln> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akl.a(lf.aU).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, eln::new)
   );
   private final akl<epk> d;

   public eln(akl<epk> $$0) {
      this.d = $$0;
   }

   @Override
   public ud a(ayk $$0, @Nullable ud $$1) {
      ud $$2 = $$1 == null ? new ud() : $$1.h();
      akl.a(lf.aU).encodeStart(ur.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public els<?> a() {
      return els.d;
   }
}
