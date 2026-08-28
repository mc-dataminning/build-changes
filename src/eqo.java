import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqo implements eqs {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eqo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a(ma.bd).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, eqo::new)
   );
   private final ali<eus> d;

   public eqo(ali<eus> $$0) {
      this.d = $$0;
   }

   @Override
   public ul a(azu $$0, @Nullable ul $$1) {
      ul $$2 = $$1 == null ? new ul() : $$1.i();
      ali.a(ma.bd).encodeStart(uz.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eqt<?> a() {
      return eqt.d;
   }
}
