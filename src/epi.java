import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epi implements epm {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<epi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a(lv.bd).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, epi::new)
   );
   private final alb<etm> d;

   public epi(alb<etm> $$0) {
      this.d = $$0;
   }

   @Override
   public uf a(azl $$0, @Nullable uf $$1) {
      uf $$2 = $$1 == null ? new uf() : $$1.i();
      alb.a(lv.bd).encodeStart(ut.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public epn<?> a() {
      return epn.d;
   }
}
