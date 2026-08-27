import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyu implements dyy {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dyu> a = RecordCodecBuilder.create($$0 -> $$0.group(aep.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, dyu::new));
   private final aep d;

   public dyu(aep $$0) {
      this.d = $$0;
   }

   @Override
   public qs a(art $$0, @Nullable qs $$1) {
      qs $$2 = $$1 == null ? new qs() : $$1.h();
      aep.a.encodeStart(rd.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public dyz<?> a() {
      return dyz.d;
   }
}
