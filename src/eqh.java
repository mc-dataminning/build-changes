import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqh implements eql {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eqh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alk.a(ma.bd).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, eqh::new)
   );
   private final alk<eul> d;

   public eqh(alk<eul> $$0) {
      this.d = $$0;
   }

   @Override
   public un a(azv $$0, @Nullable un $$1) {
      un $$2 = $$1 == null ? new un() : $$1.i();
      alk.a(ma.bd).encodeStart(vb.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eqm<?> a() {
      return eqm.d;
   }
}
