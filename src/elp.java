import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elp implements elt {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<elp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akm.a(lf.aU).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, elp::new)
   );
   private final akm<epm> d;

   public elp(akm<epm> $$0) {
      this.d = $$0;
   }

   @Override
   public ud a(aym $$0, @Nullable ud $$1) {
      ud $$2 = $$1 == null ? new ud() : $$1.h();
      akm.a(lf.aU).encodeStart(ur.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public elu<?> a() {
      return elu.d;
   }
}
