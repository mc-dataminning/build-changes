import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enx implements eob {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<enx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akq.a(lu.bc).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, enx::new)
   );
   private final akq<erw> d;

   public enx(akq<erw> $$0) {
      this.d = $$0;
   }

   @Override
   public ub a(ayw $$0, @Nullable ub $$1) {
      ub $$2 = $$1 == null ? new ub() : $$1.i();
      akq.a(lu.bc).encodeStart(up.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eoc<?> a() {
      return eoc.d;
   }
}
