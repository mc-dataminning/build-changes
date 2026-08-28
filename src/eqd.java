import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqd implements eqh {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eqd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a(lz.bd).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, eqd::new)
   );
   private final alh<euh> d;

   public eqd(alh<euh> $$0) {
      this.d = $$0;
   }

   @Override
   public uk a(azs $$0, @Nullable uk $$1) {
      uk $$2 = $$1 == null ? new uk() : $$1.i();
      alh.a(lz.bd).encodeStart(uy.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eqi<?> a() {
      return eqi.d;
   }
}
