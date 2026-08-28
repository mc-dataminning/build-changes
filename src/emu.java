import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emu implements emy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<emu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.bb).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, emu::new)
   );
   private final akj<eqt> d;

   public emu(akj<eqt> $$0) {
      this.d = $$0;
   }

   @Override
   public tx a(aym $$0, @Nullable tx $$1) {
      tx $$2 = $$1 == null ? new tx() : $$1.i();
      akj.a(lr.bb).encodeStart(ul.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public emz<?> a() {
      return emz.d;
   }
}
