import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epm implements epq {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<epm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lw.be).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, epm::new)
   );
   private final ald<etq> d;

   public epm(ald<etq> $$0) {
      this.d = $$0;
   }

   @Override
   public ug a(azn $$0, @Nullable ug $$1) {
      ug $$2 = $$1 == null ? new ug() : $$1.i();
      ald.a(lw.be).encodeStart(uu.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public epr<?> a() {
      return epr.d;
   }
}
