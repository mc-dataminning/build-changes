import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eou implements eoy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eou> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ala.a(lv.bc).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, eou::new)
   );
   private final ala<esy> d;

   public eou(ala<esy> $$0) {
      this.d = $$0;
   }

   @Override
   public uf a(azk $$0, @Nullable uf $$1) {
      uf $$2 = $$1 == null ? new uf() : $$1.i();
      ala.a(lv.bc).encodeStart(ut.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eoz<?> a() {
      return eoz.d;
   }
}
